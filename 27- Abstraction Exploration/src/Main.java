public class Main {
    public static void main(String[] args) {
        Animal d = new Dog();
        System.out.println(d.describeMe());

        Animal c = new Cat();
        System.out.println(c.describeMe());
    }
}

/// Abstraction -- show only necessary info to outside world.
abstract class Animal {
    String name;
    Integer age;

    abstract String speak();
    abstract String describeMe();
    String nonAbstractMethod() {
        return "inside non-abstract method";
    }
}

abstract class Mammal {
    abstract Integer numberOfYearsToFeed();
}

/// Inheritence
/// Dog is extending abstract Animal class.
/// ⚛️ -- Java does not support multiple inheritance, you cannot extend another class in child class.
class Dog extends Animal {

    @Override
    String speak() {
        return "bow vow";
    }

    @Override
    String describeMe() {
        return "I am a dogg";
    }
}

class Cat extends Animal {

    @Override
    String speak() {
        return "meow meow";
    }

    @Override
    String describeMe() {
        return "Hello, I am a Kat";
    }
}