class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}

public class main {
    public static void main(String[] args) {

        // Membuat object
        Mahasiswa mhs1 = new Mahasiswa("Rifqy", "23123456", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("nurul", "67", "it");
        Mahasiswa mhs3 = new Mahasiswa("bal", "68", "si");
        

        // Memanggil method
        mhs1.tampilkanData();
        mhs2.tampilkanData();
        mhs3.tampilkanData();
        System.out.println("selamat datang di its");
        System.out.println("selamat datang di its surabaya");
        System.out.println("selamat datang di itsssssssss");
    }
}