package _01_practicePrograms;
// Given any input string, return its complete reversal (every character in reverse order).
// Input: "This is a Test."
// Output: ".tseT a si sihT"

class FullStringReverse {
    public static void main(String[] args) {
        String str = "This is a Test.";
        System.out.println(reverse(str));
    }

    static String reverse(String str) {
        char[] chars = str.toCharArray();

        int left = 0, right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
}