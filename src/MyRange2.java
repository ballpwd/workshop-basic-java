public class MyRange2 {

    private String input;

    public MyRange2(String input) {
        this.input = input;
    }

//    public boolean startWithInclude(){
//        return input.startsWith("[") ;
//    }

    public boolean startWithExclude() {
        return input.startsWith("(");
    }

//    public boolean endWithInclude(){
//        return input.endsWith("]");
//    }

    public boolean endWithExclude() {
        return input.endsWith(")");
    }

    public int getStartNumber(){
        int result = Character.getNumericValue(input.charAt(1));
        if(startWithExclude()){
            result++;
        }
        return result ;
    }

    public int getEndNumber(){
        int result = Character.getNumericValue(input.charAt(3));
        if(endWithExclude()){
            result--;
        }
        return result ;
    }

    public String getResult(){
        int startNumber = getStartNumber();
        int endNumber = getEndNumber();
        String result = "";
        for (int i = startNumber; i <= endNumber; i++) {
            result += i ;
            if(i < endNumber) result += ",";
        }
        return result ;
    }
}
