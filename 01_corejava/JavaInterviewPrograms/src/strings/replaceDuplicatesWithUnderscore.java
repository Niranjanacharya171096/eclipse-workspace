package strings;

//already done in P04
class replaceDuplicatesWithUnderscore {
  public static void main(String[] args) {
    // System.out.println("Try programiz.pro");
    String str = "Nagaraj Hebbar";
    char[] ch = str.toCharArray();
    String res = "";

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (ch[i] == ch[j]) { // N a
          ch[j] = '_';
        }
      }
      res += ch[i];
    }
    System.out.println(res);
  }
}