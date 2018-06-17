import java.util.Arrays;

//code illustrating shallow copy
public class ShallowCopyDemo {

	private int[] data;

	// makes a shallow copy of values
	public ShallowCopyDemo(int[] values) {
		data = values;
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}