package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejer01 {

	private static JFrame frmEntrada;
	private JTextField num1;
	private JTextField num2;
	private JTextField Calculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer01 window = new Ejer01();
					frmEntrada.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejer01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntrada = new JFrame();
		frmEntrada.setTitle("Calculadora");
		frmEntrada.setBounds(100, 100, 450, 300);
		frmEntrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntrada.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Numero 1: ");
		lblNewLabel.setBounds(10, 64, 73, 26);
		frmEntrada.getContentPane().add(lblNewLabel);

		JLabel lblNumero = new JLabel("Numero 2:");
		lblNumero.setBounds(10, 101, 73, 26);
		frmEntrada.getContentPane().add(lblNumero);

		num1 = new JTextField();
		num1.setBounds(93, 67, 302, 20);
		frmEntrada.getContentPane().add(num1);
		num1.setColumns(10);

		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(93, 104, 302, 20);
		frmEntrada.getContentPane().add(num2);

		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado1 = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
				Calculo.setText(resultado1.toString());
			}
		});
		btnSuma.setBounds(58, 177, 109, 35);
		frmEntrada.getContentPane().add(btnSuma);
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado1 = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
				Calculo.setText(resultado1.toString());
			}
		});
		btnResta.setBounds(177, 177, 109, 35);
		frmEntrada.getContentPane().add(btnResta);

		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado1 = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
				Calculo.setText(resultado1.toString());
			}
		});
		btnMultiplicacion.setBounds(296, 177, 109, 35);
		frmEntrada.getContentPane().add(btnMultiplicacion);

		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado1 = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
				Calculo.setText(resultado1.toString());
			}
		});
		btnDivision.setBounds(177, 215, 109, 35);
		frmEntrada.getContentPane().add(btnDivision);

		Calculo = new JTextField();
		Calculo.setBounds(93, 146, 150, 20);
		frmEntrada.getContentPane().add(Calculo);
		Calculo.setColumns(10);
	}
}
