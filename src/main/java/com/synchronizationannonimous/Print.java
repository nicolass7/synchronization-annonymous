package com.synchronizationannonimous;

public class Print {
  synchronized  void printPrint (int n){
    for (int i = 1 ; i <= 5 ; i++){
      System.out.println(i*n);
      try{
        Thread.sleep(400);
      }catch (Exception e){
        System.out.println(e);
      }
    }
  }
}
