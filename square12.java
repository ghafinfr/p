import java.util.Scanner;

public class square12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); {     
        int n;

        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();

     for (int iOuter = 1; iOuter <= n; iOuter++) {   
        for (int i = 1; i <= n; i++) {
                System.out.print("*");
        }
            System.out.println();
        }
        input.close();
        }
    }
    
}
