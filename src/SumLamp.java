

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class SumLamp  extends JFrame implements ActionListener,ChangeListener

{
	
	public int slampitem;
    
	public static int 	 	valuesl1=0,  valuesl2=0,  valuesl3=0;
    public static Object 	valueosl1=0, valueosl2=0, valueosl3=0;
    public static String 	usesl1="0",  usesl2="0",  usesl3="0";
    public static String 	useosl1="0", useosl2="0", useosl3="0";
    
    private final JSpinner spin2s;
    private final JTextField txsl;
    private final JButton slampfinal;
    
    JLabel slsel = new JLabel();
    
    public SumLamp (JPanel mainpanel, JComboBox c2s, JSpinner spin2s, JTextField txsl, JButton slampfinal)
	{
		this.spin2s = spin2s;
		this.txsl = txsl;
		this.slampfinal = slampfinal;
		c2s.setEnabled(true);
		
        c2s.addActionListener(this);
        spin2s.addChangeListener(this);
        slampfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {slampfinalActionPerformed(evt);}});
        
        slsel.setFont(new Font ("Tohoma", 1, 10));
        slsel.setBounds(150,140,460,20);
        frame.spanel.add(slsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin2s.setEnabled(true);
    	slampitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (slampitem == 1)
		{
			spin2s.setValue(valuesl1);
			txsl.setText(usesl1);
			//System.out.println("____ useosl1 "+useosl1+" usesl1 "+usesl1);
		}
		else if (slampitem == 2)
		{
			spin2s.setValue(valuesl2);
			txsl.setText(usesl2);
			//System.out.println("____ useosl2 "+useosl2+" usesl2 "+usesl2);
		}
		else if (slampitem == 3)
		{
			spin2s.setValue(valuesl3);
			txsl.setText(usesl3);
			//System.out.println("____ useosl3 "+useosl3+" usesl3 "+usesl3);
		}
		else
		{
			spin2s.setEnabled(false);
			valuesl1=0;valuesl2=0;valuesl3=0;
			valueosl1=0;valueosl2=0;valueosl3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(slampitem ==1)
    	{
       		valueosl1 = spin2s.getValue();
    		valuesl1 = (Integer) valueosl1;
    		//System.out.println("useosl1 "+useosl1+" usesl1 "+usesl1);
    	}
    	else if(slampitem == 2)
    	{
    		valueosl2 = spin2s.getValue();
    		valuesl2 = (Integer) valueosl2;
    		//System.out.println("useosl2 "+useosl2+" usesl2 "+usesl2);
		}
    	else if(slampitem == 3)
    	{
    		valueosl3 = spin2s.getValue();
    		valuesl3 = (Integer) valueosl3;
    		//System.out.println("useosl3 "+useosl3+" usesl3 "+usesl3);
    	}
    	slsel.setText("[40W-"+valuesl1+" items X "+useosl1+" hrs] [60W-"+valuesl2+" items X "+useosl2+" hrs] [100W-"+valuesl3+" items X "+useosl3+" hrs]");
    }
    
    public void slampfinalActionPerformed(ActionEvent evtb) 
	{
		if (slampitem == 1)
		{
			useosl1 = txsl.getText();
    		usesl1 = useosl1;
		}
		else if (slampitem == 2)
		{
			useosl2 = txsl.getText();
    		usesl2 = useosl2;
		}
		else if (slampitem == 3)
		{
			useosl3 = txsl.getText();
    		usesl3 = useosl3;	
		}
		slsel.setText("[40W-"+valuesl1+" items X "+useosl1+" hrs] [60W-"+valuesl2+" items X "+useosl2+" hrs] [100W-"+valuesl3+" items X "+useosl3+" hrs]");
    }
}
