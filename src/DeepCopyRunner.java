public class DeepCopyRunner {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		DeepCopyDemo deepCopy = new DeepCopyDemo(vals);
		deepCopy.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		deepCopy.showData(); // prints out [3, 7, 9]

		// changes in array values will not be
		// shown in data values.
	}
}