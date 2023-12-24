import java.util.Comparator;
import java.util.Random;

public class Student {
    public static void main(String[] args) {
        Random random = new Random();

        Griffindor harry = new Griffindor("Harry Potter", random.nextInt(101), random.nextInt(101),
                random.nextInt(101),random.nextInt(101),random.nextInt(101));
        Griffindor hermiona = new Griffindor("Hermiona", random.nextInt(101), random.nextInt(101),
                random.nextInt(101),random.nextInt(101),random.nextInt(101));

        System.out.println(harry);
        System.out.println(hermiona);
        harry.compare(hermiona);

        Hogwarts dambledore = new Hogwarts(" Albus", random.nextInt(101), random.nextInt(101));
        dambledore.compare(harry);

    }
}
