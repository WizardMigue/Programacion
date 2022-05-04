package Ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class AccesoBdatos implements ActionListener, MouseListener {
	private String maquina = "localhost";
	private String usuario = "root";
	private String clave = "root";
	private int puerto = 3308;
	private String servidor = "";
	private static Connection conexion = null;
	private Vista vista;

	AccesoBdatos(Vista vista) {
		this.vista = vista;
		cargarTabla();
	}

	public void actionPerformed(ActionEvent arg0) {
		PreparedStatement cs;
		String comando = arg0.getActionCommand();
		switch (comando) {
		case "INSERTAR":
			try {
				cs = AccesoBdatos.getConexion().prepareCall("{CALL insertarSocio(?,?,?,?,?)}");
				cs.setString(1, this.vista.txtSocioID.getText());
				cs.setString(2, this.vista.txtNombre.getText());
				cs.setString(3, this.vista.txtEstatura.getText());
				cs.setString(4, this.vista.txtEdad.getText());
				cs.setString(5, this.vista.txtLocalidad.getText());
				cs.execute();
			} catch (SQLException e) {
				e.printStackTrace();
				System.err.println("Error en la INSERCIÓN");
			}
			break;
		case "BORRAR":
			int filaPulsada = this.vista.tabla.getSelectedRow();
			if (filaPulsada >= 0) {
				int identificador = (int) this.vista.dtm.getValueAt(filaPulsada, 0);
				try {
					cs = AccesoBdatos.getConexion().prepareCall("{CALL borrarSocio(?)}");
					cs.setInt(1, identificador);
					cs.execute();

				} catch (SQLException e) {
					e.printStackTrace();
					System.err.println("Error en el BORRADO");
				}
			}
			break;
		case "MODIFICAR":
			filaPulsada = this.vista.tabla.getSelectedRow();
			if (filaPulsada >= 0) {
				int identificador = (int) this.vista.dtm.getValueAt(filaPulsada, 0);
				try {
					cs = AccesoBdatos.getConexion().prepareCall("{CALL modificarSocio(?,?,?,?,?)}");
					cs.setInt(1, identificador);
					cs.setString(1, this.vista.txtSocioID.getText());
					cs.setString(2, this.vista.txtNombre.getText());
					cs.setString(3, this.vista.txtEstatura.getText());
					cs.setString(4, this.vista.txtEdad.getText());
					cs.setString(5, this.vista.txtLocalidad.getText());
					cs.execute();
				} catch (SQLException e) {
					System.err.println("Error en la MODIFICACION");
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
			break;
		default:
			System.err.println("Comando no definido");
			break;
		}
		limpia();
		cargarTabla();
	}

	private void limpia() {
		this.vista.txtSocioID.setText("");
		this.vista.txtNombre.setText("");
		this.vista.txtEstatura.setText("");
		this.vista.txtEdad.setText("");
		this.vista.txtLocalidad.setText("");
	}

	protected void cargarTabla() {
		PreparedStatement cs;
		ResultSet rs;
		Vector<Object> fila;
		for (int i = this.vista.dtm.getRowCount(); i > 0; i--) {
			this.vista.dtm.removeRow(i - 1);
		}
		try {
			cs = AccesoBdatos.getConexion().prepareCall("{CALL getSocios()}");
			rs = cs.executeQuery();
			while (rs.next()) {
				fila = new Vector<Object>();
				fila.add(rs.getInt("SocioID"));
				fila.add(rs.getString("Nombre"));
				fila.add(rs.getString("Estatura"));
				fila.add(rs.getString("Edad"));
				fila.add(rs.getString("Localidad"));
				this.vista.dtm.addRow(fila);
			}

		} catch (SQLException e) {
			System.out.println("Error al CARGAR DATOS");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		CallableStatement cs;
		ResultSet rs;
		int filaPulsada = this.vista.tabla.getSelectedRow();
		if (filaPulsada >= 0) {
			int identificador = (int) this.vista.dtm.getValueAt(filaPulsada, 0);
			try {
				cs = AccesoBdatos.getConexion().prepareCall("{CALL getSocio(?)}");
				cs.setInt(1, identificador);
				rs = cs.executeQuery();
				if (rs.next()) {
					this.vista.txtSocioID.setText(rs.getString(1));
					this.vista.txtNombre.setText(rs.getString(2));
					this.vista.txtEstatura.setText(rs.getString(3));
					this.vista.txtEdad.setText(rs.getString(4));
					this.vista.txtLocalidad.setText(rs.getString(5));

				}

			} catch (SQLException e) {
				System.err.println("Error al CARGAR UN CLIENTE");
			}
		}
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	AccesoBdatos(String baseDatos) {
		this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + baseDatos + "?useSSL=false"
				+ "&serverTimezone=CET";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR AL REGISTRAR EL DRIVER");
			System.exit(0);
		}
		try {
			conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
		} catch (SQLException e) {
			System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Conectado a " + baseDatos);
	}

	public static Connection getConexion() {
		return conexion;
	}

}
