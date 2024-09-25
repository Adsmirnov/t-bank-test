import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int fin = 18*60 + 30;
        int kol = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = x*60 + y;
            if(z<=fin){
                kol++;
            }
        }

        System.out.println(kol);
    }
}