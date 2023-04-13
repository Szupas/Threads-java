package Zad4;

import java.util.Random;
import java.util.Scanner;
public class Główny {
    public static void main(String[] args) throws InterruptedException {
        int[] tab = new int[320000000];
        Random los = new Random();
        int gora = 500000000;
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = los.nextInt(gora)+1;
        }
        System.out.println("Podaj liczbę wątków: ");
        Scanner input = new Scanner(System.in);
        int liczbaWatkow = input.nextInt();
        int x = 320000000/liczbaWatkow;
        Watek[] watki = new Watek[liczbaWatkow];
        for(int i=0;i<watki.length;i++)
        {
            int poczatek =x*i;
            int koniec = x-1+x*i;
            watki[i] = new Watek(poczatek,koniec,tab);
            Thread thread = new Thread(watki[i]);
            thread.start();
            thread.join();
        }

        int a=0, b=500000001;
        long czas=0;
        for (Watek watek : watki) {
            if (watek.getMin() < b)
                b = watek.getMin();
            if (watek.getMax() > a)
                a = watek.getMax();
            czas += watek.getCzas();
        }
        System.out.println("Maximum: "+a+" | Minimum: "+b+" | Czas wykonywania: "+czas);
    }
}
