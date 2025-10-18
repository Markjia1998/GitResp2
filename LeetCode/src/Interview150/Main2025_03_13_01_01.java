package Interview150;

public class Main2025_03_13_01_01 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    if(i != 0 && s.charAt(i - 1) == 'I'){
                        res += 3;
                        break;
                    }
                    res += 5;
                    break;
                case 'X':
                    if(i != 0 && s.charAt(i - 1) == 'I'){
                        res += 8;
                        break;
                    }
                    res += 10;
                    break;
                case 'L':
                    if(i != 0 && s.charAt(i - 1) == 'X'){
                        res += 30;
                        break;
                    }
                    res += 50;
                    break;
                case 'C':
                    res += 100;
                    if(i != 0 && s.charAt(i - 1) == 'X'){
                        res += 80;
                        break;
                    }
                    break;
                case 'D':
                    if(i != 0 && s.charAt(i - 1) == 'C'){
                        res += 300;
                        break;
                    }
                    res += 500;
                    break;
                case 'M':
                    if(i != 0 && s.charAt(i - 1) == 'C'){
                        res += 800;
                        break;
                    }
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}
