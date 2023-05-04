class kotak {
    double panjang;
    double lebar;
    double tinggi;

    kotak() {
        panjang = 12;
        lebar = 7;
        tinggi = 9;
    }

    kotak(double sisi) {
        panjang = lebar = tinggi = sisi;
    }

    kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double HitungVolume() {
        return (panjang * lebar * tinggi);
    }
}

class Over {
    public static void main(String[] args) {
        kotak k1, k2, k3;
        k1 = new kotak();
        k2 = new kotak(14);
        k3 = new kotak(5, 7, 8);
        System.out.println("Volume K1 = " + k1.HitungVolume());
        System.out.println("Volume K2 = " + k2.HitungVolume());
        System.out.println("Volume K3 = " + k3.HitungVolume());
    }
}
