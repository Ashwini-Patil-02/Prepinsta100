//Write a program to check if a given number is prime or not in java
public class Prime {
    
    public static void main(String[] args) {
        
        int  n = 23;
        
        checkPrime(n);
 
        }
        private static void checkPrime(int n)
        {
            int count = 0;
        
        if(n<2)
        {
            System.out.println(" given number" +n+ "is not prime number");
             System.exit(0);
        }
        for(int i = 1; i<= n; i++)
        {
            if(n%i ==0)
            count +=1;

        }
        if(count>2)
        System.out.println ("The given number " + n + " is not prime");
        else
        System.out.println ("The given number " + n + " is prime");
    
    
    }
}
