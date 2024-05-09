package InterviewQuestions;

public class Abstracts {
    static abstract class Animal {
        public void printName() {
            System.out.println("Animal my name");
        }
        abstract void getInfo();
    }

    static class Dog extends Animal {

        @Override
        void getInfo() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getInfo'");
        }
        
      
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.printName();
    }
}
