package vista_wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.swing.DefaultLayoutStyle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener{
	
	public static final String ACCIONINGRE = "accion ingrediente";
	private JPanel panelServicios;
	private IngredientesVista ingredientes;
	private VistaPanelPlatos platos;
	private VistaPanelOrdenNueva ordenes;
	public Ventana() {
		//Creación del panel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599,357);
		panelServicios = new JPanel();
		panelServicios.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelServicios.setLayout(null);
		setContentPane(panelServicios);
		//Creación del tabbedPane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSize(586, 317);
		panelServicios.add(tabbedPane);
		JPanel Servicios = new JPanel();
		tabbedPane.add("Servicios",Servicios);
		Servicios.setLayout(null);
		//Creación de botones para la pantalla principal(Servicios)
		JButton btnIngredientes = new JButton("Ingredientes");
		btnIngredientes.setBounds(10, 36, 119, 23);
		btnIngredientes.addActionListener(this);
		btnIngredientes.setActionCommand(ACCIONINGRE);
		Servicios.add(btnIngredientes);
		
		JButton btnPlatos = new JButton("Platos");
		btnPlatos.setBounds(139, 36, 119, 23);
		Servicios.add(btnPlatos);
		
		JLabel lblServicios = new JLabel("Servicios");
		lblServicios.setBounds(10, 70, 89, 14);
		Servicios.add(lblServicios);
		
		JButton btnAgregarOrden = new JButton("Agregar Orden");
		btnAgregarOrden.setBounds(10, 95, 178, 23);
		Servicios.add(btnAgregarOrden);
		
		JButton btnrdenesDelDa = new JButton("\u00D3rdenes del d\u00EDa");
		btnrdenesDelDa.setBounds(198, 95, 148, 23);
		Servicios.add(btnrdenesDelDa);
		
		JButton btnMenDelRestaurante = new JButton("Men\u00FA del restaurante");
		btnMenDelRestaurante.setBounds(10, 128, 178, 23);
		Servicios.add(btnMenDelRestaurante);
		
		JButton btnReportes = new JButton("Reportes");
		btnReportes.setBounds(198, 128, 89, 23);
		Servicios.add(btnReportes);
		
		JLabel lblRespaldo = new JLabel("Respaldo");
		lblRespaldo.setBounds(20, 163, 90, 14);
		Servicios.add(lblRespaldo);
		
		JButton btnGuardarcargarSistema = new JButton("Guardar/Cargar sistema");
		btnGuardarcargarSistema.setBounds(10, 188, 178, 23);
		Servicios.add(btnGuardarcargarSistema);
		
		JLabel lblRestauranteLaGuachafita = new JLabel("Restaurante Javeriano");
		lblRestauranteLaGuachafita.setBounds(393, 40, 178, 14);
		Servicios.add(lblRestauranteLaGuachafita);
		//Agregar un icono a un label
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("./data/javeriana2.png"));
		label.setBounds(393, 60, 148, 151);
		Servicios.add(label);
		
		JLabel lblDatosBsicos = new JLabel("Datos Básicos");
		lblDatosBsicos.setBounds(10, 11, 119, 14);
		Servicios.add(lblDatosBsicos);
		//Etiquetas para los distintos paneles
		ingredientes = new IngredientesVista();
		tabbedPane.add("Ingredientes",ingredientes);
		
		platos= new VistaPanelPlatos();
		tabbedPane.add("Platos",platos);
		
		ordenes = new VistaPanelOrdenNueva();
		tabbedPane.add("Agregar Orden",ordenes);
		
		JPanel OrdenesDia = new JPanel();
		tabbedPane.add("Órdenes de un día",OrdenesDia);
		
		JPanel Menú = new JPanel();
		tabbedPane.add("Menú del restaurante",Menú);
		
		JPanel Reportes = new JPanel();
		tabbedPane.add("Reportes",Reportes);
		
		JPanel Serializar = new JPanel();
		tabbedPane.add("Guardar y cargar el sistema",Serializar);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
		if(accion == ACCIONINGRE)
		{
			JOptionPane.showMessageDialog(null, "HOLA XD");
		}
	}
}
