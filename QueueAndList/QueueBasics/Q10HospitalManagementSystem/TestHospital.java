package CombinedArrayAndQueue.Q10MiniHospitalSystem;

import CombinedArrayAndQueue.Q6OrderManagementSystem.ManageOrders;

public class TestHospital {

    public static void main(String[] args) {

        ManageHospital mh1 = new ManageHospital();

        mh1.addPatient(new Patient("Amit",3));
        mh1.addPatient(new Patient("Ruchi",2));
        mh1.addPatient(new Patient("Aman",1));


        mh1.showTreated();
        mh1.treatNext();
        mh1.showTreated();
    }
}
