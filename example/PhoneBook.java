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
        } else {
            Contact newContact = new Contact(name, number);
            contacts.put(name, newContact);
        }
    }

    public void removeNumber(String name, int number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).removeNumber(number);
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public void showContacts() {
        List<Contact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(c -> c.getNumbers().size()));
        Collections.reverse(sortedContacts);

        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }
}