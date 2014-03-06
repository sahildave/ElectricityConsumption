
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class SumTube  extends JFrame implements ActionListener,ChangeListener

{
	
	public int stubeitem;
    
	public static int 	 	valuest1=0,  valuest2=0,  valuest3=0;
    public static Object 	valueost1=0, valueost2=0, valueost3=0;
    public static String 	usest1="0",  usest2="0",  usest3="0";
    public static String 	useost1="0", useost2="0", useost3="0";
    
    private final JSpinner spin4s;
    private final JTextField txst;
    private final JButton stubefinal;
    
    JLabel stsel = new JLabel();
    
    public SumTube(JPanel mainpanel, JComboBox c4s, JSpinner spin4s, JTextField txst, JButton stubefinal)
	{
		this.spin4s = spin4s;
		this.txst = txst;
		this.stubefinal = stubefinal;
		c4s.setEnabled(true);
		
        c4s.addActionListener(this);
        spin4s.addChangeListener(this);
        stubefinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {stubefinalActionPerformed(evt);}});
        
        stsel.setFont(new Font ("Tohoma", 1, 10));
        stsel.setBounds(150,155,460,20);
        frame.spanel.add(stsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin4s.setEnabled(true);
    	stubeitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (stubeitem == 1)
		{
			spin4s.setValue(valuest1);
			txst.setText(usest1);
			//System.out.println("____ useost1 "+useost1+" usest1 "+usest1);
		}
		else if (stubeitem == 2)
		{
			spin4s.setValue(valuest2);
			txst.setText(usest2);
			//System.out.println("____ useost2 "+useost2+" usest2 "+usest2);
		}
		else if (stubeitem == 3)
		{
			spin4s.setValue(valuest3);
			txst.setText(usest3);
			//System.out.println("____ useost3 "+useost3+" usest3 "+usest3);
		}
		else
		{
			spin4s.setEnabled(false);
			valuest1=0;valuest2=0;valuest3=0;
			valueost1=0;valueost2=0;valueost3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(stubeitem ==1)
    	{
       		valueost1 = spin4s.getValue();
    		valuest1 = (Integer) valueost1;
    		//System.out.println("useost1 "+useost1+" usest1 "+usest1);
    	}
    	else if(stubeitem == 2)
    	{
    		valueost2 = spin4s.getValue();
    		valuest2 = (Integer) valueost2;
    		//System.out.println("useost2 "+useost2+" usest2 "+usest2);
		}
    	else if(stubeitem == 3)
    	{
    		valueost3 = spin4s.getValue();
    		valuest3 = (Integer) valueost3;
    		//System.out.println("useost3 "+useost3+" usest3 "+usest3);
    	}
    	stsel.setText("[LED-"+valuest1+" items X "+useost1+" hrs] [EC-"+valuest2+" items X "+useost2+" hrs] [OC-"+valuest3+" items X "+useost3+" hrs]");
    }
    
    public void stubefinalActionPerformed(ActionEvent evtb) 
	{
		if (stubeitem == 1)
		{
			useost1 = txst.getText();
    		usest1 = useost1;
		}
		else if (stubeitem == 2)
		{
			useost2 = txst.getText();
    		usest2 = useost2;
		}
		else if (stubeitem == 3)
		{
			useost3 = txst.getText();
    		usest3 = useost3;	
		}
		stsel.setText("[LED-"+valuest1+" items X "+useost1+" hrs] [EC-"+valuest2+" items X "+useost2+" hrs] [OC-"+valuest3+" items X "+useost3+" hrs]");
    }
}
