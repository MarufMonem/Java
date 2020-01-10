package therap;
// Make a car class where there are different type of cars having different attributes. Sports cars fast have 4 doors, hyper cars have 2 doors and are fast however
// however we have utility cars that dont have sporty suspentions however have 4WD and 4 doors.
/**
 * @author Maruf Monem
 *
 */
public class car {
	int door;
	boolean sportSuspention;
	boolean fWD;
	
	car(int door, boolean sportsSuspention,boolean fwd){
		this.door = door;
		this.sportSuspention=sportsSuspention;
		this.fWD=fwd;
	}
	
	public void print(){
		System.out.println("Doors: " + door);
		System.out.println("sport Suspention: " + sportSuspention);
		System.out.println("fWD: " + fWD);
	}
	
	public static void main(String args[]) {
		car hyper = new car(2,true,false);
		hyper.print();
	}
}
