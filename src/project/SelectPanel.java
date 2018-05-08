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

import javax.swing.*;
import javax.swing.border.LineBorder;

import project.Controller;
import project.MainPanel;
import project.GamePanel;
import project.AdminPanel;

public class SelectPanel extends JPanel{

   Font font = new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD, 30);
      // TODO Auto-generated constructor stub
         private JLabel stagelb;
         private JPanel btbgd;
         private JButton stagebt[];
//         private JButton stage1bt;
//          private JButton stage2bt;
//          private JButton stage3bt;
//          private JButton stage4bt;
//          private JButton stage5bt;
//          private JButton stage6bt;
          private JButton homebt;
         // private JButton pausebt;
          private JButton startbt;
          private JButton adminbt;
          private int tmpstage;

          private Controller F;
         // private FindWord find;
          
          public SelectPanel(Controller f, Game g) {
             
              setLayout(null);
              F = f;
              GamePanel gp = new GamePanel(f);
              stagebt = new JButton[g.stageNum()]; 
              tmpstage = 6;
              btbgd = new JPanel();
              btbgd.setBounds(100, 120, 580, 300);
              btbgd.setBackground(Color.LIGHT_GRAY);
              //add(btbgd);
              stagelb = new JLabel("Stage Select");
              stagelb.setFont(font);
              stagelb.setBounds(50,40,200,50);
              stagelb.setHorizontalAlignment(JLabel.CENTER);
              add(stagelb);
                  
              stagebt[0] = new JButton("1");
              stagebt[0].setBounds(150,150,80,80);
              stagebt[0].setFont(font);
           
              add(stagebt[0]);
              stagebt[0].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(0);
                  }
              });
              stagebt[1] = new JButton("2");
              
       
             
              stagebt[1].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(1);
                  }
              });
              
              stagebt[1].setBounds(350,150,80,80);
              stagebt[1].setFont(font);
             
              add(stagebt[1]);
              
              stagebt[2] = new JButton("3");
              
       
              stagebt[2].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(2);
                  }
              });
              
              stagebt[2].setBounds(550,150,80,80);
              stagebt[2].setFont(font);
             
              add(stagebt[2]);
              
              stagebt[3] = new JButton("4");
              stagebt[3].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(3);
                  }
              });
              stagebt[3].setBounds(150,300,80,80);
              stagebt[3].setFont(font);
             
              add(stagebt[3]);
              
              stagebt[4] = new JButton("5");
              
       
              stagebt[4].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(4);
                  }
              });
              stagebt[4].setBounds(350,300,80,80);
              stagebt[4].setFont(font);
            
              add(stagebt[4]);
              
              stagebt[5] = new JButton("6");
              
              
              stagebt[5].addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     resetbtColor(5);
                  }
              });
              stagebt[5].setBounds(550,300,80,80);
              stagebt[5].setFont(font);
              add(stagebt[5]);
       
              
              this.add(btbgd, BorderLayout.WEST);
              
              
              homebt = new JButton("Home");
             
              homebt.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                   F.home();
                  }
              });
              homebt.setBounds(650,50,100,50);
             homebt.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD, 20));
             
              add(homebt);
              

              startbt = new JButton("Start");
              
              startbt.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                     
                     
                     if(tmpstage != 6)
                     {
                        F.game.setStageNum(tmpstage);
                        resetbtColor(6);
                        F.startGame();
                        
                         System.out.println(tmpstage+ " "+ F.game.getStageNum());
                     }
                     else 
                        JOptionPane.showMessageDialog(F, "∞‘¿”¿« Stage∏¶ º±≈√«œΩ Ω√ø¿!!", "Stage º±≈√ ø°∑Ø", JOptionPane.ERROR_MESSAGE);
                  
                     
//                     if(tmpstage != 6)
//                     {
//                        F.game.setStageNum(tmpstage);
//                        resetbtColor(6);
//                        F.startGame();
//                         System.out.println(tmpstage+ " "+ f.game.getStageNum());
//                     }
//                     else
//                        JOptionPane.showMessageDialog(F, "≥π∏ª ƒ˚¡Ó ∞‘¿”¿« ¡÷¡¶∏¶ º±≈√«ÿ ¡÷ººø‰!", "¡÷¡¶ º±≈√ ø°∑Ø", JOptionPane.ERROR_MESSAGE);
                  
                  
                  
                  }
                     
              });
              startbt.setBounds(500,450,100,50);
              startbt.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD, 20));
             
              add(startbt);
              
              adminbt = new JButton("Admin");
              
              adminbt.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                   F.admin();
                  }
              });
              adminbt.setBounds(650,450,100,50);
              adminbt.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD, 20));
              add(adminbt);
             
              setFocusable(true);
              requestFocus();
              setVisible(true);
          }
      
          
          private void resetbtColor(int index){
            for(int i=0;i<6;i++) stagebt[i].setBackground(null);
            if(index!=6){
               stagebt[index].setBackground(Color.yellow);
            }
            tmpstage=index;
         }

}