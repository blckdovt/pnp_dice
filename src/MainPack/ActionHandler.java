package MainPack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;


public class ActionHandler implements ActionListener{
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//WÜRFEL + RESET BUTTONS
		
		if(e.getSource() == GUI.w4) {
			Würfelmechanik.w4();
		}else if(e.getSource() == GUI.w6) {
			Würfelmechanik.w6();
		}else if(e.getSource() == GUI.w8) {
			Würfelmechanik.w8();
		}else if(e.getSource() == GUI.w10) {
			Würfelmechanik.w10();
		}else if(e.getSource() == GUI.w12) {
			Würfelmechanik.w12();
		}else if(e.getSource() == GUI.w20) {
			Würfelmechanik.w20();
		}else if(e.getSource() == GUI.reset) {
			Würfelmechanik.reset();
		}
		
		//DESIGN AUSWAHL - FANTASY
		
		if(e.getSource() == GUI.fantasy) {
			
			GUI.w4.setBackground(Color.decode("#845A18"));
			GUI.w6.setBackground(Color.decode("#845A18"));
			GUI.w8.setBackground(Color.decode("#845A18"));
			GUI.w10.setBackground(Color.decode("#845A18"));
			GUI.w12.setBackground(Color.decode("#845A18"));
			GUI.w20.setBackground(Color.decode("#845A18"));
			GUI.reset.setBackground(Color.decode("#5A3918"));
			
			GUI.endergebnis.setForeground(Color.decode("#395A39"));
			
			GUI.w4.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.w6.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.w8.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.w10.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.w12.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.w20.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			GUI.reset.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			
			GUI.endergebnis.setFont(new Font("Old English Text MT", Font.BOLD, 350));
			
			GUI.frame.setSize(900, 640);
			GUI.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GUI.frame.setResizable(false);
			GUI.frame.setLocationRelativeTo(null);
			GUI.frame.setLayout(null);
			GUI.frame.requestFocus();
			
			
			try {
				GUI.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/pic/FantasyBGII.jpg")))));
	        } catch (IOException ev1) {
	        	System.out.println("Error: Image not loaded!");
	            ev1.printStackTrace();
	        }
			
			
			GUI.frame.add(GUI.w4);
			GUI.frame.add(GUI.w6);
			GUI.frame.add(GUI.w8);
			GUI.frame.add(GUI.w10);
			GUI.frame.add(GUI.w12);
			GUI.frame.add(GUI.w20);
			GUI.frame.add(GUI.reset);
			
			GUI.frame.add(GUI.anzeige);
			
			GUI.frame.setVisible(true);
			
		}
		
		//DESIGN AUSWAHL - ZOMBIE
		
		else if(e.getSource() == GUI.zombie) {
			
			GUI.w4.setBackground(Color.decode("#404040"));
			GUI.w6.setBackground(Color.decode("#404040"));
			GUI.w8.setBackground(Color.decode("#404040"));
			GUI.w10.setBackground(Color.decode("#404040"));
			GUI.w12.setBackground(Color.decode("#404040"));
			GUI.w20.setBackground(Color.decode("#404040"));
			GUI.reset.setBackground(Color.decode("#141414"));
			
			GUI.endergebnis.setForeground(Color.decode("#391818"));
		
			GUI.w4.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.w6.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.w8.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.w10.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.w12.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.w20.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 30));
			GUI.reset.setFont(new Font("Exquisite Corpse", Font.CENTER_BASELINE, 22));
			
			GUI.endergebnis.setFont(new Font("Exquisite Corpse", Font.PLAIN, 350));
			
			GUI.frame.setSize(900, 640);
			GUI.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GUI.frame.setResizable(false);
			GUI.frame.setLocationRelativeTo(null);
			GUI.frame.setLayout(null);
			GUI.frame.requestFocus();
			
			try {
				GUI.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/pic/ZombieBGII.jpg")))));
	        } catch (IOException ev2) {
	        	System.out.println("Error: Image not loaded!");
	            ev2.printStackTrace();
	        }
			
			GUI.frame.add(GUI.w4);
			GUI.frame.add(GUI.w6);
			GUI.frame.add(GUI.w8);
			GUI.frame.add(GUI.w10);
			GUI.frame.add(GUI.w12);
			GUI.frame.add(GUI.w20);
			GUI.frame.add(GUI.reset);
			
			GUI.frame.add(GUI.anzeige);
			
			GUI.frame.setVisible(true);
			
		}
		
		if(e.getSource() == GUI.deutsch) {
			GUI.w4.setText("W4");
			GUI.w6.setText("W6");
			GUI.w8.setText("W8");
			GUI.w10.setText("W10");
			GUI.w12.setText("W12");
			GUI.w20.setText("W20");
			GUI.reset.setText("Neu");
		}else if(e.getSource() == GUI.englisch) {
			GUI.w4.setText("D4");
			GUI.w6.setText("D6");
			GUI.w8.setText("D8");
			GUI.w10.setText("D10");
			GUI.w12.setText("D12");
			GUI.w20.setText("D20");
			GUI.reset.setText("Reset");
		}
		
	}
	
}
