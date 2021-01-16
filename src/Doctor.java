import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0;//Autoincrement
    private String name;
    private String email;
    private String speciality;


    Doctor(){
        System.out.println("construyendo el objeto doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asigando es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
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
    }

}
