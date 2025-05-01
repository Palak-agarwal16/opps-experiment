
abstract class person {
	// Abstract superclass
	    String name;

	    public person(String name) {
	        this.name = name;
	    }

	    abstract void performDuty();
	}

	// Subclass for Student
	class Student extends person {
	    public Student(String name) {
	        super(name);
	    }

	    @Override
	    void performDuty() {
	        System.out.println(name + " is studying.");
	    }
	}

	// Subclass for Teacher
	class Teacher extends person {
	    public Teacher(String name) {
	        super(name);
	    }

	    @Override
	    void performDuty() {
	        System.out.println(name + " is teaching.");
	    }
	}


