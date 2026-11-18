
class NestedTryDemo {
    public static void main(String[] args) {

        try {
            int a = 10;

            // Inner try-catch
            try {
                int b = 0;
                int result = a / b;
            }
            catch (ArithmeticException e) {
                System.out.println(
                    "Inner catch: Division by zero"
                );
            }

            // Outer try
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Outer catch: Invalid array index"
            );
        }

        System.out.println("Program continues...");
    }
}
