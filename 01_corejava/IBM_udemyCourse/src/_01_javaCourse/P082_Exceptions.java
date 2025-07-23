package _01_javaCourse;

public class P082_Exceptions {
    public static void main(String[] args) {
        int i;
        int j=i=0;
        
        try {
            j=18/i;
        } catch (Exception e) {
            System.out.println("i should not be 0 :: " + e);
        }

        System.out.println("end");
    }
}
 