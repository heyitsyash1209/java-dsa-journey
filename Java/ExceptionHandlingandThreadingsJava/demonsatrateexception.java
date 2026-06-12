package Java.ExceptionHandlingandThreadingsJava;

package Java.ExceptionHandlingandThreadingsJava;

public class demonsatrateexception{
    public class Main {

    // throws keyword (declare exception)
    static void checkNumber(int num) throws Exception {

        // throw keyword (manually throwing exception)
        if (num < 0) {
            throw new Exception("Number cannot be negative");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {

        try {   // try block (risky code)

            checkNumber(-5);

        } catch (Exception e) {   // catch block (handle error)

            System.out.println("Caught Exception: " + e.getMessage());

        } finally {   // finally block (always runs)

            System.out.println("Program finished (finally block runs always)");
        }
    }
}
}
