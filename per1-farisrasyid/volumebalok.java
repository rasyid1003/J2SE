class Volume {
    int p = 14;
    int l = 15;
    int t = 9;
    float hasil = p * l * t;
}

public class volumebalok {
    public static void main(String[] args) {
        Volume volume = new Volume();

        System.out.println("Panjang Balok : " + volume.p);
        System.out.println("Lebar Balok   : " + volume.l);
        System.out.println("Tinggi Balok  : " + volume.t);
        System.out.println("Volume Balok  : " + volume.hasil);
    }
}
