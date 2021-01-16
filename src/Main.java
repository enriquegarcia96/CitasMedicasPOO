import javax.swing.*;

import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Diana Gonzales", "diana@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        /*
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments() ) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());

        }

        */



        Patient patient = new Patient("Enrique Garcia", "enrique@gmail.com");
        patient.setWeight(54.2);
        System.out.println(patient.getWeight());

        System.out.println(patient);






    }
}
