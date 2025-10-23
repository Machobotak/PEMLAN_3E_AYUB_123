package Tugas3.sesudah;


public class Kost {//rename
    private Bill bill;//encapsulated
    private String location;

    public Kost(Bill bill, String location) {
        this.setBill(bill);
        this.setLocation(location);
    }

    public void showHouseInfo() {
        System.out.println("Lokasi Rumah/Kost : " + getLocation());
        getBill().printSummary();
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
