package procesadorTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaseMenuItemSeleccionarTodo {

	public ClaseMenuItemSeleccionarTodo(JMenu menu) {
		
		JMenuItem seleccionarTodo = new JMenuItem("Seleccionar todo");
		
		seleccionarTodo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		menu.add(seleccionarTodo);
		
	}


}
