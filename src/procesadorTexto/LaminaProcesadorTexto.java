package procesadorTexto;

import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Lamina donde desarrollamos el procesador de texto
 */

public class LaminaProcesadorTexto extends JPanel {
	
	public JTextArea hoja;//Veriable usada para escribir como hoja
	//usada en el solo en la clase LaminaProcesador de texto 
	private JMenu archivo,edicion,formato,ver,ayuda;
	
	
	public LaminaProcesadorTexto() {
		
		setLayout(new BorderLayout());//establecemos un Layout de tipo Border
		
		JPanel laminaMenuPrincipal = new JPanel();//Lamina donde estableceremos el menu
		
		JMenuBar barraPrincipal=new JMenuBar();//instancia un menuBarra para el menu principal
		
		hoja=new JTextArea();//instancia de la variable hoja como JTextArea
		
		add(hoja,BorderLayout.CENTER);//añadiendo la hoja en la parte norte
		//--------------------------------------------------------------------------//
		archivo =new JMenu("Archivo");
		
		edicion =new JMenu("Edicion");
		
		formato =new JMenu("Formato");
		
		ver =new JMenu("Ver");
		
		ayuda =new JMenu("Ayuda");
		
		barraPrincipal.add(archivo);
		
		barraPrincipal.add(edicion);
		
		barraPrincipal.add(formato);
		
		barraPrincipal.add(ver);
		
		barraPrincipal.add(ayuda);
		
		//--------------------------------------------------------------------------//
		
		ClaseMenuItemNuevo nuevo=new ClaseMenuItemNuevo(archivo,hoja);
		
		ClaseMenuItemAbrir abrir=new ClaseMenuItemAbrir(archivo);
		
		ClaseMenuItemGuardar guardar=new ClaseMenuItemGuardar(archivo);
		
		ClaseMenuItemGuardarComo guardarComo=new ClaseMenuItemGuardarComo(archivo);
		
		ClaseMenuItemConfigurarPag confPag=new ClaseMenuItemConfigurarPag(archivo);
		
		ClaseMenuItemImprimir imprimir=new ClaseMenuItemImprimir(archivo);
		
		ClaseMenuItemSalir salir=new ClaseMenuItemSalir(archivo);
		
		
		//-------------------------------------------------------------------------------//
		
		ClaseMenuItemSalir deshacer=new ClaseMenuItemSalir(edicion);
		
		ClaseMenuItemCortar cortar=new ClaseMenuItemCortar(edicion);
		
		ClaseMenuItemCopiar copiar=new ClaseMenuItemCopiar(edicion);
		
		ClaseMenuItemPegar pegar=new ClaseMenuItemPegar(edicion);
		
		ClaseMenuItemBuscar buscar=new ClaseMenuItemBuscar(edicion);
		
		ClaseMenuItemBuscarSiguiente buscarSiguiente=new ClaseMenuItemBuscarSiguiente(edicion);
		
		ClaseMenuItemReemplazar remplazar=new ClaseMenuItemReemplazar(edicion);
		
		ClaseMenuItemIrA irA=new ClaseMenuItemIrA(edicion);
		
		ClaseMenuItemSeleccionarTodo seleccionarTodo=new ClaseMenuItemSeleccionarTodo(edicion);
		
		ClaseMenuItemHoraYFecha horaYFecha=new ClaseMenuItemHoraYFecha(edicion);
		
		//---------------------------------------------------------------------------------//
		
		ClaseMenuItemAjusteDeLinea ajusteDeLinea=new ClaseMenuItemAjusteDeLinea(formato);
		
		ClaseMenuItemFuente fuente=new ClaseMenuItemFuente(edicion);
		
		//--------------------------------------------------------------------------------//
		
		ClaseMenuItemBarraDeEstado barraDeEstado=new ClaseMenuItemBarraDeEstado(ver);
		
		//---------------------------------------------------------------------------------//
		
		ClaseMenuItemVerLaAyuda verLaAyuda=new ClaseMenuItemVerLaAyuda(ayuda);
		
		
		
		
		laminaMenuPrincipal.add(barraPrincipal);//añadimos la barra principal a la lamina
		//del menu principal NECESARIO AÑADIRLOS AL FINAL 
		
		add(laminaMenuPrincipal,BorderLayout.NORTH);//añadimos la lamina de menus a la lamina 
		//principal en la posicion norte 
		
		
		
	}

}
