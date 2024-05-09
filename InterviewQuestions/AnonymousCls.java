package InterviewQuestions;

public class AnonymousCls {

    interface MyInterface {
        void myMethod();
    }

   public static void main(String[] args) {
    MyInterface obj = new MyInterface(){
        public void myMethod(){
            System.out.println("Annonymous class implementation");
        }
     };
}
}
