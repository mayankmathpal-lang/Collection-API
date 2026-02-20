import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList ll1 = new LinkedList();
          ll1.add(10);
          ll1.add("Java");
          ll1.add("Bengaluru");
          ll1.add(20);
          System.out.println(ll1);
          ll1.addFirst(44);
          ll1.addLast(54);
          ll1.add(2, "Telusko");
          System.out.println(ll1);
          ll1.offer("Devops");
          System.out.println(ll1);   //Offer will add the element to the rare end but there are chances of not accepting as per the Java Documentation.
          ll1.offer("Junit5");
          System.out.println(ll1);
          ll1.offerFirst("SpringBoot");  //Offer will add the element to the front end but there are chances of not accepting as per the Java Documentation.
          System.out.println(ll1);
          System.out.println(ll1.peek());  //Peek will give the first element from the list
          System.out.println(ll1);
          System.out.println(ll1.poll());     //Poll will also give the first element but it will remove the element from the list.
          System.out.println(ll1);
	}

}
