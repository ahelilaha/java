public class Teacher implements Person, Animal{
    private final String myFirstName;
    private final String myLastName;
    private final Integer myAge;
    private final Gender myGender;
    private final String myAddress;
    private final boolean amISpeakable;

    /// constructor
    Teacher(String myFirstName,
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
        boolean isMale = (myGender == Gender.male);
        return "Hello, I am " + myFirstName + " " + myLastName + ". I am " + myAge + " years old. " + "I currently live in " + myAddress + ". I am " + (isMale ? "Male" : "Female") + ". Can I talk --> " + amISpeakable;
    }

    @Override
    public boolean isSpeakable() {
        return amISpeakable;
    }
}
