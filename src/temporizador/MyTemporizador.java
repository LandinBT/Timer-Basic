package temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MyTemporizador {
	static int seg;

	public static void main(String[] args) {
		seg=Integer.parseInt(JOptionPane.showInputDialog("Segundos: "));
		
		Timer reloj = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent ev) {
				System.out.println("Segundos faltantes: "+seg);
				
				if(seg==0)
					Toolkit.getDefaultToolkit().beep(); //sonido por default del sistema
				
				seg--;
			}
			
		}); //cada cuando se va repetir la accion, actionPerfomed
		
		while(seg>=0) reloj.start();
		
		reloj.stop();
	}

}
