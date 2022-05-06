package puzzle.state;

/**
 * Represents a 2D position.
 */
public record Position(int row, int col) {

    /**
     * {@return the position whose vertical and horizontal distances from this
     * position are equal to the coordinate changes of the direction given}
     *
     * @param direction a direction that specifies a change in the coordinates
     */
    public Position getPositionAt(Direction direction) {
        return new Position(row + direction.getRowChange(), col + direction.getColChange());
    }

    public Position getUp() {
        return getPositionAt(Direction.UP);
    }

    public Position getRight() {
        return getPositionAt(Direction.RIGHT);
    }

    public Position getDown() {
        return getPositionAt(Direction.DOWN);
    }

    public Position getLeft() {
        return getPositionAt(Direction.LEFT);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, col);
    }

}
