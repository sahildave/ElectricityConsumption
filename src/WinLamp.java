

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class WinLamp  extends JFrame implements ActionListener,ChangeListener

{
	
	public int lampitem;
	
    public static int 		valuel1=0,	valuel2=0,	valuel3=0;
    public static Object 	valueol1=0, valueol2=0, valueol3=0;
    public static String 	usel1="0",  usel2="0",  usel3="0";
    public static String 	useol1="0", useol2="0", useol3="0";

	private final JSpinner spin2;
	private final JTextField txl;
	private final JButton lampfinal;
	
	JLabel wlsel = new JLabel();
    
    public WinLamp(JPanel mainpanel, JComboBox c2, JSpinner spin2, JTextField txl, JButton lampfinal)
	{
		this.spin2 = spin2;
		this.txl = txl;
		this.lampfinal = lampfinal;
		c2.setEnabled(true);
        
        c2.addActionListener(this);
        spin2.addChangeListener(this);
        lampfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {lampfinalActionPerformed(evt);}});
        
        wlsel.setFont(new Font ("Tohoma", 1, 10));
        wlsel.setBounds(150,35,460,20);
        frame.spanel.add(wlsel);
	}
	
	
    public void actionPerformed (ActionEvent evt) 
	{
		spin2.setEnabled(true);
    	lampitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (lampitem == 1)
		{
			spin2.setValue(valuel1);
			txl.setText(usel1);
			//System.out.println("____ useol1 "+useol1+" usel1 "+usel1);
		}
		else if (lampitem == 2)
		{
			spin2.setValue(valuel2);
			txl.setText(usel2);
			//System.out.println("____ useol2 "+useol2+" usel2 "+usel2);
		}
		else if (lampitem == 3)
		{
			spin2.setValue(valuel3);
			txl.setText(usel3);
			//System.out.println("____ useol3 "+useol3+" usel3 "+usel3);
		}
		else
		{
			spin2.setEnabled(false);
			valuel1=0;valuel2=0;valuel3=0;
			valueol1=0;valueol2=0;valueol3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(lampitem ==1)
    	{
       		valueol1 = spin2.getValue();
    		valuel1 = (Integer) valueol1;
    		//System.out.println("useol1 "+useol1+" usel1 "+usel1);
    	}
    	else if(lampitem == 2)
    	{
    		valueol2 = spin2.getValue();
    		valuel2 = (Integer) valueol2;
    		//System.out.println("useol2 "+useol2+" usel2 "+usel2);
		}
    	else if(lampitem == 3)
    	{
    		valueol3 = spin2.getValue();
    		valuel3 = (Integer) valueol3;
    		//System.out.println("useol3 "+useol3+" usel3 "+usel3);
    	}
       	wlsel.setText("[40W-"+valuel1+" items X "+useol1+" hrs] [60W-"+valuel2+" items X "+useol2+" hrs] [100W-"+valuel3+" items X "+useol3+" hrs]");
    }
    
    public void lampfinalActionPerformed(ActionEvent evtb) 
	{
		if (lampitem == 1)
		{
			useol1 = txl.getText();
    		usel1 = useol1;
		}
		else if (lampitem == 2)
		{
			useol2 = txl.getText();
    		usel2 = useol2;
		}
		else if (lampitem == 3)
		{
			useol3 = txl.getText();
    		usel3 = useol3;	
		}
		wlsel.setText("[40W-"+valuel1+" items X "+useol1+" hrs] [60W-"+valuel2+" items X "+useol2+" hrs] [100W-"+valuel3+" items X "+useol3+" hrs]");
    }
}
