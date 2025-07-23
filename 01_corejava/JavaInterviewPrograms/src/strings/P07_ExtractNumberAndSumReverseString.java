package strings;

public class P07_ExtractNumberAndSumReverseString {
  public static void main(String[] args) {
    String str = "I have2apples and35bananas,but10oranges5";
    int sum = 0; // Variable to store sum

    System.out.println("1st way: Extracted numbers:");
    // Use regex to extract numbers
    String[] numbers = str.split("\\D+"); // Split by non-digit characters

    for (String num : numbers) {
      if (!num.isEmpty()) { // Avoid empty strings
        sum += Integer.parseInt(num);
        System.out.println(num);
      }
    }
    System.out.println("SUM=" + sum);
    sum = 0;

    System.out.println("2nd way: Extracted numbers:");
    String number = "";
    String res = "";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // If the character is a digit, add it to the number string
      if (Character.isDigit(ch)) {
        number += ch;
        res += " ";
      } else {
        res += ch;
        // If a number was being formed, print it and reset the variable
        if (!number.isEmpty()) {
          sum += Integer.parseInt(number);
          System.out.println(number);
          number = ""; // Reset the number string
        }
      }
    }

    // Print the last number if the str ends with a digit
    if (!number.isEmpty()) {
      sum += Integer.parseInt(number);
      System.out.println(number);
    }
    System.out.println("SUM=" + sum);
    System.out.println("String=" + res);

    // Reverse the string
    String reversedString = "";
    for (int i = res.length() - 1; i >= 0; i--) {
      if (!Character.isDigit(res.charAt(i)))
        reversedString += res.charAt(i);
    }

    System.out.println("Reversed string: " + reversedString);
  }
}