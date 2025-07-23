package strings;

class ExchangeMonthAndDate {
  public static void main(String[] args) {
    String str = "12/05/2025";
    String[] word = str.split("/");
    System.out.println(word[1] + "/" + word[0] + "/" + word[2]);
  }
}