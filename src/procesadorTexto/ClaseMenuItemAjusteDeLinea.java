package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemAjusteDeLinea {

	public ClaseMenuItemAjusteDeLinea(JMenu menu) {
		
		JMenuItem ajusteDeLinea = new JMenuItem("Ajuste de linea");
		
		ajusteDeLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(ajusteDeLinea);
		
	}


}
