package arrayList.mobilePhone;

import java.util.ArrayList;

public class Contacts {

  private ArrayList<String> contacts = new ArrayList<String>();

  public void printAll() {
    System.out.println("There are " + contacts.size() + " contacts");
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println((i + 1) + ". " + contacts.get(i));
    }
  }

  public void addGivenContact(String name) {
    contacts.add(name);
  }

  public void updateGivenContact(String oldName, String newName) {
    int position = findContact(oldName);

    if (position >= 0) updateGivenContact(position, newName);
  }

  private void updateGivenContact(int position, String newName) {
    contacts.set(position, newName);
    System.out.println("Contact has been modified");
  }

  public void removeGivenContact(String name) {
    int position = findContact(name);

    if (position >= 0) removeGivenContact(position);
  }

  private void removeGivenContact(int position) {
    contacts.remove(position);
  }

  public boolean searchGivenContact(String name) {
    int position = findContact(name);

    if (position >= 0) {
      System.out.println("Contact is found in position " + (position + 1));
      return true;
    } else {
      System.out.println("Contact not found");
      return false;
    }
  }

  private int findContact(String name) {
    return contacts.indexOf(name);
  }
}
