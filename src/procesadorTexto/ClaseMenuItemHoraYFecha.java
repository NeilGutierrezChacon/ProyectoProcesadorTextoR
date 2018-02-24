package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemHoraYFecha {

	public ClaseMenuItemHoraYFecha(JMenu menu) {
		
		JMenuItem horaYFecha = new JMenuItem("Hora y fecha");
		
		horaYFecha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(horaYFecha);
		
	}


}
