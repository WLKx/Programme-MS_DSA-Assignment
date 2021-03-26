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
public class FilterCourse<T extends Comparable<T>> implements FilterCourseInterface<T>{
    
    private T[] courseList;
    private int length;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public FilterCourse() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public FilterCourse(int initial) {
        length=0;
        courseList = (T[]) new Comparable[initial];
    }
    
    private void doubleArray(){
      T[] oldArray = courseList;
      courseList = (T[]) new Object[2*oldArray.length];
      for (int i = 0; i < length; i++) {
          courseList[i] = oldArray[i];
      }
    }
    
    @Override
    public void add(T newEntry) {
        if (length == courseList.length)
              doubleArray();
        courseList[length] = newEntry;
        length++;
    }

    @Override
    public boolean isEmpty() {
        if(length == 0){
            return true;
        }
        else
            return false;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public void display() {
        System.out.printf("------------Course List------------\n");
        for (int index = 0; index < length; ++index) {
            System.out.printf("Course #%d\n%-50s\n", index + 1, courseList[index]);
        }
    }

    @Override
    public String toString() {
        String outputStr = "";
        for (int index = 0; index < length; ++index) {
            outputStr += courseList[index] + "\n";
        }
        return outputStr;
    }

    @Override
    public void clear() {
        length=0;
    }
}
    
    
    

