import work6.*;

/**
 * Demonstrates the Chain of Responsibility pattern.
 */
public class Main {
    /**
     * The main method to run the demonstration.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        IHandler operator = new SupportOperator();
        IHandler engineer = new SupportEngineer();
        IHandler seniorEngineer = new SeniorSupportEngineer();

        operator.setNext(engineer);
        engineer.setNext(seniorEngineer);

        IRequest requestLevel1 = new SupportRequest(1);
        IRequest requestLevel2 = new SupportRequest(2);
        IRequest requestLevel3 = new SupportRequest(3);
        IRequest requestLevel4 = new SupportRequest(4);

        operator.handle(requestLevel1);
        operator.handle(requestLevel2);
        operator.handle(requestLevel3);
        operator.handle(requestLevel4);
    }
}

