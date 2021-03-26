/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adt;

/**
 *
 * @author wong-
 */
public interface FilterCourseInterface<T extends Comparable<T>> {
    public void add(T newEntry);
    public void display();
    public boolean isEmpty();
    public void clear();
    public int getSize();
}
