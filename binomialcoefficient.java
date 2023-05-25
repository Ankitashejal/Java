public class binomialcoefficient {
    
    public static int binCoeff(int n ,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff=fact_n/(fact_r*fact_nmr);
    
    }
    private static int factorial(int n) {
        return 0;
    }
    public static void main(String args[]) {
        System.out.println(binCoeff(3,5));

    }
}

    
       
    

