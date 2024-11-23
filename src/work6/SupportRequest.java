package work6;

/**
 * Concrete implementation of IRequest.
 * Represents a support request with a specific complexity level.
 */
public class SupportRequest implements IRequest {
    /**
     * Represents the complexity level of the support request.
     */
    private int level;

    /**
     * Constructs a SupportRequest with the given level.
     *
     * @param level Complexity level of the request.
     */
    public SupportRequest(int level) {
        this.level = level;
    }

    /**
     * Gets the level of the request.
     *
     * @return int representing the complexity level.
     */
    @Override
    public int getLevel() {
        return level;
    }
}
