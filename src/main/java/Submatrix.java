import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Submatrix {
    public static boolean[] isSubmatrixFull(int[][] numbers){
        boolean[] result = new boolean[numbers[0].length-2];
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        for(int i = 0; i < numbers[0].length-2; i++) {
            List<Integer> num = new ArrayList<>();
            for (int j = i; j <= i + 2; j++) {
                for (int k = 0; k < 3; k++) {
                    num.add(numbers[k][j]);
                }
            }
            Collections.sort(num);
            if (list.equals(num)) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        //        System.out.println(Arrays.toString(result));
        return result;
    }


    public static void main(String[] args) {

    }
}
