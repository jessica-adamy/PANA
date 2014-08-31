import java.util.Scanner;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Teste extends JFrame {

   private static final long serialVersionUID = 1L;
private Scanner scanner;

   public Teste(String applicationTitle, String chartTitle) {
        super(applicationTitle);

        // based on the dataset we create the chart
        JFreeChart pieChart = ChartFactory.createXYLineChart(chartTitle, "Category", "Score", createDataset(),PlotOrientation.VERTICAL, true, true, false);

        // Adding chart into a chart panel
        ChartPanel chartPanel = new ChartPanel(pieChart);
      
        // settind default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      
        // add to contentPane
        setContentPane(chartPanel);
    }
  
   private XYDataset createDataset() {
     
      final XYSeries dollar = new XYSeries("Dollar");
      dollar.add(2010, 1.76400);
      dollar.add(2011, 3.0);
      dollar.add(2012, 4.0);
     
      final XYSeries euro = new XYSeries("Chrome");
      euro.add(2010, 4.0);
      euro.add(2011, 6.0);
      euro.add(2012, 5.0);
      
      final XYSeries funcao = new XYSeries("função");
      scanner = new Scanner(System.in);
      
      System.out.println("Entrada:");
      int entrada = scanner.nextInt();
      
  	   System.out.println(" 1)f(n) = K \n 2)f(n) = n \n 3)f(n) = n² \n"
  	   		+ " 4)f(n) = n³ \n 5)f(n) = logn \n 6)f(n) = nlogn \n 7)f(n) = 2^n \n Escolha uma opção");
  	   int resp = scanner.nextInt();
  	   
  	 final XYSeriesCollection dataset = new XYSeriesCollection();
  	   
  	   switch (resp) {
	case 1:
		for (int x = 0; x <= entrada; x++) {
			funcao.add(x, entrada);
		}
		dataset.addSeries(funcao);
		break;
	case 2:
		for (int x = 0; x <= entrada; x++) {
			funcao.add(x, x);
		}
		dataset.addSeries(funcao);
		break;
		
	case 3:		
		for (int x = 0; x <= entrada; x++) {
			int y = x*x;
			funcao.add(x, y);
		}
		dataset.addSeries(funcao);
		break;
		
	case 4:
		for (int x = 0; x <= entrada; x++) {
			int y = x*x*x;
			funcao.add(x, y);
		}
		dataset.addSeries(funcao);
		break;
	case 5: 
		for (int x = 0; x <= entrada; x++) {
			double y = Math.log(x+1);
			funcao.add(x, y);
		}
		dataset.addSeries(funcao);
		break;
	case 6:
		for (int x = 0; x <= entrada; x++) {
			double y = x*Math.log(x);
			funcao.add(x, y);
		}
		dataset.addSeries(funcao);
		break;
	case 7:
		for (int x = 0; x <= entrada; x++) {
			double y = Math.pow(2,x);
			funcao.add(x, y);
		}
		dataset.addSeries(funcao);
		break;
			

	default:
		break;
	}
  	
	
    
     
//      final XYSeries iexplorer = new XYSeries("InternetExplorer");
//      iexplorer.add(3.0, 4.0);
//      iexplorer.add(4.0, 5.0);
//      iexplorer.add(5.0, 4.0);
     
     
     // final XYSeriesCollection dataset = new XYSeriesCollection();
      //dataset.addSeries(dollar);
      //dataset.addSeries(euro);
     // dataset.addSeries(entrada);
//      dataset.addSeries(iexplorer);
     
      return dataset;
     
  }

   public static void main(String[] args) {
	   Teste chart = new Teste("Browser Usage Statistics", "Which Browser are you using?");
	   chart.pack();
      chart.setVisible(true);
   }
}