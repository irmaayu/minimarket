import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rima Yuliana on 01/05/2017.
 */
public class Laporan {
    HashMap<Integer,Produk> daftarProduk = new HashMap<>();
    ArrayList<ReturBeli> daftarRetur = new ArrayList<>();
    ArrayList<FakturBeli> daftarFaktur = new ArrayList<>();
//    ArrayList<Bill> daftarBill = new ArrayList<>();

    int id_laporan;
    String tgl_laporan;
//    public double totalJual(){
//        double total=0;
//        for (Produk p : daftarProduk){
//            total = total +p.hargaJual();
//        }
//        return total;
//    }
//
//    public double totalKeuntungan(){
//        double total=0;
//        for (Produk p : daftarProduk){
//            total = total +p.hargaBeli();
//        }
//        return total;
//    }

}
