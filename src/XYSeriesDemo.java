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
import javax.swing.JPanel;
import java.awt.Color;

public class XYSeriesDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JCheckBox cbox_op1 = new JCheckBox();
	private JTextField textField_constante;
	private JTextField textField_n;
	private JRadioButton rdbtn_Mestre;
	private JRadioButton rdbtn_Soma;
	private JRadioButton rdbtn_Substituicao;
	private JTextField textField_a;
	private JTextField textField_b;
	private JTextField textField_fn;
	private JButton btnCalcular;
	private JTextField textField_n_2;
	
	public XYSeriesDemo(String applicationTitle, String chartTitle) {
		super(applicationTitle);

		JTabbedPane tabbedPane = new JTabbedPane();

		// based on the dataset we create the chart
		
		//int entrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada1:"));
		//int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("Entrada2:"));

		int entrada = 10;
		int entrada2 = 20;
		
		JFreeChart pieChart = ChartFactory.createXYLineChart("Grafico", "X", "Y", createDataset(), PlotOrientation.VERTICAL, true, true,
				 false);
		final ChartPanel chartPanel_exercicio_1 = new ChartPanel(pieChart);
		chartPanel_exercicio_1.setBounds(73, 193, 703, 309);
		chartPanel_exercicio_1.setPreferredSize(new java.awt.Dimension(400, 400));
		
		
		
		 
		JFreeChart pieChart_O = ChartFactory.createXYLineChart(chartTitle, "X",	"Y", createDataset_O(entrada), PlotOrientation.VERTICAL, true, true,
				false);
		
		JFreeChart pieChart_Omega = ChartFactory.createXYLineChart(chartTitle,"X", "Y", createDataset_Omega(entrada), PlotOrientation.VERTICAL,
				true, true, false);
		
		JFreeChart pieChart_Theta = ChartFactory.createXYLineChart(chartTitle,"X", "Y", createDataset_Theta(entrada, entrada2), PlotOrientation.VERTICAL,
				true, true, false);
		
		final ChartPanel chartPanel_O = new ChartPanel(pieChart_O);
		chartPanel_O.setVisible(false);
		chartPanel_O.setBounds(151, 164, 680, 420);
		
		final ChartPanel chartPanel_Omega = new ChartPanel(pieChart_Omega);
		chartPanel_Omega.setVisible(false);
		chartPanel_Omega.setBounds(151, 164, 680, 420);
		
		final ChartPanel chartPanel_Theta = new ChartPanel(pieChart_Theta);
		chartPanel_Theta.setVisible(false);
		chartPanel_Theta.setBounds(151, 164, 680, 420);
		
		
		// Adding chart into a chart panel
		
		
		final Panel panel_exercicio_1 = new Panel();
		panel_exercicio_1.setLayout(null);
		panel_exercicio_1.add(chartPanel_exercicio_1);
		
		// settind default size
		
		
		tabbedPane.addTab("Exercício 1", panel_exercicio_1);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		cbox_op1 = new JCheckBox("1) f(n) = K");
		cbox_op1.setBounds(83, 7, 97, 23);
		panel_exercicio_1.add(cbox_op1);
		
		JCheckBox cbox_op2 = new JCheckBox("2) f(n) = n");
		cbox_op2.setBounds(83, 33, 97, 23);
		panel_exercicio_1.add(cbox_op2);
		
		JCheckBox cbox_op3 = new JCheckBox("3) f(n) = n²");
		cbox_op3.setBounds(83, 59, 97, 23);
		panel_exercicio_1.add(cbox_op3);
		
		JCheckBox cbox_op4 = new JCheckBox("4) f(n) = n³");
		cbox_op4.setBounds(83, 84, 97, 23);
		panel_exercicio_1.add(cbox_op4);
		
		JCheckBox cbox_op5 = new JCheckBox("5) f(n) = logn");
		cbox_op5.setBounds(83, 110, 97, 23);
		panel_exercicio_1.add(cbox_op5);
		
		JCheckBox cbox_op6 = new JCheckBox("6) f(n) = nlogn");
		cbox_op6.setBounds(83, 136, 97, 23);
		panel_exercicio_1.add(cbox_op6);
		
		JCheckBox cbox_op7 = new JCheckBox("7) f(n) = 2^n");
		cbox_op7.setBounds(83, 163, 97, 23);
		panel_exercicio_1.add(cbox_op7);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnGerar.setBounds(247, 159, 89, 23);
		panel_exercicio_1.add(btnGerar);
		
	
		
		Panel panel_exercicio_2 = new Panel();
		
		
		
		panel_exercicio_2.setLayout(null);
		panel_exercicio_2.add(chartPanel_O);
		panel_exercicio_2.add(chartPanel_Omega);
		panel_exercicio_2.add(chartPanel_Theta);

		tabbedPane.addTab("Exercício 2", panel_exercicio_2);
		
		Panel panel_exercicio_3 = new Panel();
		tabbedPane.addTab("Exercício 3", panel_exercicio_3);
		panel_exercicio_3.setLayout(null);		
		
		
		final JLabel descricao2 = new JLabel("");
		descricao2.setBounds(179, 11, 824, 167);
		panel_exercicio_3.add(descricao2);

		final JLabel descricao = new JLabel("");
		descricao.setBounds(296, 11, 582, 107);
		panel_exercicio_2.add(descricao);
		
		
		JPanel panel_label_exec3 = new JPanel();
		panel_label_exec3.setBackground(Color.CYAN);
		panel_label_exec3.setBounds(51, 189, 360, 152);
		panel_exercicio_3.add(panel_label_exec3);
		panel_label_exec3.setLayout(null);
		
		final JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 11, 341, 137);
		panel_label_exec3.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(Color.CYAN);
		
		
		rdbtn_Soma = new JRadioButton("Soma");
		rdbtn_Soma.setBounds(35, 24, 109, 23);
		panel_exercicio_3.add(rdbtn_Soma);
		rdbtn_Soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				descricao2.setText("Método Soma: Tal método consiste em, a partir da recorrência \n"
						+ "original, obter uma coleção de recorrências que somadas resultam \n"
						+ "em um fórmula onde a recorrência é eliminada");
				lblNewLabel_2.setText("Exemplo: V(n) = 2V(n-1)+1 \n V(1) = 1");
			}
		});
		
		rdbtn_Substituicao = new JRadioButton("Substituição");
		rdbtn_Substituicao.setBounds(35, 50, 109, 23);
		panel_exercicio_3.add(rdbtn_Substituicao);
		rdbtn_Substituicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				descricao2.setText("Método Substituição: Tal método consiste em, dada uma função T \n"
						+ "definida de modo recorrente, tentar mostrar que T pertence a O(f), sendo \n"
						+ "f uma função não-recorrente.");
				lblNewLabel_2.setText("Exemplo: T(n) = 2T(n/2) + n \nT(1) = 1");
			}
		});
		
		rdbtn_Mestre = new JRadioButton("Mestre");
		rdbtn_Mestre.setBounds(35, 76, 109, 23);
		panel_exercicio_3.add(rdbtn_Mestre);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(76, 364, 401, 203);
		panel_exercicio_3.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Exemplo:");
		lblNewLabel_3.setBounds(10, 11, 116, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblTn = new JLabel("T(n) = aT(n/b) + F(n)");
		lblTn.setBounds(10, 51, 198, 23);
		panel.add(lblTn);
		
		JLabel lblNewLabel_4 = new JLabel("a =");
		lblNewLabel_4.setBounds(10, 76, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblB = new JLabel("b = ");
		lblB.setBounds(10, 97, 46, 14);
		panel.add(lblB);
		
		JLabel lblFn = new JLabel("f(n) = ");
		lblFn.setBounds(10, 119, 46, 14);
		panel.add(lblFn);
		
		textField_a = new JTextField();
		textField_a.setBounds(40, 73, 86, 20);
		panel.add(textField_a);
		textField_a.setColumns(10);
		
		textField_b = new JTextField();
		textField_b.setColumns(10);
		textField_b.setBounds(40, 94, 86, 20);
		panel.add(textField_b);
		
		textField_fn = new JTextField();
		textField_fn.setColumns(10);
		textField_fn.setBounds(40, 116, 86, 20);
		panel.add(textField_fn);
		
		textField_n_2 = new JTextField();
		textField_n_2.setColumns(10);
		textField_n_2.setBounds(40, 138, 86, 20);
		panel.add(textField_n_2);
		
		JLabel lblN = new JLabel("n = ");
		lblN.setBounds(10, 144, 46, 14);
		panel.add(lblN);
		
		JLabel lblResultado = new JLabel("RESULTADO = ");
		lblResultado.setBounds(175, 119, 101, 14);
		panel.add(lblResultado);
		
		final JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(286, 119, 46, 14);
		panel.add(lblNewLabel_5);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtn_Soma);
		buttonGroup2.add(rdbtn_Substituicao);
		buttonGroup2.add(rdbtn_Mestre);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField_a.getText());
				int b = Integer.parseInt(textField_b.getText());
				int fn = Integer.parseInt(textField_fn.getText());
				int n = Integer.parseInt(textField_n_2.getText());
				
				lblNewLabel_5.setText(""+calc_recorrencia(a, b, fn, n));
			}
		});
		btnCalcular.setBounds(40, 169, 89, 23);
		panel.add(btnCalcular);
		
		
		rdbtn_Mestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				descricao2.setText("Método Mestre: É utilizado em fórmulas de recorrência do tipo: \n"
						+ "T(n) = aT(n/b) + f(n) Onde a ≥ 1, b > 1 e f (n) uma função. \n"
						+ "Existem 3 casos. Em cada um comparar n^loga base b com f(n)");
				lblNewLabel_2.setText("Exemplo: T(n) = 9T(n/3) + n");
			}
		});
		
		

		JRadioButton rdbtnNotaoO = new JRadioButton("NOta\u00E7\u00E3o O:");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNotaoO);
		rdbtnNotaoO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				descricao.setText("Notação O:Existe um número positivo c e um número n0 tais que f(n) <= cg(n), para todo n maior que n0.");
				chartPanel_O.setVisible(true);
//				createDataset_O();
			}
		});
		rdbtnNotaoO.setBounds(151, 23, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoO);

		JRadioButton rdbtnNotaoThe = new JRadioButton("Nota\u00E7\u00E3o Θ");
		buttonGroup.add(rdbtnNotaoThe);
		rdbtnNotaoThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descricao.setText("Notação Theta:  f = Θ(g) significa que existe números positivos c e d tais que  c g(n) ≤ f(n) ≤ d g(n)  para todo n suficientemente grande.");
				chartPanel_O.setVisible(false);
				chartPanel_Omega.setVisible(false);
				chartPanel_Theta.setVisible(true);
			}
		});
		rdbtnNotaoThe.setBounds(151, 75, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoThe);

		JRadioButton rdbtnNotaoOmega = new JRadioButton(
				"NOta\u00E7\u00E3o Ω");
		buttonGroup.add(rdbtnNotaoOmega);
		rdbtnNotaoOmega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descricao.setText("Notação Omega: Existe um número positivo c e um número n0 tais que f(n) >= cg(n), para todo n maior que n0.");
				chartPanel_O.setVisible(false);
				chartPanel_Theta.setVisible(false);
				chartPanel_Omega.setVisible(true);
			}
		});
		rdbtnNotaoOmega.setBounds(151, 49, 109, 23);
		panel_exercicio_2.add(rdbtnNotaoOmega);
		
		textField_constante = new JTextField();
		textField_constante.setBounds(222, 129, 86, 20);
		panel_exercicio_2.add(textField_constante);
		textField_constante.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Constante:");
		lblNewLabel.setBounds(133, 132, 46, 14);
		panel_exercicio_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N:");
		lblNewLabel_1.setBounds(133, 105, 46, 14);
		panel_exercicio_2.add(lblNewLabel_1);
		
		textField_n = new JTextField();
		textField_n.setBounds(222, 102, 86, 20);
		panel_exercicio_2.add(textField_n);
		textField_n.setColumns(10);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		// add to contentPane
		setContentPane(tabbedPane);
	}
	
	public int calc_recorrencia(int a, int b, int fn, int n){
		int tn= n/b;
		int soma;
		if (tn <= 1){
			tn = 1;
			soma = a * 1 + fn;
		} else{
			soma = a * calc_recorrencia(a, b, fn, tn) + fn;
		}
			
			return soma;	
	
	}

	private static XYDataset createDataset() {
		final XYSeriesCollection dataset = new XYSeriesCollection();
		
			int opcao  = 2;
			int entrada  = 3;
				if (cbox_op1.isSelected()) {
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

	private XYDataset createDataset_O(int entrada) {
		final XYSeriesCollection dataset = new XYSeriesCollection();

		final XYSeries op2 = new XYSeries("f(3*n)");
		int c = 5;
		for (int x = 0; x <= 4; x++) {
			int y = 3*x;
			op2.add(x, y);
		}
		dataset.addSeries(op2);
		
		final XYSeries op3 = new XYSeries(entrada+"*g(n²)");
		for (int x = 0; x <= 4; x++) {
			int y = entrada*(x*x);
			op3.add(x, y);
		}
		dataset.addSeries(op3);

		return dataset;

	}

	private XYDataset createDataset_Omega(int entrada) {
		final XYSeriesCollection dataset = new XYSeriesCollection();

		final XYSeries op2 = new XYSeries("f(1/2 n² - 3n)");
		//int c = 5;
		for (int x = 0; x <= 20; x++) {
			int y = ((1/2)*(x * x)-(3*x));
			op2.add(x, y);
		}
		dataset.addSeries(op2);
		
		final XYSeries op3 = new XYSeries(entrada+"*g(n²)");
		
		for (int x = 0; x <= 20; x++) {
			float y = entrada*(x*x);
			op3.add(x, y);
		}
		dataset.addSeries(op3);

		return dataset;

	}

	private XYDataset createDataset_Theta(int entrada, int entrada2) {
		final XYSeriesCollection dataset = new XYSeriesCollection();
		final XYSeries op4 = new XYSeries(entrada+"*g(n²)");
		
		for (int x = 0; x <= 20; x++) {
			int y = entrada*(x * x);
			op4.add(x, y);
		}
		dataset.addSeries(op4);
		
		
		final XYSeries op2 = new XYSeries("f(1/2*n²-3n)");
		for (int x = 0; x <= 20; x++) {
			int y = 1/2*(x*x) - 3*x;
			op2.add(x, y);
		}
		dataset.addSeries(op2);
		

		final XYSeries op3 = new XYSeries(entrada2+"*g(n²)");
		for (int x = 0; x <= 20; x++) {
			int y = entrada2*(x * x);
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
	public JCheckBox getCbox_op1() {
		return cbox_op1;
	}
	public JRadioButton getRdbtn_Mestre() {
		return rdbtn_Mestre;
	}
	public JRadioButton getRdbtn_Soma() {
		return rdbtn_Soma;
	}
	public JRadioButton getRdbtn_Substituicao() {
		return rdbtn_Substituicao;
	}
	public JTextField getTextField_fn() {
		return textField_fn;
	}
	public JTextField getTextField_b() {
		return textField_b;
	}
	public JTextField getTextField_a() {
		return textField_a;
	}
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	public JTextField getTextField_n() {
		return textField_n_2;
	}
}