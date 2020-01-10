/** The question
 * Given a math equation with brackets find out if the eq is valid based on the brackets. We need to look for opening and closing brackets
 * {(5+2)*2} is okay however,
 * {(5+2)*52 isnt
 */
package therap;
import reviewJava.Node;
import reviewJava.stack;
import java.util.*;
/**
 * @author Maruf Monem, BRACU, CS
 * Jan 9, 2020
 */
public class MathEqBrackets extends stack {

	public static Node popSt(Node head) {

		//System.out.println("The element that is popped " + head.element);
		Node poppedNode = head;
		head = head.next;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(null, null);
		String a = "{(5+2)*}({2}"; // equation
		char eq[] = a.toCharArray(); // converting to a character array
		try {
			for(int i =0; i < eq.length;i++) {
				if(eq[i]=='(' || eq[i]=='{'||eq[i]=='[') { //whenever there is a opening bracket we push
					
					if(head.element==null) { //if its the first opening bracket we put it inside the head
						head.element=eq[i];
					}else {
						head = stack.pushSt(head, eq[i]);
					}
					
				}else if(eq[i]==')' || eq[i]=='}'||eq[i]==']') { // whenever there is a closing bracket we pop the last one thus the use of stack
					head = popSt(head);
				}
				}
		}catch(Exception e) {
			System.out.println("Not a perfect equation");
			System.exit(0); // the brackets dont match thus we print error and exit the program
		}
		finally {
			System.out.println("The equation is fine"); // the equation is perfect
		}
		
	}

}
