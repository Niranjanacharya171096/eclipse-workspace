/**
 * 
 */
package com.company;

/**
 * @author Niranjan
 *
 */
public class CWH_35_practice_set_on_methods {
	static int f1=0,f2=1,f3=0;
	
	static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    
    static void multiplication_rec(int n, int i)  
    {  
        // Base Case  
        if (i > 10)  
            return ;  
      
        // Print the table for current iteration  
        System.out.println(n + " * " + i + " = " + n * i);  
                 
        // Recursive call to next iteration  
        multiplication_rec(n, i + 1);  
    }  

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
    	for (int i= n-1; i>=0 ; i--){
		    for (int j=0; j<=i; j++){
		    	System.out.print("* ");
		    }
		    System.out.println();
	    }
    }
    
    static void pattern2_rec(int n, int i) {
    	// base condition 
        if (n < 1) 
            return; 
          
        // to print the stars of  
        // a particular row 
        if (i <= n) 
        { 
            System.out.print ( "* "); 
              
            // recursively print rest   
            // of the stars of the row 
            pattern2_rec(n, i + 1); 
        }  
          
        else
        { 
            // change line 
            System.out.println( ); 
              
            // print stars of the  
            // remaining rows recursively 
            pattern2_rec(n - 1, 1); 
        } 
    }
    
    static void fib(int n) {
    	int f1 = 0, f2 = 1, sum = 0;
	    for (int i = 1; i <= n; ++i)
	    {
	        System.out.print(f1 + " ");
	        sum = sum + f1;
	        
	        if(i == n) {
	        	System.out.println("\nsum: " + sum);
	    	    System.out.println("last term is: " + f1);
	    	   // break;
	        }
	        	
	        int f3 = f1 + f2;
	        f1 = f2;
	        f2 = f3;
	        //if(i == n-1)
	        	//System.out.print(n + "th/next term is: " + f1);
	    }
	    System.out.println(n+ "th term is: " + f1);
    }
    
    static void fib_series_rec(int n) {
    	//int f1=0,f2=1,f3=0;
	    if(n>0){    
	        f3 = f1 + f2;    
	        f1 = f2;    
	        f2 = f3;    
	        System.out.print(" "+f3);   
	        fib_series_rec(n-1);    
	    }
    }
    
	static int fib_nthterm_rec(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n <= 1)
            return n;
        return fib_nthterm_rec(n - 1) + fib_nthterm_rec(n - 2); 
    }

	static void sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; ++i)  
		{  
		//adding the value of i into sum variable  
			sum = sum + i;  
		}  
		//prints the sum   
		System.out.println("Sum of First 10 Natural Numbers is = " + sum); 
    }
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static float Average(int[] a, int n) {
    	int sum = 0;
    	for(int ele : a)
    		sum += ele;
    	return (float)sum/n;
    }
    
    static float sum = 0;
    static float Average_rec(int[] a, int n) {
    		if (n <= 0)
                return 0;
//    		else {
//    			System.out.println(a[n - 1]);
//    			sum = a[n - 1] + Average_rec(a, n - 1);
//    			System.out.println("sum = "+ sum);
//    		}	
    		return (float)(a[n - 1] + Average_rec(a, n - 1));
    }
    
    static float Cel_To_Fah(float n)
    {
        return ((n * 9.0f / 5.0f) + 32.0f);
    }
    
    public static void main(String[] args) {
    	// Problem 1
        multiplication(7);
        multiplication_rec(7, 1);
        
        System.out.println();
        // Problem 2
        pattern1(5);
        pattern1_rec(5);
        
        System.out.println();
        // Problem 3
        pattern2(5);
        pattern2_rec(5, 1);
        
        System.out.println();
        // Problem 4
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        fib(4);
        System.out.print(f1 + " " + f2);
        fib_series_rec(4-2);
        System.out.println();
        int result = fib_nthterm_rec(4);
        System.out.println("4th term is: "+result);

        System.out.println();
        // Problem 5
        sum(4);
        int c = sumRec(4);
        System.out.println(c);
        
        // Problem 6
        int[] arr = {2, 5, 9};
        int n = arr.length;
        float avg1 = Average(arr, n);
        float avg2 = Average_rec(arr, n)/n;
        System.out.println(avg1 + " " + avg2);
        
        // Problem 7
        float m = 20.0f;
        System.out.println(Cel_To_Fah(m));
    }
}
