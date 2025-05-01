
public class Worker {
	    String name;
	    double salaryRate;

	    // Constructor
	    Worker(String name, double salaryRate) {
	        this.name = name;
	        this.salaryRate = salaryRate;
	    }

	    // Method to compute pay (to be overridden in subclasses)
	    double computePay(int hours) {
	        return 0; // Placeholder, overridden in subclasses
	    }
	}

	// Subclass: DailyWorker
	class DailyWorker extends Worker {
	    DailyWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }

	    // Computes pay based on the number of days worked (8 hours per day)
	    @Override
	    double computePay(int hours) {
	        int daysWorked = hours / 8; // Convert hours to days
	        return salaryRate * daysWorked;
	    }
	}

	// Subclass: SalariedWorker
	class SalariedWorker extends Worker {
	    SalariedWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }

	    // Fixed weekly wage for 40 hours per week
	    @Override
	    double computePay(int hours) {
	        return salaryRate * 40;
	    }
	}


