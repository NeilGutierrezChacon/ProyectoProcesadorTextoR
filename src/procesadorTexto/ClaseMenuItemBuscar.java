package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemBuscar {

	public ClaseMenuItemBuscar(JMenu menu) {
		
		JMenuItem buscar = new JMenuItem("Buscar.....");
		
		buscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(buscar);
		
	}


}
