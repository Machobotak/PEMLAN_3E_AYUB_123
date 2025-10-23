package Tugas3.sesudah;

public class Main {//move member
    public static void main(String[] args) {//move member
        Bill  b1 = new Bill(150000, 325000, 5);
        Kost h1 = new Kost(b1, "Kost Mawar A-3");

        h1.showHouseInfo();

        b1.adjustResidents(1);

        h1.showHouseInfo();

    }
}
