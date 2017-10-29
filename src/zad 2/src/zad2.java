import java.util.Scanner;

public class zad2 {
	
	private static void najwiekszanajmniejsza () {
        //Zadanie_2_Zestaw_1
        int[] values = new int[3];
        System.out.println("Wyznaczanie najmniejszej i najwiekszej wartosci sposrod podanych...");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.println("\nPodaj " + (i + 1) + " wartoœæ ca³kowit¹: ");
            values[i] = in.nextInt();
        }
        int temp;

        for(int j = 0; j < 3; j++) {
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] < values[i + 1]) {
                    temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }

        System.out.println("Wartowœæ najwiêksza: "
                + values[0]
                + "\nWartoœæ najmniejsza: "
                + values[2]);
    }
	
	public static void main(String[] args) {
		najwiekszanajmniejsza();
    }
}