
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class SumOther  extends JFrame implements ActionListener,ChangeListener

{
	public int sotheritem;
    
	public static int 	 	valueso1=0,  valueso2=0,  valueso3=0;
    public static Object 	valueoso1=0, valueoso2=0, valueoso3=0;
    public static String 	useso1="0",  useso2="0",  useso3="0";
    public static String 	useoso1="0", useoso2="0", useoso3="0";
    
    private final JSpinner spin5s;
    private final JTextField txso;
    private final JButton sotherfinal;
    
    JLabel sosel = new JLabel();
    
    public SumOther(JPanel mainpanel, JComboBox c5s, JSpinner spin5s, JTextField txso, JButton sotherfinal)
	{
		this.spin5s = spin5s;
		this.txso = txso;
		this.sotherfinal = sotherfinal;
		c5s.setEnabled(true);
		
        c5s.addActionListener(this);
        spin5s.addChangeListener(this);
        sotherfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {sotherfinalActionPerformed(evt);}});
        
        sosel.setFont(new Font ("Tohoma", 1, 10));
        sosel.setBounds(150,185,460,20);
        frame.spanel.add(sosel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin5s.setEnabled(true);
    	sotheritem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (sotheritem == 1)
		{
			spin5s.setValue(valueso1);
			txso.setText(useso1);
			//System.out.println("____ useoso1 "+useoso1+" useso1 "+useso1);
		}
		else if (sotheritem == 2)
		{
			spin5s.setValue(valueso2);
			txso.setText(useso2);
			//System.out.println("____ useoso2 "+useoso2+" useso2 "+useso2);
		}
		else if (sotheritem == 3)
		{
			spin5s.setValue(valueso3);
			txso.setText(useso3);
			//System.out.println("____ useoso3 "+useoso3+" useso3 "+useso3);
		}
		else
		{
			spin5s.setEnabled(false);
			valueso1=0;valueso2=0;valueso3=0;
			valueoso1=0;valueoso2=0;valueoso3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(sotheritem ==1)
    	{
       		valueoso1 = spin5s.getValue();
    		valueso1 = (Integer) valueoso1;
    		//System.out.println("useoso1 "+useoso1+" useso1 "+useso1);
    	}
    	else if(sotheritem == 2)
    	{
    		valueoso2 = spin5s.getValue();
    		valueso2 = (Integer) valueoso2;
    		//System.out.println("useoso2 "+useoso2+" useso2 "+useso2);
		}
    	else if(sotheritem == 3)
    	{
    		valueoso3 = spin5s.getValue();
    		valueso3 = (Integer) valueoso3;
    		//System.out.println("useoso3 "+useoso3+" useso3 "+useso3);
    	}
    	sosel.setText("[Gey-"+valueso1+" items X "+useoso1+" hrs] [Fr-"+valueso2+" items X "+useoso2+" hrs] [TV-"+valueso3+" items X "+useoso3+" hrs]");
    }
    
    public void sotherfinalActionPerformed(ActionEvent evtb) 
	{
		if (sotheritem == 1)
		{
			useoso1 = txso.getText();
    		useso1 = useoso1;
		}
		else if (sotheritem == 2)
		{
			useoso2 = txso.getText();
    		useso2 = useoso2;
		}
		else if (sotheritem == 3)
		{
			useoso3 = txso.getText();
    		useso3 = useoso3;	
		}
		sosel.setText("[Gey-"+valueso1+" items X "+useoso1+" hrs] [Fr-"+valueso2+" items X "+useoso2+" hrs] [TV-"+valueso3+" items X "+useoso3+" hrs]");
    }
}
