import java.util.ArrayList;
import java.util.List;

public class Hoses {

    public static int[] houses(int[] houses){
        List<Integer> housesList = new ArrayList<>();
        int prev = 0;
        int count = 1;
        for (int i = 0; i < houses.length; i++) {
            if(housesList.size() == 0){
                housesList.add(1);
                prev = houses[i];
            }else{
                if(houses[i] == prev - 1 || houses[i] == prev + 1 || housesList.size() == prev -1 || housesList.size() == prev + 1){
                    housesList.add(count);
                }else{
                    housesList.add(1);
                }
                prev = houses[i];
            }
            count++;
        }
        System.out.println(housesList);
        return housesList.stream().mapToInt(i->i).toArray();
    }
}
