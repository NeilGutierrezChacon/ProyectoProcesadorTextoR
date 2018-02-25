package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ClaseMenuItemGuardar {

	public ClaseMenuItemGuardar(JMenu menu,JTextArea hoja,String nombreArchivo) {
		
		JMenuItem guardar = new JMenuItem("Guardar");
		EventoGuardar eventoGuardar= new EventoGuardar("",nombreArchivo,hoja);
		guardar.addActionListener(eventoGuardar);

		menu.add(guardar);
		
	}


}
