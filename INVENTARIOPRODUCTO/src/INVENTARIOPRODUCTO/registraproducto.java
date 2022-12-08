package INVENTARIOPRODUCTO;
import java.awt.Color;



import javax.swing.*;

public class registraproducto extends Ventana {
	static JPanel Mantel;
	static JTextArea mostrar;
	static JButton registra,botonregresar;
	static JTextField nombrea;
	static JLabel nombredelarchivo;
	
 registraproducto(int x,int y, int ancho, int alto, String titulo){
	 super(x,y,ancho,alto,titulo);
	 
	   
	   HazArchivo(400,20,200,70);	   
	   HazMantel(0,0,820,420);
	   Hazarea(50,20,320,300); 
	   Hazbotonregistra(400, 100, 239, 64,"REGISTRA PRODUCTO");
	   HazBotonregresar();
		

		 
		 
	   botonregresar=new Boton(400,150);
		 Accionagenerico j =new Accionagenerico(4,this);
		 botonregresar.addActionListener(j);
		 
		
		
		 add(botonregresar);
		 add(mostrar);
		 add(registra);
		 add(nombrea);
		 add(nombredelarchivo);
	     add(Mantel);
		 setVisible(true);
		 
 }
 public static void HazBotonregresar() {
	
 }
 public static void HazMantel(int x, int y, int ancho, int alto) {
	  Mantel= new JPanel();
	 Mantel.setLayout(null);
	 Mantel.setBounds(x,y, ancho, alto);
	 Mantel.setBackground(new Color(0,128,0));
	// Etiqueta logo=new Etiqueta(1,"C://Users//Julius//Desktop//3.png",0,0,900,500);
	
}
 
 public static void Hazarea(int x, int y, int ancho , int alto) {
	  mostrar=new JTextArea();
	 mostrar.setBounds(x,y,ancho,alto);  
	
}
 
 
 
 public static void Hazbotonregistra(int x, int y, int ancho, int alto,String titulo) {
	 registra= new Boton(x,y,ancho,alto,titulo);
	  Accionagenerico g=new Accionagenerico(3,mostrar,nombrea);  
	 registra.addActionListener(g);
	 
	 
}
 public static void HazArchivo(int x,int y, int ancho , int alto) {
	 
	 nombredelarchivo=new JLabel("Nombre del archivo");
	 nombredelarchivo.setBounds(x,y,ancho,alto);
	 nombredelarchivo.setBackground(new Color(255,255,0));
	 
	 nombrea=new JTextField();
	 nombrea.setBounds(x+120,y,ancho,alto);
 }
}
