package arrayList.mobilePhone;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static Contacts contacts = new Contacts();

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;

    while (!quit) {
      printOptions();
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          printOptions();
          break;
        case 1:
          printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          searchContact();
          break;
        case 6:
          quit = true;
          break;
        default:
          printOptions();
          break;
      }
    }
  }

  private static void printOptions() {
    System.out.println("\nPlease select an option:");
    System.out.println("\t0. Display options");
    System.out.println("\t1. Print contacts");
    System.out.println("\t2. Add a new contact");
    System.out.println("\t3. Update contact");
    System.out.println("\t4. Remove contact");
    System.out.println("\t5. Search contact\n");
  }

  private static void printContacts() {
    contacts.printAll();
  }

  private static void addContact() {
    System.out.println("Enter new contact name: ");
    String name = scanner.nextLine();
    contacts.addGivenContact(name);
  }

  private static void updateContact() {
    System.out.println("Enter contact name to be updated");
    String oldName = scanner.nextLine();
    System.out.println("Enter updated contact name: ");
    String updatedName = scanner.nextLine();
    contacts.updateGivenContact(oldName, updatedName);
  }

  private static void removeContact() {
    System.out.println("Enter name of contact to be removed: ");
    String removeName = scanner.nextLine();
    contacts.removeGivenContact(removeName);
  }

  private static void searchContact() {
    System.out.println("Enter name of contact to be searched: ");
    String searchName = scanner.nextLine();
    contacts.searchGivenContact(searchName);
  }
}
