public class Main {
    public static void main(String[] args) {
       Person aheli = new Student(
               "Aheli",
               "Laha",
               11,
               Gender.female,
               "Sammamish, WA",
               true
       );
       System.out.println(aheli.toString());

        Person diya = new Student(
                "Diya",
                "Jaswanthkumar",
                12,
                Gender.female,
                "Sammamish, WA",
                true
        );
        System.out.println(diya.toString());
    }
}