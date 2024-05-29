package my.school;

public class ClassRoom {
	private int roomNumber;
	protected String teacherName;
	static int globalKey = 54321;
	public int floor = 3;

	ClassRoom(int r, String t) {
		roomNumber = r;
		teacherName = t;
	}
}