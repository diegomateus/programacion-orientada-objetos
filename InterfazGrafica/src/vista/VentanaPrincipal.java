package vista;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
	
	private PanelInformacion panelInfo;
	
	public VentanaPrincipal() 
	{
		setVisible(true);
		
		setSize(400, 600);
		setTitle("Ventana 1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelInfo = new PanelInformacion();
		add(panelInfo, BorderLayout.CENTER);
		
		validate();
	}
}
