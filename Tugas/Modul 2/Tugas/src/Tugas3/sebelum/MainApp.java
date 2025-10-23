package Tugas3.sebelum;

public class MainApp {
    public static void main(String[] args) {
        Bill b1 = new Bill(150_000, 325_000, 5);
        House h1 = new House(b1, "Kost Mawar A-3");

        h1.showHouseInfo();

        b1.adjustResidents(1);

        h1.showHouseInfo();
    }
}
