package Tugas3.sebelum;

public class House {
    public Bill bill;
    public String location;

    public House(Bill bill, String location) {
        this.bill = bill;
        this.location = location;
    }

    public void showHouseInfo() {
        System.out.println("Lokasi Rumah/Kost : " + location);
        bill.displayInfo();
    }
}

