class Mahasiswa {
    String nama;
    String npm;
    String kelas;
}

class belajar {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Faris Rasyid";
        mhs1.npm = "50421483";
        mhs1.kelas = "2IA22";

        System.out.println("Nama    : " + mhs1.nama);
        System.out.println("NPM     : " + mhs1.npm);
        System.out.println("Kelas   : " + mhs1.kelas);
    }
}