package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısı : ");
        int eSayisi = input.nextInt();

        int[] fbn = new int[eSayisi];
        fbn[0] = 0;
        fbn[1] = 1;

        for (int i = 2; i < eSayisi; i++) {
            fbn[i] = fbn[i - 1] + fbn[i - 2];
        }

        System.out.print(eSayisi + " Sayılı Seri : ");
        for (int i = 0; i < eSayisi; i++) {
            System.out.print(fbn[i] + " ");

        }


    }
}