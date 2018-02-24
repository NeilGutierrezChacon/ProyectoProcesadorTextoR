package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemSalir {

	public ClaseMenuItemSalir(JMenu menu) {
		
		JMenuItem salir = new JMenuItem("Salir");
		
		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Esta saliendo del bloc de notas");
				
			}});
		
		menu.add(salir);
		
	}


}
