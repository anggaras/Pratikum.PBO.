
public class TestKoperasi1941723001Angga {
    public static void main(String[] args) {
        Koperasi donny1941723001Angga = new Koperasi("donny1941723001Angga",5000000);
        System.out.println("Nama Koperasi: " + donny1941723001Angga.getNama());
        System.out.println("Limit Pinjaman: " + donny1941723001Angga.getPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny1941723001Angga.meminjam(10000000);
        System.out.println("Maaf jumlah melibihi limit");
        donny1941723001Angga.limit(5000000);
        System.out.println("\nMeminjam uang 4.000.000...");
        donny1941723001Angga.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny1941723001Angga.getPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny1941723001Angga.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny1941723001Angga.getPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny1941723001Angga.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny1941723001Angga.getPinjaman()); 
    }
    
}
