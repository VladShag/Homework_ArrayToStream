import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,16,-1,-2,0,32,3,5,8,23,4);
        numbers.sort((a, b) -> a > b ? 1 : -1);
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(numbers);
        numbersList.removeIf((a) -> a < 0 || a % 2 != 0);
        System.out.println(numbersList);
    }
}