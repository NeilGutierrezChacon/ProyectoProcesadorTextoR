package procesadorTexto;

import javax.swing.JFrame;

public class MarcoProcesadorTexto extends JFrame {

	public MarcoProcesadorTexto() {
		setTitle("ProcesadorTexto");
		setBounds(300,300,450,450);
		LaminaProcesadorTexto laminaPrincipal=new LaminaProcesadorTexto();
		add(laminaPrincipal);
	}

}
