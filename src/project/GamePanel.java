package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import project.Controller;
import project.MainPanel;
import project.SelectPanel;
import project.AdminPanel;

import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends JPanel implements ActionListener {
   Font font = new Font("¸¼Àº °íµñ", Font.BOLD, 50);
   private JLabel stagelb;
   private JPanel gamebgd = new JPanel();
   private JPanel unitbgd = new JPanel();

   private JPanel contentPane;
   private JFrame frame;
   private JButton unit1bt;
   private JButton unit2bt;
   private JButton unit3bt;
   private JButton unit4bt;
   private JButton unit5bt;
   private JButton unit6bt;
   private JButton skillbt;
   private JButton pausebt;
   private Controller F;
   private Game g;
   ImageIcon bg1;
   ImageIcon bg2;
   ImageIcon bg3;
   ImageIcon bg4;
   ImageIcon bg5;
   ImageIcon bg6;
   ImageIcon bg7;

   Image bgimg;
   int bx = 0;
   int f_width;
   int f_height;
   Graphics buffg;
   Image buffImage;

   Timer timer = new Timer();
   private int sec;

   private JLabel tLabel = new JLabel("³²Àº ½Ã°£ ");
   private JLabel timeLabel = new JLabel();

   public void showTime(int currentSec) {

      timer.cancel();
      timer = new Timer();
      // tLabel.setText("³²Àº½Ã°£ ");
      timeLabel.setText(sec / 60 + " : " + (sec % 60));
      timeLabel.setText((sec / 60) + " : " + (sec % 60));

      setsec(currentSec);
      timer.scheduleAtFixedRate(new TimerTask() {
         public void run() { // ½ÇÇàÇÒ ±¸¹®
            setsec(getsec() - 1); // ½Ã°£ÃÊ 1ÃÊ¾¿ Áõ°¡
            timeLabel.setText((getsec() / 60) + " : " + (getsec() % 60));
            if (getsec() == 0) {
               timer.cancel();
               g.quit();
               F.playButton();
            }
         }

      }, 1000, 1000);

   }

   private void setsec(int sec) {
      this.sec = sec;

   }

   private int getsec() {
      return sec;
   }

   public GamePanel(Controller f) {
      setLayout(null);
      F = f;
      g = new Game();

      this.showTime(300);

      tLabel.setBounds(510, 30, 100, 50);
      tLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));

      timeLabel.setBounds(580, 30, 100, 50);
      timeLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));

      gamebgd.add(tLabel);
      gamebgd.add(timeLabel);
      f_width = 1500;
      f_height = 750;
      bgimg = new ImageIcon("10.jpg").getImage();

      unit1bt = new JButton("1");
      unit1bt.setBounds(100, 800, 100, 40);
      unit1bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit1bt);
      unit2bt = new JButton("2");
      unit2bt.setBounds(250, 800, 100, 40);
      unit2bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit2bt);
      unit3bt = new JButton("3");
      unit3bt.setBounds(400, 800, 100, 40);
      unit3bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit3bt);
      unit4bt = new JButton("4");
      unit4bt.setBounds(550, 800, 100, 40);
      unit4bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit4bt);
      unit5bt = new JButton("5");
      unit5bt.setBounds(700, 800, 100, 40);
      unit5bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit5bt);
      unit6bt = new JButton("6");
      unit6bt.setBounds(850, 800, 100, 40);
      unit6bt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(unit6bt);
      skillbt = new JButton("Skill");
      skillbt.setBounds(1000, 800, 100, 40);
      skillbt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(skillbt);
      pausebt = new JButton("Pause");
      pausebt.setBounds(1450, 30, 100, 50);
      pausebt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      add(pausebt);
      pausebt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            g.pauseGame();
            setsec(getsec());
            timer.cancel();

            String str1 = "CONTINUE", str2 = "QUIT";
            Object[] options = { str1, str2 };
            int yesOrNo = JOptionPane.showOptionDialog(null, "Pause",
                  "Pause", JOptionPane.YES_NO_OPTION,
                  JOptionPane.INFORMATION_MESSAGE, null, options, str1);

            if (yesOrNo == JOptionPane.YES_OPTION) {
               g.continueGame();
               showTime(getsec());

            }

            if (yesOrNo == JOptionPane.NO_OPTION) {
               timer.cancel();
               setsec(300);
               showTime(getsec());
               g.quit();
               F.playButton();

            }

         }
      });

      // gamebgd = new JPanel();
      // unitbgd = new JPanel();

      bg1 = new ImageIcon("1.jpg");
      bg2 = new ImageIcon("2.jpg");
      bg3 = new ImageIcon("3.jpg");
      bg4 = new ImageIcon("4.jpg");
      bg5 = new ImageIcon("5.jpg");
      bg6 = new ImageIcon("2.jpg");
      bg7 = new ImageIcon("7.jpg");
      this.setLayout(new BorderLayout());
      this.add(BorderLayout.SOUTH, gamebgd);

      unit1bt.addActionListener(this);
      unit2bt.addActionListener(this);
      unit3bt.addActionListener(this);
      unit4bt.addActionListener(this);
      unit5bt.addActionListener(this);
      unit6bt.addActionListener(this);
      skillbt.addActionListener(this);
      // pausebt.addActionListener(this);
      this.add(gamebgd, BorderLayout.CENTER);

      // this.setSize(100, 100);
      this.setVisible(true);

   }

   
   public void actionPerformed(ActionEvent arg) {
      // TODO Auto-generated method stub

      if (arg.getSource() == unit1bt) { // ¹öÆ° 1ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg1.getImage(), 40, 600, gamebgd);
      } else if (arg.getSource() == unit2bt) { // ¹öÆ° 2°¡ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg2.getImage(), 140, 600, gamebgd);
      } else if (arg.getSource() == unit3bt) { // ¹öÆ° 3ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg3.getImage(), 240, 600, gamebgd);
      } else if (arg.getSource() == unit4bt) { // ¹öÆ° 3ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg4.getImage(), 340, 600, gamebgd);
      } else if (arg.getSource() == unit5bt) { // ¹öÆ° 3ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg5.getImage(), 440, 600, gamebgd);
      } else if (arg.getSource() == unit6bt) { // ¹öÆ° 3ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg6.getImage(), 540, 600, gamebgd);
      } else if (arg.getSource() == skillbt) { // ¹öÆ° 3ÀÌ ´­·ÈÀ»°æ¿ì
         gamebgd.getGraphics().drawImage(bg7.getImage(), 640, 600, gamebgd);
      }
   }

   public void paint(Graphics g) {
      buffImage = createImage(f_width, f_height);
      buffg = buffImage.getGraphics();
      unit1bt.updateUI();
      unit2bt.updateUI();
      unit3bt.updateUI();
      unit4bt.updateUI();
      unit5bt.updateUI();
      unit6bt.updateUI();
      skillbt.updateUI();
      pausebt.updateUI();

      update(g);

   }

   public void update(Graphics g) {
      Draw_Background();
      // Draw_Unit();
      // Draw_Player();
      Draw_StatusText();
      Draw_Time();
      g.drawImage(buffImage, 30, 0, this);

   }

   public void Draw_Time() {
      buffg.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
      buffg.setColor(Color.black);
      buffg.drawString("³²Àº ½Ã°£ ", 680, 23);
   }

   public void Draw_Background() {
      buffg.clearRect(0, 100, f_width, f_height);
      bx = 0;
      buffg.drawImage(bgimg, bx, 100, gamebgd);
   }

   public void Draw_StatusText() {
      int i = 2;
      buffg.setFont(font);
      buffg.setColor(Color.black);
      buffg.drawString("Stage" + i, 50, 60);
   }
}
