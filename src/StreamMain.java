import java.util.Arrays;
import java.util.List;


public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,16,-1,-2,0,32,3,5,8,23,4);
        numbers.stream().filter((a) -> a >= 0).filter((a) -> a % 2 == 0).sorted().forEach(System.out::println);
    }
}
