package vista_wb;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaPanelOrdenNueva extends JPanel {
	private JTable table;
	
	public VistaPanelOrdenNueva() 
	{
		setVisible(true);
		setSize(586,264);
		setLayout(null);
		
		JLabel lblNuevaOrden = new JLabel("NUEVA ORDEN ");
		lblNuevaOrden.setBounds(10, 11, 140, 14);
		add(lblNuevaOrden);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 42, 342, 45);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Código", "Fecha", "Valor"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAregarOrden = new JButton("Aregar orden");
		btnAregarOrden.setBounds(189, 207, 140, 23);
		add(btnAregarOrden);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(487, 241, 89, 23);
		add(btnRegresar);
	}
}
