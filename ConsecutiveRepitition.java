package Practice;

public class RemoveConsecutiveRepetition {
    public static String removeConsecutiveRepetition(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Convert the string to lowercase to handle case-insensitive repetition removal
        str = str.toLowerCase();

        // Check if the first character is the same as the second one
        if (str.charAt(0) == str.charAt(1)) {
            int i = 1;
            while (i < str.length() && str.charAt(0) == str.charAt(i)) {
                i++;
            }
            return removeConsecutiveRepetition(str.substring(i));
        } else {
            return str.charAt(0) + removeConsecutiveRepetition(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "NnnikkhillL";
        String result = removeConsecutiveRepetition(str);
        System.out.println(result);
    }
}
