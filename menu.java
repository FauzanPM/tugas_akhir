import java.util.Scanner;
public class menu implements jenis{
    private String nama,cc;
    private int lama,tot;

    @Override
    public void paket1() {
        Scanner j = new Scanner(System.in);
        int harga=12000,tot;
        String cetak,mobil="paket 1",isi="ayam goreng + esteh";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+mobil);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
        System.out.println("cetak (y/n)");
    }

    @Override
    public void paket2() {
        Scanner j = new Scanner(System.in);
        int harga=14000,tot;
        String pesan="paket 2",isi="ayam bakar + esteh";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

    @Override
    public void paket3() {
        Scanner j = new Scanner(System.in);
        int harga=10000,tot;
        String pesan="paket 3",isi="nasi goreng + esteh";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

    @Override
    public void paket4() {
        Scanner j = new Scanner(System.in);
        int harga=13000,tot;
        String pesan="paket 4",isi="ayam goreng + esjeruk";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

    @Override
    public void paket5() {
        Scanner j = new Scanner(System.in);
        int harga=15000,tot;
        String pesan="paket 5",isi="ayam bakar + esjeruk";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

    @Override
    public void paket6() {
        Scanner j = new Scanner(System.in);
        int harga=11000,tot;
        String pesan="paket 6",isi="nasi goreng + esjeruk";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

    @Override
    public void paket7() {
        Scanner j = new Scanner(System.in);
        int harga=12000,tot;
        String pesan="paket 7",isi="ayam goreng + esmilo";
        System.out.print("pembeli     = ");
        nama =j.next();
        System.out.println("pesanan      = "+pesan);
        System.out.println("isi          = "+isi);
        System.out.printf("banyak pesanan= ");
        lama = j.nextInt();
        tot = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot);
    }

}

