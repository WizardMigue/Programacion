package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class InterfazLogin {

	private JFrame frmIniciarSesin;
	private JTextField CampoUsuario;
	private JPasswordField CampoContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazLogin window = new InterfazLogin();
					window.frmIniciarSesin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesin = new JFrame();
		frmIniciarSesin.setTitle("Iniciar Sesi\u00F3n");
		frmIniciarSesin.setBounds(100, 100, 526, 297);
		frmIniciarSesin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSesin.getContentPane().setLayout(null);

		CampoUsuario = new JTextField();
		CampoUsuario.setBounds(156, 32, 129, 20);
		frmIniciarSesin.getContentPane().add(CampoUsuario);
		CampoUsuario.setColumns(10);

		CampoContraseña = new JPasswordField();
		CampoContraseña.setBounds(156, 63, 129, 20);
		frmIniciarSesin.getContentPane().add(CampoContraseña);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(41, 34, 109, 17);
		frmIniciarSesin.getContentPane().add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(41, 68, 109, 17);
		frmIniciarSesin.getContentPane().add(lblContrasea);

		JButton btnNewButton = new JButton("Iniciar Sesi\u00F3n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] clave = CampoContraseña.getPassword();
				String claveFinal = new String(clave);
				if (CampoUsuario.getText().equals("Miguel") && CampoContraseña.getText().equals("12345")) {
					JOptionPane.showMessageDialog(null, "Has iniciado sesión correctamente", "Bienvenido",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (CampoUsuario.getText().equals("Miguel") != CampoContraseña.getText().equals("12345")) {
					JOptionPane.showMessageDialog(null, "No has iniciado sesión correctamente",
							"Vuelve a introducir tus credenciales para poder iniciar sesión", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(156, 117, 129, 35);
		frmIniciarSesin.getContentPane().add(btnNewButton);
	}
}
