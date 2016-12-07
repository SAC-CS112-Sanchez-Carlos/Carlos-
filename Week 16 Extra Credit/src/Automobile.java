public class Automobile implements Runnable {

	public int m_year = 0, m_gear = 0, m_operatingCycle = 0, m_currentSpeed = 0, m_currentGear = 0;
	public String m_make = "", m_model = "", m_color = "", m_name = "";
	public float m_distanceTraveled = 0;

	/*
	 * constructor automobile with parameters year, make, model, color, name,
	 * and gear
	 */
	public Automobile(int year, String make, String model, String color, String name, int gear) {
		m_year = year;
		m_make = make;
		m_model = model;
		m_name = name;
		m_gear = gear;
		m_color = color;
	}

	public void setYear(int year) { // allows user to set car's year
		m_year = year;
	}

	public void setMake(String make) { // allows user to set car's make
		m_make = make;
	}

	public void setModel(String model) { // allows user to set car's model
		m_model = model;
	}

	public void setColor(String color) { // allows user to set car's color
		m_color = color;
	}

	public void setName(String name) { // allows user to set car's name
		m_name = name;
	}

	public void setGears(int gear) { // allows user to set car's gears
		m_gear = gear;
	}

	public void setOperatingCycle(int operatingCycle) { // sets operating cycle,
														// current speed, and
														// distance traveled of
														// car

		if (operatingCycle <= m_gear)
			m_currentGear = operatingCycle;

		m_currentSpeed = m_currentGear * 10;

		m_distanceTraveled += m_currentSpeed;
	}

	public int getYear() { // allows user to set car's year
		return m_year;
	}

	public String getMake() { // allows user to get make of car
		return m_make;
	}

	public String getModel() { // allows user to get model of car
		return m_model;
	}

	public String getColor() { // allows user to get color of car
		return m_color;
	}

	public String getName() { // allows user to get name of car
		return m_name;
	}

	public int getGear() { // allows user to get numer of gears of car
		return m_gear;
	}

	public int getOperatingCycle() { // allows user to get operating cycle
		return m_operatingCycle;
	}

	public int currentGear() { // returns car's currentGear
		if (m_operatingCycle > m_gear) { // 4>3
			m_currentGear = m_gear;
		} else {
			m_currentGear = m_operatingCycle;
		}
		return m_currentGear;
	}

	public int getSpeed() { // returns car's current speed
		return m_currentSpeed;
	}

	public synchronized float getDistanceTraveled() throws Exception { // returns distance

		// traveled
		if (m_distanceTraveled < 10)
			System.out.println(m_name + " goes Prrr.");
		else
			System.out.println(m_name + " goes Vroom.");
		if (m_distanceTraveled > 100) {
			System.out.println(m_name + " makes a Sputter...");
			throw new ArithmeticException();
		}
		Thread.sleep(1000);
		return m_distanceTraveled;
	}

	public String toString() { // prints string of info based on Object
		return "\n" + "Name: " + m_name + "\nYear: " + m_year + "\nMake: " + m_make + "\nModel: " + m_model
				+ "\nColor: " + m_color + "\nNumber of gears: " + m_gear;

	}

	
	public synchronized void run() {
		String info = "Car is a " + m_color + " " + m_year + " " + m_make + " " + m_model + " nicknamed " + m_name + ". It has " + m_gear + " gears.";
			System.out.println(info);
			System.out.println(m_name + "'s distance = " + m_distanceTraveled + ".\n");
		}
	}

