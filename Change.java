package hit;

class Returns{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Returns(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public int getRoll() {
//		return roll;
//	}
	public String abcd() {
		return name+" "+roll;
	}
	public String toString() {
		return name+name+" "+roll+roll;
	}
	
}

public class Change {

	public static void main(String[] args) {
		Returns ret = new Returns("abcd",99);
		System.out.println(ret.abcd());
		ret.setName("name");
		System.out.println(ret.getName());
		ret.setRoll(10);
		System.out.println(ret.getRoll());
		System.out.println(ret);
		

	}

}
