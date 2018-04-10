public class SelectionSort {
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            int elementMin = list[i];
            int elemnetIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (elementMin > list[j]) {
                    elementMin = list[j];
                    elemnetIndex = j;
                }
            }
            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (elemnetIndex != i) {
                list[elemnetIndex] = list[i];
                list[i] = elementMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {4, 5, 3, 89, 5, 78, -3};
        selectionSort(number);
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
    }
}
