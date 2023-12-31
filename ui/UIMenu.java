package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

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
                    UIMenu.patientLogged = null;
                    UIMenu.doctorLogged = null;
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType)
    {
        // userType == 1 Doctor
        // userType == 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Mario Olivera", "mario@mail.com"));
        doctors.add(new Doctor("Jose María", "jose@mail.com"));
        doctors.add(new Doctor("Marcelo", "marcelo@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Carlos", "carlos@mail.com"));
        patients.add(new Patient("Roberto", "roberto@mail.com"));
        patients.add(new Patient("Julio", "julio@mail.com"));

        boolean emailCorrect = false;

        do{
            System.out.println("Insert your email: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1)
            {
                System.out.println("Valido doctor");
                for(Doctor doctor_validate: doctors)
                {
                    if(doctor_validate.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        doctorLogged = doctor_validate;
                        UIDoctorMenu.showDoctorMenu();
                        break;
                    }
                    else
                    {
                        System.out.println(doctor_validate.getEmail()+" != "+email);
                    }
                }
            }
            else
            {
                for(Patient patient_validate: patients)
                {
                    if(patient_validate.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        patientLogged = patient_validate;
                        UIPatientMenu.showPatientMenu();
                        break;
                    }
                }
            }

            if(!emailCorrect)
            {
                System.out.println("El email ingresado no es correcto");
            }
        }while(emailCorrect == false);


    }
}
