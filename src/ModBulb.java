

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class ModBulb  extends JFrame implements ActionListener,ChangeListener

{
	public int mbulbitem;
    
	public static int 	 	valuemb1=0,  valuemb2=0,  valuemb3=0;
    public static Object 	valueomb1=0, valueomb2=0, valueomb3=0;
    public static String 	usemb1="0",  usemb2="0",  usemb3="0";
    public static String 	useomb1="0", useomb2="0", useomb3="0";
    
    private final JSpinner spin1m;
    private final JTextField txmb;
    private final JButton mbulbfinal;
    
    JLabel mbsel = new JLabel();
    JLabel forget = new JLabel ("Dont Forget to Tick !!!");
    
    public ModBulb(JPanel mainpanel, JComboBox c1m, JSpinner spin1m, JTextField txmb, JButton mbulbfinal)
	{
		this.spin1m = spin1m;
		this.txmb = txmb;
		this.mbulbfinal = mbulbfinal;
		c1m.setEnabled(true);
		
		
        c1m.addActionListener(this);
        spin1m.addChangeListener(this);
        mbulbfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {mbulbfinalActionPerformed(evt);}});
        
        mbsel.setFont(new Font ("Tohoma", 1, 10));
        mbsel.setBounds(150,225,460,20);
        frame.spanel.add(mbsel);
       
        
        forget.setFont(new Font ("Tohoma", 1, 9));
        forget.setBounds(850, 55, 100, 50);
        
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin1m.setEnabled(true);
    	mbulbitem = ((JComboBox)evt.getSource()).getSelectedIndex();
    	forget.setText("Dont Forget to Tick !!!");
    	    	
		if (mbulbitem == 1)
		{
			spin1m.setValue(valuemb1);
			txmb.setText(usemb1);
			//System.out.println("____ useomb1 "+useomb1+" usemb1 "+usemb1);
		}
		else if (mbulbitem == 2)
		{
			spin1m.setValue(valuemb2);
			txmb.setText(usemb2);
			//System.out.println("____ useomb2 "+useomb2+" usemb2 "+usemb2);
		}
		else if (mbulbitem == 3)
		{
			spin1m.setValue(valuemb3);
			txmb.setText(usemb3);
			//System.out.println("____ useomb3 "+useomb3+" usemb3 "+usemb3);
		}
		else
		{
			spin1m.setEnabled(false);
			valuemb1=0;valuemb2=0;valuemb3=0;
			valueomb1=0;valueomb2=0;valueomb3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(mbulbitem ==1)
    	{
       		valueomb1 = spin1m.getValue();
    		valuemb1 = (Integer) valueomb1;
    		//System.out.println("useomb1 "+useomb1+" usemb1 "+usemb1);
    	}
    	else if(mbulbitem == 2)
    	{
    		valueomb2 = spin1m.getValue();
    		valuemb2 = (Integer) valueomb2;
    		//System.out.println("useomb2 "+useomb2+" usemb2 "+usemb2);
		}
    	else if(mbulbitem == 3)
    	{
    		valueomb3 = spin1m.getValue();
    		valuemb3 = (Integer) valueomb3;
    		//System.out.println("useomb3 "+useomb3+" usemb3 "+usemb3);
    	}
    	mbsel.setText("[11W - "+valuemb1+" items X "+useomb1+" hrs] [18W - "+valuemb2+" items X "+useomb2+" hrs] [26W-"+valuemb3+" items X "+useomb3+" hrs]");
    	
    	
    }
    
    public void mbulbfinalActionPerformed(ActionEvent evtb) 
	{
		if (mbulbitem == 1)
		{
			useomb1 = txmb.getText();
    		usemb1 = useomb1;
    		
		}
		else if (mbulbitem == 2)
		{
			useomb2 = txmb.getText();
    		usemb2 = useomb2;
		}
		else if (mbulbitem == 3)
		{
			useomb3 = txmb.getText();
    		usemb3 = useomb3;	
		}
		mbsel.setText("[11W - "+valuemb1+" items X "+useomb1+" hrs] [18W - "+valuemb2+" items X "+useomb2+" hrs] [26W-"+valuemb3+" items X "+useomb3+" hrs]");
		forget.setText(" ");
	}
}