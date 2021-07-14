import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseDigitInPairs {


    static int reverseDigitsInPairs(int n){
//        int reverse = 0;
//        while (n > 0) {
//            int d = n % 10;
//            int e = reverse * 10;
//            reverse = e + d;
//            n = n / 10;
//        }

      char [] c  = String.valueOf(n).toCharArray();


        return 0;

    }

//    static boolean arrayShift(int[] elements) {
//     List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2= new ArrayList<>();
//
//        Collections.sort(list1);
//        Collections.sort(list2, Collections.reverseOrder());
//        if(list1.size() != list2.size())
//            return false;
//
//        int aPointer = 0;
//        int bPointer = 0;
//
//
//        boolean isFirstTimeWalk = true;
//
//
//        while(aPointer < list1.size()){
//
//
//            if(list1.get(aPointer)== list2.get(bPointer){
//                aPointer++;
//                if(bPointer < list2.size()-1){
//                    bPointer++;}
//                else{
//                    isFirstTimeWalk = false;
//                    bPointer = 0;
//                }
//            }else if(isFirstTimeWalk && bPointer < list2.size()-1){
//
//                bPointer++;
//            }else {
//                return false;
//            }
//        }
//        return true;
//
//    }

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
