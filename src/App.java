import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
        //scanner untuk terima inputan
        //nasabah.add inputan yg diterima dalam string, 
        Nasabah nsb1 =  new Nasabah("0214578","Jian",500000);
        nasabah.add(nsb1);
        Nasabah nsb2 =  new Nasabah("0214571","Gilbert",500000);
        nasabah.add(nsb2);
        Nasabah nsb3 =  new Nasabah("0214572","Kimberlly",500000);
        nasabah.add(nsb3);
        nasabah.add( new Nasabah("0214573","Wilbert",500000));
        cetakNamaNasabah(nasabah);

        nsb3.setNamansb("Kimberly");
        nasabah.set(2,nsb3);
        cetakNamaNasabah(nasabah);

        nasabah.remove(1);
        cetakNamaNasabah(nasabah);

        nasabah.remove(nsb1);
        cetakNamaNasabah(nasabah);
    }

    public static void cetakNamaNasabah(ArrayList<Nasabah> nasabah){
        System.out.println("No.Rekening\tNama\t\tSaldo\tNo.kartu\tPIN\tTgl. Daftar");
        System.out.println("-------------------------------------------------------------------------");
        for (Nasabah nsbh : nasabah) {
            System.out.println(nsbh);
        }
        System.out.println("-------------------------------------------------------------------------");
 
    }
}
