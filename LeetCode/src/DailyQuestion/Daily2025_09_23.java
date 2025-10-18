package src.DailyQuestion;

public class Daily2025_09_23 {
    public int compareVersion(String version1, String version2) {
        int long1 = version1.length();
        int long2 = version2.length();
        int left1 = 0, left2 = 0, right1 = 0, right2 = 0;
        while (left1 < long1 || left2 < long2) {
            long v1 = 0, v2 = 0;
            while (right1 < long1 && version1.charAt(right1) != '.') right1++;
            while (right2 < long2 && version2.charAt(right2) != '.') right2++;
            if (left1 != long1){
                v1 = Long.parseLong(version1.substring(left1, right1));
                left1 = right1;
                right1++;
            }
            if (left2 != long2){
                v2 = Long.parseLong(version2.substring(left2, right2));
                right2 = right2;
                right2++;
            }
            if (v1 > v2){
                return 1;
            } else if (v1 < v2){
                return -1;
            }
        }
        return 0;
    }
}
