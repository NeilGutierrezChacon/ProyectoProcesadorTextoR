package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemIrA {

	public ClaseMenuItemIrA(JMenu menu) {
		
		JMenuItem irA = new JMenuItem("Ir a.....");
		
		irA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(irA);
		
	}


}
