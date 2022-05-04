package Ejercicios;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Ejercicios.Ejercicio17_03.OyenteBoton1;
import Ejercicios.Ejercicio17_03.OyenteBoton2;

public class Ejercicio17_04 extends JFrame {
	Container panel;
	JButton boton1;
	JTextField texto1, texto2, calculo;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio17_04() {
		super("Iniciar Sesión");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Usuario");
		etiqueta2 = new JLabel("Contraseña");
		etiqueta1.setBounds(10, 20, 120, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 120, 20);
		panel.add(etiqueta2);
		texto1 = new JTextField(5);
		texto1.setBounds(90, 20, 100, 20);
		panel.add(texto1);
		texto2 = new JTextField(6);
		texto2.setBounds(90, 50, 100, 20);
		panel.add(texto2);
		boton1 = new JButton("Validar");
		boton1.setBounds(90, 90, 100, 20);
		panel.add(boton1);
		boton1.addActionListener(new OyenteBoton1());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio17_04 ventana = new Ejercicio17_04();

	}

	class OyenteBoton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String usuario = "dam";
			String contraseña = "1234";
			if(texto1.getText().equals(usuario) && texto2.getText().equals(contraseña)) {
				setTitle("Validacion Correcta");
			}else {
				setTitle("Validacion Incorrecta");
			}
		}
	}

}
