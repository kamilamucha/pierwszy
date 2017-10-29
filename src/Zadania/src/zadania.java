import java.util.*;

public class zadania {

private static double celsiusToFahrenheit() {
        //Zadanie_1_Zestaw_1
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wartoœæ temperatury w stopniach Celsjusza: ");
        double celsiusDegree = in.nextFloat();
        System.out.println("Temperatura w stopniach Fahrenheita jest rowna: ");
        return ((1.8 * celsiusDegree) + 32.0);
    }
	
	    public static void main(String[] args) {
        System.out.print(celsiusToFahrenheit());
    }
}