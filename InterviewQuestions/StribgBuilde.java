package InterviewQuestions;

public class StribgBuilde {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Satish ");
        System.out.println(sb.hashCode());
        sb.append("Gavhane");
        System.out.println(sb.hashCode());

        System.out.println("String ");
        String str = "Satish";
        System.out.println(str.hashCode());
        str="Satish";
        System.out.println(str.hashCode());
    }
}
