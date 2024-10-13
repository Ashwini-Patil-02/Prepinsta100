public class fibonacciNth {
    public static void main(String[] args) {
        int num = 15;
        int a= 0 , b= 1;
        // print 0 to 1st term
        System.out.print(a + " ," + b + " ,");
        int nextTerm;

        // print remaining terms
        for(int i = 2; i<num; i++)
        {
            nextTerm = a+b;
            a = b;
            b= nextTerm;
            System.out.print(nextTerm + " ,");
        }

    }
    
}
