package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.LineBorder;

import project.MainPanel;
import project.GamePanel;
import project.SelectPanel;
import project.AdminPanel;


public class Controller extends JFrame{
    private CardLayout cards = new CardLayout();

    
    private MainPanel mainpanel;
    private AdminPanel adminpanel;
    private GamePanel gamepanel;
    private SelectPanel selectpanel;
    public Game game;
   
    
    public Controller() {
       setSize(800, 600);
//       DisplayMode dm=new DisplayMode(800,600,32,DisplayMode.REFRESH_RATE_UNKNOWN);
//        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd=ge.getDefaultScreenDevice();
//        setUndecorated(true);
//        gd.setFullScreenWindow(this);
//        gd.setDisplayMode(dm);
        game = new Game();
       setTitle("²Ì¶óµ¶");
        getContentPane().setLayout(cards);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        mainpanel = new MainPanel(this);
        
        getContentPane().add("MainPanel",  mainpanel);
        
        adminpanel = new AdminPanel(this);
        getContentPane().add("AdminPanel", adminpanel);
        
        gamepanel=new GamePanel(this);
        getContentPane().add("GamePanel",gamepanel);
        
        selectpanel=new SelectPanel(this, game);
        
        getContentPane().add("SelectPanel", selectpanel);

        setVisible(true);
        mainpanel.requestFocus();
        
    }
    
    
    public void home()
    {
       cards.show(this.getContentPane(), "MainPanel");
       setSize(800, 600);

       selectpanel.requestFocus();
       selectpanel.transferFocus();
    }

    public void back()
    {
       setSize(800, 600);
       cards.show(this.getContentPane(), "SelectPanel");
       selectpanel.requestFocus();
        selectpanel.transferFocus();
    }
    
    public void startGame()
    {
       setSize(1900, 1000);
       cards.show(this.getContentPane(), "GamePanel");
       gamepanel.requestFocus();
       gamepanel.transferFocus();
    }
    
    
    public void playButton()
    {
       cards.show(this.getContentPane(), "SelectPanel");
       setSize(800, 600);

       selectpanel.requestFocus();
       selectpanel.transferFocus();
       
    }
    
    public void admin()
    {
       cards.show(this.getContentPane(), "AdminPanel");
       setSize(800, 600);
       adminpanel.requestFocus();
       adminpanel.transferFocus();
       
    }
    
    public void exitButton()
    {
       dispose();
       System.exit(0);
    }



}
