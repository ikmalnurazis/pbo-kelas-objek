public class LingkaranMain {

    public static void main(String[] args) {
        // Contoh 1: Referensi Objek Sama
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println("Contoh 1:");
        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5
        l2.setJari2(10);
        System.out.println(l1.getJari2()); // 10
        System.out.println(l2.getJari2()); // 10

        // Contoh 2: Referensi Objek Berbeda
        l1 = new Lingkaran(5);
        l2 = l1;
        Lingkaran l3 = new Lingkaran(7);
        l2 = l3;
        System.out.println("\nContoh 2:");
        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 7
        System.out.println(l3.getJari2()); // 7

        // Contoh 3: Referensi NULL
        l1 = new Lingkaran(5);
        l2 = l1;
        l2 = null;
        System.out.println("\nContoh 3:");
        System.out.println(l1.getJari2()); // 5
        if (l2 != null) {
            System.out.println(l2.getJari2());
        } else {
            System.out.println("l2 is null");
        }

        // Contoh 4: Objek sebagai Parameter
        l1 = new Lingkaran(5);
        l2 = l1;
        System.out.println("\nContoh 4:");
        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5
        ubahJari2(l2);
        System.out.println(l1.getJari2()); // 4
        System.out.println(l2.getJari2()); // 4
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }
}
