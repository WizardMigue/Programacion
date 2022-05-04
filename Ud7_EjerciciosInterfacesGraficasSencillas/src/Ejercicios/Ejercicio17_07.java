package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Ejercicios.Ejercicio17_05.OyenteBoton1;

public class Ejercicio17_07 extends JFrame {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17_07 window = new Ejercicio17_07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio17_07() {
		super("Confirmar");
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnHeLedo = new JTextPane();
		txtpnHeLedo.setForeground(Color.BLACK);
		txtpnHeLedo.setText("He le\u00EDdo el documento y esto de acuerdo con las codiciones");
		txtpnHeLedo.setBounds(10, 23, 414, 20);
		frame.getContentPane().add(txtpnHeLedo);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 198, 144, 38);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto");
		chckbxNewCheckBox.addActionListener(new ActionListener()); {
			if(btnNewButton.isVisible()) {
				btnNewButton.setEnabled(false);
			}else {
				btnNewButton.setEnabled(true);
			}
		}
		chckbxNewCheckBox.setBounds(10, 141, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
