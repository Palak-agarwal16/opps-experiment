
public class SchoolManagement {
	public static void main(String[] args) {
        person[] people = new person[3];
        people[0] = new Student("Emma");
        people[1] = new Teacher("Mr. Smith");
        people[2] = new Student("Oliver");

        for (person p : people) {
            p.performDuty(); // Runtime polymorphism
        }
    }
}
