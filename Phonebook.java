package Day_2;

import java.util.*;

class PhoneBook {

    // Collection 1 → Store all contacts
    ArrayList<Contact> contactList = new ArrayList<>();

    // Collection 2 → Search by phone number
    HashMap<String, Contact> phoneMap = new HashMap<>();

    // Collection 3 → Sorted by surname
    TreeMap<String, Contact> surnameMap = new TreeMap<>();


    // Method 1: Add Contact
    void addContact(String firstName,
                    String lastName,
                    String phone,
                    String email) {

        Contact c = new Contact(
                firstName,
                lastName,
                phone,
                email
        );

        // Add to all collections
        contactList.add(c);

        phoneMap.put(phone, c);

        surnameMap.put(lastName, c);

        System.out.println("Contact added successfully.");
    }


    // Method 2: Search by Phone
    Contact searchByPhone(String phone) {

        return phoneMap.get(phone);
    }


    // Method 3: Search by Name
    Contact searchByName(String name) {

        for (Contact c : contactList) {

            if (c.firstName.equalsIgnoreCase(name)) {

                return c;
            }
        }

        return null;
    }


    // Method 4: List Contacts Sorted by Surname
    void listSortedContacts() {

        System.out.println("\nContacts sorted by surname:");

        for (Contact c : surnameMap.values()) {

            System.out.println(c);
        }
    }

}
