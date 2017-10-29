package zad4;

import java.util.Scanner;

public class zad4 { 
		private static void podatek(double dochod) {
        double kwota = 0;
        if (dochod <= 85528){
            kwota = (0.18 * dochod) - 556.02;
        }
        if (dochod > 85528){
            kwota = (0.32 * (dochod - 85528)) + 14839.02;
        }
        System.out.print("podatek to: " + kwota);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwote: ");
        double dochod = in.nextDouble();
        podatek(dochod);
    }
}
