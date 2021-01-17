package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User  {
    //Atributo
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asigando es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * metodo que va a estar añadiendo las nuevas citas disponibles (incrementa las citas)
     * **/
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    /**
     * devuelve el array que acabo de hacer (la lista completa de citas)
     **/
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+speciality+"\nAvailable:  "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    /**
     * Clase Anidada
     * */
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        //constructor
        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: "+date+ "\nTime: "+ time;
        }
    }

}
