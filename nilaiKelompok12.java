import java.util.Scanner;

public class nilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;             
        int nKelompok = 6;     
        float totalNilai, rataNilai;  
        while (i <= nKelompok) {
            System.out.println("Kelompok " + i);

            totalNilai = 0; 
            for (int j = 1; j <= 5; j++) { 
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                float nilai = sc.nextFloat();
                totalNilai += nilai; 
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            System.out.println();

            i++; 
        }

        sc.close();
    }
}
