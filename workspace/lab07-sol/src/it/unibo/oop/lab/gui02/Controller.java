package it.unibo.oop.lab.gui02;

import java.util.List;

/**
 * 
 */
public interface Controller {

    /*
     * This interface must model a simple controller responsible of I/O access.
     * It considers only the standard output, and it is able to print on it.
     * 
     * Write the interface and implement it in a class class in such a way that
     * it includes:
     * 
     * 1) A method for setting the next string to print
     * 
     * 2) A method for getting the next string to print
     * 
     * 3) A method for getting the history of the printed strings (in form of a
     * List of Strings)
     * 
     * 4) A method that prints the current string.
     * 
     */

    /**
     * 
     * @param nextString next string to print
     */
    void setNextStringToPrint(String nextString);

    /**
     * 
     * @return next string to print
     */
    String getNextStringToPrint();

    /**
     * 
     * @return history of printed strings as a list
     */
    List<String> getPrintedStringsHistory();

    /**
     * 
     */
    void printCurrentString();
}
