package INVENTARIOPRODUCTO;

import java.awt.Color;

import java.awt.Font;

import javax.swing.*;


public class Etiqueta extends JLabel{
	static private ImageIcon icon1;
	/*Etiqueta(int x, int y, String texto,String ruta)
	{
		icon1=new ImageIcon(ruta);
		setIcon(icon1);
		//setText(texto);
		setLocation(x,y);
		
		setBounds(500,10,200,200);
		//setForeground(new Color(0,0,0));
		setText("JESSE");
	}*/
	Etiqueta( int id,String ruta, int x, int y, int ancho, int alto)
	{
		if(id==1){
		icon1=new ImageIcon(ruta);
		setIcon(icon1);
		setBounds(x,y,ancho, alto);
		
	}
	
	else{
		
		//setBounds(500,10,200,200);
		//setForeground(new Color(0,0,0));
		//setText("JESSE");
		
		Font fuente=new Font("",Font.BOLD,40);
		setFont(fuente);
		setBounds(x,y,ancho,alto);
		setText(ruta);
		
	}

}
}
