package in.shivamagarwal.problems;

public class BackSpaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        return getTruncatedString(S).equals(getTruncatedString(T));
    }

    private String getTruncatedString(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '#') {
                if(sb.length() > 1) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb = new StringBuilder();
                }
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
