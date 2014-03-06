

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class WinHeat  extends JFrame implements ActionListener,ChangeListener

{
	
public int heatitem;
    
	public static int 	 	valueh1=0,  valueh2=0,  valueh3=0;
    public static Object 	valueoh1=0, valueoh2=0, valueoh3=0;
    public static String 	useh1="0",  useh2="0",  useh3="0";
    public static String 	useoh1="0", useoh2="0", useoh3="0";
    
    private final JSpinner spin4;
    private final JTextField txh;
    private final JButton heatfinal;
    
    JLabel whsel = new JLabel();
    
    public WinHeat(JPanel mainpanel, JComboBox c4, JSpinner spin4, JTextField txh, JButton heatfinal)
	{
		this.spin4 = spin4;
		this.txh = txh;
		this.heatfinal = heatfinal;
		c4.setEnabled(true);
		
        c4.addActionListener(this);
        spin4.addChangeListener(this);
        heatfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {heatfinalActionPerformed(evt);}});
        
        whsel.setFont(new Font ("Tohoma", 1, 10));
        whsel.setBounds(150,65,460,20);
        frame.spanel.add(whsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin4.setEnabled(true);
    	heatitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (heatitem == 1)
		{
			spin4.setValue(valueh1);
			txh.setText(useh1);
			//System.out.println("____ useoh1 "+useoh1+" useh1 "+useh1);
		}
		else if (heatitem == 2)
		{
			spin4.setValue(valueh2);
			txh.setText(useh2);
			//System.out.println("____ useoh2 "+useoh2+" useh2 "+useh2);
		}
		else if (heatitem == 3)
		{
			spin4.setValue(valueh3);
			txh.setText(useh3);
			//System.out.println("____ useoh3 "+useoh3+" useh3 "+useh3);
		}
		else
		{
			spin4.setEnabled(false);
			valueh1=0;valueh2=0;valueh3=0;
			valueoh1=0;valueoh2=0;valueoh3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(heatitem ==1)
    	{
       		valueoh1 = spin4.getValue();
    		valueh1 = (Integer) valueoh1;
    		//System.out.println("useoh1 "+useoh1+" useh1 "+useh1);
    	}
    	else if(heatitem == 2)
    	{
    		valueoh2 = spin4.getValue();
    		valueh2 = (Integer) valueoh2;
    		//System.out.println("useoh2 "+useoh2+" useh2 "+useh2);
		}
    	else if(heatitem == 3)
    	{
    		valueoh3 = spin4.getValue();
    		valueh3 = (Integer) valueoh3;
    		//System.out.println("useoh3 "+useoh3+" useh3 "+useh3);
    	}
    	whsel.setText("[1.2Kw-"+valueh1+" items X "+useoh1+" hrs][1.5Kw-"+valueh2+" items X "+useoh2+" hrs][2Kw-"+valueh3+" items X "+useoh3+" hrs]");
    }
    
    public void heatfinalActionPerformed(ActionEvent evtb) 
	{
		if (heatitem == 1)
		{
			useoh1 = txh.getText();
    		useh1 = useoh1;
		}
		else if (heatitem == 2)
		{
			useoh2 = txh.getText();
    		useh2 = useoh2;
		}
		else if (heatitem == 3)
		{
			useoh3 = txh.getText();
    		useh3 = useoh3;	
		}
		whsel.setText("[1.2Kw-"+valueh1+" items X "+useoh1+" hrs][1.5Kw-"+valueh2+" items X "+useoh2+" hrs][2Kw-"+valueh3+" items X "+useoh3+" hrs]");
    }
}
