package patternprograms;

public class PatternPrograms {
  public static void main(String[] args) {
    System.out.println("\n==== Program-1 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-2 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(9 - j + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-3 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-4 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(9 - i + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-5 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print((char) (65 + j) + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-6 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print((char) (74 - j) + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-7 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print((char) (65 + i) + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-8 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print((char) (74 - i) + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-9 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-10 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-11 ====");
    for (int i = 1; i <= 5; i++) {
      for (int j = i; j < 5; j++) {
        System.out.print("  ");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-12 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" " + " ");
      }
      for (int k = 0; k < (5 - i); k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-13 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (5 - i); j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-14 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (4 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-15 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (5 - i); k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-16 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (4 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * (i + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-17 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (10 - 2 * i); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-18 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (4 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-19 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 10 - 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-20 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (4 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (4 - i); k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-21 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (5 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(" " + " ");
      }
      for (int k = 0; k < 2; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    System.out.println("\n==== Program-22 ====");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 4; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
