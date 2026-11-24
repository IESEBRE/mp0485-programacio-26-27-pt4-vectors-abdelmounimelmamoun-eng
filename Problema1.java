import java.util.Scanner;
import java.util.Arrays;

public class Problema1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;

        do {
            casos = sc.nextInt();
            if (casos > 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[casos];
        int[] longituds = new int[casos];

        for (int i = 0; i < casos; i++) {
            paraules[i] = sc.nextLine();
            longituds[i] = paraules[i].length();
        }
        System.out.println(Arrays.toString(paraules) + " -> " + Arrays.toString(longituds));
        sc.close();
    }
}
