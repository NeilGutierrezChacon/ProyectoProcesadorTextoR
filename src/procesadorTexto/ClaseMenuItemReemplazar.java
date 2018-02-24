package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemReemplazar {

	public ClaseMenuItemReemplazar(JMenu menu) {
		
		JMenuItem reemplazar = new JMenuItem("Reemplazar");
		
		reemplazar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(reemplazar);
		
	}


}
