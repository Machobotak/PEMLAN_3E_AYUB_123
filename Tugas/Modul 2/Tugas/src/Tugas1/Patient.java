package Tugas1;

public class Patient {
    public String name;
    public int recordNumber;
    public Doctor doctor;
    public String disease;

    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails(){
        System.out.println("Patient Name: "+name);
        System.out.println("Record Number: "+recordNumber);
        System.out.println("Disease: "+disease);
        System.out.println("Doctor in Charage: "+ doctor.getName());
    }

    public void updateDisease(String newDisease){
        disease = newDisease;
        System.out.println("Disease updated to: "+disease);
    }
}
