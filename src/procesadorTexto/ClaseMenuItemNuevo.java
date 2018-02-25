package procesadorTexto;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class ClaseMenuItemNuevo implements ActionListener {

	public ClaseMenuItemNuevo(JMenu menu, JTextArea hoja) {
		
		JMenuItem nuevo = new JMenuItem("Nuevo");
		Frame c1=new Frame();
		FileDialog cuadro=new FileDialog(c1,"Guardar",FileDialog.SAVE);
		
		nuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(!(hoja.getText().equals(""))) {
					//JOptionPane.showMessageDialog( null, "¿Desea guardar los cambios?" );
					
					cuadro.show();
					hoja.setText("");
				}
				
				
				
			}});
		
		menu.add(nuevo);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
