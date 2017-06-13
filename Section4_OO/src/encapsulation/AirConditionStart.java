package encapsulation;

public class AirConditionStart {

	 private int power;
	 private boolean working;
	 private int temp;
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		//set max of 30 temp
		this.temp = temp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirConditionStart [power=");
		builder.append(power);
		builder.append(", working=");
		builder.append(working);
		builder.append(", temp=");
		builder.append(temp);
		builder.append("]");
		return builder.toString();
	}
	
}