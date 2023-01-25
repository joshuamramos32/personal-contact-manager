package ContactManager;


public class Contact {
    private String Name;
    private String phoneNumber;

    private String birthDay;



    public Contact(String Name, String phoneNumber, String birthDay) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String toString() {
        return this.Name + " " + "Phone Number: " + this.phoneNumber + this.birthDay;
    }
}
