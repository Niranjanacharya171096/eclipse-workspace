
public class Test {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print(9-j+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print(9-i+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print((char)(65+j)+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print((char)(74-j)+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print((char)(65+i)+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.print((char)(74-i)+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < i; j++) {
        System.out.print(" "+" ");
      }
      for(int k = 0; k < (10-i); k++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < (10-i); j++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < (9-i); j++) { System.out.print(" "); }
      for(int k = 0; k <= i; k++) { System.out.print("*"+" "); }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < (4-i); j++) {
        System.out.print(" ");
      }
      for(int k = 0; k < (2*i+1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < (4-i); j++) { System.out.print(" "); }
      for(int k = 0; k < 2 * (i + 1); k++) { System.out.print("*"); }
      System.out.println();
    }
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for(int k = 0; k < (10-i); k++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < i; j++) { System.out.print(" "); }
      for(int k = 0; k < (10 - 2*i); k++) { System.out.print("*"); }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < i; j++) { System.out.print(" "); }
      for(int k = 0; k < 10-2*i-1; k++) { System.out.print("*"); }
      System.out.println();
    }
    for(int i =0; i < 10; i++) {
      for(int j = 0; j < (9-i); j++) {
        System.out.print(" ");
      }
      for(int k = 0; k <= i; k++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 9; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for(int k = 0; k < (9- i); k++) {
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) { System.out.print("*"); }
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 3; j++) { System.out.print(" "); }
      for(int k = 0; k < 4; k++) { System.out.print("*"); }
      System.out.println();
    }
    for(int i = 0; i < 8; i++) {
      for(int j = 0; j < (8 - i); j++) { System.out.print(" "); }
      for(int k = 0; k <= i; k++) { System.out.print("*"+" "); }
      System.out.println();
    }
    for(int i = 0; i < 7; i++) {
      for(int j = 0; j < 3; j++) { System.out.print(" "+" "); }
      for(int k = 0; k < 3; k++) { System.out.print("*"+" "); }
      System.out.println();
    }
  }
}
