

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class ModLamp  extends JFrame implements ActionListener,ChangeListener

{
	
	public int mlampitem;
    
	public static int 	 	valueml1=0,  valueml2=0,  valueml3=0;
    public static Object 	valueoml1=0, valueoml2=0, valueoml3=0;
    public static String 	useml1="0",  useml2="0",  useml3="0";
    public static String 	useoml1="0", useoml2="0", useoml3="0";
    
    private final JSpinner spin2m;
    private final JTextField txml;
    private final JButton mlampfinal;
    
    JLabel mlsel = new JLabel();
    
    public ModLamp (JPanel mainpanel, JComboBox c2m, JSpinner spin2m, JTextField txml, JButton mlampfinal)
	{
		this.spin2m = spin2m;
		this.txml = txml;
		this.mlampfinal = mlampfinal;
		c2m.setEnabled(true);
		
        c2m.addActionListener(this);
        spin2m.addChangeListener(this);
        mlampfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {mlampfinalActionPerformed(evt);}});
        
        mlsel.setFont(new Font ("Tohoma", 1, 10));
        mlsel.setBounds(150,240,460,20);
        frame.spanel.add(mlsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin2m.setEnabled(true);
    	mlampitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (mlampitem == 1)
		{
			spin2m.setValue(valueml1);
			txml.setText(useml1);
			//System.out.println("____ useoml1 "+useoml1+" useml1 "+useml1);
		}
		else if (mlampitem == 2)
		{
			spin2m.setValue(valueml2);
			txml.setText(useml2);
			//System.out.println("____ useoml2 "+useoml2+" useml2 "+useml2);
		}
		else if (mlampitem == 3)
		{
			spin2m.setValue(valueml3);
			txml.setText(useml3);
			//System.out.println("____ useoml3 "+useoml3+" useml3 "+useml3);
		}
		else
		{
			spin2m.setEnabled(false);
			valueml1=0;valueml2=0;valueml3=0;
			valueoml1=0;valueoml2=0;valueoml3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(mlampitem ==1)
    	{
       		valueoml1 = spin2m.getValue();
    		valueml1 = (Integer) valueoml1;
    		//System.out.println("useoml1 "+useoml1+" useml1 "+useml1);
    	}
    	else if(mlampitem == 2)
    	{
    		valueoml2 = spin2m.getValue();
    		valueml2 = (Integer) valueoml2;
    		//System.out.println("useoml2 "+useoml2+" useml2 "+useml2);
		}
    	else if(mlampitem == 3)
    	{
    		valueoml3 = spin2m.getValue();
    		valueml3 = (Integer) valueoml3;
    		//System.out.println("useoml3 "+useoml3+" useml3 "+useml3);
    	}
    	mlsel.setText("[40W-"+valueml1+" items X "+useoml1+" hrs] [60W-"+valueml2+" items X "+useoml2+" hrs] [100W-"+valueml3+" items X "+useoml3+" hrs]");
    }
    
    public void mlampfinalActionPerformed(ActionEvent evtb) 
	{
		if (mlampitem == 1)
		{
			useoml1 = txml.getText();
    		useml1 = useoml1;
		}
		else if (mlampitem == 2)
		{
			useoml2 = txml.getText();
    		useml2 = useoml2;
		}
		else if (mlampitem == 3)
		{
			useoml3 = txml.getText();
    		useml3 = useoml3;	
		}
		mlsel.setText("[40W-"+valueml1+" items X "+useoml1+" hrs] [60W-"+valueml2+" items X "+useoml2+" hrs] [100W-"+valueml3+" items X "+useoml3+" hrs]");
	}
}
