package INVENTARIOPRODUCTO;
import java.awt.Color;


import javax.swing.*;
public class visualizarproducto extends Ventana {
	static JPanel Mantel;
	static JTextArea mostrar;
	static JButton botonregresar,botonver;
	static JTextField nombrea;
	static JLabel nombredelarchivo;
	visualizarproducto(int x, int y, int ancho, int alto, String titulo){
		super(x,y,ancho,alto,titulo);
		
		   HazMantel(0,0,820,420);
		   Hazarea(50,20,320,300);
		   HazArchivo(400,40,200,70);
		  // HazBotonver(10,400,200,50,0,128,0,"Ver gasto");
		 //  HazBotonregresar();
		   botonregresar=new Boton(400,150);
			 Accionagenerico z =new Accionagenerico(4,this);
			 botonregresar.addActionListener(z);
			
			 botonver=new Boton(400,250,100,50,"Botonver");
			 Accionagenerico v =new Accionagenerico(5,mostrar,nombrea);
			 botonver.addActionListener(v);
			 
			 Etiqueta logo=new Etiqueta(1,"C://Users//Julius//Desktop//3.png",0,0,900,500);
			 add(nombrea);
			 add(nombredelarchivo);
			add(botonver);
			  add(botonregresar);
			 add(mostrar); 
			 add(Mantel);
			 setVisible(true);
			
		
	}
	public static void HazBotonrver() {
		 
	 }
	
	public static void HazMantel(int x, int y, int ancho , int alto) {
		  Mantel= new JPanel();
		 Mantel.setLayout(null);
		 Mantel.setBounds(x,y,ancho , alto);
		 Mantel.setBackground(new Color(0,128,0));
		
	}
	public static void Hazarea(int x, int y, int ancho , int alto) {
		 mostrar=new JTextArea();
		 mostrar.setBounds(x,y,ancho, alto);
		 
		
	}
	public static void HazArchivo(int x,int y, int ancho , int alto) {
		 
		 nombredelarchivo=new JLabel("Nombre del archivo");
		 nombredelarchivo.setBounds(x,y,ancho,alto);
		 nombredelarchivo.setBackground(new Color(150,20,190));
		 
		 nombrea=new JTextField();
		 nombrea.setBounds(x+120,y,ancho,alto);
	 }

}
