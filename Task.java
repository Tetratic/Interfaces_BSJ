
public class Task implements Priority,Comparable<Task>{
	private String name;
	private int priority;
	private Status status;
	
	public Task(String name) {
		setName(name);
		setPriority(priority);
		setStatus(status);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status s) {
		this.status = s;
	}
	public int getPriority() {
		return priority;
	}
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Task o) {
		int val = 0;
		if (this.getPriority() == o.getPriority()) {
			val=0;
		}
		else if (this.getPriority() < o.getPriority()) {
			val=-1;
		}
		else if (this.getPriority() > o.getPriority()) {
			val=1;
		}
		return val;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
	}
	
	


	
	
}
