package Tugas3.sesudah;

public class Bill implements IBillCalculator {
    public static final int ADMIN_FEE = 2500;//constant
    public static final double TAX_RATE = 0.05;//constant
    private double wifi;//encapsulated
    private double listrik;//encapsulated
    private int penghuni;//encapsulated

    Bill(double wifi, double listrik, int penghuni) {
        this.setWifi(wifi);
        this.setListrik(listrik);
        this.setPenghuni(penghuni);
    }

    @Override
    public void printSummary() {//rename
        System.out.println("Wi-Fi     : Rp " + getWifi());
        System.out.println("Listrik   : Rp " + getListrik());


        double pajak = (getWifi() + getListrik()) * TAX_RATE;//constant

        double total = calculatedTotal(ADMIN_FEE, pajak);//inline varible
        double perOrang = calculatedPerPerson(total);

        System.out.println("Total     : Rp " + total);
        System.out.println("Per Orang : Rp " + perOrang);
        System.out.println("Per Orang (diskon 10%) : Rp " + calculatedDiscount(perOrang));//extract
    }

    private double calculatedDiscount(double perOrang) {//extrack method
        return perOrang - (perOrang * 0.1);
    }

    @Override
    public double calculatedPerPerson(double total) {//extrack method
        return total / getPenghuni();
    }

    @Override
    public double calculatedTotal(double admin, double pajak) {//extrack method
        return getWifi() + getListrik() + admin + pajak;//inline variable
    }

    public void adjustResidents(int adjustment) {
        setPenghuni(getPenghuni() + adjustment);
        System.out.println("Jumlah penghuni disesuaikan.");
        System.out.println("Penghuni sekarang: " + getPenghuni());
    }

    public double getWifi() {
        return wifi;
    }

    public void setWifi(double wifi) {
        this.wifi = wifi;
    }

    public double getListrik() {
        return listrik;
    }

    public void setListrik(double listrik) {
        this.listrik = listrik;
    }

    public int getPenghuni() {
        return penghuni;
    }

    public void setPenghuni(int penghuni) {
        this.penghuni = penghuni;
    }
}
