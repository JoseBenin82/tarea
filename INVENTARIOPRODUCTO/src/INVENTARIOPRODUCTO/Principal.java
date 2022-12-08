package INVENTARIOPRODUCTO;

import java.awt.Color;



import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.*;



public class Principal extends Ventana {
	
	 static JPanel Mantel;
	 static JButton registra;
	 static JButton visualizar;
	 
	 
	 Principal(int x, int y, int ancho, int alto, String titulo){
		 super(x,y,ancho,alto,titulo);
	
		 HazMantel(510,10,820,420);
		 Etiqueta logo=new Etiqueta(1,"C://Users//Julius//Desktop//3.png",0,0,900,500);
	
	//HazBotonregistra(243, 100, 239, 64,"REGISTAR PRODUCTO");
//	HazBotonvisualizarproducto(243,180,239,64,"VISUALIZAR PRODUCTO");
	// JFrame Ventana = new JFrame();
	
		 registra= new Boton(280,110,200,50,"REGISTRAR PRODUCTO");
	   Accionagenerico A=new Accionagenerico(1,this);
	  registra.addActionListener(A);
		 
		 
	  visualizar= new Boton(280,160,200,50,"VISUALIZAR PRODUCTO");
		Accionagenerico B=new Accionagenerico(2,this);
	    visualizar.addActionListener(B);
		
		 
	
	
	 Mantel.add(registra);
	Mantel.add(visualizar);
	Mantel.add(logo);    
	
	
	setContentPane(Mantel);
   
	setVisible(true);
    setTitle("INVENTARIO");
    
	 }
    
	
	public static void HazMantel(int x, int y, int ancho, int alto) {
		 //Mantel= new JPanel();
		//Mantel.setLayout(null);
		
		Mantel=new Mantelote(x,y,ancho,alto);
		
		//Mantel.setBounds(x,y,ancho,alto);
	//	Mantel.setBackground(new Color( 0,128,0));
	
	}
	
	public static void HazBotonregistra(int x,int y, int ancho, int alto,String titulo) {
 	    
		 
	}
	
	public static void HazBotonvisualizarproducto(int x, int y, int ancho, int alto, String titulo) {
		  
	}
	 }


