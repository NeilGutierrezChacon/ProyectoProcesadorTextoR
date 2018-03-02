package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemPegar {

	public ClaseMenuItemPegar(JComponent menu) {
		
		JMenuItem pegar = new JMenuItem("Pegar");
		
		pegar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(pegar);
		
	}


}
