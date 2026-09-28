package HospitalManagement;

public class Doctor extends Person implements MedicalProfessional{

    Doctor(String name, int age) {
        super(name, age);
    }
     public  void displayRole() {
        System.out.println("Doctor role");
     }

     public void treatPatient() {
        System.out.println("Doctor.... treatment");
     }
}
