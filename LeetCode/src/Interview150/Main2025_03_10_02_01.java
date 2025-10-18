package Interview150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main2025_03_10_02_01 {
    class RandomizedSet {
        HashSet<Integer> set;
        Random random;

        public RandomizedSet() {
            set = new HashSet<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (set.contains(val)) return false;
            set.add(val);
            return true;
        }

        public boolean remove(int val) {
            if(set.contains(val)) {
                set.remove(val);
                return true;
            }
            return false;
        }

        public int getRandom() {
            int index = random.nextInt(set.size());
            List<Integer> list = new ArrayList<>(set);
            return list.get(index);
        }
    }
}
