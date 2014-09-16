import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Funcoes extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Funcoes(String applicationTitle, String chartTitle) {
		super(applicationTitle);

		
		JFreeChart pieChart = ChartFactory.createXYLineChart("Grafico", "X", "Y", createDataset(), PlotOrientation.VERTICAL, true, true,
				 false);
		//final ChartPanel chartPanel_exercicio_1 = new ChartPanel(pieChart);
//		chartPanel_exercicio_1.setBounds(73, 193, 703, 309);
//		chartPanel_exercicio_1.setPreferredSize(new java.awt.Dimension(400, 400));
		
	}

	private static XYDataset createDataset() {
		final XYSeriesCollection dataset = new XYSeriesCollection();
		
			int opcao  = 2;
			int entrada  = 3;
				if (opcao==1) {
					final XYSeries op1 = new XYSeries("f(n)=K");
					for (int x = 0; x <= entrada; x++) {
						op1.add(x, entrada);
					}
					dataset.addSeries(op1);
				}

				if (opcao == 2) {
					final XYSeries op2 = new XYSeries("f(n)=n");
					for (int x = 0; x <= entrada; x++) {
						op2.add(x, x);
					}
					dataset.addSeries(op2);
				}

				if (opcao == 3) {
					final XYSeries op3 = new XYSeries("f(n)=n^2");
					for (int x = 0; x <= entrada; x++) {
						int y = x * x;
						op3.add(x, y);
					}
					dataset.addSeries(op3);
				}

				if (opcao == 4) {
					final XYSeries op4 = new XYSeries("f(n)=n^3");
					for (int x = 0; x <= entrada; x++) {
						int y = x * x * x;
						op4.add(x, y);
					}
					dataset.addSeries(op4);
				}

				if (opcao == 5) {
					final XYSeries op5 = new XYSeries("f(n)=logn");
					for (int x = 1; x <= entrada; x++) {
						double y = Math.log10(x);
						op5.add(x, y);
					}
					dataset.addSeries(op5);
				}

				if (opcao == 6) {
					final XYSeries op6 = new XYSeries("f(n)=nlogn");
					double y;
					for (int x = 1; x <= entrada; x++) {
						y = x * Math.log10(x);
						System.out.println(x + " log" + x + " = " + y);
						op6.add(x, y);
					}
					dataset.addSeries(op6);
				}

				if (opcao == 7) {
					final XYSeries op7 = new XYSeries("f(n)=2^n");
					for (int x = 0; x <= entrada; x++) {
						double y = Math.pow(2, x);
						op7.add(x, y);
					}
					dataset.addSeries(op7);
				}

		return dataset;

	}
}

