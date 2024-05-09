package InterviewQuestions;

public class Immutability {
    public static void main(String[] args) {

        String name = "Satish";
        System.out.println(name.hashCode());
        name += "Gavhane";
        System.out.println(name.hashCode());

        StringBuilder sb = new StringBuilder("Satish");
        System.out.println(sb.hashCode()); // 1101288798
        sb.append("Gavhane");
        System.out.println(sb.hashCode()); // 1101288798

        StringBuffer sf = new StringBuffer("Satosh");
        System.out.println(sf.hashCode()); // 2104457164
        sf.append("Gavhane");
        System.out.println(sf.hashCode()); // 2104457164
    }
}

// How to make a class immutable - final class className
// final class Anima {

// }

// class Dog extends Anima { // throwing error

// }
