class Nilai {
    double kuis;
    double tugas;

    double HitungNilai() {
        double jumlah = (kuis + tugas) / 2;
        return jumlah;
    }
}

class NilaiUtama {
    public static void main(String[] args) {
        Nilai n = new Nilai();

        n.kuis = 99.5;
        n.tugas = 89.5;

        System.out.println("Nilai Kuis      : " + n.kuis);
        System.out.println("Nilai Tugas     : " + n.tugas);
        System.out.println("Jumlah Nilai    : " + n.HitungNilai());
    }
}
