package Tugas3.sebelum;

public class Bill {
    public double wifi;
    public double listrik;
    public int penghuni;

    Bill(double wifi, double listrik, int penghuni) {
        this.wifi = wifi;
        this.listrik = listrik;
        this.penghuni = penghuni;
    }

    public void displayInfo() {
        System.out.println("Wi-Fi     : Rp " + wifi);
        System.out.println("Listrik   : Rp " + listrik);

        double admin = 2500;
        double pajak = (wifi + listrik) * 0.05;

        double total = wifi + listrik + admin + pajak;
        double perOrang = total / penghuni;

        System.out.println("Total     : Rp " + total);
        System.out.println("Per Orang : Rp " + perOrang);
        System.out.println("Per Orang (diskon 10%) : Rp " + (perOrang - (perOrang * 0.1)));
    }

    public void adjustResidents(int adjustment) {
        penghuni += adjustment;
        System.out.println("Jumlah penghuni disesuaikan.");
        System.out.println("Penghuni sekarang: " + penghuni);
    }


}
