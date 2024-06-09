package JobsheetCollection;
import java.util.ArrayList;
import java.util.Collection;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collection.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        customers.sort((c1,c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}
