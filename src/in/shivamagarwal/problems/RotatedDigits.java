package in.shivamagarwal.problems;

public class RotatedDigits {

    private int rotatedDigits(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(isValid(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int i) {
        boolean isValid = false;
        while(i > 0) {
            switch (i % 10) {
                case 2:
                case 5:
                case 6:
                case 9:
                    isValid = true;
                    break;
                case 3:
                case 4:
                case 7:
                    return false;
            }
            i = i/10;
        }
        return isValid;
    }
}
