package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemCopiar {

	public ClaseMenuItemCopiar(JMenu menu) {
		
		JMenuItem copiar = new JMenuItem("Copiar");
		
		copiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(copiar);
		
	}


}
