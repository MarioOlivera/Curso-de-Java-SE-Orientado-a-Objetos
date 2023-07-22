import model.Doctor;
import model.Patient;
import model.User;
import ui.UIMenu;

import java.util.Date;

public class Main {

    public static void main(String[] args){

        UIMenu.showMenu();

        //showMenu();

        /*
        Doctor myDoctor = new Doctor("Mario Olivera", "mario@email.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "13pm");
        */


        //System.out.println(myDoctor);

        /*User user = new Patient("Mario Olivera", "mario@email.com");
        user.showDataUser();*/

        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments())
        {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(60.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        System.out.println(patient);
        */

    }
}
