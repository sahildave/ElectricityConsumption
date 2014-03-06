

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JSpinner;

public class WinTube  extends JFrame implements ActionListener,ChangeListener

{
	
public int tubeitem;
    
	public static int 	 	valuet1=0,  valuet2=0,  valuet3=0;
    public static Object 	valueot1=0, valueot2=0, valueot3=0;
    public static String 	uset1="0",  uset2="0",  uset3="0";
    public static String 	useot1="0", useot2="0", useot3="0";
    
    private final JSpinner spin3;
    private final JTextField txt;
    private final JButton tubefinal;
    
    JLabel wtsel = new JLabel();
    
    public WinTube(JPanel mainpanel, JComboBox c3, JSpinner spin3, JTextField txt, JButton tubefinal)
	{
		this.spin3 = spin3;
		this.txt = txt;
		this.tubefinal = tubefinal;
		c3.setEnabled(true);
		
        c3.addActionListener(this);
        spin3.addChangeListener(this);
        tubefinal.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt)
        {tubefinalActionPerformed(evt);}});
        
        wtsel.setFont(new Font ("Tohoma", 1, 10));
        wtsel.setBounds(150,50,460,20);
        frame.spanel.add(wtsel);
	}
	
	
	public void actionPerformed (ActionEvent evt) 
	{
		spin3.setEnabled(true);
    	tubeitem = ((JComboBox)evt.getSource()).getSelectedIndex();
		if (tubeitem == 1)
		{
			spin3.setValue(valuet1);
			txt.setText(uset1);
			//System.out.println("____ useot1 "+useot1+" uset1 "+uset1);
		}
		else if (tubeitem == 2)
		{
			spin3.setValue(valuet2);
			txt.setText(uset2);
			//System.out.println("____ useot2 "+useot2+" uset2 "+uset2);
		}
		else if (tubeitem == 3)
		{
			spin3.setValue(valuet3);
			txt.setText(uset3);
			//System.out.println("____ useot3 "+useot3+" uset3 "+uset3);
		}
		else
		{
			spin3.setEnabled(false);
			valuet1=0;valuet2=0;valuet3=0;
			valueot1=0;valueot2=0;valueot3=0;
		}
		frame.tpane.setSelectedIndex(1);
	}                                        
    
    public void stateChanged(ChangeEvent evt) 
    {
    	if(tubeitem ==1)
    	{
       		valueot1 = spin3.getValue();
    		valuet1 = (Integer) valueot1;
    		//System.out.println("useot1 "+useot1+" uset1 "+uset1);
    	}
    	else if(tubeitem == 2)
    	{
    		valueot2 = spin3.getValue();
    		valuet2 = (Integer) valueot2;
    		//System.out.println("useot2 "+useot2+" uset2 "+uset2);
		}
    	else if(tubeitem == 3)
    	{
    		valueot3 = spin3.getValue();
    		valuet3 = (Integer) valueot3;
    		//System.out.println("useot3 "+useot3+" uset3 "+uset3);
    	}
    	wtsel.setText("[LED-"+valuet1+" items X "+useot1+" hrs] [EC-"+valuet2+" items X "+useot2+" hrs] [OC-"+valuet3+" items X "+useot3+" hrs]");
    }
    
    public void tubefinalActionPerformed(ActionEvent evtb) 
	{
		if (tubeitem == 1)
		{
			useot1 = txt.getText();
    		uset1 = useot1;
		}
		else if (tubeitem == 2)
		{
			useot2 = txt.getText();
    		uset2 = useot2;
		}
		else if (tubeitem == 3)
		{
			useot3 = txt.getText();
    		uset3 = useot3;	
		}
		wtsel.setText("[LED-"+valuet1+" items X "+useot1+" hrs] [EC-"+valuet2+" items X "+useot2+" hrs] [OC-"+valuet3+" items X "+useot3+" hrs]");
    }
}
