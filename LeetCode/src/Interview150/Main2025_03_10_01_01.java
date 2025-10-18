package Interview150;

import java.util.Arrays;

public class Main2025_03_10_01_01 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] >= citations.length - i){
                return citations.length - i;
            }
        }
        return  -1;
    }
}
