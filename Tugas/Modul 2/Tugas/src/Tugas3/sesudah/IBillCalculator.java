package Tugas3.sesudah;

public interface IBillCalculator {//extract Interface
    void printSummary();

    double calculatedPerPerson(double total);

    double calculatedTotal(double admin, double pajak);
}
