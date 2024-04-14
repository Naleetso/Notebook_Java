package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nYou are in a phonebook, choose an action:");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact number");
            System.out.println("3. Remove contact");
            System.out.println("4. Show contacts");
            System.out.println("5. Leave");
            System.out.print("Enter the number of action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact number: ");
                    int number = scanner.nextInt();
                    phoneBook.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Enter contact name: ");
                    String nameRemove = scanner.nextLine();
                    System.out.print("Enter contact number for removal: ");
                    int numberRemove = scanner.nextInt();
                    phoneBook.removeNumber(nameRemove, numberRemove);
                    break;
                case 3:
                    System.out.print("Enter contact name for removal: ");
                    String nameRemoveAll = scanner.nextLine();
                    phoneBook.removeContact(nameRemoveAll);
                    break;
                case 4:
                    phoneBook.showContacts();
                    break;
                case 5:
                    System.out.println("You are out of the phone book");
                    System.exit(0);
                default:
                    System.out.println("Incorrect entry, try again.");
            }
        }
    }
}
