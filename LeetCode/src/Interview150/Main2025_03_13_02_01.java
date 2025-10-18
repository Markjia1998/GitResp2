package Interview150;

public class Main2025_03_13_02_01 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] string = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V", "IV", "I"};
        for (int i = 0; i < nums.length; i++) {
            int h = nums[i];
            String s = string[i];
            while(num > h){
                sb.append(s);
                num -= h;
            }
            if(num == 0){
                break;
            }
        }
        return sb.toString();
    }
}
