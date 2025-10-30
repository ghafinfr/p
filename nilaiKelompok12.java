import java.util.Scanner;

public class nilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1; 
        int nKelompok = sc.nextInt(); ;
        float totalNilai, rataNilai;
        float rataTertinggi = 0; 
        int kelompokTertinggi = 0;

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
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " 
                            + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);

        sc.close();
    }
}
