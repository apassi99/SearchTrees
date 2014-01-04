package ListStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This is the list interface.
 * @author Arjun Passi
 *
 */
public interface List<T extends Comparable<? super T>> extends Iterable<T> {
	// ----------------------------------------------------------
    /**
     * This method return the size of the list.
     * @return size of the list.
     */
    public int size();
    
    // ----------------------------------------------------------
    /**
	 * Method to insert a desired data element given
	 * an index.
	 * 
	 * Throws an IndexOutOfBoundsException if the
	 * provided index is out of range.
	 * 
	 * Throws an IllegalArgumentExcpetion if a null
	 * data element is being added to the list.
	 * 
	 * @param index : location the data element will be inserted
	 * @param data : data element to be inserted.
	 * @throws IndexOutOfBoundsException
	 * @throws IllegalArgumentException
	 */
    public void insert(int index, T data) throws IndexOutOfBoundsException, IllegalArgumentException;
    
    // ----------------------------------------------------------
    /**
     * Method to insert a desired data element in
     * front of the list.
     * 
     * Throws an IllegalArgumentException if a null
     * data element is being added to the list.
     * 
     * @param data : data element to be inserted.
     * @throws IllegalArgumentException
     */
    public void insertFront(T data) throws IllegalArgumentException;
    
    // ----------------------------------------------------------
    /**
     * Method to insert a desired data element at
     * the end of the list.
     * 
     * Throws an IllegalArgumentException if a null
     * data element is being added to the list.
     * 
     * @param data
     * @throws IllegalArgumentException
     */
    public void insertLast(T data) throws IllegalArgumentException;
    
    // ----------------------------------------------------------
    /**
	 * Method to remove the element provided an index.
	 * 
	 * Throws an IndexOutOfBoundsException if the
	 * provided index is out of range.
	 * 
	 * @param index : location of the data element to be removed.
	 * @return data element that was removed from the list.
	 * @throws IndexOutOfBoundsException
	 */
    public T delete(int index) throws IndexOutOfBoundsException;
    
    // ----------------------------------------------------------
    /**
     * Method to delete the provided data element from
     * the list.
     * 
     * Throws an IllegalStateException if the list is
     * empty and deletion is called.
     * 
     * Throws a NoSuchElementException if the data element
     * desired to be deleted is not present in the list.
     * 
     * @param data : data element to be deleted.
     * @return : data element that got deleted.
     * @throws IllegalStateException
     * @throws NoSuchElementException
     */
    public T delete(T data) throws IllegalStateException, NoSuchElementException;
    
    // ----------------------------------------------------------
    /**
     * Method to delete the first data element in the list.
     * 
     * Throws an IllegalStateException if the list is
     * empty.
     * 
     * @return : data element that got deleted.
     * @throws IllegalStateException
     */
    public T deleteFirst() throws IllegalStateException;
    
    // ----------------------------------------------------------  
    /**
     * Method to delete the last data element in the list.
     * 
     * Throws an IllegalStateException if the list is empty.
     * 
     * @return : data element that got removed.
     * @throws IllegalStateException
     */
    public T deleteLast() throws IllegalStateException;
    
    // ----------------------------------------------------------
    /**
	 * Method to retrieve the element at the desired
	 * index.
	 * 
	 * Throws an IndexOutOfBounds exception if the 
	 * provided index is out of range.
	 * 
	 * Throws an IllegalStateException if the list
	 * is empty.
	 * 
	 * @param index : location from where the data element
	 * 				  retrieved.
	 * @return the data element provided the index.
	 * @throws IndexOutOfBoundsException
	 * @throws IllegalStateException
	 */
    public T get(int index) throws IndexOutOfBoundsException, IllegalStateException;
    
    // ----------------------------------------------------------
    /**
     * Method to retrieve the first element in the list.
     * 
     * Throws an IllegalStateException if the list
     * is empty.
     * 
     * @return last data element in the list.
     * @throws IllegalStateException
     */
    public T getFirst() throws IllegalStateException;
    
    // ----------------------------------------------------------
    /**
     * Method to retrieve the last element in the list.
     * 
     * Throws an IllegalStateException if the list
     * is empty.
     * 
     * @return last data element in the list.
     * @throws IllegalStateException
     */
    public T getLast() throws IllegalStateException;
    
    // ----------------------------------------------------------
    /**
     * This method sorts the list in ascending order. 
     */
    public void sort();
    
    // ----------------------------------------------------------
    /**
     * This method reverses the lists.
     */
    public void reverse();
    
    // ----------------------------------------------------------
    /**
     * Method to remove all the elements in the list.
     */
    public void clear();
    
    // ----------------------------------------------------------
    /**
     * Method returns a new Iterator.
     * @return iterator to go through the list.
     */
    public Iterator<T> iterator();
    
    // ----------------------------------------------------------
    /**
     * Method to compare the two list objects.
     * @param object - other list to be compared.
     * @return true if the two lists are equal
     * otherwise false.
     */
    public boolean equals(Object object);
    
    // ----------------------------------------------------------
    /**
     * This method returns a copy of this list.
     * @return copy of this list.
     */
    public List<T> clone();
    
    // ----------------------------------------------------------
    /**
     * This method returns the hash code of the list.
     * @return hash code of the list.
     */
    public int hashCode();
    
    // ----------------------------------------------------------
    /**
     * Method to retrieve the string representation of the
     * list.
     * 
     * @return string representation of the list.
     */
    public String toString();
}
