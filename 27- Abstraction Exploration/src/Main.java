public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.describeMe());

        Cat c = new Cat();
        System.out.println(c.describeMe());
    }
}

/// Abstraction -- show only necessary info to outside world.
abstract class Animal {
    String name;
    Integer age;

    abstract String speak();
    abstract String describeMe();
}

/// Inheritence
/// Dog is extending abstract Animal class.
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