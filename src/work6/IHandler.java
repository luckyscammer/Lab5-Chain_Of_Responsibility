package work6;

/**
 * Interface for handling support requests.
 * Part of the Chain of Responsibility pattern.
 */
public interface IHandler {
    /**
     * Sets the next handler in the chain.
     *
     * @param handler The next handler.
     */
    void setNext(IHandler handler);

    /**
     * Handles the request or passes it to the next handler.
     *
     * @param request The support request to handle.
     */
    void handle(IRequest request);
}
