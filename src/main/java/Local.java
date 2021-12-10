import java.util.List;

public class Local implements CheckPerson{
    @Override
    public boolean test(Person p) {
        if (p.name.equals("Frank") && p.age == 34) {
            return true;
        }
        return false;
    }






    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
