package InterviewQuestions;


public class MethodReference {
    
    public static void main(String[] args) {
       Animal animal = new Animal();
       
    }
}

class Animal{
    public static void printInfo(){
        System.out.println("Info");
    }

    int a;

    void getIt(){
        System.out.println("Received");
    }
}