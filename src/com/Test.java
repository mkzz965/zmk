package com;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入天数=");
        int d = sc.nextInt();
        int z = d / 7;
        int t = d % 7;
        System.out.println("周数为"+z+"剩余天数为"+t);






    }
}
