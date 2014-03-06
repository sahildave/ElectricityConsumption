

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class SumHeat  extends JFrame implements ActionListener,ChangeListener

{
	public int sheatitem;
    
	public static int 	 	valuesh1=0,  valuesh2=0,  valuesh3=0;
    public static Object 	valueosh1=0, valueosh2=0, valueosh3=0;
    public static String 	usesh1="0",  usesh2="0",  usesh3="0";
    public static String 	useosh1="0", useosh2="0", useosh3="0";
    
    private final JSpinner spin3s;
    private final JTextField txsh;
    private final JButton sheatfinal;
    
    JLabel shsel = new JLabel();
    
    public SumHeat(JPanel mainpanel, JComboBox c3s, JSpinner spin3s, JTextField txsh, JButton sheatfinal)
	{
		this.spin3s = spin3s;
		this.txsh = txsh;
		this.sheatfinal = sheatfinal;
		c3s.setEnabled(true);
		
        c3s.addActionListener(this);
        spin3s.addChangeListener(this);
        sheatfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {sheatfinalActionPerformed(evt);}});
        
        shsel.setFont(new Font ("Tohoma", 1, 10));
        shsel.setBounds(150,170,460,20);
        frame.spanel.add(shsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin3s.setEnabled(true);
    	sheatitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (sheatitem == 1)
		{
			spin3s.setValue(valuesh1);
			txsh.setText(usesh1);
			//System.out.println("____ useosh1 "+useosh1+" usesh1 "+usesh1);
		}
		else if (sheatitem == 2)
		{
			spin3s.setValue(valuesh2);
			txsh.setText(usesh2);
			//System.out.println("____ useosh2 "+useosh2+" usesh2 "+usesh2);
		}
		else if (sheatitem == 3)
		{
			spin3s.setValue(valuesh3);
			txsh.setText(usesh3);
			//System.out.println("____ useosh3 "+useosh3+" usesh3 "+usesh3);
		}
		else
		{
			spin3s.setEnabled(false);
			valuesh1=0;valuesh2=0;valuesh3=0;
			valueosh1=0;valueosh2=0;valueosh3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(sheatitem ==1)
    	{
       		valueosh1 = spin3s.getValue();
    		valuesh1 = (Integer) valueosh1;
    		//System.out.println("useosh1 "+useosh1+" usesh1 "+usesh1);
    	}
    	else if(sheatitem == 2)
    	{
    		valueosh2 = spin3s.getValue();
    		valuesh2 = (Integer) valueosh2;
    		//System.out.println("useosh2 "+useosh2+" usesh2 "+usesh2);
		}
    	else if(sheatitem == 3)
    	{
    		valueosh3 = spin3s.getValue();
    		valuesh3 = (Integer) valueosh3;
    		//System.out.println("useosh3 "+useosh3+" usesh3 "+usesh3);
    	}
    	shsel.setText("[1.2Kw-"+valuesh1+" items X "+useosh1+" hrs][1.5Kw-"+valuesh2+" items X "+useosh2+" hrs][2Kw-"+valuesh3+" items X "+useosh3+" hrs]");
    }
    
    public void sheatfinalActionPerformed(ActionEvent evtb) 
	{
		if (sheatitem == 1)
		{
			useosh1 = txsh.getText();
    		usesh1 = useosh1;
		}
		else if (sheatitem == 2)
		{
			useosh2 = txsh.getText();
    		usesh2 = useosh2;
		}
		else if (sheatitem == 3)
		{
			useosh3 = txsh.getText();
    		usesh3 = useosh3;	
		}
		shsel.setText("[1.2Kw-"+valuesh1+" items X "+useosh1+" hrs][1.5Kw-"+valuesh2+" items X "+useosh2+" hrs][2Kw-"+valuesh3+" items X "+useosh3+" hrs]");
    }
}
