package ui;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    //varible constante
    public static final String[] MONTHS  = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Tank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response !=0);
    }

    private static void authUser(int userType){
        //usertype = 1 Doctor
        //usertype = 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Omar Guerra", "omar3@gmail.com"));
        doctors.add(new Doctor("Shellsea Gonzales", "shellsea@gmail.com"));
        doctors.add(new Doctor("Diana Gonzales", "diana@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Enrique Garcia", "enrique@gmail.com"));
        patients.add(new Patient("Belkin Garcia", "belkin@gmail.com"));
        patients.add(new Patient("Maria Romero", "maria@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [d@d.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        showPatientMenu();
                    }
                }
            }
        }while (!emailCorrect);

    }


    public static void showPatientMenu(){
        int reponse = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            reponse = Integer.valueOf(sc.nextLine());

            switch (reponse){
                case 1:
                    System.out.println("::Book an appointment");

                    //Muestra la lista de los 3 primeros meses
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }

                    break;
                case 2:
                    System.out.println(":: My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (reponse !=0);
    }


}
