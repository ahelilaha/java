public class Student implements Person, Animal {
    private String myFirstName;
    private String myLastName;
    private Integer myAge;
    private Gender myGender;
    private String myAddress;
    private boolean amISpeakable;

    /// constructor
    Student(String myFirstName,
            String myLastName,
            Integer myAge,
            Gender myGender,
            String myAddress,
            boolean amISpeakable) {
        this.myFirstName = myFirstName;
        this.myLastName = myLastName;
        this.myAge = myAge;
        this.myGender = myGender;
        this.myAddress = myAddress;
        this.amISpeakable = amISpeakable;
    }

    @Override
    public String firstName() {
        return myFirstName;
    }

    @Override
    public String lastName() {
        return myLastName;
    }

    @Override
    public Integer age() {
        return myAge;
    }

    @Override
    public Gender gender() {
        return myGender;
    }

    @Override
    public String address() {
        return myAddress;
    }

    @Override
    public String toString() {
        boolean isBoy = (myGender == Gender.male);
        return "My Name is " + myFirstName + " " + myLastName + ". My age is " + myAge + " years. " + "I live in " + myAddress + ". I am a " + (isBoy ? "Boy" : "Girl") + ". Can I speak? " + amISpeakable;
    }

    @Override
    public boolean isSpeakable() {
        return amISpeakable;
    }
}
