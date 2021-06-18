package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0110 {

  public static void printSpaces(int len) {
    for (int i = 0; i <len; i++) {
      System.out.print(" ");
    }
  }

  public static void printStars(int len) {
    for (int i = 0; i <len; i++) {
      System.out.print("#");
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 샵의갯수? ");
    int len = keyScan.nextInt();
    keyScan.close();

    for (int starLen = 1; starLen <= len; starLen +=2) {
      printSpaces((len - starLen) / 2);
      printStars(starLen);
      System.out.println();
    }

  }
}



