package People;

import java.time.LocalDate;

public class Person {
    private String FirstName; // First name of the person
    private String LastName; // Last name of the person
    private LocalDate Dob; // Date of birth of the person
    private static int PeopleCount = 0; // Static variable to count the number of people

    // Constructor to initialize the person's details and increment the people count
    public Person(String FirstName, String LastName, LocalDate Dob) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Dob = Dob;
        PeopleCount++;
    }

    // Getter for the first name
    public String getFirstName() {
        return FirstName;
    }

    // Setter for the first name
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    // Getter for the last name
    public String getLastName() {
        return LastName;
    }

    // Setter for the last name
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    // Getter for the date of birth
    public LocalDate getDob() {
        return Dob;
    }

    // Setter for the date of birth
    public void setDob(LocalDate dob) {
        this.Dob = Dob;
    }

    // Static method to get the count of people
    public static int getPeopleCount() {
        return PeopleCount;
    }

    // Static method to set the count of people
    public static void setPeopleCount(int peopleCount) {
        PeopleCount = peopleCount;
    }

    // Override toString method to display person's details
    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Dob=" + Dob +
                ", PeopleCount=" + getPeopleCount() +
                '}';
    }

    public static void main(String[] args) {
        // Creating instances of Person
        Person scott = new Person("Scott", "O' Brien", LocalDate.of(1999, 1, 11));
        Person chloe = new Person("Chloe", "Please add", LocalDate.of(1999, 3, 23));
        Person sraddheya = new Person("Sraddheya", "Please add", LocalDate.of(1999, 1, 11));
        Person tina = new Person("Avgustina", "Pinaldi", LocalDate.of(1995, 3, 9));
        Person stam = new Person("Stamatis", "Theocharous", LocalDate.of(1999, 5, 28));

        // Getting the count of instances created
        System.out.println("Number of people created: " + Person.getPeopleCount());
        System.out.println(scott.toString());
    }
}
