package InterviewQuestions;

public class SuperKeyword {
    interface Animal{
        void sound();
    }

    class Dog implements Animal{
        public void sound(){
            System.out.println("Dog BArks");
        }
    } 

    class Rathi extends Dog{
            
        public void sound(){
            super.sound(); // Calls Dogs sound method -- Immediate parent's methods
            System.out.println("Barks Propaganda loudly");
        }
    }

    public static void main(String[] args) {
        Rathi rathi = new SuperKeyword().new Rathi();
        rathi.sound();
    }

}
