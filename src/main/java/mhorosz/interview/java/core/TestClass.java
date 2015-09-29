package mhorosz.interview.java.core;

public class TestClass {

    private static String STATIC_FILED = "STATIC_FIELD";

    private String instanceField = "Instance field";

    private static String doSomethingStatic(){
        return STATIC_FILED;
    }


    //Nested class has rules are like any top level class + privilege to access private members
    //Nested class instance can exist without outer class instance
    public static class NestedTestClass{

        //access to static field as any top level class
        private static String innerField = TestClass.STATIC_FILED;

        //access to instance field through TestClass instance
        private String nestedInstanceField = new TestClass().instanceField;

        //can declare static members
        public static void nestedDoSomethingStatic(){

        }

        //object of outer class is not required
        private TestClass.NestedTestClass nestedObject = new TestClass.NestedTestClass();

        private Integer number;

        private void doSomething(){

        }
        public static NestedTestClass factoryMethod(){
            return new TestClass.NestedTestClass();
        }

    }



    //Inner class can
    public class InnerClass {

        //not allowed do declare static members!!!
        //private static String STATIC_INNER_FILED = TestClass.STATIC_FILED;

        //instance field are ok to access
        private String innerInstanceField = new TestClass().instanceField;

        //can access static methods
        private String test = TestClass.doSomethingStatic();

    }
}
