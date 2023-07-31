
public class Process implements Priority,Comparable<Process>{

	private String processID;
	private int priority;
	
	public Process(String processID) {
		setProcessID(processID);
		setPriority(priority);
		
	}
	
	public String getProcessID() {
		return processID;
	}
	public void setProcessID(String processID){
		this.processID = processID;
	}
	public int getPriority() {
		return priority;
	}
	@Override
	public void setPriority(int priority) {
		this.priority = priority;		
	}	
	
	@Override
	public int compareTo(Process o) {
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
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}

}
