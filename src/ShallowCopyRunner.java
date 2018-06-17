public class ShallowCopyRunner {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		ShallowCopyDemo shallowClass = new ShallowCopyDemo(vals);
		shallowClass.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		shallowClass.showData(); // prints out [13, 7, 9]

		// Very confusing, because we didn't
		// intentionally change anything about
		// the object shallowClass refers to.
	}
}