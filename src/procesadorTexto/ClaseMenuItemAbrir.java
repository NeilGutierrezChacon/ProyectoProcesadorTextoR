package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemAbrir {

	public ClaseMenuItemAbrir(JMenu menu) {
		
		JMenuItem abrir = new JMenuItem("Abrir");
		
		abrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(abrir);
		
	}


}
