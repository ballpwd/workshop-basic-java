import java.util.List;

public class MySort {

    private List<Integer> input ;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> sortCase01(){
        return input ;
    }

    public List<Integer> sortCase02() {
        return input ;
    }

    public List<Integer> sortCase03() {
        int firstNum = input.get(0);
        int secondNum = input.get(1);
        if(firstNum > secondNum){
            input.set(0,secondNum);
            input.set(1,firstNum);
        }
        return input ;
    }
}
