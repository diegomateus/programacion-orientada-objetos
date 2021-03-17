package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInformacion extends JPanel
{
	public static final Color VERDE_WHATSAPP = new Color(7, 94, 84);
	
	private JButton boton;
	private JTextField texto;
	private JLabel lblNombre;
	private JLabel lblImagen;
	
	
	public PanelInformacion() 
	{
		setLayout(new GridLayout(3, 1));
		
		JPanel panelAzul = new JPanel();
		panelAzul.setLayout(new BorderLayout());
		panelAzul.setBackground(VERDE_WHATSAPP);
		
		lblImagen = new JLabel(new ImageIcon("./data/imagenes/perfil1.png"));
		panelAzul.add(lblImagen, BorderLayout.WEST);
		
		lblNombre = new JLabel("Hola! :)");
		lblNombre.setForeground(Color.WHITE);
		
		panelAzul.add(lblNombre, BorderLayout.CENTER);
		
		add(panelAzul);
		
		texto = new JTextField();
		add(texto);
		
		boton = new JButton("OK");
		add(boton);
		
	}
}
