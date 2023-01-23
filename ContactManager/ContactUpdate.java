package ContactManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactUpdate {
    static ArrayList<ContactManager.Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Path dataFile = Paths.get("data", "contacts.txt");

    public static int mainMenu() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("  1. View contacts");
        System.out.println("  2. Add a new contact");
        System.out.println("  3. Search a contact by name and/or phone number.");
        System.out.println("  4. Delete an existing contact.");
        System.out.println("  5.Add Contact Birthday.");
        System.out.println("  6. Exit");
        System.out.print("\nEnter an option (1, 2, 3, 4 or 5): ");

        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();
        return userInput;
    }

    public static void ViewContacts() throws IOException {
        System.out.printf("Name       | Phone Number |\n---------------------------\n");
        List<String> contacts = Files.readAllLines(dataFile);
        for (String contact : contacts) {
            String[] contactInfo = contact.split("\\|");
            System.out.printf("%-11s| %-12s|\n", contactInfo[0], contactInfo[1]);
        }
    }

    public static void addContact() throws IOException {
        System.out.print("  Enter A Name: ");
        String Name = scanner.nextLine();
        System.out.print("  Enter A Phone Number : ");
        String phoneNumber = scanner.nextLine();
        Files.write(
                Paths.get("data", "contacts.txt"),
                List.of(Name + " " + " | " + phoneNumber),
                StandardOpenOption.APPEND
        );
        contacts.add(new ContactManager.Contact(Name, phoneNumber));
        System.out.println(Name + " " + " has been successfully added to the contact list ");
    }

    public static void searchByName() throws IOException {
        System.out.print("  Enter A Name: ");
        String Name = scanner.nextLine();
        List<String> contacts = Files.readAllLines(dataFile);
        for (String contact : contacts) {
            if (contact.toLowerCase().contains(Name)) {
                System.out.println(contact);
            }
        }
    }

    public static void deleteContact() throws IOException {
        System.out.print(" Enter A Name or Number: ");
        String input = scanner.nextLine();
        List<String> contacts = Files.readAllLines(dataFile);
        String foundContact = null;
        for (String contact : contacts) {
            if (contact.contains(input)) {
                foundContact = contact;
            }
        }
        contacts.remove(foundContact);
        System.out.println("Contact successfully deleted!");
        Files.write(Paths.get("data", "contacts.txt"), contacts);
    }
    public static void addBirthDay() throws IOException {
        System.out.print("  Enter A Name: ");
        String Name = scanner.nextLine();
        System.out.print("  Enter A Phone Number : ");
        String phoneNumber = scanner.nextLine();
        Files.write(
                Paths.get("data", "contacts.txt"),
                List.of(Name + " " + " | " + phoneNumber),
                StandardOpenOption.APPEND
        );
        contacts.add(new ContactManager.Contact(Name, phoneNumber));
        System.out.println(Name + " " + " has been successfully added to the contact list ");
    }

    public static void exit(){
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
