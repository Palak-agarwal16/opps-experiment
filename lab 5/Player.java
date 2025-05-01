
public class Player {
	    String name;
	    int age;
	    String position;

	    // Constructor
	    Player(String name, int age, String position) {
	        this.name = name;
	        this.age = age;
	        this.position = position;
	    }

	    // Common method for all players
	    void play() {
	        System.out.println(name + " is playing as a " + position);
	    }

	    void train() {
	        System.out.println(name + " is training.");
	    }
	}

	// Cricket Player subclass
	class Cricket_Player extends Player {
	    Cricket_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    void play() {
	        System.out.println(name + " is playing cricket as a " + position);
	    }
	}

	// Football Player subclass
	class Football_Player extends Player {
	    Football_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    void play() {
	        System.out.println(name + " is playing football as a " + position);
	    }
	}

	// Hockey Player subclass
	class Hockey_Player extends Player {
	    Hockey_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    void play() {
	        System.out.println(name + " is playing hockey as a " + position);
	    }
	}



