package Day_2;

class Contact {

    String firstName;
    String lastName;
    String phoneNumber;
    String email;

    // Constructor
    Contact(String firstName,
            String lastName,
            String phoneNumber,
            String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display contact nicely
    public String toString() {

        return firstName + " " + lastName +
               " | " + phoneNumber +
               " | " + email;
    }
}
