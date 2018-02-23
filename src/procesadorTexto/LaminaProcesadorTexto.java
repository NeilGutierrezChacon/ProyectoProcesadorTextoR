package procesadorTexto;

import java.awt.BorderLayout;

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
		
		hoja=new JTextArea();//instancia de la variable hoja como JTextArea
		
		add(hoja,BorderLayout.CENTER);//añadiendo la hoja en la parte norte
		
		
	}

}
