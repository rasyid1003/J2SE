class MyClass {
    void tulis() {
        System.out.println("Tidak ada parameter bernilai");
    }

    void tulis(double d) {
        System.out.println("Dengan Satu Paramater Bernilai : " + d);
    }
}

class DemoOv {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.tulis();
        c.tulis(10.5);
    }
}