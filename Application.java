
public class Application {

	public static void main(String[] args) {
		Task t1 = new Task("Task1");
		Task t2 = new Task("Task2");
		System.out.println(t1.toString());
		
		t1.setPriority(2);
		t2.setPriority(5);
		
		System.out.println(t1.compareTo(t2));//return -1
		System.out.println(t1.compareTo(t1));//return 0
		System.out.println(t2.compareTo(t1));//return 1
		
		System.out.println(t1.getName());//return Task1
		t1.setStatus(Status.NOT_STARTED);
		System.out.println(t1.getStatus());//return NOT_STARTED
		System.out.println(t1.getPriority());//return 2
		
		System.out.println("\n\n\n");
		
		Process p1 = new Process("Process1");
		Process p2 = new Process("Process2");
		System.out.println(p1.toString());
		
		p1.setPriority(5);
		p2.setPriority(2);
		
		System.out.println(p1.compareTo(p2));//return 1
		System.out.println(p1.compareTo(p1));//return 0
		System.out.println(p2.compareTo(p1));//return -1
		
		System.out.println(p1.getProcessID());//return Process1
		System.out.println(p1.getPriority());//return 5
	}

}
