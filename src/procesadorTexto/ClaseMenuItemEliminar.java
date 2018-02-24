package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemEliminar {

	public ClaseMenuItemEliminar(JMenu menu) {
		
		JMenuItem eliminar = new JMenuItem("Eliminar");
		
		eliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(eliminar);
		
	}


}
