package INVENTARIOPRODUCTO;
import javax.swing.*;
import java.awt.Color;
public class Boton extends JButton{
	Boton ( int x , int y, int ancho, int alto, String titulo,Color c)
	{
		setForeground(c);
		setText(titulo);
		setBounds(x,y,ancho,alto);
		setBackground(new Color(255,255,255));
	}
	Boton(int x,int y, int ancho , int alto,String titulo){
		setText(titulo);
		setBounds(x,y,ancho,alto);
		setBackground(new Color(255,255,255));
	}
	Boton(int x, int y){
		
		setText("REGRESAR");
		setBounds(x,y,239,64);
		setBackground(new Color(250,250,250));
	}


}
