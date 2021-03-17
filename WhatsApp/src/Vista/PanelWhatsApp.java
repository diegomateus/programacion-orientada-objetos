package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelWhatsApp extends JPanel {
	
	public static final Color VERDE_WAPP = new Color (7,94,84);
	
	private JLabel lblImagen;
	private JLabel lblImagen1;
	private JLabel lblImagen2;
	private JLabel lblTexto;
	private JButton lblTexto2;
	private JButton lblTexto3;
	private JButton lblTexto4;
	private JLabel nada;
	
	public PanelWhatsApp(){
		
		setLayout(new GridLayout(6,1));
		JPanel panelEncabezado = new JPanel();
		panelEncabezado.setLayout(new GridLayout(2,3));
		panelEncabezado.setBackground(VERDE_WAPP);
		
		lblTexto = new JLabel(" WhatsApp ");
		lblTexto.setForeground(Color.WHITE);
		panelEncabezado.add(lblTexto, 0);
		
		nada = new JLabel(" ");
		nada.setForeground(VERDE_WAPP);
		panelEncabezado.add(nada,1);
		
		JPanel imagenes = new JPanel();
		imagenes.setLayout(new GridLayout(1,3));
		imagenes.setBackground(VERDE_WAPP);
		
		lblImagen = new JLabel(new ImageIcon("./data/imagen/lupa.png"));
		imagenes.add(lblImagen, 0);
		
		lblImagen1 = new JLabel(new ImageIcon("./data/imagen/mensaje.png"));
		imagenes.add(lblImagen1, 0);
		
		lblImagen2 = new JLabel(new ImageIcon("./data/imagen/puntos.png"));
		imagenes.add(lblImagen2, 0);
		
		panelEncabezado.add(imagenes,2);
		
		lblTexto2 = new JButton(" Llamadas ");
		lblTexto2.setForeground(Color.WHITE);
		panelEncabezado.add(lblTexto2, 3);
		
		lblTexto3 = new JButton(" Chats ");
		lblTexto3.setForeground(Color.WHITE);
		panelEncabezado.add(lblTexto3, 4);
		
		lblTexto4 = new JButton(" Contactos ");
		lblTexto4.setForeground(Color.WHITE);
		panelEncabezado.add(lblTexto4, 5);
		
		add(panelEncabezado);
			
	}
		
}
