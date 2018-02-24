package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemFuente {

	public ClaseMenuItemFuente(JMenu menu) {
		
		JMenuItem fuente = new JMenuItem("Fuente.....");
		
		fuente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(fuente);
		
	}


}
