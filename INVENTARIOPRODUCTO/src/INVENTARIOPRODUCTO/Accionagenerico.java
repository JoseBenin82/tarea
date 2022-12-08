package INVENTARIOPRODUCTO;

import java.awt.event.ActionEvent;




import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Accionagenerico implements ActionListener{
	int d;
	JTextArea caja;
	JFrame ven;
	JTextField nom;
	Accionagenerico(int i, JTextArea c,JTextField nombre){
		d=i;
		caja=c;
		nom=nombre;
	}
	Accionagenerico(int i){
		d=i;
	}
	Accionagenerico(int i,JFrame j){
		d=i;
		ven=j;
		
	}
	
	public void actionPerformed(ActionEvent e){
		switch (d) {
		
		case 1:
		{
			registraproducto r= new registraproducto(510, 10, 820, 420,"REGISTRAR PRODUCTO");
			ven.setVisible(false);
			
			break;
		}
		case 2:
		{
			
			visualizarproducto v= new visualizarproducto(510,10, 820, 420,"VISUALIZAR PRODUCTO");
			ven.setVisible(false);

			break;
			
		}
		
		case 3:
		{
		    
			File fil;
			fil=new File("C://Users//Julius//Desktop//"+nom.getText()+".txt");
					try {
						FileWriter write=new FileWriter(fil);
						BufferedWriter bw=new
						BufferedWriter(write);
						PrintWriter wr=new PrintWriter(bw);
						int o=1;
						for(int i=0;i<o;i++)
						{
							wr.append(caja.getText()+"");
						}
						wr.close();
						bw.close();
					}
			catch (Exception ex) {}
					break;
			
		}
		case 4:
			
		{
			
			System.out.println("Hacer invisible");
			Principal p=new Principal(510,10,820,420,"principal"); 
			ven.setVisible(false);
			break;
		}
		case 5:
		{
			System.out.println("ME DIO");
			FileReader fr=null;
			BufferedReader br=null;
			try {
				fr= new FileReader("C://Users//Julius//Desktop//"+nom.getText()+".txt");
				br=new BufferedReader(fr);
				int i = 0;
				String aux=br.readLine();
				while(aux!=null){
					caja.append(aux);
					i++;
					aux=br.readLine();
				}
			}
			catch(Exception ex) {}
			break;
		}
		
		
		default:
			break;
		}
	}
	
}
