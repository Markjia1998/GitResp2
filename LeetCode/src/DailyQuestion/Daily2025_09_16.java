package DailyQuestion;

import java.util.ArrayList;
import java.util.List;

public class Daily2025_09_16 {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            while (!res.isEmpty()){
                int num1 = res.get(res.size()-1);
                int gongyin = process_2025_09_16(num1, num);
                if(gongyin > 1){
                    num = num / gongyin * num1;
                    res.remove(res.size()-1);
                } else {
                    break;
                }
            }
            res.add(num);
        }
        return res;
    }

    public  int process_2025_09_16(int a, int b){
        return b == 0 ? a : process_2025_09_16(b, a % b);
    }
}
