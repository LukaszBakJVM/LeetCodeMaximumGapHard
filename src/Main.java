import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public int maximumGap(int[] nums) {
        int sum=0;
        List<Integer> integers = Arrays.stream(nums).boxed().sorted().toList();
        if (integers.size()<2){
            return 0;
        }
        for (int i = integers.size()-1; i >0; i--) {
            if (integers.get(i)-integers.get(i-1)>sum){
                sum=integers.get(i)-integers.get(i-1);
            }

        }
        return sum;
    }
}