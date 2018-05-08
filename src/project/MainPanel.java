package project;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project.Controller;
import project.GamePanel;
import project.SelectPanel;
import project.AdminPanel;

public class MainPanel extends JPanel implements KeyListener{
	 
	private JLabel titleLabel;
      private JButton playbt;
      private JButton exitbt;
      private Controller F;
      
      public MainPanel(Controller f) {

    	  setLayout(null);
    	  
          JPanel jpanel = new JPanel();
          F = f;
          
          titleLabel = new JLabel("²Ì¶óµ¶");
          
          Font font = new Font("¸¼Àº °íµñ",Font.BOLD, 50); 
          titleLabel.setFont(font);
          titleLabel.setBounds(200,40,400,100);
          titleLabel.setHorizontalAlignment(JLabel.CENTER);
          
          add(titleLabel);
          
          playbt = new JButton("PLAY");
          exitbt = new JButton("EXIT");
          
         
         
          //alphabt.addKeyListener(this);
          
          playbt.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0) {
              // TODO Auto-generated method stub
              
              F.playButton();
           }
          });
          playbt.setBounds(300,170,200,160);
        playbt.setFont(font);
          add(playbt);
         //wordbt.addKeyListener(this);
          exitbt.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0) {
              // TODO Auto-generated method stub
              F.exitButton();
           }
          });
          exitbt.setBounds(300,370,200,160);
          exitbt.setFont(font);
         // add(playbt);
          add(exitbt);
          setFocusable(true);
         // addMouseListener(this);
          requestFocus();
          
          setVisible(true);
          }
              
     
      
      
	 
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	 
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	 
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}

