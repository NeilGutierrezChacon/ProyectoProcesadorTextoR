package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ClaseMenuItemNuevo implements ActionListener {

	public ClaseMenuItemNuevo(JMenu menu, JTextArea hoja) {
		
		JMenuItem nuevo = new JMenuItem("Nuevo");
		
		nuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(!(hoja.getText().equals(""))) {
					System.out.println("Desea guardar los cambios.....");
					hoja.setText("");
				}
				
				
			}});
		
		menu.add(nuevo);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
