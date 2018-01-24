package practice3_4_2017;

public class SetGet {

    public static void main(String[] args) {
	int array[][] = { { 1, 3, 5 }, { 2, 8, 0 } };

	ArrayElements arrayElements = new ArrayElements();
	arrayElements.setArray(array);
	/*
	 * arrayElements.printElements(); int a[][] = arrayElements.getArray();
	 * for (int x[] : a) { for (int y : x) { System.out.print(y); }
	 * System.out.println(); }
	 */
	int k[] = arrayElements.getEvenElements();
	for (int y : k) { System.out.print(y);}

    }

}
