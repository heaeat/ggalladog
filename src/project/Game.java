package project;


import java.awt.Font;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Game extends Thread{
   private static int  STAGENUM = 6;
   public int[] rewardMoney;
   private int sumMoney;
   private int stage;
   private int eHomeHP;
   private int enemyAmount;
   
   
   static final int NORMAL   = 0;
   static final int PAUSE    = 1;
   static final int CONTINUE   = 2;
   private int request;

   public void run(){
       synchronized (this) {
          this.setRequest(NORMAL);
           if (request == PAUSE) {
               while (request != CONTINUE) {
                   try {
                  wait();
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
               } ;
           } request = NORMAL;
       }
   }
   
   public synchronized void pauseGame() {
       request = PAUSE;
       notify();
   }

      
   public synchronized void continueGame() {
       if (request == PAUSE) {
           request = CONTINUE;
           notify();
       }
   }
   
   void waitIfPauseRequest() throws InterruptedException {

      synchronized (this) {
         if (request == PAUSE) {
            while (request != CONTINUE) {
               wait();
            }

            request = NORMAL;
         }
      }
   }
   
   
      
   public void quit(){
      
      stop();
   }
   
   public void makeUnit(int num){
      
   }
   
   public void skill(){
      
   }
   
   public int getRequest(){
      return request;      
   }
   
   public void setRequest(int request){
      this.request = request;
   }
   
   public int stageNum(){
      return STAGENUM;      
   }
   
   public int getStageNum()
   {
      return stage;
   }
   
   public void setStageNum(int num){
      this.stage = num;
   }
   
   
   
}