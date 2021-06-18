import java.util.List;

public class MySort {

    private List<Integer> input ;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> sort() {
        int size = input.size() ;
        if(input.size() < 2 ){
            return input ;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1 ; j++) {
                if(input.get(j) > input.get(j+1)){
                    int temp = input.get(j);
                    input.set(j,input.get(j+1));
                    input.set(j+1,temp);
                }
            }
        }

        return input ;
    }

}
