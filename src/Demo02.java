import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        // String
        String name1  = "puwadech";
        String name2 = new String("puwadech");

        int[] scores = new int[]{0,10,20,30,40};
        for (int score : scores) {
            System.out.println(score);
        }

        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        Arrays.stream(scores).forEach(score -> System.out.println(score) );

        if("puwadech".equals(name1)){
            System.out.println("OK 1");
        }
        if("puwadech".equals(name2)){
            System.out.println("OK 2");
        }

    }
}
