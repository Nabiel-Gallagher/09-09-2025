import java.util.Scanner;

public class JumlahDeretBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa: ");
        int Awal = scanner.nextInt();
        int temp = 0;

        for (int i = 1; i <= Awal; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            temp += nilai;
        }

        System.out.println("Rata-rata nilai siswa adalah: " + (temp / Awal));
    }
}
