package procesadorTexto;

import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Lamina donde desarrollamos el procesador de texto
 */

public class LaminaProcesadorTexto extends JPanel {
	
	private JTextArea hoja;//Veriable usada para escribir como hoja
	//usada en el solo en la clase LaminaProcesador de texto 
	
	
	public LaminaProcesadorTexto() {
		
		setLayout(new BorderLayout());//establecemos un Layout de tipo Border
		
		JPanel laminaMenuPrincipal = new JPanel();//Lamina donde estableceremos el menu
		
		JMenuBar barraPrincipal=new JMenuBar();//instancia un menuBarra para el menu principal
		
		hoja=new JTextArea();//instancia de la variable hoja como JTextArea
		
		add(hoja,BorderLayout.CENTER);//añadiendo la hoja en la parte norte
		//--------------------------------------------------------------------------//
		JMenu archivo =new JMenu("Archivo");
		
		JMenu edicion =new JMenu("Edicion");
		
		JMenu formato =new JMenu("Formato");
		
		JMenu ver =new JMenu("Ver");
		
		JMenu ayuda =new JMenu("Ayuda");
		
		barraPrincipal.add(archivo);
		
		barraPrincipal.add(edicion);
		
		barraPrincipal.add(formato);
		
		barraPrincipal.add(ver);
		
		barraPrincipal.add(ayuda);
		
		
		
		
		
		laminaMenuPrincipal.add(barraPrincipal);//añadimos la barra principal a la lamina
		//del menu principal NECESARIO AÑADIRLOS AL FINAL 
		
		add(laminaMenuPrincipal,BorderLayout.NORTH);//añadimos la lamina de menus a la lamina 
		//principal en la posicion norte 
		
		
		
	}

}
