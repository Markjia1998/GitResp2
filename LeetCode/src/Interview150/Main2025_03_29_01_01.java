package Interview150;

public class Main2025_03_29_01_01 {
    public boolean isHappy(int n) {
        while(true){
            if(n < 10 && n!=1) return false;
            int temp = 0;
            while(n >= 10){
                int yushu = n%10;
                n = n/10;
                temp += yushu * yushu;
            }
            temp += n*n;
            if(temp == 1){
                return true;
            } else {
                n = temp;
            }
        }
    }
}
