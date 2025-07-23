package strings;

class P17_InsertNewString {
  public static void main(String[] args) {
    String originalString = "Java is a programming language";
    String stringToBeInserted = "powerful";
    int index = 9;

    System.out.println("Original String: " + originalString);
    System.out.println("String to be inserted: " + stringToBeInserted);
    System.out.println("String to be inserted at index: " + index);

    // Insert the String
    System.out.println("Modified String: " + insertString1(originalString, stringToBeInserted, index));
    System.out.println("Modified String: " + insertString2(originalString, stringToBeInserted, index));
  }

  // 1st way: Function to insert string
  public static String insertString1(String originalString, String stringToBeInserted, int index) {
    String newString = "";// new String(); --> not recommended

    for (int i = 0; i < originalString.length(); i++) {
      if (i == index) {
        newString += stringToBeInserted + " ";
      }
      // Insert the original string character
      newString += originalString.charAt(i);
    }

    return newString;
  }

  // 2nd way: Function to insert string
  public static String insertString2(String originalString, String stringToBeInserted, int index) {
    // Create a new string
    String newString = originalString.substring(0, index + 1) + stringToBeInserted + " "
        + originalString.substring(index + 1);

    return newString;
  }
}
