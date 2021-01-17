package model;

import model.User;

public class Patient extends User {
    //Atributo
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor
    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight( double weight ){
        this.weight = weight;
    }

    public String getWeight(){
      return this.weight + " Kg.";
    }


    public void setPhoneNumber(String phoneNumber) {

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: "+birthday + "\n Weight: "+getWeight() +"\n Height" + getHeight() + "\nBlood: "+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}