package People;

import java.time.LocalDate;

public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate Dob;

    private static int PeopleCount = 0;

    public Person(String FirstName, String LastName, LocalDate Dob){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Dob = Dob;
        PeopleCount ++;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        this.Dob = Dob;
    }

    public static int getPeopleCount() {
        return PeopleCount;
    }

    public static void setPeopleCount(int peopleCount) {
        PeopleCount = peopleCount;
    }

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
        // Creating instances of MyClass
        Person scott = new Person("Scott", "O' Brien", LocalDate.of(1999, 1, 11));
        Person chloe = new Person("Chloe", "Please add", LocalDate.of(1999, 3, 23));
        Person sraddheya = new Person("sraddheya", "Please add", LocalDate.of(1999, 1, 11));
        Person tina = new Person("Avgustina", "Pinaldi", LocalDate.of(1995, 3, 9));
        Person stam = new Person("Stamatis", "Theocharous", LocalDate.of(1999, 5, 28));

        // Getting the count of instances created
        System.out.println("Number of people created: " + Person.getPeopleCount());
        System.out.println(scott.toString());
    }


}





