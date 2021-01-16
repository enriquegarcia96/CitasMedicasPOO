import javax.swing.*;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Diana Gonzales", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Enrique Garcia", "enrique@gmail.com");




    }
}
