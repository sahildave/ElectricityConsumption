

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class WinBulb  extends JFrame implements ActionListener,ChangeListener

{
	public int bulbitem;
    
	public static int 	 	valueb1=0,  valueb2=0,  valueb3=0;
    public static Object 	valueob1=0, valueob2=0, valueob3=0;
    public static String 	useb1="0",  useb2="0",  useb3="0";
    public static String 	useob1="0", useob2="0", useob3="0";
    
    private final JSpinner spin1;
    private final JTextField txb;
    private final JButton bulbfinal;
    
    JLabel wbsel = new JLabel();
    
    public WinBulb(JPanel mainpanel, JComboBox c1, JSpinner spin1, JTextField txb, JButton bulbfinal)
	{
		this.spin1 = spin1;
		this.txb = txb;
		this.bulbfinal = bulbfinal;
		c1.setEnabled(true);
		
        c1.addActionListener(this);
        spin1.addChangeListener(this);
        bulbfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {bulbfinalActionPerformed(evt);}});
        
        wbsel.setFont(new Font ("Tohoma", 1, 10));
        wbsel.setBounds(150,20,460,20);
        frame.spanel.add(wbsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin1.setEnabled(true);
    	bulbitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (bulbitem == 1)
		{
			spin1.setValue(valueb1);
			txb.setText(useb1);
			//System.out.println("____ useob1 "+useob1+" useb1 "+useb1);
		}
		else if (bulbitem == 2)
		{
			spin1.setValue(valueb2);
			txb.setText(useb2);
			//System.out.println("____ useob2 "+useob2+" useb2 "+useb2);
		}
		else if (bulbitem == 3)
		{
			spin1.setValue(valueb3);
			txb.setText(useb3);
			//System.out.println("____ useob3 "+useob3+" useb3 "+useb3);
		}
		else
		{
			spin1.setEnabled(false);
			valueb1=0;valueb2=0;valueb3=0;
			valueob1=0;valueob2=0;valueob3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(bulbitem ==1)
    	{
       		valueob1 = spin1.getValue();
    		valueb1 = (Integer) valueob1;
    		//System.out.println("useob1 "+useob1+" useb1 "+useb1);
    	}
    	else if(bulbitem == 2)
    	{
    		valueob2 = spin1.getValue();
    		valueb2 = (Integer) valueob2;
    		//System.out.println("useob2 "+useob2+" useb2 "+useb2);
		}
    	else if(bulbitem == 3)
    	{
    		valueob3 = spin1.getValue();
    		valueb3 = (Integer) valueob3;
    		//System.out.println("useob3 "+useob3+" useb3 "+useb3);
    	}
    	wbsel.setText("[11W-"+valueb1+" items X "+useob1+" hrs] [18W-"+valueb2+" items X "+useob2+" hrs] [26W-"+valueb3+" items X "+useob3+" hrs]");
    }
    
    public void bulbfinalActionPerformed(ActionEvent evtb) 
	{
		if (bulbitem == 1)
		{
			useob1 = txb.getText();
    		useb1 = useob1;
		}
		else if (bulbitem == 2)
		{
			useob2 = txb.getText();
    		useb2 = useob2;
		}
		else if (bulbitem == 3)
		{
			useob3 = txb.getText();
    		useb3 = useob3;	
		}
		wbsel.setText("[11W-"+valueb1+" items X "+useob1+" hrs] [18W-"+valueb2+" items X "+useob2+" hrs] [26W-"+valueb3+" items X "+useob3+" hrs]");
    }
}
