import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ToolTipManager;

public class ModerateComp 
{
	JPanel mainpanel;
		
	JButton mb1 = new JButton();
	JButton mt1 = new JButton();
	JButton mh1 = new JButton();
	JButton mo1 = new JButton();
	JButton ml1 = new JButton();
	
	JButton sbulbfinal = new JButton();
	JButton slampfinal = new JButton();
	JButton stubefinal = new JButton();
	JButton sheatfinal = new JButton();
	JButton sotherfinal = new JButton();
	
	ImageIcon mcfl1 = new ImageIcon(getClass().getResource("/cflred.jpg"));
	ImageIcon mcfl2 = new ImageIcon(getClass().getResource("/cflgreen.JPG"));
	ImageIcon mtube1 = new ImageIcon(getClass().getResource("/tubered.jpg"));
	ImageIcon mtube2 = new ImageIcon(getClass().getResource("/tubegreen.JPG"));
	ImageIcon mheat1 = new ImageIcon(getClass().getResource("/heatred.jpg"));
	ImageIcon mheat2 = new ImageIcon(getClass().getResource("/heatgreen.JPG"));
	ImageIcon mlamp1 = new ImageIcon(getClass().getResource("/lampred.jpg"));
	ImageIcon mlamp2 = new ImageIcon(getClass().getResource("/lampgreen.JPG"));
	ImageIcon mother1 = new ImageIcon(getClass().getResource("/otred.jpg"));
	ImageIcon mother2 = new ImageIcon(getClass().getResource("/otgreen.JPG"));
	ImageIcon tick = new ImageIcon(getClass().getResource("/green_tick.png"));
	
	SpinnerModel sm1 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm2 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm3 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm4 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm5 = new SpinnerNumberModel(0,0,5,1);
	
	JSpinner spin1m = new JSpinner(sm1);
	JSpinner spin2m = new JSpinner(sm2);
	JSpinner spin3m = new JSpinner(sm3);
	JSpinner spin4m = new JSpinner(sm4);
	JSpinner spin5m = new JSpinner(sm5);
	
	JComboBox cb1m = new JComboBox();
	JComboBox cb2m = new JComboBox();
	JComboBox cb3m = new JComboBox();
	JComboBox cb4m = new JComboBox();
	JComboBox cb5m = new JComboBox();
	
	JTextField mtf1 = new JTextField();
	JTextField mtf2 = new JTextField();
	JTextField mtf3 = new JTextField();
	JTextField mtf4 = new JTextField();
	JTextField mtf5 = new JTextField();
	
	JLabel mlb = new JLabel("CFL Bulb :");
	JLabel mll = new JLabel("Regular Bulbs/Lamps :");
	JLabel mlt = new JLabel("Tubelights :");
	JLabel mlh = new JLabel("Air Temp :");
	JLabel mlo = new JLabel("Others :");

	JTextField usebulb = new JTextField(2);
	
	public ModerateComp(JPanel mainpanel)
	{
		
		mainpanel.setLayout(null);
		this.mainpanel = mainpanel;
		
		
		//set Icons
		mb1.setIcon(mcfl1);
		mo1.setIcon(mother1);
		mt1.setIcon(mtube1);
		mh1.setIcon(mheat1);
		ml1.setIcon(mlamp1);
		
		sbulbfinal.setIcon(tick);
		slampfinal.setIcon(tick);
		stubefinal.setIcon(tick);
		sheatfinal.setIcon(tick);
		sotherfinal.setIcon(tick);
		
		//Action Listeners
		mb1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {bulbActionPerformed(evt);}});
		mo1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {otherActionPerformed(evt);}});
		mt1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {tubeActionPerformed(evt);}});
		mh1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {heatActionPerformed(evt);}});
		ml1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {lampActionPerformed(evt);}});
		
		//defining
		cb1m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "CFL - 11 W", "CFL - 18 W", "CFL - 26 W" }));
        cb2m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Bulb - 40 W", "Bulb - 60 W", "Bulb - 100 W" }));
        cb3m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "LED - 9 W", "Elec Choke - 36 W", "Ord. Choke - 52 W" }));
        cb4m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Cooler", "Split AC", "Window AC" }));
        cb5m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Geyser", "Fridge", "TV" }));
        
        cb1m.setEnabled(false);
        cb2m.setEnabled(false);
        cb3m.setEnabled(false);
        cb4m.setEnabled(false);
        cb5m.setEnabled(false);
        
        //enabling
        spin1m.setEnabled(false);
        spin2m.setEnabled(false);
        spin3m.setEnabled(false);
        spin4m.setEnabled(false);
        spin5m.setEnabled(false);
        
        usebulb.setEnabled(false);
        usebulb.setText("0");
        
        //positioning
        mlb.setBounds(602,42,150,25);
        mb1.setBounds(670,30,50,50);
		cb1m.setBounds(730,42,130,25);
		spin1m.setBounds(870,42,30,25);
		mtf1.setBounds(910,42,25,25);
		sbulbfinal.setBounds(945, 42, 25, 25);
		
		mll.setBounds(530,102,150,25);
		ml1.setBounds(670,90,50,50);
		cb2m.setBounds(730,102,130,25);
		spin2m.setBounds(870,102,30,25);
		mtf2.setBounds(910,102,25,25);
		slampfinal.setBounds(945,102, 25, 25);
		
		mlt.setBounds(592,162,150,25);
		mt1.setBounds(670,150,50,50);
		cb3m.setBounds(730,162,130,25);
		spin3m.setBounds(870,162,30,25);
		mtf3.setBounds(910,162,25,25);
		stubefinal.setBounds(945,162, 25, 25);
		
		mlh.setBounds(600,222,150,25);
		mh1.setBounds(670,210,50,50);
		cb4m.setBounds(730,222,130,25);
		spin4m.setBounds(870,222,30,25);
		mtf4.setBounds(910,222,25,25);
		sheatfinal.setBounds(945,222, 25, 25);
		
		mlo.setBounds(612,282,150,25);
		mo1.setBounds(670,270,50,50);
		cb5m.setBounds(730,282,130,25);
		spin5m.setBounds(870,282,30,25);
		mtf5.setBounds(910,282,25,25);
		sotherfinal.setBounds(945,282, 25, 25);
		
		//tooltip
		spin1m.setToolTipText("Select no of items");
		spin2m.setToolTipText("Select no of items");
		spin3m.setToolTipText("Select no of items");
		spin4m.setToolTipText("Select no of items");
		spin5m.setToolTipText("Select no of items");
		
		mtf1.setToolTipText("Enter Avg Daily Use");		
		mtf2.setToolTipText("Enter Avg Daily Use");		
		mtf3.setToolTipText("Enter Avg Daily Use");		
		mtf4.setToolTipText("Enter Avg Daily Use");		
		mtf5.setToolTipText("Enter Avg Daily Use");
		ToolTipManager.sharedInstance().setInitialDelay(0);
		
		//adding
		mainpanel.add(mlb);
		mainpanel.add(mb1);
        mainpanel.add(cb1m);
		mainpanel.add(spin1m);
		mainpanel.add(mtf1);
		mainpanel.add(sbulbfinal);
		
		mainpanel.add(mll);
		mainpanel.add(ml1);
		mainpanel.add(cb2m);
		mainpanel.add(spin2m);
		mainpanel.add(mtf2);
		mainpanel.add(slampfinal);
		
		mainpanel.add(mlt);
		mainpanel.add(mt1);
        mainpanel.add(cb3m);
		mainpanel.add(spin3m);
		mainpanel.add(mtf3);
		mainpanel.add(stubefinal);
		
		mainpanel.add(mlh);
		mainpanel.add(mh1);
        mainpanel.add(cb4m);
		mainpanel.add(spin4m);
		mainpanel.add(mtf4);
		mainpanel.add(sheatfinal);
		
		mainpanel.add(mlo);
		mainpanel.add(mo1);
        mainpanel.add(cb5m);
		mainpanel.add(spin5m);
		mainpanel.add(mtf5);
		mainpanel.add(sotherfinal);
		
	
	}
	
	public void bulbActionPerformed(ActionEvent evtb) 
	{
		String result = (((JButton) evtb.getSource()).getIcon()).toString();
		//System.out.println("result - "+result +" ||||||mcfl1 - "+mcfl1);
		if (result.equals(mcfl1.toString()))	
		{
			mb1.setIcon(mcfl2);	
			//System.out.println("Button Worked");
			ModBulb obj2 = new ModBulb(mainpanel, cb1m, spin1m,  mtf1, sbulbfinal);
		}
		if (result.equals(mcfl2.toString()))				
		{
			mb1.setIcon(mcfl1);
			//System.out.println("Button Worked2");
			spin1m.setEnabled(false);
			cb1m.setEnabled(false);
			usebulb.setEnabled(false);
		}
	}
	
	public void lampActionPerformed(ActionEvent evtg)
	{
		String result = (((JButton) evtg.getSource()).getIcon()).toString();
		if (result.equals(mlamp1.toString()))	
		{
			ml1.setIcon(mlamp2);
			ModLamp obj3 = new ModLamp (mainpanel, cb2m, spin2m,  mtf2, slampfinal);
		}
		if (result.equals(mlamp2.toString()))	
		{
			ml1.setIcon(mlamp1);
			spin2m.setEnabled(false);
			cb2m.setEnabled(false);
		}
	}
	public void tubeActionPerformed(ActionEvent evtt)
	{
		String result = (((JButton) evtt.getSource()).getIcon()).toString();
		if (result.equals(mtube1.toString()))	
		{
			mt1.setIcon(mtube2);
			ModTube obj4 = new ModTube (mainpanel, cb3m, spin3m,  mtf3, stubefinal);
		}
		if (result.equals(mtube2.toString()))	
		{
			mt1.setIcon(mtube1);
			spin3m.setEnabled(false);
			cb3m.setEnabled(false);
		}
	}
	public void heatActionPerformed(ActionEvent evth)
	{
		String result = (((JButton) evth.getSource()).getIcon()).toString();
		if (result.equals(mheat1.toString()))	
		{
			mh1.setIcon(mheat2);
			ModHeat obj5 = new ModHeat (mainpanel, cb4m, spin4m,  mtf4, sheatfinal);
		}
		if (result.equals(mheat2.toString()))	
		{
			mh1.setIcon(mheat1);
			spin4m.setEnabled(false);
			cb4m.setEnabled(false);
		}
	}
	public void otherActionPerformed(ActionEvent evth)
	{
		String result = (((JButton) evth.getSource()).getIcon()).toString();
		if (result.equals(mother1.toString()))	
		{
			mo1.setIcon(mother2);
			ModOther obj6 = new ModOther (mainpanel, cb5m, spin5m,  mtf5, sotherfinal);
		}
		if (result.equals(mother2.toString()))	
		{
			mo1.setIcon(mother1);
			spin5m.setEnabled(false);
			cb5m.setEnabled(false);
		}
	}
	public void actionPerformed(ActionEvent e) {}
}
