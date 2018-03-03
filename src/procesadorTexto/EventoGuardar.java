package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class EventoGuardar implements ActionListener{

	String direccion,nombreArchivo;
	JTextArea hoja;
	public EventoGuardar(String dir, String nomArch,JTextArea hojaOrigen) {
		direccion=dir;
		nombreArchivo=nomArch;
		hoja=hojaOrigen;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			File archivo=new File(nombreArchivo);
			FileWriter archivoGuardar = new FileWriter(archivo,true);
			archivoGuardar.write(hoja.getText());
			archivoGuardar.close();
			System.out.println("Contenido guardado");
		}catch(Exception ei) {
			
			System.out.println("EL archivo no se pudo guardar");
		}
		
	}
	

}
