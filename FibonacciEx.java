public class FibonacciEx {

    private static long fibonacciIterative(long num)
    {
        if (num<=1)
            return num;


        long first=0;
        long second=1;
        long result=0;

        for (long i = 2; i <= num; i++) {
            result=first+second;
            first=second;
            second=result;
        }

        return result;
    }

    private static long fibonacciRecursive(long num)
    {
        if (num<=1)
            return num;

        return fibonacciRecursive(num-1)+fibonacciRecursive(num-2);
    }

    public static void main(String[] args) {
        int num=55;
        long startTime=System.nanoTime();
        System.out.println("Fibonacci (using iterative) for "+num+": "+fibonacciIterative(num));
        long endTime=System.nanoTime();
        System.out.println("Time for iterative: "+(endTime-startTime));
        startTime=System.nanoTime();
        System.out.println("\nFibonacci (using recursive) for "+num+": "+fibonacciRecursive(num));
        endTime=System.nanoTime();
        System.out.println("Time for recursive: "+(endTime-startTime));

    }
}
