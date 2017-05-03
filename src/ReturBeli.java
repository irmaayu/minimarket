import java.util.ArrayList;

/**
 * Created by Rima Yuliana on 01/05/2017.
 */
public class ReturBeli {
    int no_returbeli;
    String tgl_returbeli;
    String ket_returbeli;
    int jumlah_retur;
    int retur;
    ArrayList<Produk> daftarProduk = new ArrayList<>();
    ArrayList<DetailFaktur> daftarFaktur = new ArrayList<>();

    Makanan mkn;
    Minuman mi;
    Obat ob;
    Sembako sm;

    public void addProduk(Produk p) {
        //tambah produk ke array
        daftarProduk.add(p);
    }

    public Produk cariBarang(int idProduk) {
        return daftarProduk.get(idProduk);
    }

    public ReturBeli(int no_returbeli, String tgl_returbeli, String ket_returbeli, int jumlah_retur, Makanan mkn, Minuman mi, Obat ob, Sembako sm){
        this.no_returbeli = no_returbeli;
        this.tgl_returbeli = tgl_returbeli;
        this.ket_returbeli = ket_returbeli;
        this.jumlah_retur = jumlah_retur;
        this.mkn=mkn;
        this.mi=mi;
        this.ob=ob;
        this.sm=sm;
    }

    public double totalReturbarang(){
        double total=0;
        for (Produk p : daftarProduk){
            total = total +(p.hitungJumlahProduk()-jumlah_retur);
        }
        return total;
    }

    public double totalRugi(){
        double total=0;
        for (Produk p : daftarFaktur){
            total = total +(p.hargaBeli()*jumlah_retur);
        }
        return total;
    }
    public void print(){
        for(Produk produk : daftarProduk){
            produk.print();
            System.out.println();
        }
        System.out.println("No :"+no_returbeli);
        System.out.println("Tanggal :"+tgl_returbeli);
        System.out.println("Keterangan :"+ket_returbeli);
        System.out.println("Jumlah  :"+jumlah_retur);
    }

    public static void main(String[] Args){
        Makanan mk = new Makanan( 1, "Indomie","Mie Instan",2000,10,2300);
        Minuman mi = new Minuman(2, "Ultramilk","Susu",2000,10,2300);
        Sembako sm = new Sembako( 3, "Cap Ayam Jago","Beras",40000,10,55000);
        Obat ob = new Obat(4, "Oskadon","Sakit Kepala",2000,10,2300);
        ReturBeli dfb = new ReturBeli(1,"05-05-2017","Kadaluarsa",2,mk,mi,ob,sm);
        dfb.addProduk(mk);
        dfb.addProduk(mi);
        dfb.addProduk(sm);
        dfb.addProduk(ob);
        dfb.print();
        dfb.cariBarang(1);
        System.out.println("Total Retur :"+dfb.totalReturbarang());
        System.out.println("Total Harga Produk dari Supplier :"+dfb.totalRugi());
    }
}
