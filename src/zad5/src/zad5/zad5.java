package zad5;

import java.util.Scanner;
public class zad5 { 

    private static void rata(){
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartosc towaru: ");
        double cenaTowaru = in.nextDouble();
        System.out.print("Podaj ilosc rat: ");
        int liczbaRat = in.nextInt();
        double wartosc = 0;
        if (cenaTowaru >= 100 && cenaTowaru <= 10000 && liczbaRat >= 6 && liczbaRat <= 48){
            if (liczbaRat <= 12){
                wartosc = 0.025 * cenaTowaru;
            }
            if (liczbaRat >= 13 && liczbaRat <= 24){
                wartosc = 0.05 * cenaTowaru;
            }
            if (liczbaRat >= 25){
                wartosc = 0.1 * cenaTowaru;
            }
            System.out.print("Rata wynosi: " + wartosc);
        } else {
            System.out.print("prosze podac dane jeszcze raz");
            rata();
        }
    }

    public static void main(String[] args) {
        rata();
    }
}
