package _01_practicePrograms;
// Determine whether a given string reads the same forwards and backwards.
// Examples:
// •	"madam" → Palindrome
// •	"monday" → Not a Palindrome

class PalindromeCheck {
    public static void main(String[] args) {
        String[] strings = {"madam", "monday"};

        for (String str : strings) {
            System.out.println(str + " is " + (isPalindrome(str) ? "Palindrome" : "not a Palindrome"));
        }
    }

    static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;

        while(left < right) {
            if(str.charAt(left++) != str.charAt(right--))
                return false;
        }
        return true;
    }
}