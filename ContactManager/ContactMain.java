package ContactManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ContactMain {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String contactsFile = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, contactsFile);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }


        while (true) {
            int userInput = ContactUpdate.mainMenu();
            if (userInput == 1)
                ContactUpdate.ViewContacts();
            else if (userInput == 2)
                ContactUpdate.addContact();
            else if (userInput == 3)
                ContactUpdate.searchByName();
            else if (userInput == 4) {
                ContactUpdate.deleteContact();
            } else if (userInput == 5) {
                ContactUpdate.addBirthDay();
            } else if (userInput == 6) {
                ContactUpdate.exit();
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}



