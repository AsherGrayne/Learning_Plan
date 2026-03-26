package Day_2;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n--- PHONEBOOK MENU ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Phone");
            System.out.println("4. List Contacts Sorted by Surname");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    pb.addContact(
                            firstName,
                            lastName,
                            phone,
                            email
                    );

                    break;


                case 2:

                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();

                    Contact result1 =
                            pb.searchByName(name);

                    if (result1 != null) {

                        System.out.println(result1);

                    } else {

                        System.out.println("Contact not found.");
                    }

                    break;


                case 3:

                    System.out.print("Enter phone to search: ");
                    String ph = sc.nextLine();

                    Contact result2 =
                            pb.searchByPhone(ph);

                    if (result2 != null) {

                        System.out.println(result2);

                    } else {

                        System.out.println("Contact not found.");
                    }

                    break;


                case 4:

                    pb.listSortedContacts();

                    break;


                case 5:

                    System.out.println("Exiting...");
                    break;


                default:

                    System.out.println("Invalid choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}
