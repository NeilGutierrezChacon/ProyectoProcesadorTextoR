package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemDeshacer {

	public ClaseMenuItemDeshacer(JComponent menu) {
		
		JMenuItem deshacer = new JMenuItem("Deshacer");
		
		deshacer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(deshacer);
		
	}


}
