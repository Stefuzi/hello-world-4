package com.company;

// For this challenge, create an abstract class to define items that can be stored in a list.
// The class should contain 2 references to items which will represent the next and previous
// items (in the case of a linked list).
// I.e., if you call your abstract class ListItem, then it would have 2 member variables of
// type ListItem that will hold references to the next/right and previous/left ListItems.
//
// The abstract class will also need to hold a value - try to be as flexible as possible
// when defining the type of this value.
//
// The class will also need methods to move to the next item and back to the previous item,
// and methods to set the next and previous items.
//
// You should also specify a compareTo() method that takes a parameter of the same type as the
// class and returns 0 if the values are equal, greater than zero if the value sorts greater than
// the parameter and less than zero if it sorts less than the parameter.

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    // Constructor
    public ListItem(Object value) {
        this.value = value;
    }

    // Methods

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    // Getter and setters

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
