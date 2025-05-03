abstract class Patient {
    protected String name;
    protected String patientId;
    public void setDetails(String name, String id) {
        this.name = name;
        patientId = id;
    }
    public abstract double generateBill();
}
class InPatient extends Patient {
    @Override
    public double generateBill() {
        return 2000 + 500; // Room + treatment charges
    }
}
class OutPatient extends Patient {
    @Override
    public double generateBill() {
        return 300; // Consultation only
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient inpatient = new InPatient();
        inpatient.setDetails("Ali", "P001");
        System.out.println("In-Patient Bill: Rs." + inpatient.generateBill());
        Patient outpatient = new OutPatient();
        outpatient.setDetails("Hina", "P002");
        System.out.println("Out-Patient Bill: Rs." + outpatient.generateBill());
    }
}