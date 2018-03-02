package procesadorTexto;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemGuardarComo {

	public ClaseMenuItemGuardarComo(JMenu menu) {
		
		JMenuItem guardarComo = new JMenuItem("Guardar como");
		
		
		guardarComo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame c1=new Frame();
				FileDialog cuadro=new FileDialog(c1,"Guardar",FileDialog.SAVE);
				cuadro.show();
				
			}});
		
		menu.add(guardarComo);
		
	}


}
