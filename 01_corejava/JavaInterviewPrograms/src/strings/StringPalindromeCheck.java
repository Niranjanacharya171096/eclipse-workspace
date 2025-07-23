package strings;

class StringPalindromeCheck {
  public static void main(String[] args) {
    String[] strings = { "madam", "monday" };

    for (String str : strings) {
      // 1st way: reverse and check
      reverseAndCheckPalindrome(str);
      // 2nd way: without reversing
      System.out.println(str + " is " + (isPalindrome(str) ? "Palindrome" : "not a Palindrome"));
    }
  }

  static void reverseAndCheckPalindrome(String str) {
    String revStr = "";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      revStr = ch + revStr;
    }
    System.out.println("Reversed String is : " + revStr);

    if (str.equals(revStr))
      System.out.println(str + " is Palindrome");
    else
      System.out.println(str + " is not Palindrome");
  }

  static boolean isPalindrome(String str) {
    int start = 0, end = str.length() - 1;

    while (start < end) {
      if (str.charAt(start++) != str.charAt(end--)) {
// System.out.println(str + " is not Palindrome");
        return false;
      }
//    start++;
//    end--;
    }
// System.out.println(str + " is Palindrome");
    return true;
  }
}
