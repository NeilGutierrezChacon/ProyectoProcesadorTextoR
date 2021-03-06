package procesadorTexto;

import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
		
		JPopupMenu menuEmergente =new JPopupMenu();
		
		hoja=new JTextArea(8,20);//instancia de la variable hoja como JTextArea
		
		
		add(hoja,BorderLayout.CENTER);//a�adiendo la hoja en la parte norte
		
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
		
		ClaseMenuItemGuardar guardar=new ClaseMenuItemGuardar(archivo,hoja,"testGuardado.txt");
		
		ClaseMenuItemGuardarComo guardarComo=new ClaseMenuItemGuardarComo(archivo);
		
		ClaseMenuItemConfigurarPag confPag=new ClaseMenuItemConfigurarPag(archivo);
		
		ClaseMenuItemImprimir imprimir=new ClaseMenuItemImprimir(archivo);
		
		ClaseMenuItemSalir salir=new ClaseMenuItemSalir(archivo);
		
		
		//-------------------------------------------------------------------------------//
		
		ClaseMenuItemDeshacer deshacer=new ClaseMenuItemDeshacer(edicion);
		
		ClaseMenuItemCortar cortar=new ClaseMenuItemCortar(edicion);
		
		ClaseMenuItemCopiar copiar=new ClaseMenuItemCopiar(edicion);
		
		ClaseMenuItemPegar pegar=new ClaseMenuItemPegar(edicion);
		
		ClaseMenuItemEliminar eliminar =new ClaseMenuItemEliminar(edicion);
		
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
		
		//--------------------------------------------------------------------------------//
		/*
		 * Items del menu emergente del click derecho
		 */
		
		ClaseMenuItemCortar cortarE=new ClaseMenuItemCortar(menuEmergente);
		
		ClaseMenuItemCopiar copiarE=new ClaseMenuItemCopiar(menuEmergente);
		
		ClaseMenuItemPegar pegarE=new ClaseMenuItemPegar(menuEmergente);
		
		ClaseMenuItemEliminar eliminarE =new ClaseMenuItemEliminar(menuEmergente);
		
		ClaseMenuItemDeshacer DeshacerE = new ClaseMenuItemDeshacer(menuEmergente);
		
		hoja.setComponentPopupMenu(menuEmergente);
		
		laminaMenuPrincipal.add(barraPrincipal);//a�adimos la barra principal a la lamina
		//del menu principal NECESARIO A�ADIRLOS AL FINAL 
		
		add(laminaMenuPrincipal,BorderLayout.NORTH);//a�adimos la lamina de menus a la lamina 
		//principal en la posicion norte 
		
		
		
	}

}
