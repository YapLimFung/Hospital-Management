import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hospital_Main_Menu {
    static ArrayList<Patient> patientArrayList = new ArrayList<>(); //creating an arraylist to store patient details
    static Scanner input = new Scanner(System.in); //scan user input

    public static void main(String[] args) {
        String cont = "yes";
        int options = 0;

        do {
            System.out.println("--------------------------\n" +
                    "Hospital Management System\n" +
                    "--------------------------\n" +
                    "1. Add New Patient\n" +
                    "2. Display Doctor/Patient Details\n" +
                    "3. Display Payment Confirmation\n" +
                    "4. Update Patient Record\n" +
                    "5. Exit");
            System.out.print("Choose an Option: ");

            try {
                options = input.nextInt();
                input.nextLine();

                switch (options) {
                    case 1 -> {
                        //adding new patient to the system
                        addNewPatient();
                    }
                    case 2 -> {
                        //Display Person info, either doctor or patient
                        displayDetails();
                    }
                    case 3 -> {
                        //display payment confirmation

                    }

                    case 4 -> {
                        //update patient record

                    }

                    case 5 -> {
                        cont = "no";
                        System.out.println("Exited Successfully!");

                    }
                    default -> {
                        System.out.println("Wrong input! Please enter between 1 - 5"); //rerun case function if input is an integer but not within 1-5
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Please try again! "); //rerun if input is not an integer, would not cause an error to the system
                input.nextLine();
                options = 0;
            }
        } while (options != 5);
    }


    public static void addNewPatient() {
        //for the method to refer back to the same list from the main so that it only uses one ArrayList for all patients
        //case 1
        //adding new patient to System

        System.out.print("Enter New Patient id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Date of Birth (ex: 28/01/2008): ");
        String dateOfBirth = input.nextLine();
        System.out.print("Select Gender (Male/Female): ");
        String gender = input.nextLine().toLowerCase();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Phone Number: ");
        String phoneNum = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Does Patient Have Insurance? (yes/no): ");
        String insurance = input.nextLine();
        System.out.print("Choose Patient Blood Type (AB/A/B/O): ");
        String bloodType = input.nextLine();
        System.out.println("Successfully Added New Patient!");
        System.out.println(id + ", " + firstName + " " + lastName + ", " + dateOfBirth + ", " + gender + ", " + address + ", " + phoneNum + ", " + email + ", " + insurance + ", " + bloodType + "\n");

        patientArrayList.add(new Patient(id, firstName, lastName, dateOfBirth,
                gender, address, phoneNum, email, insurance, bloodType)); //adding it to patient arraylist

    }


    public static void displayDetails() {  //if selected option 2 run method
        int det = 0;
        int doctor = 0;

        System.out.print("\n-------------------------\n" +
                "1. Check Doctor Details\n" +
                "2. Check Patient Details\n" +
                "-------------------------\n");
        System.out.print("Select an Option: ");
        det = input.nextInt();
        input.nextLine();

        switch (det) {
            case 1 -> {
                displayDoctorDetails();
            }
            case 2 -> {
                displayPatientDetails();
            }
            default -> {
                System.out.println("Invalid Input! Please enter either 1 or 2!");
            }
        }
    }


    public static void displayDoctorDetails() {
        int doctor = 0;

        System.out.println("1. Display All Doctor Details\n" +
                "2. Search Doctor by ID");
        doctor = input.nextInt();

    }


    public static void displayPatientDetails() {
        int options = 0;
        int patientsId = 0;
        int choice = 0;
        String patientsName;

        System.out.println("\n1. Display All Patient Details\n" +
                "2. Search Patient by ID");
        System.out.print("Choose an Option: ");
        options = input.nextInt();

        switch (options) {
            case 1 -> {
                System.out.println(patientArrayList+
                        "\n" +
                        "Total Active Patients: " +
                        patientArrayList.size());
            }

            case 2 -> {
                System.out.println("1. Search by ID\n" +
                        "2. Search by Name");
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Patient ID: ");
                        patientsId = input.nextInt();

                        for (int i = 0; i < patientArrayList.size(); i++) {
                            Person Patient = patientArrayList.get(i);
                            if (Patient.getId() == patientsId) {
                                System.out.println(Patient);
                            }
                        }
                    }

                    case 2 -> {
                        System.out.print("Search Patient by Name: ");
                        patientsName = input.nextLine();
                        boolean found = false;

                        for (int i = 0; i < patientArrayList.size(); i++) {
                            Patient patientName = patientArrayList.get(i);

                            if (patientName.getFirstName().toLowerCase().equals(patientsName.toLowerCase())) { //changing it to lowercase for it be found easier
                                if (patientName instanceof Patient) {
                                    System.out.println("Patient with name: " + patientsName);
                                    System.out.println("Patient Details\n" +
                                            "---------------------" + patientName + "\n");
                                    found = true;
                                }
                            }
                            if (!found) {
                                System.out.println("Cant find name!\n" +
                                        "Redirecting Back to Main Menu....");
                            }
                        }


                    }

                }


            }
        }

    }


}