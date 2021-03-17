package vista_wb;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class IngredientesVista extends JPanel {
	private JTable table;
public IngredientesVista()
{
	setVisible(true);
	setLayout(null);
	setSize(586,264);
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 29, 566, 155);
	add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
		},
		new String[] {
			"C\u00F3digo", "Nombre", "Precio Unitario", "Descripci\u00F3n", "Inventario", "M\u00EDnimo"
		}
	));
	scrollPane.setViewportView(table);
	
	JButton btnCargarIngredientes = new JButton("Cargar Ingredientes");
	btnCargarIngredientes.setBounds(24, 195, 160, 23);
	add(btnCargarIngredientes);
	
	JButton btnNuevoIngrediente = new JButton("Nuevo Ingrediente");
	btnNuevoIngrediente.setBounds(24, 229, 160, 23);
	add(btnNuevoIngrediente);
	
	JButton btnAlmacenarIngredientes = new JButton("Almacenar ingredientes");
	btnAlmacenarIngredientes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	btnAlmacenarIngredientes.setBounds(194, 195, 174, 23);
	add(btnAlmacenarIngredientes);
	
	JButton btnRegresar = new JButton("Regresar");
	btnRegresar.setBounds(487, 241, 89, 23);
	add(btnRegresar);
}
}
