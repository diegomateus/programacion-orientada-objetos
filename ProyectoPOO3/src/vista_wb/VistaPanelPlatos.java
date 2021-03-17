package vista_wb;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaPanelPlatos extends JPanel {
	private JTable table;
	private JTable table_1;
public VistaPanelPlatos()
{
	setVisible(true);
	setSize(586,264);
	setLayout(null);
	
	JLabel lblPlatos = new JLabel("Platos");
	lblPlatos.setBounds(10, 11, 107, 14);
	add(lblPlatos);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(20, 36, 556, 59);
	add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null, null},
			{null, null, null, null},
			{null, null, null, null},
			{null, null, null, null},
		},
		new String[] {
			"C\u00F3digo", "Nombre", "Tipo", "D\u00EDa"
		}
	));
	scrollPane.setViewportView(table);
	
	JLabel lblIngredientes = new JLabel("Ingredientes");
	lblIngredientes.setBounds(10, 106, 96, 14);
	add(lblIngredientes);
	
	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(20, 120, 556, 74);
	add(scrollPane_1);
	
	table_1 = new JTable();
	table_1.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null, null},
			{null, null, null, null},
			{null, null, null, null},
			{null, null, null, null},
		},
		new String[] {
			"C\u00F3digo", "Nombre", "Precio unitario", "Cantidad"
		}
	));
	scrollPane_1.setViewportView(table_1);
	
	JButton btnCargarPlatos = new JButton("Cargar platos");
	btnCargarPlatos.setBounds(20, 205, 130, 23);
	add(btnCargarPlatos);
	
	JButton btnNuevoPlato = new JButton("Nuevo plato");
	btnNuevoPlato.setBounds(160, 205, 130, 23);
	add(btnNuevoPlato);
	
	JButton btnAlmacenarPlato = new JButton("Almacenar plato");
	btnAlmacenarPlato.setBounds(300, 205, 130, 23);
	add(btnAlmacenarPlato);
	
	JButton btnRegresar = new JButton("Regresar");
	btnRegresar.setBounds(487, 241, 89, 23);
	add(btnRegresar);
}
}
