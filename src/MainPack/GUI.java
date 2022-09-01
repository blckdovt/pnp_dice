package MainPack;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class GUI {
		
		static JButton w4;
		static JButton w6;
		static JButton w8;
		static JButton w10;
		static JButton w12;
		static JButton w20;
		static JButton reset;
		
		static JLabel endergebnis;
		
		static JPanel anzeige;
		
		JMenuBar menubar;
		
		JMenu design;
		JMenu sprache;
		JMenu about;
		
		static JMenuItem fantasy;
		static JMenuItem zombie;
		static JMenuItem deutsch;
		static JMenuItem englisch;
		
		static JFrame frame;
		
		public GUI() {
			
		//W4-BUTTON
			
			w4 = new JButton("W4");
			w4.setBounds(102, 45, 110, 40);
			w4.setBackground(Color.decode("#845A18"));
			w4.setForeground(Color.decode("#D4D4D4"));
			w4.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w4.setFocusable(false);
			w4.addActionListener(new ActionHandler());
			
			w4.setVisible(true);
			
		//W6-BUTTON
			
			w6 = new JButton("W6");
			w6.setBounds(102, 115, 110, 40);
			w6.setBackground(Color.decode("#845A18"));
			w6.setForeground(Color.decode("#D4D4D4"));
			w6.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w6.setFocusable(false);
			w6.addActionListener(new ActionHandler());
					
			w6.setVisible(true);
					
		//W8-BUTTON
					
			w8 = new JButton("W8");
			w8.setBounds(102, 190, 110, 40);
			w8.setBackground(Color.decode("#845A18"));
			w8.setForeground(Color.decode("#D4D4D4"));
			w8.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w8.setFocusable(false);
			w8.addActionListener(new ActionHandler());
					
			w8.setVisible(true);
			
		//W10-BUTTON
			
			w10 = new JButton("W10");
			w10.setBounds(102, 265, 110, 40);
			w10.setBackground(Color.decode("#845A18"));
			w10.setForeground(Color.decode("#D4D4D4"));
			w10.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w10.setFocusable(false);
			w10.addActionListener(new ActionHandler());
					
			w10.setVisible(true);
			
		//W12-BUTTON
			
			w12 = new JButton("W12");
			w12.setBounds(102, 340, 110, 40);
			w12.setBackground(Color.decode("#845A18"));
			w12.setForeground(Color.decode("#D4D4D4"));
			w12.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w12.setFocusable(false);
			w12.addActionListener(new ActionHandler());
					
			w12.setVisible(true);
			
		//W20-BUTTON
			
			w20 = new JButton("W20");
			w20.setBounds(102, 415, 110, 40);
			w20.setBackground(Color.decode("#845A18"));
			w20.setForeground(Color.decode("#D4D4D4"));
			w20.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			w20.setFocusable(false);
			w20.addActionListener(new ActionHandler());
							
			w20.setVisible(true);
			
		//RESET-BUTTON
			
			reset = new JButton("Neu");
			reset.setBounds(102, 495, 110, 40);
			reset.setBackground(Color.decode("#5A3918"));
			reset.setForeground(Color.decode("#D4D4D4"));
			reset.setFont(new Font("Old English Text MT", Font.CENTER_BASELINE, 25));
			reset.setFocusable(false);
			reset.addActionListener(new ActionHandler());
							
			reset.setVisible(true);
			
		//ERGEBNISANZEIGE
			
			endergebnis = new JLabel();
			endergebnis.setForeground(Color.decode("#395A39"));
			endergebnis.setFont(new Font("Old English Text MT", Font.BOLD, 350));
			endergebnis.setText("?");
			endergebnis.setHorizontalAlignment(JLabel.CENTER);
			endergebnis.setVerticalAlignment(JLabel.CENTER);
			
			endergebnis.setVisible(true);
			
			
			anzeige = new JPanel();
			anzeige.setBounds(338, 75, 450, 450);
			anzeige.setBackground(Color.decode("#909090"));
			anzeige.setOpaque(false);
			anzeige.setLayout(new BorderLayout());
			
			anzeige.setVisible(true);
			anzeige.add(endergebnis);
			
		//MENÜ
			
			menubar = new JMenuBar();
			
			design = new JMenu("Design");
			sprache = new JMenu("Sprache");
			about = new JMenu("About");
			
			fantasy = new JMenuItem("FANTASY THEME");
			fantasy.addActionListener(new ActionHandler());
			zombie = new JMenuItem("ZOMBIE THEME");
			zombie.addActionListener(new ActionHandler());
			deutsch = new JMenuItem("DEUTSCH");
			deutsch.addActionListener(new ActionHandler());
			englisch = new JMenuItem("ENGLISCH");
			englisch.addActionListener(new ActionHandler());
			
			design.add(fantasy);
			design.add(zombie);
			sprache.add(deutsch);
			sprache.add(englisch);
			
			menubar.add(design);
			menubar.add(sprache);
			menubar.add(about);
			
		//HAUPTFENSTER
			
			frame = new JFrame("Pen & Paper - Würfel");
			frame.setSize(900, 640);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setLayout(null);
			frame.requestFocus();
			
			
			try {
				GUI.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/pic/FantasyBGII.jpg")))));
	        } catch (IOException e) {
	        	System.out.println("Error: Image not loaded!");
	            e.printStackTrace();
	        }
			
			
			frame.add(w4);
			frame.add(w6);
			frame.add(w8);
			frame.add(w10);
			frame.add(w12);
			frame.add(w20);
			frame.add(reset);
			
			frame.add(anzeige);
			
			frame.setJMenuBar(menubar);
			
			frame.setVisible(true);
		
	}

}
