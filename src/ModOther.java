

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class ModOther  extends JFrame implements ActionListener,ChangeListener

{
	
	public int motheritem;
    
	public static int 	 	valuemo1=0,  valuemo2=0,  valuemo3=0;
    public static Object 	valueomo1=0, valueomo2=0, valueomo3=0;
    public static String 	usemo1="0",  usemo2="0",  usemo3="0";
    public static String 	useomo1="0", useomo2="0", useomo3="0";
    
    private final JSpinner spin5m;
    private final JTextField txmo;
    private final JButton motherfinal;
    
    JLabel mosel = new JLabel();
    
    public ModOther(JPanel mainpanel, JComboBox c5m, JSpinner spin5m, JTextField txmo, JButton motherfinal)
	{
		this.spin5m = spin5m;
		this.txmo = txmo;
		this.motherfinal = motherfinal;
		c5m.setEnabled(true);
		
        c5m.addActionListener(this);
        spin5m.addChangeListener(this);
        motherfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {motherfinalActionPerformed(evt);}});
        
        mosel.setFont(new Font ("Tohoma", 1, 10));
        mosel.setBounds(150,285,460,20);
        frame.spanel.add(mosel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin5m.setEnabled(true);
    	motheritem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (motheritem == 1)
		{
			spin5m.setValue(valuemo1);
			txmo.setText(usemo1);
			//System.out.println("____ useomo1 "+useomo1+" usemo1 "+usemo1);
		}
		else if (motheritem == 2)
		{
			spin5m.setValue(valuemo2);
			txmo.setText(usemo2);
			//System.out.println("____ useomo2 "+useomo2+" usemo2 "+usemo2);
		}
		else if (motheritem == 3)
		{
			spin5m.setValue(valuemo3);
			txmo.setText(usemo3);
			//System.out.println("____ useomo3 "+useomo3+" usemo3 "+usemo3);
		}
		else
		{
			spin5m.setEnabled(false);
			valuemo1=0;valuemo2=0;valuemo3=0;
			valueomo1=0;valueomo2=0;valueomo3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(motheritem ==1)
    	{
       		valueomo1 = spin5m.getValue();
    		valuemo1 = (Integer) valueomo1;
    		//System.out.println("useomo1 "+useomo1+" usemo1 "+usemo1);
    	}
    	else if(motheritem == 2)
    	{
    		valueomo2 = spin5m.getValue();
    		valuemo2 = (Integer) valueomo2;
    		//System.out.println("useomo2 "+useomo2+" usemo2 "+usemo2);
		}
    	else if(motheritem == 3)
    	{
    		valueomo3 = spin5m.getValue();
    		valuemo3 = (Integer) valueomo3;
    		//System.out.println("useomo3 "+useomo3+" usemo3 "+usemo3);
    	}
    	mosel.setText("[Gey-"+valuemo1+" items X "+useomo1+" hrs] [Fr-"+valuemo2+" items X "+useomo2+" hrs] [TV-"+valuemo3+" items X "+useomo3+" hrs]");
    }
    
    public void motherfinalActionPerformed(ActionEvent evtb) 
	{
		if (motheritem == 1)
		{
			useomo1 = txmo.getText();
    		usemo1 = useomo1;
		}
		else if (motheritem == 2)
		{
			useomo2 = txmo.getText();
    		usemo2 = useomo2;
		}
		else if (motheritem == 3)
		{
			useomo3 = txmo.getText();
    		usemo3 = useomo3;	
		}
		mosel.setText("[Gey-"+valuemo1+" items X "+useomo1+" hrs] [Fr-"+valuemo2+" items X "+useomo2+" hrs] [TV-"+valuemo3+" items X "+useomo3+" hrs]");
	}
}
