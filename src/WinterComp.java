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

public class WinterComp 
{
	JPanel mainpanel;

	JButton b1 = new JButton();
	JButton t1 = new JButton();
	JButton h1 = new JButton();
	JButton o1 = new JButton();
	JButton l1 = new JButton();
	
	JButton bulbfinal = new JButton();
	JButton lampfinal = new JButton();
	JButton tubefinal = new JButton();
	JButton heatfinal = new JButton();
	JButton otherfinal = new JButton();
	
	ImageIcon cfl1 = 	new ImageIcon(getClass().getResource("/cflred.jpg"));
	ImageIcon cfl2 = 	new ImageIcon(getClass().getResource("/cflgreen.JPG"));
	ImageIcon tube1 = 	new ImageIcon(getClass().getResource("/tubered.jpg"));
	ImageIcon tube2 = 	new ImageIcon(getClass().getResource("/tubegreen.JPG"));
	ImageIcon heat1 = 	new ImageIcon(getClass().getResource("/heatred.jpg"));
	ImageIcon heat2 = 	new ImageIcon(getClass().getResource("/heatgreen.JPG"));
	ImageIcon lamp1 = 	new ImageIcon(getClass().getResource("/lampred.jpg"));
	ImageIcon lamp2 = 	new ImageIcon(getClass().getResource("/lampgreen.JPG"));
	ImageIcon other1 = 	new ImageIcon(getClass().getResource("/otred.jpg"));
	ImageIcon other2 = 	new ImageIcon(getClass().getResource("/otgreen.JPG"));
	ImageIcon tick = 	new ImageIcon(getClass().getResource("/green_tick.png"));
	
	SpinnerModel sm1 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm2 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm3 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm4 = new SpinnerNumberModel(0,0,5,1);
	SpinnerModel sm5 = new SpinnerNumberModel(0,0,5,1);
	
	JSpinner spin1 = new JSpinner(sm1);
	JSpinner spin2 = new JSpinner(sm2);
	JSpinner spin3 = new JSpinner(sm3);
	JSpinner spin4 = new JSpinner(sm4);
	JSpinner spin5 = new JSpinner(sm5);
	
	JComboBox cb1 = new JComboBox();
	JComboBox cb2 = new JComboBox();
	JComboBox cb3 = new JComboBox();
	JComboBox cb4 = new JComboBox();
	JComboBox cb5 = new JComboBox();

	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	
	JLabel lb = new JLabel("CFL Bulb :");
	JLabel ll = new JLabel("Regular Bulbs/Lamps :");
	JLabel lt = new JLabel("Tubelights :");
	JLabel lh = new JLabel("Air Temp :");
	JLabel lo = new JLabel("Others :");

	public WinterComp(JPanel mainpanel)
	{
				
		mainpanel.setLayout(null);
		this.mainpanel = mainpanel;
		
		//set Icons
		b1.setIcon(cfl1);
		o1.setIcon(other1);
		t1.setIcon(tube1);
		h1.setIcon(heat1);
		l1.setIcon(lamp1);
		
		bulbfinal.setIcon(tick);
		lampfinal.setIcon(tick);
		tubefinal.setIcon(tick);
		heatfinal.setIcon(tick);
		otherfinal.setIcon(tick);
		
		//Action Listeners
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt) 
        
			{
				bulbActionPerformed(evt);
			}
		});
		o1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {otherActionPerformed(evt);}});
		t1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {tubeActionPerformed(evt);}});
		h1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {heatActionPerformed(evt);}});
		l1.addActionListener(new ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt) 
        {lampActionPerformed(evt);}});
		
		//defining
		cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "CFL - 11 W", "CFL - 18 W", "CFL - 26 W" }));
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Bulb - 40 W", "Bulb - 60 W", "Bulb - 100 W" }));
        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "LED - 9 W", "Elec Choke - 36 W", "Ord. Choke - 52 W" }));
        cb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Heater 1.2KW", "Heater 1.5KW", "Heater 2KW" }));
        cb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select An Item", "Geyser", "Fridge", "TV" }));
        
        //enabling
        cb1.setEnabled(false);
        cb2.setEnabled(false);
        cb3.setEnabled(false);
        cb4.setEnabled(false);
        cb5.setEnabled(false);
        
        spin1.setEnabled(false);
        spin2.setEnabled(false);
        spin3.setEnabled(false);
        spin4.setEnabled(false);
        spin5.setEnabled(false);
        
        //positioning
        lb.setBounds(102,42,150,25);
        b1.setBounds(170,30,50,50);
		cb1.setBounds(230,42,130,25);
		spin1.setBounds(370,42,30,25);
		tf1.setBounds(410,42,25,25);
		bulbfinal.setBounds(445, 42, 25, 25);
		
		ll.setBounds(30,102,150,25);
		l1.setBounds(170,90,50,50);
		cb2.setBounds(230,102,130,25);
		spin2.setBounds(370,102,30,25);
		tf2.setBounds(410,102,25,25);
		lampfinal.setBounds(445, 102, 25, 25);
		
		lt.setBounds(92,162,150,25);
		t1.setBounds(170,150,50,50);
		cb3.setBounds(230,162,130,25);
		spin3.setBounds(370,162,30,25);
		tf3.setBounds(410,162,25,25);
		tubefinal.setBounds(445,162,25,25);		
		
		lh.setBounds(100,222,150,25);
		h1.setBounds(170,210,50,50);
		cb4.setBounds(230,222,130,25);
		spin4.setBounds(370,222,30,25);
		tf4.setBounds(410,222,25,25);
		heatfinal.setBounds(445, 222, 25, 25);
		
		lo.setBounds(112,282,150,25);
		o1.setBounds(170,270,50,50);
		cb5.setBounds(230,282,130,25);
		spin5.setBounds(370,282,30,25);
		tf5.setBounds(410,282,25,25);
		otherfinal.setBounds(445,282,25,25);
		
		//tooltip
		spin1.setToolTipText("Select no of items");
		spin2.setToolTipText("Select no of items");
		spin3.setToolTipText("Select no of items");
		spin4.setToolTipText("Select no of items");
		spin5.setToolTipText("Select no of items");
		
		tf1.setToolTipText("Enter Avg Daily Use");		
		tf2.setToolTipText("Enter Avg Daily Use");		
		tf3.setToolTipText("Enter Avg Daily Use");		
		tf4.setToolTipText("Enter Avg Daily Use");		
		tf5.setToolTipText("Enter Avg Daily Use");
		ToolTipManager.sharedInstance().setInitialDelay(0);
		
		//adding
		mainpanel.add(lb);
		mainpanel.add(b1);
        mainpanel.add(cb1);
		mainpanel.add(spin1);
		mainpanel.add(tf1);
		mainpanel.add(bulbfinal);
		
		mainpanel.add(ll);
		mainpanel.add(l1);
		mainpanel.add(cb2);
		mainpanel.add(spin2);
		mainpanel.add(tf2);
		mainpanel.add(lampfinal);
		
		mainpanel.add(lt);
		mainpanel.add(t1);
        mainpanel.add(cb3);
		mainpanel.add(spin3);
		mainpanel.add(tf3);
		mainpanel.add(tubefinal);
		
		mainpanel.add(lh);
		mainpanel.add(h1);
        mainpanel.add(cb4);
		mainpanel.add(spin4);
		mainpanel.add(tf4);
		mainpanel.add(heatfinal);
		
		mainpanel.add(lo);
		mainpanel.add(o1);
        mainpanel.add(cb5);
		mainpanel.add(spin5);
		mainpanel.add(tf5);
		mainpanel.add(otherfinal);
		
	}
	
	public void bulbActionPerformed(ActionEvent evtb) 
	{
		String result = (((JButton) evtb.getSource()).getIcon()).toString();
		
		if (result.equals(cfl1.toString()))	
		{
			b1.setIcon(cfl2);	
			WinBulb obj2 = new WinBulb(mainpanel, cb1, spin1, tf1, bulbfinal);
		}
		if (result.equals(cfl2.toString()))				
		{
			b1.setIcon(cfl1);
			spin1.setEnabled(false);
			cb1.setEnabled(false);
		}
	}
	
	public void lampActionPerformed(ActionEvent evtg)
	{
		String result = (((JButton) evtg.getSource()).getIcon()).toString();
		if (result.equals(lamp1.toString()))	
		{
			l1.setIcon(lamp2);
			WinLamp obj3 = new WinLamp (mainpanel, cb2, spin2, tf2, lampfinal);
		}
		if (result.equals(lamp2.toString()))		
		{
			l1.setIcon(lamp1);
			spin2.setEnabled(false);
			cb2.setEnabled(false);
		}
	}
	public void tubeActionPerformed(ActionEvent evtt)
	{
		String result = (((JButton) evtt.getSource()).getIcon()).toString();
		if (result.equals(tube1.toString()))	
		{
			t1.setIcon(tube2);
			WinTube obj4 = new WinTube (mainpanel, cb3, spin3, tf3, tubefinal);
		}
		if (result.equals(tube2.toString()))		
		{
			t1.setIcon(tube1);
			spin3.setEnabled(false);
			cb3.setEnabled(false);
		}
	}
	public void heatActionPerformed(ActionEvent evth)
	{
		String result = (((JButton) evth.getSource()).getIcon()).toString();
		if (result.equals(heat1.toString()))	
		{
			h1.setIcon(heat2);
			WinHeat obj5 = new WinHeat (mainpanel, cb4, spin4, tf4, heatfinal);
		}
		if (result.equals(heat2.toString()))		
		{
			h1.setIcon(heat1);
			spin4.setEnabled(false);
			cb4.setEnabled(false);
		}
	}
	public void otherActionPerformed(ActionEvent evto)
	{
		String result = (((JButton) evto.getSource()).getIcon()).toString();
		if (result.equals(other1.toString()))	
		{
			o1.setIcon(other2);
			WinOther obj6 = new WinOther (mainpanel, cb5, spin5, tf5, otherfinal);
		}
		if (result.equals(other2.toString()))		
		{
			o1.setIcon(other1);
			spin5.setEnabled(false);
			cb5.setEnabled(false);
		}
	}
	public void actionPerformed(ActionEvent e) {}
}
