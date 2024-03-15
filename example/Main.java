package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВы находитесь в телефонной книге, выбирете действие:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить номер контакта");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Показать контакты");
            System.out.println("5. Выйти из телефонной книги");
            System.out.print("Выбирете действие, что вы хотите сделать: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер контакта: ");
                    int number = scanner.nextInt();
                    phoneBook.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Введите имя контакта: ");
                    String nameRemove = scanner.nextLine();
                    System.out.print("Введите номер контакта для удаления: ");
                    int numberRemove = scanner.nextInt();
                    phoneBook.removeNumber(nameRemove, numberRemove);
                    break;
                case 3:
                    System.out.print("Введите имя контакта для удаления: ");
                    String nameRemoveAll = scanner.nextLine();
                    phoneBook.removeContact(nameRemoveAll);
                    break;
                case 4:
                    phoneBook.showContacts();
                    break;
                case 5:
                    System.out.println("Вы вышли из телефонной книги.");
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод, попробуйте еще раз.");
            }
        }
    }
}