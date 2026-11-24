import java.util.Scanner;
import java.util.Arrays;

public class Problema3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int casos;

        do {
            casos = sc.nextInt();
            if (casos >= 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[casos];
        boolean[] estat = new boolean[casos];

        for (int i = 0; i < casos; i++) {
            paraules[i] = sc.nextLine();

            String primera = paraules[i].substring(0, 1);
            String ultima = paraules[i].substring(paraules[i].length() - 1);

            estat[i] = paraules[i].startsWith(ultima) && paraules[i].endsWith(primera);

        }
        System.out.println(Arrays.toString(estat));
    }
}
