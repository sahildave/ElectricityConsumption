

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Result implements ActionListener
{
	JButton result = new JButton ("Result");
	JPanel mainpanel = new JPanel();
	
	public Result(JPanel mainpanel)
	{
		this.mainpanel=mainpanel;
		result.setBounds(20,180,70,25);
		frame.cpanel.add(result);
		
		result.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{

		//System.out.println("sent - " +WinBulb.valueb1+","+WinBulb.valueb2+","+WinBulb.valueb3);
		
		new Chart(WinBulb.valueb1,WinBulb.valueb2,WinBulb.valueb3,
				  WinLamp.valuel1,WinLamp.valuel2,WinLamp.valuel3,
				  WinTube.valuet1,WinTube.valuet2,WinTube.valuet3,
				  WinHeat.valueh1,WinHeat.valueh2,WinHeat.valueh3,
				  WinOther.valueo1,WinOther.valueo2,WinOther.valueo3,
				  
				  WinBulb.useob1,WinBulb.useob2,WinBulb.useob3,
				  WinLamp.useol1,WinLamp.useol2,WinLamp.useol3,
				  WinTube.useot1,WinTube.useot2,WinTube.useot3,
				  WinHeat.useoh1,WinHeat.useoh2,WinHeat.useoh3,
				  WinOther.useoo1,WinOther.useoo2,WinOther.useoo3,
				  
				  SumBulb.valuesb1,SumBulb.valuesb2,SumBulb.valuesb3,
				  SumLamp.valuesl1,SumLamp.valuesl2,SumLamp.valuesl3,
				  SumTube.valuest1,SumTube.valuest2,SumTube.valuest3,
				  SumHeat.valuesh1,SumHeat.valuesh2,SumHeat.valuesh3,
				  SumOther.valueso1,SumOther.valueso2,SumOther.valueso3,
				  
				  SumBulb.useosb1,SumBulb.useosb2,SumBulb.useosb3,
				  SumLamp.useosl1,SumLamp.useosl2,SumLamp.useosl3,
				  SumTube.useost1,SumTube.useost2,SumTube.useost3,
				  SumHeat.useosh1,SumHeat.useosh2,SumHeat.useosh3,
				  SumOther.useoso1,SumOther.useoso2,SumOther.useoso3,
				  
				  ModBulb.valuemb1,ModBulb.valuemb2,ModBulb.valuemb3,
				  ModLamp.valueml1,ModLamp.valueml2,ModLamp.valueml3,
				  ModTube.valuemt1,ModTube.valuemt2,ModTube.valuemt3,
				  ModHeat.valuemh1,ModHeat.valuemh2,ModHeat.valuemh3,
				  ModOther.valuemo1,ModOther.valuemo2,ModOther.valuemo3,
				  
				  ModBulb.useomb1,ModBulb.useomb2,ModBulb.useomb3,
				  ModLamp.useoml1,ModLamp.useoml2,ModLamp.useoml3,
				  ModTube.useomt1,ModTube.useomt2,ModTube.useomt3,
				  ModHeat.useomh1,ModHeat.useomh2,ModHeat.useomh3,
				  ModOther.useomo1,ModOther.useomo2,ModOther.useomo3,
				  
				  frame.tpane);
		//Chart.main(null);
		
		frame.tpane.setSelectedIndex(2);
		
	}

}
