package InterviewQuestions;

public class Polymorphism {

    // interface Shape {
    // void draw();
    // }

    // class Circle implements Shape {
    // public void draw() {
    // System.out.println("Drawing");
    // }
    // }
    // Method Overriding
    class Animal {
        
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Method Overloadng - same functionname wih different parameter
    // Method overloading allows a class to have multiple methods with the same name
    // but different parameter lists.
    // return type also can be different
    static class Calc { 
        public void Sum() {
            System.out.println(Sum(12, 34));
        }

        public int Sum(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {

        Calc cs = new Calc();
        cs.Sum();
        Animal anim = new Polymorphism().new Dog();
        anim.makeSound(); // Dog Barks

        // String str = null;
        // int length = str.length(); // Throws NullPointerException
        // final int MAX_VALUE = 100;
        // System.out.println(MAX_VALUE);

    }
}
