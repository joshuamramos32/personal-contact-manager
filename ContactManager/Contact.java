package ContactManager;


public class Contact {
    private String Name;
    private String phoneNumber;

    public Contact(String Name, String phoneNumber) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
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

    public String toString() {
        return this.Name + " " + "Phone Number: " + this.phoneNumber;
    }
}
