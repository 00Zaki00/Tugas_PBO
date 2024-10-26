// Kelas dasar yang merepresentasikan kendaraan di bengkel
class Kendaraan {
    protected String merk;
    protected String model;

    // Konstruktor Kendaraan
    public Kendaraan(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Model: " + model);
    }
}

// Kelas turunan dari Kendaraan untuk motor
class Motor extends Kendaraan {
    private int kapasitasMesin;

    // Konstruktor Motor yang memanggil konstruktor superclass Kendaraan
    public Motor(String merk, String model, int kapasitasMesin) {
        super(merk, model);
        this.kapasitasMesin = kapasitasMesin;
    }

    // Method untuk menampilkan informasi tambahan spesifik motor
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}

// Kelas turunan dari Kendaraan untuk mobil
class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Konstruktor Mobil yang memanggil konstruktor superclass Kendaraan
    public Mobil(String merk, String model, int jumlahPintu) {
        super(merk, model);
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi tambahan spesifik mobil
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas utama untuk menjalankan program
public class ContohInheritance {
    public static void main(String[] args) {
        // Membuat objek Motor dan Mobil
        Motor motor = new Motor("Yamaha", "NMAX", 155);
        Mobil mobil = new Mobil("Toyota", "Avanza", 4);

        // Memanggil method tampilkanInfo pada masing-masing objek
        System.out.println("Informasi Motor:");
        motor.tampilkanInfo();

        System.out.println("\nInformasi Mobil:");
        mobil.tampilkanInfo();
    }
}
