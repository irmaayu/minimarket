import java.util.ArrayList;

/**
 * Created by Aspire on 03/05/2017.
 */
public class Billing {
    String idbill;
    int idpetugas;
    int idproduk;
    int kuantitas;
    int hargaproduk;
    int totalbayar;
    String tgl_transaksi;
    Makanan mkn;
    Minuman mi;
    Obat ob;
    Sembako sm;

    ArrayList<Produk> daftarProduk = new ArrayList<>();

    public Billing(String idbill,int idpetugas, String tgl_transaksi, Makanan mkn, Minuman mi, Obat ob, Sembako sm) {
        this.idbill=idbill;
        this.kuantitas=kuantitas;
        this.tgl_transaksi=tgl_transaksi;
        this.idpetugas=idpetugas;
        this.mkn=mkn;
        this.mi=mi;
        this.ob=ob;
        this.sm=sm;
    }

    public void addProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void print() {
        System.out.println("ID Struk: "+idbill);
        System.out.println("ID Petugas: "+idpetugas);
        for(Produk produk : daftarProduk){
            produk.printbill();
            totalbayar=totalbayar+produk.totalbayarproduk();
        }
        System.out.println("Total Pembayaran: "+totalbayar);
    }


    public static void main(String[] Args){
        Makanan mk = new Makanan( 1, "Indomie","Mie Instan",5,2300);
        Minuman mi = new Minuman(2, "Ultramilk","Susu",3,2300);
        Sembako sm = new Sembako( 3, "Cap Ayam Jago","Beras",1,55000);
        Obat ob = new Obat(4, "Oskadon","Sakit Kepala",1,2300);
        Billing bill = new Billing("001", 001, "02-04-2017",mk,mi,ob,sm);

        bill.addProduk(mk);
        bill.addProduk(mi);
        bill.addProduk(ob);
        bill.addProduk(sm);
        bill.print();

    }
}
