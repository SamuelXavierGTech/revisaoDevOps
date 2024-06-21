package org.example;

import java.util.Scanner;

public class ogro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int d = sc.nextInt();
        if (e >= 0 && e <= 5 && d >= 0 && d <= 5) {
            int resultado;
            if (e > d) {
                resultado = e + d;
                System.out.println(resultado);
            } else {
                resultado = 2 * (d - e);
                System.out.println(resultado);
            }
        }
    }
}