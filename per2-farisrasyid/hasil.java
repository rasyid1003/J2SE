class Perkalian {
    int kali(int a, int b) {
        return a * b;
    }

    double kali(double a, double b) {
        return a * b;
    }
}

class hasil {
    public static void main(String[] args) {
        Perkalian perkalian = new Perkalian();
        int y = perkalian.kali(7, 10);
        double x = perkalian.kali(12.5, 4);

        System.out.println("Hasil Perkalian 7 * 10   = " + y);
        System.out.println("Hasil Perkalian 12,5 * 4 = " + x);
    }
}