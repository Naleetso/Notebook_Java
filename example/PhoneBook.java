package example;

import java.util.*;

class PhoneBook {
    private HashMap<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, int number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).addNumber(number);
            System.out.println("\nContact number added.");
        } else {
            Contact newContact = new Contact(name, number);
            contacts.put(name, newContact);
            System.out.println("\nContact added.");
        }
    }

    public void removeNumber(String name, int number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).removeNumber(number);
            System.out.println("\nContact number removed.");
        } else {
            System.out.println("\nContact is not found.");
        }
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("\nContact removed.");
        } else {
            System.out.println("\nContact is not found.");
        }
    }

    public void showContacts() {
        List<Contact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(c -> c.getNumbers().size()));
        Collections.reverse(sortedContacts);
        System.out.println("\nList of contacts:\n");

        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }
}