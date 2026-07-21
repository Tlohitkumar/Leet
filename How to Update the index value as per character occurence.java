public class learn {
    public static void main(String[] args) {

        String s = "bcabc";
        int[] lastIndex = new int[26];

        // Initialize with -1
        for (int i = 0; i < 26; i++) {
            lastIndex[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            System.out.println("Before: " + ch + " -> " + lastIndex[ch - 'a']);

            lastIndex[ch - 'a'] = i;

            System.out.println("After : " + ch + " -> " + lastIndex[ch - 'a']);
            System.out.println();
        }
    }
}