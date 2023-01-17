import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int no, ket;
        String cetak;
        menu menu = new menu();
        keterangan makan = new keterangan();
        Scanner input = new Scanner(System.in);
        System.out.println("- - - - - - - - - - - - - - - - - - ");
        System.out.println("            Waroeng seadanya");
        System.out.println("- - - - - - - - - -  - - - - - - - -");
        System.out.println("1. paket 1 (ayam goreng + esteh)");
        System.out.println("2. paket 2 (ayam bakar + esteh)");
        System.out.println("3. paket 3 (nasi goreng + esteh)");
        System.out.println("4. paket 4 (ayam goreng + es jeruk)");
        System.out.println("5. paket 5 (ayam bakar + esjeruk)");
        System.out.println("6. paket 6 (nasi goreng + esjeruk)");
        System.out.println("7. paket 7 (ayam goreng + es milo)");
        System.out.println("- - - - - - - - - -  - - - - - - - -");
        System.out.print("MASUKAN MOBIL PILIHAN ANDA (NOMOR) = ");
        no = input.nextInt();
        if (no==1){
            menu.paket1();
        } else if (no==2) {
            menu.paket2();
        } else if (no==3) {
            menu.paket3();
        } else if (no==4) {
            menu.paket4();
        }else if (no==5){
            menu.paket5();
        }else if (no==6){
            menu.paket6();
        }else if (no==7){
            menu.paket7();
        }
        System.out.println("keterangan");
        System.out.println("1, bungkus");
        System.out.println("2. makan tempat");
        ket = input.nextInt();
        if (ket==1){
            makan.ket1();
            makan.cetaK();
            }
        else if (ket==2){
            makan.ket2();
            makan.cetaK();
            }

    }
}
