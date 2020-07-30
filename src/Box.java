public class Box {
	public int size = 0;

	//create box
	public void printBox() {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printBox(char c) { // overload method
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	//size of box
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.size = 5;
		myBox.printBox();

		System.out.println("Output from Overloaded method, I have passed char as c\n");

		//print box as c instead of *
		myBox.printBox('c'); 

	}

}