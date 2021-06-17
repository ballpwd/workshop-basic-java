import java.util.ArrayList;

public class MyRange {
    public static void main(String[] args) {
        String input = args[0];

        String result = "";

        int start = Character.getNumericValue(input.charAt(1)) ;
        int end = Character.getNumericValue(input.charAt(3)) ;

        if(input.startsWith("(")){
            start++ ;
        }
        if(input.endsWith(")")){
            end-- ;
        }

        for (int i = start; i <= end; i++) {
            result = result+i ;
            if(i < end) result = result +",";
        }


        System.out.println(result);

    }
}
