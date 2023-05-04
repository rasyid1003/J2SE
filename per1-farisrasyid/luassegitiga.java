class Segitiga {
    double alas;
    int tinggi;

    public Segitiga(double alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    void hasil() {
        double l = alas * tinggi / 2;
        System.out.println("Alas           : " + alas);
        System.out.println("Tinggi         : " + tinggi);
        System.out.println("Luas Segitiga  : " + l);
    }
}

class luassegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(13.5, 10);
        segitiga.hasil();
    }
}
