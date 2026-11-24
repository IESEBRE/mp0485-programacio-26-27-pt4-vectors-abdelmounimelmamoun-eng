import java.util.Scanner;

public class Problema2{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;

        do {
            casos = sc.nextInt();
            if (casos > 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[casos];
        int[] aparicions = new int[casos];

        for (int i = 0; i < casos; i++) {
            paraules[i] = sc.nextLine();
        }
        char lletra = sc.nextLine().charAt(0);

        for (int i = 0; i < casos; i++) {
            int comptador = 0;
            for (int j = 0; j < paraules[i].length(); j++) {
                if (paraules[i].charAt(j) == lletra) {
                    comptador++;
                }
            }
            aparicions[i] = comptador;
        }
        System.out.println(Arrays.toString(aparicions));
    }
}
