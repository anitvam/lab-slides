package it.unibo.oop.lab07.exercise05;

/**
 * 
 * Represent the dual of an Iterator: accept elements in the same sequence as
 * configured on its Acceptable.
 * 
 * @author Andrea Santi
 * @author Matteo Casadei
 *
 * @param <T>
 */
public interface Acceptor<T> {

    /**
     * Accept a new element. In case the element is not part of the set
     * sequence, returns a
     * {@link it.unibo.oop.lab07.exercise05.Acceptor.ElementNotAcceptedException}
     * .
     * 
     * @param newElement
     *            the next element to be accepted
     * @throws ElementNotAcceptedException
     *             if the element is out of the scheduled sequence
     */
    void accept(T newElement) throws ElementNotAcceptedException;

    /**
     * Terminate to input new elements. If more elements have still to be
     * inserted, throws an
     * {@link it.unibo.oop.lab07.exercise05.Acceptor.EndNotAcceptedException}.
     * 
     * @throws EndNotAcceptedException
     *             if more elements still need to be accepted
     */
    void end() throws EndNotAcceptedException;

    /**
     * Represents an exception occurring when trying to make the acceptor accept
     * a wrong (out-of-sequence) element.
     * 
     * @author Matteo Casadei
     *
     */
    public static class ElementNotAcceptedException extends Exception {

        private final Object element;

        /**
         * 
         * @param element
         *            the element that cause the exception to be raised
         */
        public ElementNotAcceptedException(final Object element) {
            super();
            this.element = element;
        }

        /**
         * 
         * @return the elements that caused this exception to be raised
         */
        public Object getElement() {
            return element;
        }

    }

    /**
     * Occurring when trying to terminate accepting new elements, but still
     * other elements have to accepted.
     * 
     * @author Matteo Casadei
     *
     */
    public static class EndNotAcceptedException extends Exception {
    }

}
