package in.shivamagarwal.May2020LeetCodingChallenge;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        if(isBadVersion(1)) {
            return 1;
        }
        long low = 1;
        long top = n;
        int middle = (int) ((low + top) / 2);
        while(low <= top) {
            if(isBadVersion(middle) && !isBadVersion(middle-1)) {
                return middle;
            } else if(!isBadVersion(middle) && !isBadVersion(middle-1)) {
                low = middle + 1;
                middle = (int) ((low + top) / 2);
            } else {
                top = middle - 1;
                middle = (int) ((low + top) / 2);
            }
        }
        return middle;
    }

    public boolean isBadVersion(int version) {
        if(version < 4) {
            return false;
        } else {
            return true;
        }
    }
}