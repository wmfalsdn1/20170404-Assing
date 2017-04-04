package a1;

public class Student2 {
	private String major;
	private int StuNum;

	private void setmajor(String major) {
		this.major = major;
	}

	private void setStuNum(int StuNum) {
		this.StuNum = StuNum;
	}

	public String getmajor() {
		return major;
	}

	public int getStuNum() {
		return StuNum;
	}

	public static void main(String[] args) {
		Student2 a = new Student2();
		a.major = "컴퓨터정보 공학과";
		a.StuNum = 20142754;

		System.out.println(a.getmajor());
		System.out.println(a.getStuNum());

	}

}
