package mhorosz.interview.java.core;

public class StaticKeyword {

    private static String STATIC_FILED = "STATIC_FIELD";

    private String instanceField = "Instance field";

    private static String doSomethingStatic(){
        return STATIC_FILED;
    }


    //Nested class has rules are like any top level class + privilege to access private members
    //Nested class instance can exist without outer class instance
    public static class NestedTestClass{

        //access to static field as any top level class
        private static String innerField = StaticKeyword.STATIC_FILED;

        //access to instance field through StaticKeyword instance
        private String nestedInstanceField = new StaticKeyword().instanceField;

        //can declare static members
        public static void nestedDoSomethingStatic(){

        }

        //object of outer class is not required
        private StaticKeyword.NestedTestClass nestedObject = new StaticKeyword.NestedTestClass();

        private Integer number;

        private void doSomething(){

        }
        public static NestedTestClass factoryMethod(){
            return new StaticKeyword.NestedTestClass();
        }

    }



    //Inner class can
    public class InnerClass {

        //not allowed do declare static members!!!
        //private static String STATIC_INNER_FILED = StaticKeyword.STATIC_FILED;

        //instance field are ok to access
        private String innerInstanceField = new StaticKeyword().instanceField;

        //can access static methods
        private String test = StaticKeyword.doSomethingStatic();

    }
}
