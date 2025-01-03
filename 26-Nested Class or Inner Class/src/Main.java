

public class Main {
    public static void main(String[] args) {
       OuterClass outerClassObjc = new OuterClass();
       outerClassObjc.x = 100;

        OuterClass.InnerClass innerClassObj = outerClassObjc.new InnerClass();
        innerClassObj.y = 300;
        innerClassObj.describeMe();

        OuterClass.StaticInnerClass staticInnerObj = new OuterClass.StaticInnerClass();
        staticInnerObj.z = 500;

        System.out.println(outerClassObjc.x + " " + innerClassObj.y + " "+ staticInnerObj.z);
    }
}

class OuterClass {
    Integer x = 5;
    static Integer x1 = 3;

    class InnerClass {
        Integer y = 4;

        public void describeMe() {
            System.out.println("print outer x = " + x);
        }
    }

    static class StaticInnerClass {
        Integer z;

        public void describeMe() {
            System.out.println("print outer x = " + OuterClass.x1);
        }
    }
}