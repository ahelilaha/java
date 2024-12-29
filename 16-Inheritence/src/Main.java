public class Main {

    public static void main(String[] args) {
        BabyChair aheliStudyChair = new BabyChair("black", 10, 20, true);
        aheliStudyChair.isSwingable = true;
        System.out.println(aheliStudyChair.descibeMe());

        Chair ashisDiningChair = new Chair("black", 5, 15, false);
        System.out.println(ashisDiningChair.descibeMe());

        ashisDiningChair = aheliStudyChair;
        System.out.println(ashisDiningChair.descibeMe());
        System.out.println(aheliStudyChair.descibeMe());
        ashisDiningChair.cost = 8;
        System.out.println(aheliStudyChair.cost);

    }
}

class Chair {
    // properties / attributes
    String color;
    double cost;
    int height;
    boolean isAdjustableHeight;

    // constructor (object is allocated in memory using new)
    public Chair(String color, double chairCost, int height, boolean isAdjustableHeight) {
        this.color = color;
        this.cost = chairCost;
        this.height = height;
        this.isAdjustableHeight = isAdjustableHeight;
    }

    // methods / behaviors
    public String descibeMe() {
        return "I am a " + color + " color chair. " + "I am worth of $" + myCost() + " cost. My height is " + height + " cm. " + "Can you adjust my height? --> " + isAdjustableHeight;
    }

    private double myCost() {
        return cost;
    }
}

class BabyChair extends Chair {
    boolean isSwingable;

    public BabyChair(String color, double chairCost, int height, boolean isAdjustableHeight) {
        super(color, chairCost, height, isAdjustableHeight);
    }

    @Override
    public String descibeMe() {
        return super.descibeMe() + " Am I swingable? --> " + isSwingable;
    }
}