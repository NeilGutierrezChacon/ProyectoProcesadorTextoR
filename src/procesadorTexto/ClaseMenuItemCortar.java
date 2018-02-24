package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemCortar {

	public ClaseMenuItemCortar(JMenu menu) {
		
		JMenuItem Cortar = new JMenuItem("Cortar");
		
		Cortar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(Cortar);
		
	}


}
