package _01_javaCourse;

class Aclass2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A show = " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// class Bclass2 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("B show = " + i);
//         }
//     }
// }

public class P093_RunnableVsThread {
    public static void main(String[] args) {
        Runnable a = new Aclass2();
        Runnable b = ()->{ //using Lambda exp as Runnable is Functional Interface
            for(int i=0; i<10; i++) {
                System.out.println("B show = "+i);
            }
        };
        
        Thread t1 = new Thread(a); // mandatory if implented Runnable
        Thread t2 = new Thread(b);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY); //or 10
        //Min-1; Norm-5; Max-10
        long time1 = System.nanoTime();
        t1.start();
        t2.start();

        long time2 = System.nanoTime();
        System.out.println((double)(time2-time1)/1_000_000); 
    }
}