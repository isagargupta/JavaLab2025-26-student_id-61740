import java.util.logging.Logger;
import java.io.StringWriter;
import java.io.PrintWriter;

class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    
    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    
    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Task5_LoggingExceptions {
    
    // Declares both exceptions but throws only the first one
    public static void methodOne() throws MyException1, MyException2 {
        throw new MyException1();
    }
    
    // Declares and throws the second exception
    public static void methodTwo() throws MyException2 {
        throw new MyException2();
    }
    
    public static void main(String[] args) {
        // First try block for methodOne
        try {
            methodOne();
        } catch (Exception e) {
            System.out.println("Caught exception from methodOne: " + e.getClass().getSimpleName());
        }
        
        // Second try block for methodTwo
        try {
            methodTwo();
        } catch (Exception e) {
            System.out.println("Caught exception from methodTwo: " + e.getClass().getSimpleName());
        }
    }
}

