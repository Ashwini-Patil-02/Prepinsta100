public class power {
    public static void main(String[] args) {
        double base = 3;
         int expo = 2;
         double res = 1.0;

         while(expo !=0){
            res*= base;
            expo--;
         }
            System.out.println("result = " + res);
    }
    
}
