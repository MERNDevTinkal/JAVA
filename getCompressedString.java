public class Solution {

    public static String getCompressedString(String str) {
        StringBuilder compressed = new StringBuilder();

        // Loop through each character in the input string
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            int count = 1;

            // Count the consecutive occurrences of the current character
            while (i + 1 < str.length() && str.charAt(i + 1) == c) {
                count++;
                i++;
            }

            // Append the current character and its count to the compressed string if the count is greater than 1
            if (count > 1) {
                compressed.append(c);
                compressed.append(count);
            } else {
                compressed.append(c);
            }

            i++;
        }

        // Return the compressed string
        return compressed.toString();
    }

}
