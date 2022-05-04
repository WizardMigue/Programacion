package Ejercicios;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Ejercicios.Ejercicio17_02.OyenteBoton;

public class Ejercicio17_03 extends JFrame {
	Container panel;
	JButton botonCalcular1;
	JButton botonCalcular2;
	JTextField Num1, Num2, calculo;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio17_03() {
		super("Sumar y restar reales");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Num1");
		etiqueta2 = new JLabel("Num2");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		Num1 = new JTextField(5);
		Num1.setBounds(50, 20, 45, 20);
		panel.add(Num1);
		Num2 = new JTextField(6);
		Num2.setBounds(50, 50, 45, 20);
		panel.add(Num2);
		botonCalcular1 = new JButton("+");
		botonCalcular1.setBounds(50, 90, 45, 20);
		botonCalcular2 = new JButton("-");
		botonCalcular2.setBounds(100, 90, 45, 20);
		panel.add(botonCalcular1);
		panel.add(botonCalcular2);
		calculo = new JTextField(6);
		calculo.setBounds(160, 90, 45, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonCalcular1.addActionListener(new OyenteBoton1());
		botonCalcular2.addActionListener(new OyenteBoton2());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio17_03 ventana = new Ejercicio17_03();
	}

	class OyenteBoton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado1 = Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText());
			calculo.setText(resultado1.toString());
		}
	}

	class OyenteBoton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado2 = Double.parseDouble(Num1.getText()) - Double.parseDouble(Num2.getText());
			calculo.setText(resultado2.toString());
		}
	}

}
