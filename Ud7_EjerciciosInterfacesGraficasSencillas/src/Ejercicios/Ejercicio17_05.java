package Ejercicios;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Ejercicios.Ejercicio17_03.OyenteBoton2;
import Ejercicios.Ejercicio17_04.OyenteBoton1;

public class Ejercicio17_05 extends JFrame {
	Container panel;
	JButton boton1, boton2, boton3, boton4;
	JTextField texto1, texto2, calculo;
	JLabel etiqueta1, etiqueta2, etiqueta3, imagenCalculadora, imagenExit, imagenHombre;

	public Ejercicio17_05() {
		super("Calculadora");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Dato 1: ");
		etiqueta2 = new JLabel("Dato 2: ");
		etiqueta3 = new JLabel("Resultado: ");
		// etiquetas
		etiqueta1.setBounds(10, 100, 120, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 130, 120, 20);
		panel.add(etiqueta2);
		etiqueta3.setBounds(10, 160, 120, 20);
		panel.add(etiqueta3);
		// textos
		texto1 = new JTextField(5);
		texto1.setBounds(90, 100, 100, 20);
		panel.add(texto1);
		texto2 = new JTextField(6);
		texto2.setBounds(90, 130, 100, 20);
		panel.add(texto2);
		calculo = new JTextField(5);
		calculo.setBounds(90, 160, 100, 20);
		// botones
		panel.add(calculo);
		boton1 = new JButton("+");
		boton1.setBounds(200, 100, 50, 20);
		panel.add(boton1);
		boton2 = new JButton("-");
		boton2.setBounds(200, 130, 50, 20);
		panel.add(boton2);
		boton3 = new JButton("x");
		boton3.setBounds(200, 160, 50, 20);
		panel.add(boton3);
		boton4 = new JButton("/");
		boton4.setBounds(200, 190, 50, 20);
		panel.add(boton4);
		boton1.addActionListener(new OyenteBoton1());
		boton2.addActionListener(new OyenteBoton2());
		boton3.addActionListener(new OyenteBoton3());
		boton4.addActionListener(new OyenteBoton4());
		// imagen calculadora
		imagenCalculadora = new JLabel();
		imagenCalculadora.setBounds(40, 20, 100, 20);
		ImageIcon iconoCalculadora = new ImageIcon("calculadora.jpg");
		imagenCalculadora.setIcon(iconoCalculadora);
		panel.add(imagenCalculadora);
		// imagen exit
		imagenExit = new JLabel();
		imagenExit.setBounds(102, 2, 200, 80);
		ImageIcon iconoExit = new ImageIcon("puerta.jpg");
		imagenExit.setIcon(iconoExit);
		panel.add(imagenExit);
		// imagen hombre
		imagenHombre = new JLabel();
		imagenHombre.setBounds(102, 2, 200, 80);
		ImageIcon iconoHombre = new ImageIcon("hombre.png");
		imagenHombre.setIcon(iconoHombre);
		panel.add(imagenHombre);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio17_05 ventana = new Ejercicio17_05();
	}

	class OyenteBoton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado1 = Double.parseDouble(texto1.getText()) + Double.parseDouble(texto2.getText());
			calculo.setText(resultado1.toString());
		}
	}

	class OyenteBoton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado2 = Double.parseDouble(texto1.getText()) - Double.parseDouble(texto2.getText());
			calculo.setText(resultado2.toString());
		}
	}

	class OyenteBoton3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado3 = Double.parseDouble(texto1.getText()) * Double.parseDouble(texto2.getText());
			calculo.setText(resultado3.toString());
		}
	}

	class OyenteBoton4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado4 = Double.parseDouble(texto1.getText()) / Double.parseDouble(texto2.getText());
			calculo.setText(resultado4.toString());
		}
	}
}
