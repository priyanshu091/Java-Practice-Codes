package CombinedArrayAndQueue.Q10MiniHospitalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ManageHospital {

    PriorityQueue<Patient> patientPriorityQueue=new PriorityQueue<>(
            (p1,p2) -> Integer.compare(p1.getEmergencyLevel(),p2.getEmergencyLevel())
    );
    List<Patient> treatedPatientList = new ArrayList<>();

    public void addPatient(Patient patient){
        if (patientPriorityQueue.offer(patient)){
            System.out.println("Patient Added: "+patient.getName()+" (Emergency Level): "+patient.getEmergencyLevel());
        }
        else {
            System.out.println("Unable to Add Patient");
        }

    }
    public void treatNext(){
        Patient p = patientPriorityQueue.poll();

        if (p!=null){
            treatedPatientList.add(p);
            System.out.println("\nPatient Treated :"+p);
        }
        else {
        System.out.println("No Patient to Treat");
    }}
    public  void showTreated(){
        System.out.println("=".repeat(20)+"List of Treated Patient"+"=".repeat(20)+"\n");
        int index=1;

        if (treatedPatientList.isEmpty())
        {
            System.out.println("No patient Treated yet\n");
            return;
        }

        for (Patient patient : treatedPatientList) {

            System.out.println(index+"."+patient);
            index++;

        }
    }
}
