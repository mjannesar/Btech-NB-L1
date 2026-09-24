package HospitalManagement;

public class Nurse extends Person implements MedicalProfessional{
    Nurse(String name, int age) {
        super(name, age);
    }
     public  void displayRole() {
        System.out.println("Nurse role");
     }

     public void treatPatient() {
        System.out.println("Nurse.... treatment");
     }
}
