public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "fly moon to  me  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) { // Start from the end of the string and iterate backwards to stop earlier 
            if (s.charAt(i) == ' ' && length > 0) {
                return length;
            } 
            else if (s.charAt(i) != ' ') {
                length++;
            }
        }
        return length;
    }
}
