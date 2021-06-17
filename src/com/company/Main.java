package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi ;
        int i, k;
        System.out.print("Sayı Giriniz : ");
        sayi=scanner.nextInt();
        System.out.print("Dördün Kuvvetleri = ");
        for (i=4; i<=sayi; i*=4){
            System.out.print(i+",");
        }
        System.out.print("\nBeşin Kuvvetleri = ");
        for (k=5; k<=sayi; k*=5){
            System.out.print(k +",");
        }
    }
}
