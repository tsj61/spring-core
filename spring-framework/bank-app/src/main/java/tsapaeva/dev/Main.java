package tsapaeva.dev;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tsapaeva.dev.listener.OperationsConsoleListener;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("tsapaeva.dev");
        OperationsConsoleListener operationsConsoleListener = annotationConfigApplicationContext.getBean(OperationsConsoleListener.class);
        operationsConsoleListener.start();
    }
}