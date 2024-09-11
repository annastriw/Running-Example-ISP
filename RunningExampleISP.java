// Interface yang mengikuti Interface Segregation Principle (ISP)
interface Printable {
    void print(Document doc);
}

interface Scannable {
    void scan(Document doc);
}

interface Faxable {
    void fax(Document doc);
}

// Kelas untuk dokumen
class Document {
    // Implementasi atau atribut dokumen bisa ditambahkan di sini
}

// Kelas printer multifungsi yang mendukung semua fitur
class MultiFunctionPrinter implements Printable, Scannable, Faxable {
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax(Document doc) {
        System.out.println("Sending fax...");
    }
}

// Kelas printer sederhana yang hanya mendukung fitur print
class SimplePrinter implements Printable {
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }
}

// Kelas utama untuk menjalankan contoh
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        
        // Menggunakan printer multifungsi
        System.out.println("Printer Multifungsi:");
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print(doc);
        mfp.scan(doc);
        mfp.fax(doc);
        
        System.out.println("\n");

        // Menggunakan printer sederhana
        System.out.println("Printer Sederhana:");
        SimplePrinter sp = new SimplePrinter();
        sp.print(doc);
    }
}
