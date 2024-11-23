package work6;

/**
 * Handles simple level requests.
 * First in the chain of responsibility.
 */
public class SupportOperator extends AbstractHandler {

    /**
     * Handles the request if level is 1, else passes it to the next handler.
     *
     * @param request The support request to handle.
     */
    @Override
    public void handle(IRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("SupportOperator handles request of level " + request.getLevel());
        } else {
            System.out.println("SupportOperator passes request of level " + request.getLevel());
            if (next != null) {
                next.handle(request);
            }
        }
    }
}
