package mhorosz.interview.java.core;

/**
 * Created  by Marcin_Horoszkiewicz on 10/1/2015.
 */
public class MemoryLeak {

    public static class Stack{
        private static final int SIZE = 100;
        private String[] elements = new String[SIZE];
        int currentIndex = 0;

        public void push(String element){
            if(currentIndex < SIZE-1){
                elements[currentIndex] = element;
                currentIndex++;
            }
        }

        //Memory leak - popped references are not set to null
        public String pop(){
            if(currentIndex > 0){
                String poppedElement = elements[currentIndex];
                currentIndex--;
                return poppedElement;
            } else{
                return null;
            }
        }
    }

}
