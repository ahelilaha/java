import java.lang.*;

class Food {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Food chicken = new Food();
        //System.out.println(chicken.name);
        chicken.name = "huli huli chicken";
        //System.out.println(chicken.name);

        Food anotherChicken = new Food();
        anotherChicken.name = "desi chicken";
        System.out.println(chicken.name);
        System.out.println(anotherChicken.name);
        chicken = anotherChicken;
        System.out.println(chicken.name);
        System.out.println(anotherChicken.name);
        // create 3 students

        // create Aheli student object
//        Student aheli = new Student("Aheli Laha", 11, "6");
//        Student diya = new Student("Diya Jaswanthkumar",12,"6");
//        Student ayda = new Student("Ayda Joe",12,"6");
//
//        // print them
//        String aheliDescription = aheli.description();
//        System.out.println(aheliDescription);
//        System.out.println(diya.description());
//        System.out.println(ayda.description());

    }
}

/*
hehehehehehe this was made by the super duper amazing awesome and nice person named Aheli
*/

// create a new public class called Student
class Student {

    private String name;
    private Integer age;
    private String grade;

    // constructor / init
    Student(String givenName, Integer givenAge, String givenGrade) {
        this.name = givenName;
        this.age = givenAge;
        this.grade = givenGrade;

    }

    // describe this student
    public String description() {
        return "I am " + name + ". I am " + age.toString() + " years old " + ". I also study in grade " + grade ;
    }
}