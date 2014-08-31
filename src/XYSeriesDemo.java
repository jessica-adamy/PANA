import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class XYSeriesDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private Scanner scanner;

	public XYSeriesDemo(String applicationTitle, String chartTitle) {
		super(applicationTitle);

		JTabbedPane tabbedPane = new JTabbedPane();

		// based on the dataset we create the chart
		 JFreeChart pieChart = ChartFactory.createXYLineChart(chartTitle, "X",
		 "Y", createDataset(), PlotOrientation.VERTICAL, true, true,
		 false);

		JFreeChart pieChart_O = ChartFactory.createXYLineChart(chartTitle, "X",
				"Y", createDataset_O(), PlotOrientation.VERTICAL, true, true,
				false);
		JFreeChart pieChart_Omega = ChartFactory.createXYLineChart(chartTitle,
				"X", "Y", createDataset_Omega(), PlotOrientation.VERTICAL,
				true, true, false);
		JFreeChart pieChart_Theta = ChartFactory.createXYLineChart(chartTitle,
				"X", "Y", createDataset_Theta(), PlotOrientation.VERTICAL,
				true, true, false);

		// Adding chart into a chart panel
		ChartPanel chartPanel_exercicio_1 = new ChartPanel(pieChart);
		final ChartPanel chartPanel_O = new ChartPanel(pieChart_O);
		chartPanel_O.setVisible(false);
		chartPanel_O.setBounds(151, 164, 680, 420);
		final ChartPanel chartPanel_Omega = new ChartPanel(pieChart_Omega);
		chartPanel_Omega.setVisible(false);
		final ChartPanel chartPanel_Theta = new ChartPanel(pieChart_Theta);
		chartPanel_Theta.setVisible(false);
		Panel panel_exercicio_2 = new Panel();
		
		
		// settind default size
		chartPanel_exercicio_1.setPreferredSize(new java.awt.Dimension(200, 200));


		tabbedPane.addTab("Exercício 1", chartPanel_exercicio_1);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		panel_exercicio_2.setLayout(null);
		panel_exercicio_2.add(chartPanel_O);

		tabbedPane.addTab("Exercício 2", panel_exercicio_2);

		final JLabel descricao = new JLabel("");
		descricao.setBounds(296, 11, 582, 107);
		panel_exercicio_2.add(descricao);

		JRadioButton rdbtnNotaoO = new JRadioButton("NOta\u00E7\u00E3o O:");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNotaoO);
		rdbtnNotaoO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				descricao.setText("teste Notação O");
				chartPanel_O.setVisible(true);
				createDataset_O();
			}
		});
		rdbtnNotaoO.setBounds(151, 23, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoO);

		JRadioButton rdbtnNotaoThe = new JRadioButton("Nota\u00E7\u00E3o tHE");
		buttonGroup.add(rdbtnNotaoThe);
		rdbtnNotaoThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descricao.setText("Teste Notação Theta");
				chartPanel_Theta.setVisible(true);
			}
		});
		rdbtnNotaoThe.setBounds(151, 98, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoThe);

		JRadioButton rdbtnNotaoOmega = new JRadioButton(
				"NOta\u00E7\u00E3o OMEGA");
		buttonGroup.add(rdbtnNotaoOmega);
		rdbtnNotaoOmega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descricao.setText("teste Notação Omaega");
				chartPanel_Omega.setVisible(true);
			}
		});
		rdbtnNotaoOmega.setBounds(151, 63, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoOmega);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		// add to contentPane
		setContentPane(tabbedPane);
	}

	private XYDataset createDataset() {
		scanner = new Scanner(System.in);

		System.out.println("Entrada:");
		int entrada = scanner.nextInt();

		int opcao;
		System.out
				.println("Escolha as funções a serem exibidas. \n"
						+ " 1)f(n) = K \n 2)f(n) = n \n 3)f(n) = n² \n"
						+ " 4)f(n) = n³ \n 5)f(n) = logn \n 6)f(n) = nlogn \n 7)f(n) = 2^n");

		List<Integer> opcoes = new ArrayList<Integer>();
		final XYSeriesCollection dataset = new XYSeriesCollection();
		do {
			System.out.println("Próximo: (0 para parar)");
			opcao = scanner.nextInt();

			if (!opcoes.contains(opcao)) {
				if (opcao == 1) {
					opcoes.add(1);
					final XYSeries op1 = new XYSeries("f(n)=K");
					for (int x = 0; x <= entrada; x++) {
						op1.add(x, entrada);
					}
					dataset.addSeries(op1);
				}

				if (opcao == 2) {
					opcoes.add(2);
					final XYSeries op2 = new XYSeries("f(n)=n");
					for (int x = 0; x <= entrada; x++) {
						op2.add(x, x);
					}
					dataset.addSeries(op2);
				}

				if (opcao == 3) {
					opcoes.add(3);
					final XYSeries op3 = new XYSeries("f(n)=n^2");
					for (int x = 0; x <= entrada; x++) {
						int y = x * x;
						op3.add(x, y);
					}
					dataset.addSeries(op3);
				}

				if (opcao == 4) {
					opcoes.add(4);
					final XYSeries op4 = new XYSeries("f(n)=n^3");
					for (int x = 0; x <= entrada; x++) {
						int y = x * x * x;
						op4.add(x, y);
					}
					dataset.addSeries(op4);
				}

				if (opcao == 5) {
					opcoes.add(5);
					final XYSeries op5 = new XYSeries("f(n)=logn");
					for (int x = 1; x <= entrada; x++) {
						double y = Math.log10(x);
						op5.add(x, y);
					}
					dataset.addSeries(op5);
				}

				if (opcao == 6) {
					opcoes.add(6);
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
					opcoes.add(7);
					final XYSeries op7 = new XYSeries("f(n)=2^n");
					for (int x = 0; x <= entrada; x++) {
						double y = Math.pow(2, x);
						op7.add(x, y);
					}
					dataset.addSeries(op7);
				}
			} else {
				System.out.println("Você já escolheu esta opção!!!");
			}
		} while (opcao != 0);

		return dataset;

	}

	private XYDataset createDataset_O() {
		final XYSeriesCollection dataset = new XYSeriesCollection();

		final XYSeries op2 = new XYSeries("f(n)");
		for (int x = 0; x <= 4; x++) {
			op2.add(x, x);
		}
		dataset.addSeries(op2);

		final XYSeries op3 = new XYSeries("cg(n)");
		for (int x = 0; x <= 4; x++) {
			int y = x * x;
			op3.add(x, y);
		}
		dataset.addSeries(op3);

		return dataset;

	}

	private XYDataset createDataset_Omega() {
		final XYSeriesCollection dataset = new XYSeriesCollection();

		final XYSeries op2 = new XYSeries("f(n)");
		for (int x = 0; x <= 4; x++) {
			op2.add(x, x);
		}
		dataset.addSeries(op2);

		final XYSeries op3 = new XYSeries("cg(n)");
		for (int x = 0; x <= 4; x++) {
			int y = x * x;
			op3.add(x, y);
		}
		dataset.addSeries(op3);

		return dataset;

	}

	private XYDataset createDataset_Theta() {
		final XYSeriesCollection dataset = new XYSeriesCollection();

		final XYSeries op2 = new XYSeries("f(n)");
		for (int x = 0; x <= 4; x++) {
			op2.add(x, x);
		}
		dataset.addSeries(op2);

		final XYSeries op3 = new XYSeries("cg(n)");
		for (int x = 0; x <= 4; x++) {
			int y = x * x;
			op3.add(x, y);
		}
		dataset.addSeries(op3);

		return dataset;

	}

	public static void main(String[] args) {
		XYSeriesDemo chart = new XYSeriesDemo(
				"Projeto e Análise de Algoritmos", "Gráfico");
		chart.pack();
		chart.setVisible(true);

	}
}