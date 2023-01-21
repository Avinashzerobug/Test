1)java collection hierarchy 
                                              Iterable
							                     |
								              Collection
								      |--------------|--------------|
					        		List		 Queue             Set
									ArrayList    Deque             Hashset
									LinkedList   ArrayDeque       LinkedHashSet
									Vector                         sortedset
									Stack                           tree set
					
	It is the collection framework and it contained within it with four core interfaces they are collection ,set,map
    and list additionallly.There are two more focused interfaces nameyly the sortedset and sertedMap which is used to
    sorting purpose

2) Map interfaces	HashMap,TreeMap and LinkedHashMap

3) Hashset - Hashset is implemented using Hashtable
             Hashset allows a null object
			 Hash set use equals method to compare two objects
			 
  Treeset - The tree set is implmented using a tree structure
            it does not allow the null object it throws the null pointer exception
			Tree set use compare method for comparing two objects
			
4)  It indicates the implementation of hashCode() is native because there is not any direct method in java to fetch the reference of the object.
    An object hash code value can change in multiple executions of the same application. If two objects are equal according to equals() method,
	then their hash code must be same. If two objects are unequal according to equals() method, their hash code are not required to be different.
			
5) Fail-fast systems abort operations as fast as possible exposing faliures immediately and stop the whole execution part
   Fail-Safe system dont abort an operation in the case of a failure .such system try to avoid raising failures 
   as much as possible
   
   6. * Get the bytes of the String.
   * Create a new ByteArrayInputStream using the bytes of the String.
   * Assign the ByteArrayInputStream object to an InputStream variable.
   * Buffer contains bytes that read from the stream.
   * Print the InputStream.
   
7) An object for traversing and partitioning elements of a source. The source of elements covered by a Spliterator could be, 
   for example, an array, a Collection , an IO channel, or a generator function. A Spliterator may traverse elements individually 
   ( tryAdvance() ) or sequentially in bulk ( forEachRemaining() ).
   
8)  The stream() function converts any Collection into a stream of data
    map() function is used to process the data
    There is also another function, named filter(), where we can include filtering criteria

9) Core (spring-core) is the core of the framework that power features such as Inversion of Control and dependency injection. 
   Beans (spring-beans) provides Beanfactory, which is a sophisticated implementation of the factory pattern.
   
10) dependency injection is a design pattern in which an object or function receives other objects or functions that it depends on. 
    A form of inversion of control, dependency injection aims to separate the concerns of constructing objects and using them, 
	leading to loosely coupled programs.

11) We can use Spring Framework to define our beans and their dependency injection. The @ComponentScan annotation is used to 
    find beans and the corresponding injected with @Autowired annotation. If you followed the Spring Boot typical layout, 
	no need to specify any arguments for @ComponentScan annotation.
	
 

20)
import java.util.*;

  public class Exercise13 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
     // print the list
   System.out.println("The Original linked list: " + l_list);

  // Remove the first element
    Object firstElement = l_list.removeFirst();
    System.out.println("Element removed: "+ firstElement);
 
  // Remove the last element
    Object lastElement = l_list.removeLast();
    System.out.println("Element removed: "+ lastElement);
    System.out.println("The New linked list: " + l_list);
  }
}
   