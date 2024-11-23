package work6;

/**
 * Handles complex level requests.
 * Last in the chain of responsibility.
 */
public class SeniorSupportEngineer extends AbstractHandler {
    /**
     * Handles the request if level is 3, else indicates it cannot handle.
     *
     * @param request The support request to handle.
     */
    @Override
    public void handle(IRequest request) {
        if (request.getLevel() == 3) {
            System.out.println("SeniorSupportEngineer handles request of level " + request.getLevel());
        } else {
            System.out.println("SeniorSupportEngineer cannot handle request of level " + request.getLevel());
        }
    }
}
