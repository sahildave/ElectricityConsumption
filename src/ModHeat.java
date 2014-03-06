
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class ModHeat  extends JFrame implements ActionListener,ChangeListener

{
	
	public int mheatitem;
    
	public static int 	 	valuemh1=0,  valuemh2=0,  valuemh3=0;
    public static Object 	valueomh1=0, valueomh2=0, valueomh3=0;
    public static String 	usemh1="0",  usemh2="0",  usemh3="0";
    public static String 	useomh1="0", useomh2="0", useomh3="0";
    
    private final JSpinner spin3m;
    private final JTextField txmh;
    private final JButton mheatfinal;
    
    JLabel mhsel = new JLabel();
    
    public ModHeat(JPanel mainpanel, JComboBox c3m, JSpinner spin3m, JTextField txmh, JButton mheatfinal)
	{
		this.spin3m = spin3m;
		this.txmh = txmh;
		this.mheatfinal = mheatfinal;
		c3m.setEnabled(true);
		
        c3m.addActionListener(this);
        spin3m.addChangeListener(this);
        mheatfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {mheatfinalActionPerformed(evt);}});
        
        mhsel.setFont(new Font ("Tohoma", 1, 10));
        mhsel.setBounds(150,270,460,20);
        frame.spanel.add(mhsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin3m.setEnabled(true);
    	mheatitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (mheatitem == 1)
		{
			spin3m.setValue(valuemh1);
			txmh.setText(usemh1);
			//System.out.println("____ useomh1 "+useomh1+" usemh1 "+usemh1);
		}
		else if (mheatitem == 2)
		{
			spin3m.setValue(valuemh2);
			txmh.setText(usemh2);
			//System.out.println("____ useomh2 "+useomh2+" usemh2 "+usemh2);
		}
		else if (mheatitem == 3)
		{
			spin3m.setValue(valuemh3);
			txmh.setText(usemh3);
			//System.out.println("____ useomh3 "+useomh3+" usemh3 "+usemh3);
		}
		else
		{
			spin3m.setEnabled(false);
			valuemh1=0;valuemh2=0;valuemh3=0;
			valueomh1=0;valueomh2=0;valueomh3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(mheatitem ==1)
    	{
       		valueomh1 = spin3m.getValue();
    		valuemh1 = (Integer) valueomh1;
    		//System.out.println("useomh1 "+useomh1+" usemh1 "+usemh1);
    	}
    	else if(mheatitem == 2)
    	{
    		valueomh2 = spin3m.getValue();
    		valuemh2 = (Integer) valueomh2;
    		//System.out.println("useomh2 "+useomh2+" usemh2 "+usemh2);
		}
    	else if(mheatitem == 3)
    	{
    		valueomh3 = spin3m.getValue();
    		valuemh3 = (Integer) valueomh3;
    		//System.out.println("useomh3 "+useomh3+" usemh3 "+usemh3);
    	}
    	mhsel.setText("[1.2Kw-"+valuemh1+" items X "+useomh1+" hrs][1.5Kw-"+valuemh2+" items X "+useomh2+" hrs][2Kw-"+valuemh3+" items X "+useomh3+" hrs]");
    }
    
    public void mheatfinalActionPerformed(ActionEvent evtb) 
	{
		if (mheatitem == 1)
		{
			useomh1 = txmh.getText();
    		usemh1 = useomh1;
		}
		else if (mheatitem == 2)
		{
			useomh2 = txmh.getText();
    		usemh2 = useomh2;
		}
		else if (mheatitem == 3)
		{
			useomh3 = txmh.getText();
    		usemh3 = useomh3;	
		}
		mhsel.setText("[1.2Kw-"+valuemh1+" items X "+useomh1+" hrs][1.5Kw-"+valuemh2+" items X "+useomh2+" hrs][2Kw-"+valuemh3+" items X "+useomh3+" hrs]");
	}
}
