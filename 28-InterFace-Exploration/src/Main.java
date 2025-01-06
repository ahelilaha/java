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

        Person ashis = new Teacher(
                "Ashis",
                "Laha",
                35,
                Gender.male,
                "Sammamish, WA",
                true
        );
        System.out.println(ashis.toString());

        Person livy = new Teacher(
                "Livy",
                "Shivraj",
                57,
                Gender.female,
                "Hydrebad, India",
                true
        );
        System.out.println(livy.toString());
    }

}