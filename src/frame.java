
import java.awt.*;
import javax.swing.*;


public class frame extends JFrame

{
	public static JPanel mainpanel = new JPanel();
	public static final JTabbedPane tpane = new JTabbedPane();
	
	
	JSeparator vertical1 = new JSeparator(JSeparator.VERTICAL);
	JSeparator vertical2 = new JSeparator(JSeparator.VERTICAL);
	JSeparator horizontal1 = new JSeparator(JSeparator.HORIZONTAL);
	JSeparator horizontal2 = new JSeparator(JSeparator.HORIZONTAL);
	
	
	JLabel head1 = new JLabel();
	JLabel head2 = new JLabel();
	JLabel head3 = new JLabel();
	
	public static JPanel cpanel = new JPanel();
	public static JPanel spanel = new JPanel();
	String inst = new String ("Instructions");
	String selected = new String ("Selected Items");
	
	//instructions buttons
	JLabel ib1 = new JLabel();
	JLabel ib2 = new JLabel();
	JLabel ib3 = new JLabel();
	JComboBox icb1 = new JComboBox();
	JSpinner is1 = new JSpinner();
	ImageIcon ig = new ImageIcon(getClass().getResource("/igreen.jpg"));
	ImageIcon ir = new ImageIcon(getClass().getResource("/ired.jpg"));
	ImageIcon it = new ImageIcon(getClass().getResource("/green_tick.png"));
	JLabel lf1 = new JLabel("1. Click on the red button ");
	JLabel lf2 = new JLabel(" to activate and turn it into green button");
	JLabel ls1 = new JLabel("2. Select the type of equipment from ");
	JLabel lt1 = new JLabel("3. Select the no. of items from ");
	JLabel lt2 = new JLabel(" and fill the no of hrs of avg daily use");
	JLabel lf3 = new JLabel("4. Click on        to lock the selection.");
	JLabel lr1 = new JLabel("5. Click Result to see a graphical result and suggestions.");
	
	//for Selected Panel
	JLabel UseWin = new JLabel("Winter");
	JLabel UseSum = new JLabel("Summer");
	JLabel UseMod = new JLabel("Moderate");
	
	JLabel bulb = new JLabel("CFL Bulb");
	JLabel lamp = new JLabel("Regular Bulbs/Lamps");
	JLabel tlight = new JLabel("Tubelights");
	JLabel air = new JLabel("Air Temp");
	JLabel others = new JLabel("Others");
	
	JLabel sbulb = new JLabel("CFL Bulb");
	JLabel slamp = new JLabel("Regular Bulbs/Lamps");
	JLabel stlight = new JLabel("Tubelights");
	JLabel sair = new JLabel("Air Temp");
	JLabel sothers = new JLabel("Others");
	
	JLabel mbulb = new JLabel("CFL Bulb");
	JLabel mlamp = new JLabel("Regular Bulbs/Lamps");
	JLabel mtlight = new JLabel("Tubelights");
	JLabel mair = new JLabel("Air Temp");
	JLabel mothers = new JLabel("Others");

    public frame()
	{
		mainpanel.setLayout(null);
		
		
		//Formatting
		head1.setText("Winter - Nov, Dec, Jan, Feb");
		head1.setFont(new Font ("Tohoma", 3, 16));
		head2.setText("Summer - Mar, Apr, May, Jun");
		head2.setFont(new Font ("Tohoma", 3, 16));
		head3.setText("Moderate - Jul, Aug, Sept, Oct");
		head3.setFont(new Font ("Tohoma", 3, 16));
		
		lf1.setFont(new Font ("Tohoma", 1, 13));
		lf2.setFont(new Font ("Tohoma", 1, 13));
		ls1.setFont(new Font ("Tohoma", 1, 13));
		lt1.setFont(new Font ("Tohoma", 1, 13));
		lt2.setFont(new Font ("Tohoma", 1, 13));
		lf3.setFont(new Font ("Tohoma", 1, 13));
		lr1.setFont(new Font ("Tohoma", 1, 13));
		
		bulb.setFont(new Font ("Tohoma", 1, 10));
		lamp.setFont(new Font ("Tohoma", 1, 10));
		tlight.setFont(new Font ("Tohoma", 1, 10));
		air.setFont(new Font ("Tohoma", 1, 10));
		others.setFont(new Font ("Tohoma", 1, 10));
		
		sbulb.setFont(new Font ("Tohoma", 1, 10));
		slamp.setFont(new Font ("Tohoma", 1, 10));
		stlight.setFont(new Font ("Tohoma", 1, 10));
		sair.setFont(new Font ("Tohoma", 1, 10));
		sothers.setFont(new Font ("Tohoma", 1, 10));
		
		mbulb.setFont(new Font ("Tohoma", 1, 10));
		mlamp.setFont(new Font ("Tohoma", 1, 10));
		mtlight.setFont(new Font ("Tohoma", 1, 10));
		mair.setFont(new Font ("Tohoma", 1, 10));
		mothers.setFont(new Font ("Tohoma", 1, 10));
		
		UseWin.setFont(new Font ("Tohoma", 1, 12));
		UseSum.setFont(new Font ("Tohoma", 1, 12));
		UseMod.setFont(new Font ("Tohoma", 1, 12));
		
		//instruction buttons
		ib1.setIcon(ir);
		ib2.setIcon(ig);
	    	ib3.setIcon(it);
	    	icb1.setEnabled(false);
	    	is1.setEnabled(false);
	    
	    	lf1.setBounds(10,    15, 180,15);			//"1. Click on the red button "
	    	ib1.setBounds(175,  12, 20, 20);			
		lf2.setBounds(198,  15, 280, 15);			//" to activate and turn it into green button");
		ib2.setBounds(455,  12, 20, 20);
		
		ls1.setBounds(10, 45, 257, 15);				//"2. Select the type of equipment from "
		icb1.setBounds(245, 43, 60, 20);
		
		lt1.setBounds(10,   75, 220, 15);			//"3. Select the no. of items from "
		is1.setBounds(205, 73,  30, 20);
		lt2.setBounds(237, 75, 250, 15);			//" and fill the no of hours of avg daily use"
		
		lf3.setBounds(10, 105, 250,15);				//"4. Click on     to lock the selection."
		ib3.setBounds(80,98,30,30);

		lr1.setBounds(10,  135, 378, 20);			//"4. Click Result to see the result."
		
	    	head1.setBounds(150,5,350,25);
		head2.setBounds(150,345,350,25);
        	head3.setBounds(650,5,350,25);
        
        	horizontal1.setBounds(0, 340, 490, 2);
		horizontal2.setBounds(490, 340, 490, 2);
		vertical1.setBounds(490, 0, 2, 350);
		vertical2.setBounds(490, 350, 2, 350);

		bulb.setBounds(10, 20, 150, 20);
		lamp.setBounds(10, 35, 150, 20);
		tlight.setBounds(10,50,150, 20);
		air.setBounds(10, 65, 150, 20);
		others.setBounds(10, 80, 150, 20);
		
		sbulb.setBounds(10, 125, 150, 20);
		slamp.setBounds(10, 140, 150, 20);
		stlight.setBounds(10,155,150, 20);
		sair.setBounds(10, 170, 150, 20);
		sothers.setBounds(10,185, 150, 20);
		
		mbulb.setBounds(10, 225, 150, 20);
		mlamp.setBounds(10, 240, 150, 20);
		mtlight.setBounds(10,255,150, 20);
		mair.setBounds(10, 270, 150, 20);
		mothers.setBounds(10, 285, 150, 20);
		
		UseWin.setBounds(0,0,100,25);
		UseSum.setBounds(0,105,100,25);
		UseMod.setBounds(0,205,100,25);
		
		tpane.setBounds(490,340, 500, 350);
		
		cpanel.setLayout(null);
		spanel.setLayout(null);
		
		cpanel.add(lf1);
	    	cpanel.add(ib1);
	    cpanel.add(lf2);
	    cpanel.add(ib2);
	    cpanel.add(ls1);
	    cpanel.add(icb1);
	    cpanel.add(lt1);
	    cpanel.add(is1);
	    cpanel.add(lt2);
	    cpanel.add(lf3);
	    cpanel.add(ib3);
	    cpanel.add(lr1);
	  	    
	    spanel.add(bulb);
	    spanel.add(lamp);
	    spanel.add(tlight);
	    spanel.add(air);
	    spanel.add(others);
	    
	    spanel.add(mbulb);
	    spanel.add(mlamp);
	    spanel.add(mtlight);
	    spanel.add(mair);
	    spanel.add(mothers);
	    
	    spanel.add(sbulb);
	    spanel.add(slamp);
	    spanel.add(stlight);
	    spanel.add(sair);
	    spanel.add(sothers);
	    
	    spanel.add(UseWin);
	    spanel.add(UseSum);
	    spanel.add(UseMod);
	    
	    tpane.add(inst, cpanel);
	    tpane.add(selected, spanel);
				
		add(mainpanel);
	    
		mainpanel.add(head1);
        	mainpanel.add(head2);
        	mainpanel.add(head3);
        
        	mainpanel.add(horizontal1);
		mainpanel.add(horizontal2);
		mainpanel.add(vertical1);
		mainpanel.add(vertical2);
		
		mainpanel.add(tpane);
		
		WinterComp objwincomp = new WinterComp(mainpanel);
		//System.out.println("Wintercomp called?");
		SummerComp objsumcomp = new SummerComp(mainpanel);
		//System.out.println("Summercomp called?");
		ModerateComp objmodcomp = new ModerateComp(mainpanel);
		//System.out.println("ModerateComp called?");
		Result objresult = new Result(mainpanel);
		//System.out.println("Result called?");
		
	}
	
	public static void main(String[] args) 
	{
		frame obj = new frame();
		obj.setSize(1000,720);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
		obj.setResizable(false);
		obj.setTitle("Electricty Bill Calculator");
	}

}
