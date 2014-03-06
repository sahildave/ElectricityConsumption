

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class ModTube  extends JFrame implements ActionListener,ChangeListener

{
	
	public int stubeitem;
    
	public static int 	 	valuemt1=0,  valuemt2=0,  valuemt3=0;
    public static Object 	valueomt1=0, valueomt2=0, valueomt3=0;
    public static String 	usemt1="0",  usemt2="0",  usemt3="0";
    public static String 	useomt1="0", useomt2="0", useomt3="0";
    
    private final JSpinner spin4m;
    private final JTextField txmt;
    private final JButton stubefinal;
    
    JLabel mtsel = new JLabel();
    
    public ModTube(JPanel mainpanel, JComboBox c4m, JSpinner spin4m, JTextField txmt, JButton stubefinal)
	{
		this.spin4m = spin4m;
		this.txmt = txmt;
		this.stubefinal = stubefinal;
		c4m.setEnabled(true);
		
        c4m.addActionListener(this);
        spin4m.addChangeListener(this);
        stubefinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {stubefinalActionPerformed(evt);}});
        
        mtsel.setFont(new Font ("Tohoma", 1, 10));
        mtsel.setBounds(150,255,460,20);
        frame.spanel.add(mtsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin4m.setEnabled(true);
    	stubeitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (stubeitem == 1)
		{
			spin4m.setValue(valuemt1);
			txmt.setText(usemt1);
			//System.out.println("____ useomt1 "+useomt1+" usemt1 "+usemt1);
		}
		else if (stubeitem == 2)
		{
			spin4m.setValue(valuemt2);
			txmt.setText(usemt2);
			//System.out.println("____ useomt2 "+useomt2+" usemt2 "+usemt2);
		}
		else if (stubeitem == 3)
		{
			spin4m.setValue(valuemt3);
			txmt.setText(usemt3);
			//System.out.println("____ useomt3 "+useomt3+" usemt3 "+usemt3);
		}
		else
		{
			spin4m.setEnabled(false);
			valuemt1=0;valuemt2=0;valuemt3=0;
			valueomt1=0;valueomt2=0;valueomt3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(stubeitem ==1)
    	{
       		valueomt1 = spin4m.getValue();
    		valuemt1 = (Integer) valueomt1;
    		//System.out.println("useomt1 "+useomt1+" usemt1 "+usemt1);
    	}
    	else if(stubeitem == 2)
    	{
    		valueomt2 = spin4m.getValue();
    		valuemt2 = (Integer) valueomt2;
    		//System.out.println("useomt2 "+useomt2+" usemt2 "+usemt2);
		}
    	else if(stubeitem == 3)
    	{
    		valueomt3 = spin4m.getValue();
    		valuemt3 = (Integer) valueomt3;
    		//System.out.println("useomt3 "+useomt3+" usemt3 "+usemt3);
    	}
    	mtsel.setText("[LED-"+valuemt1+" items X "+useomt1+" hrs] [EC-"+valuemt2+" items X "+useomt2+" hrs] [OC-"+valuemt3+" items X "+useomt3+" hrs]");
    }
    
    public void stubefinalActionPerformed(ActionEvent evtb) 
	{
		if (stubeitem == 1)
		{
			useomt1 = txmt.getText();
    		usemt1 = useomt1;
		}
		else if (stubeitem == 2)
		{
			useomt2 = txmt.getText();
    		usemt2 = useomt2;
		}
		else if (stubeitem == 3)
		{
			useomt3 = txmt.getText();
    		usemt3 = useomt3;	
		}
		mtsel.setText("[LED-"+valuemt1+" items X "+useomt1+" hrs] [EC-"+valuemt2+" items X "+useomt2+" hrs] [OC-"+valuemt3+" items X "+useomt3+" hrs]");
	}
}
