package work6;

/**
 * Abstract handler that implements common functionality.
 * Stores the next handler in the chain.
 */
public abstract class AbstractHandler implements IHandler {
    /**
     * The next handler in the chain.
     */
    protected IHandler next;

    /**
     * Sets the next handler in the chain.
     *
     * @param handler The next handler.
     */
    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }
}
