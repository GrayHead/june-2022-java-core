package lesson5_io.exceptions;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        try {
            foo(10, 0); // ArE
            System.out.println(ints[10]); // AIOOBE
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (ArithmeticException e) {

        } catch (Exception e) {

        } finally {

        }

//        foo(20,0);


        try {
            foo(100, 0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }

    }

    public static void foo(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("you doing some asdqweqsdfadf");
        } else {

            System.out.println(a / b);
        }

    }
}

class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }

}
