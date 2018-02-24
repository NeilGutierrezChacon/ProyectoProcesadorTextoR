package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemBuscarSiguiente {

	public ClaseMenuItemBuscarSiguiente(JMenu menu) {
		
		JMenuItem buscarSiguiente = new JMenuItem("Buscar siguiente");
		
		buscarSiguiente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(buscarSiguiente);
		
	}


}
