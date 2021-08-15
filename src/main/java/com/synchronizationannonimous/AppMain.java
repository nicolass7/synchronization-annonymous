package com.synchronizationannonimous;

public class AppMain {
  public static void main(String args[]){
    final Print print = new Print();
    Thread t1 = new Thread(){
      public void run(){
        print.printPrint(5);
      }
    };
    Thread t2 = new Thread(){
      public void run(){
        print.printPrint(100);
      }
    };
    t1.start();
    t2.start();
  }
}
