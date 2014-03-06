

import java.lang.Math;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Paint;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StandardGradientPaintTransformer;


public class Chart extends ApplicationFrame 

{
	public static double valuewb1,valuewb2,valuewb3,
						 valuewl1,valuewl2,valuewl3,
						 valuewt1,valuewt2,valuewt3,
						 valuewh1,valuewh2,valuewh3,
						 valuewo1,valuewo2,valuewo3,
						 
						 valuesb1,valuesb2,valuesb3,
						 valuesl1,valuesl2,valuesl3,
						 valuest1,valuest2,valuest3,
						 valuesh1,valuesh2,valuesh3,
						 valueso1,valueso2,valueso3,
						 
						 valuemb1,valuemb2,valuemb3,
						 valueml1,valueml2,valueml3,
						 valuemt1,valuemt2,valuemt3,
						 valuemh1,valuemh2,valuemh3,
						 valuemo1,valuemo2,valuemo3,
						 
						 finalsum, finalwin, finalmod;
	
	public String chartstring = new String("CHART");
	public String sugg = new String ("SUGGESTIONS");
	
	public JTabbedPane tpane = new JTabbedPane();
	
	public JPanel spanel = new JPanel();
  
	public Chart(double wb1, double wb2, double wb3,
				 double wl1, double wl2, double wl3,
				 double wt1, double wt2, double wt3,
				 double wh1, double wh2, double wh3,
				 double wo1, double wo2, double wo3,
				
				 String useowb1, String useowb2, String useowb3, 
				 String useowl1, String useowl2, String useowl3, 
				 String useowt1, String useowt2, String useowt3, 
				 String useowh1, String useowh2, String useowh3, 
				 String useowo1, String useowo2, String useowo3, 
				 
				 double sb1, double sb2, double sb3,
				 double sl1, double sl2, double sl3,
				 double st1, double st2, double st3,
				 double sh1, double sh2, double sh3,
				 double so1, double so2, double so3,
				 
				 String useosb1, String useosb2, String useosb3, 
				 String useosl1, String useosl2, String useosl3, 
				 String useost1, String useost2, String useost3, 
				 String useosh1, String useosh2, String useosh3, 
				 String useoso1, String useoso2, String useoso3, 
				 
				 double mb1, double mb2, double mb3,
				 double ml1, double ml2, double ml3,
				 double mt1, double mt2, double mt3,
				 double mh1, double mh2, double mh3,
				 double mo1, double mo2, double mo3,
				 
				 String useomb1, String useomb2, String useomb3, 
				 String useoml1, String useoml2, String useoml3, 
				 String useomt1, String useomt2, String useomt3, 
				 String useomh1, String useomh2, String useomh3, 
				 String useomo1, String useomo2, String useomo3, 
				 
				 JTabbedPane tpane2) 
	{
        super(null);
        tpane.setLayout(null);
        tpane = tpane2;
               
        valuewb1 = Math.sqrt(wb1*11)*(Integer.parseInt(useowb1));
    	valuewb2 = Math.sqrt(wb2*18)*(Integer.parseInt(useowb2));
    	valuewb3 = Math.sqrt(wb3*26)*(Integer.parseInt(useowb3));
    	
    	valuewl1 = Math.sqrt(wl1*40)*(Integer.parseInt(useowl1));
    	valuewl2 = Math.sqrt(wl2*60)*(Integer.parseInt(useowl2));
    	valuewl3 = Math.sqrt(wl3*100)*(Integer.parseInt(useowl3));
    	
    	valuewt1 = Math.sqrt(wt1*9)*(Integer.parseInt(useowt1));
    	valuewt2 = Math.sqrt(wt2*36)*(Integer.parseInt(useowt2));
    	valuewt3 = Math.sqrt(wt3*52)*(Integer.parseInt(useowt3));
    	
    	valuewh1 = Math.sqrt(wh1*1200)*(Integer.parseInt(useowh1));
    	valuewh2 = Math.sqrt(wh2*1500)*(Integer.parseInt(useowh2));
    	valuewh3 = Math.sqrt(wh3*2000)*(Integer.parseInt(useowh3));
    	
    	valuewo1 = Math.sqrt(wo1*1200)*(Integer.parseInt(useowo1));
    	valuewo2 = Math.sqrt(wo2*1500)*(Integer.parseInt(useowo2));
    	valuewo3 = Math.sqrt(wo3*2000)*(Integer.parseInt(useowo3));
    	
    	
    	
    	finalwin =  valuewb1+valuewb2+valuewb3+
		 			valuewl1+valuewl2+valuewl3+
		 			valuewt1+valuewt2+valuewt3+
		 			valuewh1+valuewh2+valuewh3+
		 			valuewo1+valuewo2+valuewo3;
    	
    	valuesb1 = Math.sqrt(sb1*11)*(Integer.parseInt(useosb1));
     	valuesb2 = Math.sqrt(sb2*18)*(Integer.parseInt(useosb2));
     	valuesb3 = Math.sqrt(sb3*26)*(Integer.parseInt(useosb3));
     	
     	valuesl1 = Math.sqrt(sl1*40)*(Integer.parseInt(useosl1));
     	valuesl2 = Math.sqrt(sl2*60)*(Integer.parseInt(useosl2));
     	valuesl3 = Math.sqrt(sl3*100)*(Integer.parseInt(useosl3));
     	
     	valuest1 = Math.sqrt(st1*9)*(Integer.parseInt(useost1));
     	valuest2 = Math.sqrt(st2*36)*(Integer.parseInt(useost2));
     	valuest3 = Math.sqrt(st3*52)*(Integer.parseInt(useost3));
     	
     	valuesh1 = Math.sqrt(sh1*1200)*(Integer.parseInt(useosh1));
     	valuesh2 = Math.sqrt(sh2*1500)*(Integer.parseInt(useosh2));
     	valuesh3 = Math.sqrt(sh3*2000)*(Integer.parseInt(useosh3));
     	
     	valueso1 = Math.sqrt(so1*1200)*(Integer.parseInt(useoso1));
     	valueso2 = Math.sqrt(so2*1500)*(Integer.parseInt(useoso2));
     	valueso3 = Math.sqrt(so3*2000)*(Integer.parseInt(useoso3));
     	
     	finalsum =  valuesb1+valuesb2+valuesb3+
		 			valuesl1+valuesl2+valuesl3+
		 			valuest1+valuest2+valuest3+
		 			valuesh1+valuesh2+valuesh3+
		 			valueso1+valueso2+valueso3;
		 
     	
     	valuemb1 = Math.sqrt(mb1*11)*(Integer.parseInt(useomb1));
     	valuemb2 = Math.sqrt(mb2*18)*(Integer.parseInt(useomb2));
     	valuemb3 = Math.sqrt(mb3*26)*(Integer.parseInt(useomb3));
     	
     	valueml1 = Math.sqrt(ml1*40)*(Integer.parseInt(useoml1));
     	valueml2 = Math.sqrt(ml2*60)*(Integer.parseInt(useoml2));
     	valueml3 = Math.sqrt(ml3*100)*(Integer.parseInt(useoml3));
     	
     	valuemt1 = Math.sqrt(mt1*9)*(Integer.parseInt(useomt1));
     	valuemt2 = Math.sqrt(mt2*36)*(Integer.parseInt(useomt2));
     	valuemt3 = Math.sqrt(mt3*52)*(Integer.parseInt(useomt3));
     	
     	valuemh1 = Math.sqrt(mh1*1200)*(Integer.parseInt(useomh1));
     	valuemh2 = Math.sqrt(mh2*1500)*(Integer.parseInt(useomh2));
     	valuemh3 = Math.sqrt(mh3*2000)*(Integer.parseInt(useomh3));
     	
     	valuemo1 = Math.sqrt(mo1*1200)*(Integer.parseInt(useomo1));
     	valuemo2 = Math.sqrt(mo2*1500)*(Integer.parseInt(useomo2));
     	valuemo3 = Math.sqrt(mo3*2000)*(Integer.parseInt(useomo3));
    	
     	
     	
     	finalmod =  valuemb1+valuemb2+valuemb3+
		 			valueml1+valueml2+valueml3+
		 			valuemt1+valuemt2+valuemt3+
		 			valuemh1+valuemh2+valuemh3+
		 			valuemo1+valuemo2+valuemo3;
     	
     	final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        
        JLabel Beta = new JLabel("Sorry! In Beta Mode");
        Beta.setFont(new Font ("Tohoma", 2, 12));
        Beta.setBounds(0,0,100,25);
        spanel.add(Beta);
        
        tpane.add(chartstring , chartPanel);
        tpane.add(sugg , spanel);
        
    }
    
    private CategoryDataset createDataset() 
    {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        
        result.addValue(valuewb1,		"Bulb CFL", "Winter");
        result.addValue(valuesb1, 		"Bulb CFL", "Summer");
        result.addValue(valuemb1, 		"Bulb CFL", "Moderate");
        result.addValue(valuewb2, 		"Bulb 100W", "Winter");
        result.addValue(valuesb2, 		"Bulb 100W", "Summer");
        result.addValue(valuemb2, 		"Bulb 100W", "Moderate");
        result.addValue(valuewb3, 		"Bulb 200W", "Winter");
        result.addValue(valuesb3, 		"Bulb 200W", "Summer");
        result.addValue(valuemb3, 		"Bulb 200W", "Moderate");
  
        result.addValue(valuewl1, 		"Lamp 100W", "Winter");
        result.addValue(valuesl1, 		"Lamp 100W", "Summer");
        result.addValue(valueml1,		"Lamp 100W", "Moderate");
        result.addValue(valuewl2,		"Lamp 200W", "Winter");
        result.addValue(valuesl2,		"Lamp 200W", "Summer");
        result.addValue(valueml2, 		"Lamp 200W", "Moderate");
        result.addValue(valuewl3, 		"Lamp 300W", "Winter");
        result.addValue(valuesl3, 		"Lamp 300W", "Summer");
        result.addValue(valueml3, 		"Lamp 300W", "Moderate");

        result.addValue(valuewt1, 		"Tube CFL", "Winter");
        result.addValue(valuest1, 		"Tube CFL", "Summer");
        result.addValue(valuemt1, 		"Tube CFL", "Moderate");
        result.addValue(valuewt2, 		"Tube 100W", "Winter");
        result.addValue(valuest2, 		"Tube 100W", "Summer");
        result.addValue(valuemt2, 		"Tube 100W", "Moderate");
        result.addValue(valuewt3,		"Tube 200W", "Winter");
        result.addValue(valuest3, 		"Tube 200W", "Summer");
        result.addValue(valuemt3, 		"Tube 200W", "Moderate");
        
        result.addValue(valuewh1, 		"Heater 100W", "Winter");
        result.addValue(valuesh1, 		"Heater 100W", "Summer");
        result.addValue(valuemh1,		"Heater 100W", "Moderate");
        result.addValue(valuewh2,		"Heater 200W", "Winter");
        result.addValue(valuesh2,		"Heater 200W", "Summer");
        result.addValue(valuemh2, 		"Heater 200W", "Moderate");
        result.addValue(valuewh3, 		"Heater 300W", "Winter");
        result.addValue(valuesh3, 		"Heater 300W", "Summer");
        result.addValue(valuemh3, 		"Heater 300W", "Moderate");
 
        result.addValue(valuewo1, 		"Others 100W", "Winter");
        result.addValue(valueso1, 		"Others 100W", "Summer");
        result.addValue(valuemo1,		"Others 100W", "Moderate");
        result.addValue(valuewo2,		"Others 200W", "Winter");
        result.addValue(valueso2,		"Others 200W", "Summer");
        result.addValue(valuemo2, 		"Others 200W", "Moderate");
        result.addValue(valuewo3, 		"Others 300W", "Winter");
        result.addValue(valueso3, 		"Others 300W", "Summer");
        result.addValue(valuemo3, 		"Others 300W", "Moderate");
 
        result.addValue(finalwin, 		"WUsage", "Winter");
        result.addValue(finalsum, 		"SUsage", "Summer");
        result.addValue(finalmod,		"MUsage", "Moderate");
        
        return result;
    }
    
    private JFreeChart createChart(final CategoryDataset dataset) 
    {

        final JFreeChart chart = ChartFactory.createStackedBarChart(
            "",  // chart title
            "",                  		 // domain axis label
            "KW-Hr",                     	 // range axis label
            dataset,                     // data
            PlotOrientation.HORIZONTAL,    // the plot orientation
            true,                        // legend
            true,                        // tooltips
            false                        // urls
        );
        
        GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup("Bulb CFL", "G1");
        map.mapKeyToGroup("Bulb 100W", "G1");
        map.mapKeyToGroup("Bulb 200W", "G1");

        map.mapKeyToGroup("Lamp 100W", "G2");
        map.mapKeyToGroup("Lamp 200W", "G2");
        map.mapKeyToGroup("Lamp 300W", "G2");

        map.mapKeyToGroup("Tube CFL", "G3");
        map.mapKeyToGroup("Tube 100W", "G3");
        map.mapKeyToGroup("Tube 200W", "G3");
        
        map.mapKeyToGroup("Heater 100W", "G4");
        map.mapKeyToGroup("Heater 200W", "G4");
        map.mapKeyToGroup("Heater 300W", "G4");

        map.mapKeyToGroup("Others 100W", "G5");
        map.mapKeyToGroup("Others 200W", "G5");
        map.mapKeyToGroup("Others 300W", "G5");
        
        map.mapKeyToGroup("WUsage", "G6");
        map.mapKeyToGroup("SUsage", "G6");
        map.mapKeyToGroup("MUsage", "G6");

        renderer.setSeriesToGroupMap(map); 
        renderer.setItemMargin(0.0);
        Paint p1 = new GradientPaint(
            0.0f, 0.0f, new Color(0x22, 0x22, 0xFF), 0.0f, 0.0f, new Color(0x88, 0x88, 0xFF)
        );
        renderer.setSeriesPaint(0, p1);
        renderer.setSeriesPaint(3, p1);
        renderer.setSeriesPaint(6, p1);
        renderer.setSeriesPaint(9, p1);
        renderer.setSeriesPaint(12, p1);
        
        Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(0x22, 0xFF, 0x22), 0.0f, 0.0f, new Color(0x88, 0xFF, 0x88)
        );
        renderer.setSeriesPaint(1, p2); 
        renderer.setSeriesPaint(4, p2); 
        renderer.setSeriesPaint(7, p2); 
        renderer.setSeriesPaint(10, p2); 
        renderer.setSeriesPaint(13, p2);
        
        Paint p3 = new GradientPaint(
            0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
        );
        renderer.setSeriesPaint(2, p3);
        renderer.setSeriesPaint(5, p3);
        renderer.setSeriesPaint(8, p3);
        renderer.setSeriesPaint(11, p3);
        renderer.setSeriesPaint(14, p3);
            
        Paint p4 = new GradientPaint(
                0.0f, 0.0f, Color.YELLOW , 0.0f, 0.0f, Color.yellow
            );
        renderer.setSeriesPaint(15, p4);
        renderer.setSeriesPaint(16, p4);
        renderer.setSeriesPaint(17, p4);
           
            
        renderer.setGradientPaintTransformer(
            new StandardGradientPaintTransformer(GradientPaintTransformType.VERTICAL)
        );
        
        SubCategoryAxis domainAxis = new SubCategoryAxis("");
        domainAxis.setCategoryMargin(0.1);
        domainAxis.addSubCategory("CFL Bulb");
        domainAxis.addSubCategory("Lamps");
        domainAxis.addSubCategory("Tubelights");
        domainAxis.addSubCategory("Air Temp");
        domainAxis.addSubCategory("Others");
        domainAxis.addSubCategory("Monthly Usage");
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDomainAxis(domainAxis);
        //plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.setRenderer(renderer);
        plot.setFixedLegendItems(createLegendItems());
        return chart;
        
    }

    private LegendItemCollection createLegendItems() 
    {
         LegendItemCollection result = new LegendItemCollection();
         LegendItem item1 = new LegendItem("Type 1", new Color(0x22, 0x22, 0xFF));
         LegendItem item2 = new LegendItem("Type 2", new Color(0x22, 0xFF, 0x22));
         LegendItem item3 = new LegendItem("Type 3", new Color(0xFF, 0x22, 0x22));
         LegendItem item4 = new LegendItem("Monthly Usage", Color.YELLOW);

         result.add(item1);
         result.add(item2);
         result.add(item3);
         result.add(item4);

         return result;
    }
}