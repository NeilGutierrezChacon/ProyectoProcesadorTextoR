package procesadorTexto;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MarcoProcesadorTexto extends JFrame {

	public MarcoProcesadorTexto() {
		setTitle("ProcesadorTexto");
		setBounds(300,300,450,450);
		LaminaProcesadorTexto laminaPrincipal=new LaminaProcesadorTexto();
		JScrollPane laminaConBarras = new JScrollPane(laminaPrincipal);
		add(laminaConBarras);
	}

}
