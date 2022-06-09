import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<String> nasabah = new ArrayList<String>();
        nasabah.add("Jian");
        nasabah.add("Gilbert");
        nasabah.add("Kimberlly");
        cetakNamaNasabah(nasabah);

        nasabah.set(2,"Kimberly");
        cetakNamaNasabah(nasabah);

        nasabah.remove(1);
        cetakNamaNasabah(nasabah);
        
        nasabah.remove("Jian");
        cetakNamaNasabah(nasabah);
    }

    public static void cetakNamaNasabah(ArrayList<String> nasabah){
        System.out.println("Nama Nasabah");
        System.out.println("---------------");
        for (String nsbh : nasabah) {
            System.out.println(nsbh);
        }
    }
}
