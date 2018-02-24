package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemGuardar {

	public ClaseMenuItemGuardar(JMenu menu) {
		
		JMenuItem guardar = new JMenuItem("Guardar");
		
		guardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(guardar);
		
	}


}
