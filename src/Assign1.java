public class Assign1 {
    public static void printHelpMessage(){
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        if(args.length == 0 || args.length % 2 != 0) {
            printHelpMessage();
            return;
        }
        for(int i = 0; i < args.length; i += 2){
            switch(args[i]){
                case "-fib":
                    int number = Integer.parseInt(args[i + 1]);
                    if(number < 0 || number > 40){
                        System.out.println("Fibonacci valid range is [0, 40]");
                    }
                    else {
                        System.out.println("Fibonacci of " + number + " is " + fibonacci(number));
                    }
                    break;
                default:
                    System.out.println("Unknown command line argument: " + args[i]);
            }
        }
    }
}