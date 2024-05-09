package InterviewQuestions;

public class Throwms {
    public static void main(String[] args) {
        System.out.println(123);

        Throwms tr = new Throwms();
        makeSound();
        try {
            tr.printName();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
//The static keyword is used to create class-level members (variables or methods) that can be accessed without creating an instance of the class.
    public  void printName() throws Exception {
        // this may be throw exception
        System.out.println(23 / 0); // DividebyZero Excepion
    }

    public static void makeSound() {
        try {
            throw new Exception("This is my explicitly thrown exception");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

/**
 * throw is used to explicitly throw an exception, while throws is used in
 * method declarations to indicate that the method may throw an exception.
 */