
public class WorkerSalary {
	 public static void main(String[] args) {
	        // Creating instances of DailyWorker and SalariedWorker
	        Worker dailyWorker = new DailyWorker("John", 500);
	        Worker salariedWorker = new SalariedWorker("Alice", 1000);

	        // Calculating and displaying weekly pay
	        System.out.println("Daily Worker's Weekly Pay (40 hours): " + dailyWorker.computePay(40));
	        System.out.println("Salaried Worker's Weekly Pay (50 hours): " + salariedWorker.computePay(50));
	    }

}
