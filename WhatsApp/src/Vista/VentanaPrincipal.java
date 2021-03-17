package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelWhatsApp panelWhatsApp;
	
	public VentanaPrincipal(){
		
		setVisible(true);
		setSize(500,500);
		setTitle("Whatsapp");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelWhatsApp = new PanelWhatsApp();
		add(panelWhatsApp, BorderLayout.CENTER);
		
		validate();
		
	}
	
}
