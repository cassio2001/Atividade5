package Atividade5;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        
        float metros;
        System.out.println("Digite um valor em metros");
        metros = sc.nextFloat();

        float cm = metros * 100;
        System.out.println(cm + " centimetros");

        sc.close();
    
    }   

}
