package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemVerLaAyuda {

	public ClaseMenuItemVerLaAyuda(JMenu menu) {
		
		JMenuItem verLaAyuda = new JMenuItem("Ver la ayuda");
		
		verLaAyuda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(verLaAyuda);
		
	}


}
