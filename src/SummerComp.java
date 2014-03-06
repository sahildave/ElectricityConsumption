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

public class SummerComp 
{
	JPanel mainpanel;
	
	JButton sb1 = new JButton();
	JButton st1 = new JButton();
	JButton sh1 = new JButton();
	JButton so1 = new JButton();
	JButton sl1 = new JButton();
	
	JButton sbulbfinal = new JButton();
	JButton slampfinal = new JButton();
	JButton stubefinal = new JButton();
	JButton sheatfinal = new JButton();
	JButton sotherfinal = new JButton();
	
	ImageIcon scfl1 = 	new ImageIcon(getClass().getResource("/cflred.jpg"));
	ImageIcon scfl2 =	new ImageIcon(getClass().getResource("/cflgreen.JPG"));
	ImageIcon stube1 = 	new ImageIcon(getClass().getResource("/tubered.jpg"));
	ImageIcon stube2 = 	new ImageIcon(getClass().getResource("/tubegreen.JPG"));
	ImageIcon sheat1 = 	new ImageIcon(getClass().getResource("/heatred.jpg"));
	ImageIcon sheat2 = 	new ImageIcon(getClass().getResource("/heatgreen.JPG"));
	ImageIcon slamp1 = 	new ImageIcon(getClass().getResource("/lampred.jpg"));
	ImageIcon slamp2 = 	new ImageIcon(getClass().getResource("/lampgreen.JPG"));
	ImageIcon sother1 = new ImageIcon(getClass().getResource("/otred.jpg"));
	ImageIcon sother2 = new ImageIcon(getClass().getResource("/otgreen.JPG"));
	ImageIcon tick = 	new ImageIcon(getClass().getResource("/green_tick.png"));
	
	SpinnerModel sm1s = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm2s = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm3s = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm4s = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm5s = new SpinnerNumberModel(0,0,5,1);
	
	JSpinner spin1s = new JSpinner(sm1s);
	JSpinner spin2s = new JSpinner(sm2s);
	JSpinner spin3s = new JSpinner(sm3s);
	JSpinner spin4s = new JSpinner(sm4s);
	JSpinner spin5s = new JSpinner(sm5s);
	
	JComboBox cb1s = new JComboBox();
	JComboBox cb2s = new JComboBox();
	JComboBox cb3s = new JComboBox();
	JComboBox cb4s = new JComboBox();
	JComboBox cb5s = new JComboBox();
	
	JTextField stf1 = new JTextField();
	JTextField stf2 = new JTextField();
	JTextField stf3 = new JTextField();
	JTextField stf4 = new JTextField();
	JTextField stf5 = new JTextField();
	
	JLabel slb = new JLabel("CFL Bulb :");
	JLabel sll = new JLabel("Regular Bulbs/Lamps :");
	JLabel slt = new JLabel("Tubelights :");
	JLabel slh = new JLabel("Air Temp :");
	JLabel slo = new JLabel("Others :");

	public SummerComp(JPanel mainpanel)
	{
		
		mainpanel.setLayout(null);
		this.mainpanel = mainpanel;
		
		//set Icons
		sb1.setIcon(scfl1);
		so1.setIcon(sother1);
		st1.setIcon(stube1);
		sh1.setIcon(sheat1);
		sl1.setIcon(slamp1);
		
		sbulbfinal.setIcon(tick);
		slampfinal.setIcon(tick);
		stubefinal.setIcon(tick);
		sheatfinal.setIcon(tick);
		sotherfinal.setIcon(tick);
		
		//Action Listeners
		sb1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {bulbActionPerformed(evt);}});
		so1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {otherActionPerformed(evt);}});
		st1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {tubeActionPerformed(evt);}});
		sh1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {heatActionPerformed(evt);}});
		sl1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {lampActionPerformed(evt);}});
		
		//defining
		cb1s.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "CFL - 11 W", "CFL - 18 W", "CFL - 26 W" }));
        cb2s.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Bulb - 40 W", "Bulb - 60 W", "Bulb - 100 W" }));
        cb3s.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "LED - 9 W", "Elec Choke - 36 W", "Ord. Choke - 52 W" }));
        cb4s.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Cooler", "Split AC", "Window AC" }));
        cb5s.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Geyser", "Fridge", "TV" }));
        
        cb1s.setEnabled(false);
        cb2s.setEnabled(false);
        cb3s.setEnabled(false);
        cb4s.setEnabled(false);
        cb5s.setEnabled(false);
        
        //enabling
        spin1s.setEnabled(false);
        spin2s.setEnabled(false);
        spin3s.setEnabled(false);
        spin4s.setEnabled(false);
        spin5s.setEnabled(false);
        
        //positioning
        slb.setBounds(102,382,150,25);
        sb1.setBounds(170,370,50,50);
		cb1s.setBounds(230,382,130,25);
		spin1s.setBounds(370,382,30,25);
		stf1.setBounds(410, 382,25,25);
		sbulbfinal.setBounds(445, 382, 25, 25);
		
		sll.setBounds(30,442,150,25);
		sl1.setBounds(170,430,50,50);
		cb2s.setBounds(230,442,130,25);
		spin2s.setBounds(370,442,30,25);
		stf2.setBounds(410,442,25,25);
		slampfinal.setBounds(445, 442, 25, 25);
		
		slt.setBounds(92,502,150,25);
		st1.setBounds(170,490,50,50);
		cb3s.setBounds(230,502,130,25);
		spin3s.setBounds(370,502,30,25);
		stf3.setBounds(410,502,25,25);
		stubefinal.setBounds(445, 502, 25, 25);
		
		slh.setBounds(100,562,150,25);
		sh1.setBounds(170,550,50,50);
		cb4s.setBounds(230,562,130,25);
		spin4s.setBounds(370,562,30,25);
		stf4.setBounds(410,562,25,25);
		sheatfinal.setBounds(445, 562, 25, 25);
		
		slo.setBounds(112,622,150,25);
		so1.setBounds(170,610,50,50);
		cb5s.setBounds(230,622,130,25);
		spin5s.setBounds(370,622,30,25);
		stf5.setBounds(410,622,25,25);
		sotherfinal.setBounds(445, 622, 25, 25);
		
		//tooltip
		spin1s.setToolTipText("Select no of items");
		spin2s.setToolTipText("Select no of items");
		spin3s.setToolTipText("Select no of items");
		spin4s.setToolTipText("Select no of items");
		spin5s.setToolTipText("Select no of items");
		
		stf1.setToolTipText("Enter Avg Daily Use");		
		stf2.setToolTipText("Enter Avg Daily Use");		
		stf3.setToolTipText("Enter Avg Daily Use");		
		stf4.setToolTipText("Enter Avg Daily Use");		
		stf5.setToolTipText("Enter Avg Daily Use");		
		ToolTipManager.sharedInstance().setInitialDelay(0);
		
		//adding
		mainpanel.add(slb);
		mainpanel.add(sb1);
        mainpanel.add(cb1s);
		mainpanel.add(spin1s);
		mainpanel.add(stf1);
		mainpanel.add(sbulbfinal);
		
		mainpanel.add(sll);
		mainpanel.add(sl1);
		mainpanel.add(cb2s);
		mainpanel.add(spin2s);
		mainpanel.add(stf2);
		mainpanel.add(slampfinal);
		
		mainpanel.add(slt);
		mainpanel.add(st1);
        mainpanel.add(cb3s);
		mainpanel.add(spin3s);
		mainpanel.add(stf3);
		mainpanel.add(stubefinal);
		
		mainpanel.add(slh);
		mainpanel.add(sh1);
        mainpanel.add(cb4s);
		mainpanel.add(spin4s);
		mainpanel.add(stf4);
		mainpanel.add(sheatfinal);
		
		mainpanel.add(slo);
		mainpanel.add(so1);
        mainpanel.add(cb5s);
		mainpanel.add(spin5s);
		mainpanel.add(stf5);
		mainpanel.add(sotherfinal);
		
	}
	
	public void bulbActionPerformed(ActionEvent evtb) 
	{
		String result = (((JButton) evtb.getSource()).getIcon()).toString();
		
		if (result.equals(scfl1.toString()))	
		{
			sb1.setIcon(scfl2);	
			SumBulb obj2 = new SumBulb(mainpanel, cb1s, spin1s, stf1, sbulbfinal);
		}
		if (result.equals(scfl2.toString()))				
		{
			sb1.setIcon(scfl1);
			spin1s.setEnabled(false);
			cb1s.setEnabled(false);
		}	
	}
	
	public void lampActionPerformed(ActionEvent evtg)
	{
		String result = (((JButton) evtg.getSource()).getIcon()).toString();
		if (result.equals(slamp1.toString()))	
		{
			sl1.setIcon(slamp2);
			SumLamp obj3 = new SumLamp (mainpanel, cb2s, spin2s, stf2, slampfinal);
		}
		if (result.equals(slamp2.toString()))
		{
			sl1.setIcon(slamp1);
			spin2s.setEnabled(false);
			cb2s.setEnabled(false);
		}
	}
	public void tubeActionPerformed(ActionEvent evtt)
	{
		String result = (((JButton) evtt.getSource()).getIcon()).toString();
		if (result.equals(stube1.toString()))	
		{
			st1.setIcon(stube2);
			SumTube obj4 = new SumTube (mainpanel, cb3s, spin3s, stf3, stubefinal);
		}
		if (result.equals(stube2.toString()))
		{
			st1.setIcon(stube1);
			spin3s.setEnabled(false);
			cb3s.setEnabled(false);
		}
	}
	public void heatActionPerformed(ActionEvent evth)
	{
		String result = (((JButton) evth.getSource()).getIcon()).toString();
		if (result.equals(sheat1.toString()))	
		{
			sh1.setIcon(sheat2);
			SumHeat obj5 = new SumHeat (mainpanel, cb4s, spin4s, stf4, sheatfinal);
		}
		if (result.equals(sheat2.toString()))
		{
			sh1.setIcon(sheat1);
			spin4s.setEnabled(false);
			cb4s.setEnabled(false);
		}
	}
	public void otherActionPerformed(ActionEvent evth)
	{
		String result = (((JButton) evth.getSource()).getIcon()).toString();
		if (result.equals(sother1.toString()))	
		{
			so1.setIcon(sother2);
			SumOther obj6 = new SumOther (mainpanel, cb5s, spin5s, stf5, sotherfinal);
		}
		if (result.equals(sother2.toString()))
		{
			so1.setIcon(sother1);
			spin5s.setEnabled(false);
			cb5s.setEnabled(false);
		}
	}
	public void actionPerformed(ActionEvent e) {}
}
