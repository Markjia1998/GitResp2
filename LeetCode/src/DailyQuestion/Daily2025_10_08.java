package src.DailyQuestion;

import java.util.Arrays;

public class Daily2025_10_08 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            double target = success/spells[i];
            int mid = 0;
            while (!(potions[mid] > target) && mid <= spells.length - 1) {
                mid ++;
            }
            spells[i] = potions.length - mid - 1;
        }
        return spells;
    }
}
