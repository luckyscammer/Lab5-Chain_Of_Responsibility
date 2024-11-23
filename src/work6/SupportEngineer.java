package work6;

/**
 * Handles medium level requests.
 * Second in the chain of responsibility.
 */
public class SupportEngineer extends AbstractHandler {

    /**
     * Handles the request if level is 2, else passes it to the next handler.
     *
     * @param request The support request to handle.
     */
    @Override
    public void handle(IRequest request) {
        if (request.getLevel() == 2) {
            System.out.println("SupportEngineer handles request of level " + request.getLevel());
        } else {
            System.out.println("SupportEngineer passes request of level " + request.getLevel());
            if (next != null) {
                next.handle(request);
            }
        }
    }
}
