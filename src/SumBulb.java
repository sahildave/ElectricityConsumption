

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class SumBulb  extends JFrame implements ActionListener,ChangeListener

{
	
	public int sbulbitem;
    
	public static int 	 	valuesb1=0,  valuesb2=0,  valuesb3=0;
    public static Object 	valueosb1=0, valueosb2=0, valueosb3=0;
    public static String 	usesb1="0",  usesb2="0",  usesb3="0";
    public static String 	useosb1="0", useosb2="0", useosb3="0";
    
    private final JSpinner spin1s;
    private final JTextField txsb;
    private final JButton sbulbfinal;
    
    JLabel sbsel = new JLabel();
    
    public SumBulb(JPanel mainpanel, JComboBox c1s, JSpinner spin1s, JTextField txsb, JButton sbulbfinal)
	{
		this.spin1s = spin1s;
		this.txsb = txsb;
		this.sbulbfinal = sbulbfinal;
		c1s.setEnabled(true);
		
        c1s.addActionListener(this);
        spin1s.addChangeListener(this);
        sbulbfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {sbulbfinalActionPerformed(evt);}});
        
        sbsel.setFont(new Font ("Tohoma", 1, 10));
        sbsel.setBounds(150,125,460,20);
        frame.spanel.add(sbsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin1s.setEnabled(true);
    	sbulbitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (sbulbitem == 1)
		{
			spin1s.setValue(valuesb1);
			txsb.setText(usesb1);
			//System.out.println("____ useosb1 "+useosb1+" usesb1 "+usesb1);
		}
		else if (sbulbitem == 2)
		{
			spin1s.setValue(valuesb2);
			txsb.setText(usesb2);
			//System.out.println("____ useosb2 "+useosb2+" usesb2 "+usesb2);
		}
		else if (sbulbitem == 3)
		{
			spin1s.setValue(valuesb3);
			txsb.setText(usesb3);
			//System.out.println("____ useosb3 "+useosb3+" usesb3 "+usesb3);
		}
		else
		{
			spin1s.setEnabled(false);
			valuesb1=0;valuesb2=0;valuesb3=0;
			valueosb1=0;valueosb2=0;valueosb3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(sbulbitem ==1)
    	{
       		valueosb1 = spin1s.getValue();
    		valuesb1 = (Integer) valueosb1;
    		//System.out.println("useosb1 "+useosb1+" usesb1 "+usesb1);
    	}
    	else if(sbulbitem == 2)
    	{
    		valueosb2 = spin1s.getValue();
    		valuesb2 = (Integer) valueosb2;
    		//System.out.println("useosb2 "+useosb2+" usesb2 "+usesb2);
		}
    	else if(sbulbitem == 3)
    	{
    		valueosb3 = spin1s.getValue();
    		valuesb3 = (Integer) valueosb3;
    		//System.out.println("useosb3 "+useosb3+" usesb3 "+usesb3);
    	}
    	sbsel.setText("[11W-"+valuesb1+" items X "+useosb1+" hrs] [18W-"+valuesb2+" items X "+useosb2+" hrs] [26W-"+valuesb3+" items X "+useosb3+" hrs]");
        }
    
    public void sbulbfinalActionPerformed(ActionEvent evtb) 
	{
		if (sbulbitem == 1)
		{
			useosb1 = txsb.getText();
    		usesb1 = useosb1;
		}
		else if (sbulbitem == 2)
		{
			useosb2 = txsb.getText();
    		usesb2 = useosb2;
		}
		else if (sbulbitem == 3)
		{
			useosb3 = txsb.getText();
    		usesb3 = useosb3;	
		}
		sbsel.setText("[11W-"+valuesb1+" items X "+useosb1+" hrs] [18W-"+valuesb2+" items X "+useosb2+" hrs] [26W-"+valuesb3+" items X "+useosb3+" hrs]");
    }
}
