package zad3;

import java.util.Scanner;

public class zad3 {

private static void BMI(double waga, double wzrost){
        double bmi = waga/(wzrost*wzrost);
        if(bmi > 18.5 && bmi < 24.9){
            System.out.print(" w normie!");
        } else if (bmi > 24.9){
            System.out.print("Nadwaga");
        } else {
            System.out.print("Niedowaga");
        }
    }

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("podaj wzrost w metrach: ");
		double wzrost = in.nextDouble();
		System.out.print("podaj wage w kilogramach: ");
		double waga = in.nextDouble();
		BMI(waga, wzrost);
    }
}