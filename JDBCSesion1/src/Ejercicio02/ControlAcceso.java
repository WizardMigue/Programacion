package Ejercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ControlAcceso {

	private static JFrame frame;
	private JTextField textField, textField_1;
	static AccesoBDatos abd = new AccesoBDatos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlAcceso window = new ControlAcceso();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					abd.conectar();
				} catch (ClassNotFoundException e) {
						System.out.println("No se pudo conectar con la base de datos");
					e.printStackTrace();
				} catch (SQLException e) {
						System.out.println("Error inesperado");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlAcceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 42, 105, 26);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(33, 79, 105, 26);
		frame.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(148, 47, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 84, 86, 20);
		frame.getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("Aceptar");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(311, 44, 118, 23);
		frame.getContentPane().add(btnNewButton) {
			public void actionPerformed (ActionEvent e) {
				
			}
		}

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DAM1alu15\\Downloads\\candado_cerrado.png"));
		lblNewLabel_1.setBounds(148, 160, 95, 144);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DAM1alu15\\Downloads\\candado_abierto.png"));
		lblNewLabel_2.setBounds(285, 160, 109, 144);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
	}
}
