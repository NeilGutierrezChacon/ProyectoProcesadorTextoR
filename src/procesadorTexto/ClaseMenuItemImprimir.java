package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemImprimir {

	public ClaseMenuItemImprimir(JMenu menu) {
		
		JMenuItem imprimir = new JMenuItem("Imprimir....");
		
		imprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(imprimir);
		
	}


}
