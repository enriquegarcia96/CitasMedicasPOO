import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Diana Gonzales", "diana@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("santos", "satos@gmail.com");
        user.showDataUser();

        User pa = new Patient("santos", "santos@gmail.com");
        pa.showDataUser();

        User user1 = new User("santos", "santos@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatria");
            }
        };

        user1.showDataUser();
        //clases anonimas
        IScheedulable iScheedulable = new IScheedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };


        /*
        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments() ) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());

        }  */

        /*
        Patient patient = new Patient("Enrique Garcia", "enrique@gmail.com");
        patient.setWeight(54.2);
        System.out.println(patient.getWeight());

        System.out.println(patient);

        */







    }
}
