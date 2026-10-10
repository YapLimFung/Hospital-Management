public class Patient extends Person {
    private String insurance;
    private String bloodType;

    public Patient() {

    }

    public Patient(int id, String firstName, String lastName, String dateOfBirth,
                   String gender, String address, String phoneNum, String email, String insurance, String bloodType) {
        super(id, firstName, lastName, dateOfBirth, gender, address, phoneNum, email);
        this.insurance = insurance;
        this.bloodType = bloodType;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String isInsurance() {
        return insurance;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }

    @Override
    public String toString() {
        return
                "\nID: " + getId()
                        + "\nFirst Name: " + getFirstName()
                        + "\nLast Name: " + getLastName()
                        + "\nDate of Birth: " + getDateOfBirth()
                        + "\nGender: " + getGender()
                        + "\nAddress: " + getAddress()
                        + "\nPhone Number: " + getPhoneNum()
                        + "\nEmail: " + getEmail()
                        + "\nHave Insurance: " + insurance
                        + "\nBloodType: " + bloodType;
    }

}
