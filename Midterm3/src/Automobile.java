public class Automobile {

	int yearInput; // declares year
	String makeInput; // declares make
	String modelInput; // declares model
	String colorInput; // declares name
	String nameInput; // declares name
	int gearsInput; // declares gears
	int operatingCycleInput; // declares operating cycle
	int currentSpeed; // declares currentSpeed of the automobile
	int currentGear; // declares currentGear of the automobile
	int distanceTravel; // declares distanceTravel

	int setYear(int year) { // allows user to set car's year
		yearInput = year;
		return year;
	}

	String setMake(String make) { // allows user to set car's make
		makeInput = make;
		return make;
	}

	String setModel(String model) { // allows user to set car's model
		modelInput = model;
		return model;
	}

	String setColor(String color) { // allows user to set car's color
		colorInput = color;
		return color;
	}

	String setName(String name) { // allows user to set car's name
		nameInput = name;
		return name;
	}

	int setGears(int gears) { // allows user to set car's gears
		gearsInput = gears;
		return gears;
	}

	int setOperatingCycle(int operatingCycle) { // allows user to set car's
												// operating cycle
		operatingCycleInput = operatingCycle;
		return operatingCycle;
	}

	int currentGear() { // returns car's currentGear
		if (operatingCycleInput > gearsInput) {
			currentGear = gearsInput;
		} else {
			currentGear = operatingCycleInput;
		}
		return currentGear;
	}

	int currentSpeed() { // returns car's current speed
		currentSpeed = gearsInput * 10;
		return currentSpeed;
	}
}