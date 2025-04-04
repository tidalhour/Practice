// This deserves to be here (even if it's schoolwork over personal practice) since I coded this RAW. No ChatGPT, only Google (only used ChatGPT for the final moments during debugging). 
// I need to practice my objects and classes more, I really struggled with it but I think I'm getting the hang of it.
public class PrintQueueSimulator {

	public static void main(String[] args) {
		System.out.println("Print Jobs \n");
		
		PrintJob firstDoc = new PrintJob();
		firstDoc.setJobId(001);
		firstDoc.setDocumentName("Beginners in Java.pdf");
		firstDoc.setPages(200);
		
		PrintJob secDoc = new PrintJob();
		secDoc.setJobId(002);
		secDoc.setDocumentName("Python for Dummies.docx");
		secDoc.setPages(350);
		
		PrintJob thirdDoc = new PrintJob();
		thirdDoc.setJobId(003);
		thirdDoc.setDocumentName("Basics in SQL.pdf");
		thirdDoc.setPages(430);
		
		PrintQueue i = new PrintQueue();
		
		System.out.println("Add the first document: ");
		i.addJob(firstDoc);
		i.displayAllJobs();
		
		System.out.println();
		
		System.out.println("Add the second document: ");
		i.addJob(secDoc);
		
		System.out.println();
		
		System.out.println("Current queue: ");
		i.displayAllJobs();
		
		System.out.println();
		
		System.out.println("Printing out first document: ");
		i.processJob();
		
		System.out.println();
		
		i.peekNextJob();
		
		System.out.println();
		
		System.out.println("Add the third document: ");
		i.addJob(thirdDoc);
		
		System.out.println();
		
		i.displayAllJobs();
		
	}

}
// Need to practice constructors and getters / setters. I really struggled with that one.
class PrintJob {
    private int jobId;
    private String documentName;
    private int pages;

    public int getJobId() {
        return jobId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getPages() {
        return pages;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName; 
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
// Debugs by ChatGPT because I ran out of time. Either way I do understand the logic so its totally okay.
import java.util.*;
public class PrintQueue {
	private Queue<PrintJob> queue = new LinkedList<>();
	
	public void addJob(PrintJob job) {
		queue.add(job);
		System.out.println("The file " + job.getDocumentName() + " has been added.");
	}
	
	public PrintJob processJob() {		
		PrintJob job = queue.remove();
		System.out.println("The file " + job.getDocumentName() + " has been printed.");
		return job;
	}
	
	public PrintJob peekNextJob() {
    PrintJob job = queue.peek();
    if (job != null) {
        System.out.println("Next to print: " + job.getDocumentName());
    } else {
        System.out.println("No jobs in queue.");
    }
    return job;
}

	
	public void displayAllJobs() {
    if (queue.isEmpty()) {
        System.out.println("There are no more print jobs.");
    } else {
        System.out.println("Current Print Queue:");
        for (PrintJob job : queue) {
            System.out.println("ID: " + job.getJobId() + ", Document: " + job.getDocumentName() + ", Pages: " + job.getPages());
        }
    }
}
}



