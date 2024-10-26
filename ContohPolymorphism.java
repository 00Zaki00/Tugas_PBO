// Kelas dasar abstrak untuk layanan bengkel
abstract class Layanan {
    // Method abstrak untuk melakukan layanan
    public abstract void lakukanLayanan();
}

// Kelas GantiOli yang mengimplementasikan layanan ganti oli
class GantiOli extends Layanan {
    @Override
    public void lakukanLayanan() {
        System.out.println("Melakukan layanan ganti oli...");
    }
}

// Kelas GantiBan yang mengimplementasikan layanan ganti ban
class GantiBan extends Layanan {
    @Override
    public void lakukanLayanan() {
        System.out.println("Melakukan layanan ganti ban...");
    }
}

// Kelas utama untuk menjalankan program
public class ContohPolymorphism {
    public static void main(String[] args) {
        // Membuat array layanan bengkel
        Layanan[] layanan = new Layanan[2];
        
        // Mengisi array dengan objek GantiOli dan GantiBan
        layanan[0] = new GantiOli();
        layanan[1] = new GantiBan();
        
        // Menggunakan polymorphism untuk memanggil lakukanLayanan
        for (Layanan l : layanan) {
            l.lakukanLayanan();
        }
    }
}
