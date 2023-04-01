package DSA.Week1;

import DSA.Week1.LinkedList.LinkedList;
import DSA.Week1.Recursion.Fibonacci;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application {

	public static void main(String[] args) {
		var ioc = SpringApplication.run(Week1Application.class, args);

		LinkedList linkedList = ioc.getBean(LinkedList.class);
//		linkedList.insertFirst(1);
//		linkedList.insertFirst(2);
//		linkedList.insertFirst(3);
//		linkedList.insertLast(100);
//		linkedList.display();
//		linkedList.deleteByPosition(1);
//		linkedList.display();
//		linkedList.insertAtPosition(1,2);
//		linkedList.insertAtPosition(3,2);
//		linkedList.display();
//		linkedList.removeDuplicatesWithOneLoop();
//		linkedList.display();
//		linkedList.reverse();
//		linkedList.display();

		linkedList.convertArrayToLinkedList(new int[]{1,2,3,4,5});
		linkedList.display();
		linkedList.insertAfterX(3,10);
		linkedList.display();
//		Fibonacci fibonacci = ioc.getBean(Fibonacci.class);
//		fibonacci.run(1,1,10);
	}

}
