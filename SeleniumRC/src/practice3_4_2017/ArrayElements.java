package practice3_4_2017;

public class ArrayElements {
    int array[][];

    public void printElements() {
	for (int x[] : array) {
	    for (int y : x) {
		System.out.print(y);
	    }
	    System.out.println();
	}
    }

    public int[][] getArray() {
	return array;
    }

    public void setArray(int array[][]) {
	this.array = array;
    }

    public int[] getEvenElements() {
	int a[] = new int[3];
	int k = 0;
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++)
		if (array[i][j] % 2 == 0) {

		    a[k] = array[i][j];
		    // System.out.println("even numbers" + a[k]);
		    k++;

		}

	}
	return a;
    }

}
