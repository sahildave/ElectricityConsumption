

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class WinOther  extends JFrame implements ActionListener,ChangeListener

{
	
	public int otheritem;
    
	public static int 	 	valueo1=0,  valueo2=0,  valueo3=0;
    public static Object 	valueoo1=0, valueoo2=0, valueoo3=0;
    public static String 	useo1="0",  useo2="0",  useo3="0";
    public static String 	useoo1="0", useoo2="0", useoo3="0";
    
    private final JSpinner spin5;
    private final JTextField txo;
    private final JButton otherfinal;
    
    JLabel wosel = new JLabel();
    
    public WinOther(JPanel mainpanel, JComboBox c5, JSpinner spin5, JTextField txo, JButton otherfinal)
	{
		this.spin5 = spin5;
		this.txo = txo;
		this.otherfinal = otherfinal;
		c5.setEnabled(true);
		
        c5.addActionListener(this);
        spin5.addChangeListener(this);
        otherfinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {otherfinalActionPerformed(evt);}});
        
        wosel.setFont(new Font ("Tohoma", 1, 10));
        wosel.setBounds(150,80,460,20);
        frame.spanel.add(wosel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin5.setEnabled(true);
    	otheritem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (otheritem == 1)
		{
			spin5.setValue(valueo1);
			txo.setText(useo1);
			//System.out.println("____ useoo1 "+useoo1+" useo1 "+useo1);
		}
		else if (otheritem == 2)
		{
			spin5.setValue(valueo2);
			txo.setText(useo2);
			//System.out.println("____ useoo2 "+useoo2+" useo2 "+useo2);
		}
		else if (otheritem == 3)
		{
			spin5.setValue(valueo3);
			txo.setText(useo3);
			//System.out.println("____ useoo3 "+useoo3+" useo3 "+useo3);
		}
		else
		{
			spin5.setEnabled(false);
			valueo1=0;valueo2=0;valueo3=0;
			valueoo1=0;valueoo2=0;valueoo3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(otheritem ==1)
    	{
       		valueoo1 = spin5.getValue();
    		valueo1 = (Integer) valueoo1;
    		//System.out.println("useoo1 "+useoo1+" useo1 "+useo1);
    	}
    	else if(otheritem == 2)
    	{
    		valueoo2 = spin5.getValue();
    		valueo2 = (Integer) valueoo2;
    		//System.out.println("useoo2 "+useoo2+" useo2 "+useo2);
		}
    	else if(otheritem == 3)
    	{
    		valueoo3 = spin5.getValue();
    		valueo3 = (Integer) valueoo3;
    		//System.out.println("useoo3 "+useoo3+" useo3 "+useo3);
    	}
    	wosel.setText("[Gey-"+valueo1+" items X "+useoo1+" hrs] [Fr-"+valueo2+" items X "+useoo2+" hrs] [TV-"+valueo3+" items X "+useoo3+" hrs]");
    }
    
    public void otherfinalActionPerformed(ActionEvent evtb) 
	{
		if (otheritem == 1)
		{
			useoo1 = txo.getText();
    		useo1 = useoo1;
		}
		else if (otheritem == 2)
		{
			useoo2 = txo.getText();
    		useo2 = useoo2;
		}
		else if (otheritem == 3)
		{
			useoo3 = txo.getText();
    		useo3 = useoo3;	
		}
		wosel.setText("[Gey-"+valueo1+" items X "+useoo1+" hrs] [Fr-"+valueo2+" items X "+useoo2+" hrs] [TV-"+valueo3+" items X "+useoo3+" hrs]");
    }
}
