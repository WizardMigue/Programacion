package ejer1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/* import kadumMVC.Controller; */

import javax.swing.JTable;

public class Vista extends JFrame {

	/**************** ATRIBUTOS ***************************/
	// CONTENEDOR PRINCIPAL
	private JPanel contenedor;

	// DEFINICI�N DE LAS ETIQUETAS
	private JLabel lblSocioID;
	private JLabel lblNombre;
	private JLabel lblEstatura;
	private JLabel lblEdad;
	private JLabel lblLocalidad;

	// DEFINICI�N DE LOS CUADROS DE TEXTO
	protected JTextField txtSocioID;
	protected JTextField txtNombre;
	protected JTextField txtEstatura;
	protected JTextField txtEdad;
	protected JTextField txtLocalidad;

	// DEFINICI�N DE LOS BOTONES
	protected JButton btnAdd;
	protected JButton btnDel;
	protected JButton btnUpd;

	// DEFINICI�N DE LOS OBJETOS PARA LA TABLA
	private JScrollPane scroll; // Panel de scroll que contiene la tabla
	public Object[][] datos; // Cuerpo de la tabla
	public String[] cabecera; // Cabecera de la tabla
	public DefaultTableModel dtm;// Uni�n de la cabecera y la tabla
	public JTable tabla; // Tabla propiamente dicha

	/**************** M�TODOS ***************************/
	// CONSTRUCTOR
	Vista() {
		// M�todos de la JFrame
		setBounds(100, 100, 450, 300);// Definir las dimensiones de la ventana
		setTitle("GESTI�N DE LOS SOCIOS DE LA BASE DE DATOS BALONCESTO"); // Barra de t�tulo
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Acci�n al pulsar salir

		// CREAR EL CONTENEDOR PRINCIPAL Y A�ADIRLO A LA VENTANA
		contenedor = new JPanel();
		getContentPane().add(contenedor);

		// INDICAR QUE SE QUIERE USAR SPRINGLAYOUT
		SpringLayout sp = new SpringLayout();
		contenedor.setLayout(sp);

		// Vamos al l�o
		/**************** BOF ETIQUETAS vvvvvvvvvvvvvvvv **/
		// ETIQUETA SocioID
		lblSocioID = new JLabel("SocioID:"); // Crear el objeto
		contenedor.add(lblSocioID); // A�adirlo al contenedor
		sp.putConstraint(SpringLayout.NORTH, lblSocioID, 10, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblSocioID, 10, SpringLayout.WEST, contenedor);
		// ETIQUETA NOMBRE
		lblNombre = new JLabel("Nombre:");
		contenedor.add(lblNombre);
		sp.putConstraint(SpringLayout.NORTH, lblNombre, 40, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, contenedor);
		// ETIQUETA ESTATURA
		lblEstatura = new JLabel("Estatura:");
		contenedor.add(lblEstatura);
		sp.putConstraint(SpringLayout.NORTH, lblEstatura, 70, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblEstatura, 10, SpringLayout.WEST, contenedor);
		// ETIQUETA EDAD
		lblEdad = new JLabel("Edad:");
		contenedor.add(lblEdad);
		sp.putConstraint(SpringLayout.NORTH, lblEdad, 100, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblEdad, 10, SpringLayout.WEST, contenedor);
		// ETIQUTA LOCALIDAD
		lblLocalidad = new JLabel("Localidad:");
		contenedor.add(lblLocalidad);
		sp.putConstraint(SpringLayout.NORTH, lblLocalidad, 130, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblLocalidad, 10, SpringLayout.WEST, contenedor);
		/**************** EOF ETIQUETAS ^^^^^^^^^^^^^^^^ **/

		/**************** BOF CUADROS DE TEXTO vvvvvvvvv **/
		// CUADRO DE TEXTO PARA EL SOCIOID
		txtSocioID = new JTextField();
		contenedor.add(txtSocioID);
		sp.putConstraint(SpringLayout.NORTH, txtSocioID, 10, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtSocioID, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtSocioID, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA EL NOMBRE
		txtNombre = new JTextField();
		contenedor.add(txtNombre); // a�adir al contenedor
		sp.putConstraint(SpringLayout.NORTH, txtNombre, 40, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtNombre, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtNombre, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA LAS ESTATURA
		txtEstatura = new JTextField();
		contenedor.add(txtEstatura);
		sp.putConstraint(SpringLayout.NORTH, txtEstatura, 70, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtEstatura, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtEstatura, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA LA EDAD
		txtEdad = new JTextField();
		contenedor.add(txtEdad);
		sp.putConstraint(SpringLayout.NORTH, txtEdad, 100, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtEdad, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtEdad, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA LA LOCALIDAD
		txtLocalidad = new JTextField();
		contenedor.add(txtLocalidad);
		sp.putConstraint(SpringLayout.NORTH, txtLocalidad, 130, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtLocalidad, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtLocalidad, 300, SpringLayout.WEST, contenedor);
		/**************** EOF CUADROS DE TEXTO ^^^^^^^^^ **/

		/**************** BOF TABLA vvvvvvvvvvvvvvvvvvvv **/
		scroll = new JScrollPane();
		cabecera = new String[] { "SocioID", "Nombre", "Estatura", "Edad", "Localidad" };
		dtm = new DefaultTableModel(datos, cabecera);
		tabla = new JTable(dtm);
		scroll.setViewportView(tabla);
		// y ahora se coloca el scrollpane...
		contenedor.add(scroll); // a�adir al contenedor
		sp.putConstraint(SpringLayout.NORTH, scroll, 160, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, scroll, 10, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, scroll, -10, SpringLayout.EAST, contenedor);
		sp.putConstraint(SpringLayout.SOUTH, scroll, -50, SpringLayout.SOUTH, contenedor);
		/**************** EOF TABLA ^^^^^^^^^^^^^^^^^^^^ **/

		/**************** BOF BOTONES vvvvvvvvvvvvvvvvvv **/
		// BOT�N A�ADIR
		btnAdd = new JButton("A�adir");
		contenedor.add(btnAdd);
		sp.putConstraint(SpringLayout.SOUTH, btnAdd, -10, SpringLayout.SOUTH, contenedor);// colocarlo
		sp.putConstraint(SpringLayout.WEST, btnAdd, 60, SpringLayout.WEST, contenedor);
		// BOT�N BORRAR
		btnDel = new JButton("Borrar");
		contenedor.add(btnDel);
		sp.putConstraint(SpringLayout.SOUTH, btnDel, -10, SpringLayout.SOUTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, btnDel, 150, SpringLayout.WEST, contenedor);
		// BOT�N MODIFICAR
		btnUpd = new JButton("Editar");
		contenedor.add(btnUpd);
		sp.putConstraint(SpringLayout.SOUTH, btnUpd, -10, SpringLayout.SOUTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, btnUpd, 240, SpringLayout.WEST, contenedor);
		/**************** EOF BOTONES ^^^^^^^^^^^^^^^^^^^^ **/

		// Se hace visible la ventana
		setVisible(true);

	}

	public void conectaControlador(AccesoBdatos c) {

		btnAdd.addActionListener(c);
		btnAdd.setActionCommand("INSERTAR");

		btnDel.addActionListener(c);
		btnDel.setActionCommand("BORRAR");

		btnUpd.addActionListener(c);
		btnUpd.setActionCommand("MODIFICAR");

		tabla.addMouseListener(c);
		// s�lo se permite pulsar una fila a la vez.
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
}
