
package Saebyul_Yun_Sect302_Assignment3;

//23F Assignment 3 Solution: CourseList.java 

// Insert your solution code into this file as instructed in the information document. Hints have been provided.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you use the appropriate methods for the operations specifically mentioned in the instructions.
// Note that there are code inbetween the print statements (see assignment information).


//This assignment explores the use of Lists, LinkedLists, ListIterators and several more concepts learned in this course.
//The program creates two LinkedLists of Strings. 
//In order to make the code more concise, this program uses the appropriate methods and the LinkedList constructor that takes a Collection argument. 
//The elements in one list are added to the other list through a method (ensure that you use the method taught in class for this). Then the resource is released.
//Thereafter, all the Strings are converted to uppercase. 
//Subsequently, several of the courses were found unsuitable and needed to be deleted from the list. Finally, duplicates were also removed. 

//Make sure that you have detailed JAVADOC in your code using the appropriate JAVADOC style used in this course.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet; 


/**
 *@author Saebyul Yun
 *@version 1.1
 *@since Eclipse 4.27.0
 *@see Assignment03
 */

public class CourseList {

	public static void main(String[] args) {
		System.out.println("Welcome Everyone to My Assignment 3. My Name is Saebyul Yun.");

		// add courses to list1
		String[] courses = {"math", "english", "chemistry", "physics", "history", "geography"};

		// TO DO: YOUR CODE
		Collection<String> list1Coll = Arrays.asList(courses);
		
		//LinkedList constructor that takes a Collection argument
		LinkedList<String> list1 = new LinkedList<String>(list1Coll);

		// add courses2 to list2
		String[] courses2 = {"religion", "arts", "accounting", "math", "programming", "biology"};
		
		// TO DO: YOUR CODE
		Collection<String> list2Coll = Arrays.asList(courses2);
		LinkedList<String> list2 = new LinkedList<String>(list2Coll); 
		
		//Added the elements in list2 to list1
		list1.addAll(list2);
		printList(list1);

		// TO DO: Insert code for method calls in main here for each of the sections below.	   

		System.out.printf("%nDisplaying names of courses in uppercase letters...\n");
		uppercase(list1);
		printList(list1);

		System.out.printf("%nDeleting courses 4 to 6...\n");
		sublist(list1);
		printList(list1);

		System.out.printf("%nHere is the current list of courses...\n");
		printList(list1);
		reverse(list1);
		
		//sort the list alphabetically
		System.out.printf("%nSorted courses in alphabetical order...\n");
		Collections.sort(list1);
		printList(list1);

		System.out.printf("%nRemoving duplicate courses...\n");
		duplicates(list1);	
	} 

	// HINT: MORE TO DO: Insert your methods in this section. You should include: 
	// output List contents
	/**
	 * list that we're trying to print
	 * @param LinkedList<String>list
	 * */
	public static void printList(LinkedList<String>list) {
		System.out.printf("%nThe List is:%n");
		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.printf("%s, ", iter.next());
		}
		
		System.out.printf("%n");
	}

	// locate String objects and convert to uppercase
	/**
	 * convert all the elements to uppercase
	 * @param LinkedList<String>list / list that we want to convert all strings uppercase from
	 * */
	public static void uppercase(LinkedList<String>list) {
		ListIterator<String> iter = list.listIterator();

		while(iter.hasNext()) {
			String str = iter.next().toUpperCase();
			iter.remove();
			iter.add(str);
		}
	}

	// obtain sublist and use clear method to delete sublist items
	/**
	 * sublist of items 4 to 6 from list1 and delete the sublist
	 * @param LinkedList<String>list / list that we want to delete items 4 to 6 from
	 * */
	public static void sublist(LinkedList<String>list) {
		list.subList(4, 7).clear();
	}

	// print the list in reverse order
	/**
	 *  list in reverse order 
	 * @param LinkedList<String>list / list that we want to reverse order from
	 * */
	public static void reverse(LinkedList<String>list) {

		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		System.out.printf("%nReversed List is:%n");
		while(iter.hasPrevious()) {		
			System.out.printf("%s, ", iter.previous());
		}
		System.out.println();
	}
	/**
	 * eliminates all duplicated elements and then print out the final content of the list
	 * @param LinkedList<String>list / list that we want to remove duplicates from
	 * */
	//locate String objects and eliminate duplicates
	public static void duplicates(LinkedList<String>list) {
		
		Set<String> set = new HashSet<>(list);
		
		System.out.printf("%nNon-duplicates are: ");
		for (String srt : set) {
			System.out.printf("%s, ", srt);
		}
		System.out.println();
	}  

}



