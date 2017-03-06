package Module2;

/**
 * Created by Linkin on 06.02.2017.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int[] arrayOfIntElements = {90, -247, 44, 674, 3234, -57, 666, -777, 88, 0};
        double[] arrayOfDoubleEllements = {1.5, -2.554, 5.66, 8.3, 6.66, 7.77, 8.88, 9.99, 100.1, 42.65};
        HomeWork1 s = new HomeWork1();
        System.out.println(s.sum(arrayOfIntElements));
        System.out.println(s.sum(arrayOfDoubleEllements));
        System.out.println(s.min(arrayOfIntElements));
        System.out.println(s.min(arrayOfDoubleEllements));
        System.out.println(s.max(arrayOfIntElements));
        System.out.println(s.max(arrayOfDoubleEllements));
        System.out.println(s.maxPositive(arrayOfIntElements));
        System.out.println(s.maxPositive(arrayOfDoubleEllements));
        System.out.println(s.multiplication(arrayOfIntElements));
        System.out.println(s.multiplication(arrayOfDoubleEllements));
        System.out.println(s.secondLargest(arrayOfIntElements));
        System.out.println(s.secondLargest(arrayOfDoubleEllements));
        System.out.println(s.modulus(arrayOfIntElements));
        System.out.println(s.modulus(arrayOfDoubleEllements));
    }

    public int sum(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int summOfElementInArray = 0;
        for (int i = 0; i < arrayOfIntElements.length; i++) {
            summOfElementInArray += arrayOfIntElements[i];
        }
        return summOfElementInArray;
    }

    public double sum(double arrayOfDoubleElements[]) {
        if (arrayOfDoubleElements == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (arrayOfDoubleElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double summOfElementInArray = 0;
        for (int i = 0; i < arrayOfDoubleElements.length; i++) {
            summOfElementInArray += arrayOfDoubleElements[i];
        }
        return summOfElementInArray;
    }

    int min(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int minNumberInArray = arrayOfIntElements[0];
        for (int i = 1; i < arrayOfIntElements.length; i++) {
            if (arrayOfIntElements[i] < minNumberInArray) {
                minNumberInArray = arrayOfIntElements[i];
            }
        }
        return minNumberInArray;
    }

    double min(double arrayOfDoubleElementss[]) {
        if (arrayOfDoubleElementss == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElementss.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double minNumberInArray = arrayOfDoubleElementss[0];
        for (int i = 0; i < arrayOfDoubleElementss.length; i++) {
            if (arrayOfDoubleElementss[i] < minNumberInArray) {
                minNumberInArray = arrayOfDoubleElementss[i];
            }
        }
        return minNumberInArray;
    }

    int max(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int maxNumberInArray = arrayOfIntElements[0];
        for (int i = 1; i < arrayOfIntElements.length; i++) {
            if (arrayOfIntElements[i] > maxNumberInArray) {
                maxNumberInArray = arrayOfIntElements[i];
            }
        }
        return maxNumberInArray;
    }

    double max(double arrayOfDoubleElementss[]) {
        if (arrayOfDoubleElementss == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElementss.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double maxNumberInArray = arrayOfDoubleElementss[0];
        for (int i = 1; i < arrayOfDoubleElementss.length; i++) {
            if (arrayOfDoubleElementss[i] > maxNumberInArray) {
                maxNumberInArray = arrayOfDoubleElementss[i];
            }
        }
        return maxNumberInArray;
    }

    int maxPositive(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int maxPositiveNumberInArray = 0;
        for (int i = 0; i < arrayOfIntElements.length; i++) {

            if (arrayOfIntElements[i] >= 0 && arrayOfIntElements[i] > maxPositiveNumberInArray) {
                maxPositiveNumberInArray = arrayOfIntElements[i];
            }
        }
        return maxPositiveNumberInArray;
    }

    double maxPositive(double arrayOfDoubleElements[]) {
        if (arrayOfDoubleElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double maxPositiveNumberInArray = 0.0;
        for (int i = 0; i < arrayOfDoubleElements.length; i++) {

            if (arrayOfDoubleElements[i] >= 0 && arrayOfDoubleElements[i] > maxPositiveNumberInArray) {
                maxPositiveNumberInArray = arrayOfDoubleElements[i];
            }
        }
        return maxPositiveNumberInArray;
    }

    long multiplication(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        long multiplicationOfNumberInArray = 1;
        for (int i = 0; i < arrayOfIntElements.length; i++) {
            multiplicationOfNumberInArray *= arrayOfIntElements[i];
        }
        return multiplicationOfNumberInArray;
    }

    double multiplication(double arrayOfDoubleElements[]) {
        if (arrayOfDoubleElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double multiplicationOfNumberInArray = 1;
        for (int i = 0; i < arrayOfDoubleElements.length; i++) {
            multiplicationOfNumberInArray *= arrayOfDoubleElements[i];
        }
        return multiplicationOfNumberInArray;
    }

    int secondLargest(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int maxNumberInArray = 0;
        int secondLargestElementInArray = 0;
        for (int i = 0; i < arrayOfIntElements.length; i++) {
            if (arrayOfIntElements[i] > maxNumberInArray) {
                maxNumberInArray = arrayOfIntElements[i];
            } else if ((arrayOfIntElements[i] > secondLargestElementInArray) && (secondLargestElementInArray < maxNumberInArray))
                secondLargestElementInArray = arrayOfIntElements[i];
        }
        return secondLargestElementInArray;
    }

    double secondLargest(double arrayOfDoubleElements[]) {
        if (arrayOfDoubleElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double maxNumberInArray = 0;
        double secondLargestElementInArray = 0;
        for (int i = 0; i < arrayOfDoubleElements.length; i++) {
            if (arrayOfDoubleElements[i] > maxNumberInArray) {
                maxNumberInArray = arrayOfDoubleElements[i];
            } else if ((arrayOfDoubleElements[i] > secondLargestElementInArray) && (secondLargestElementInArray < maxNumberInArray))
                secondLargestElementInArray = arrayOfDoubleElements[i];
        }
        return secondLargestElementInArray;
    }

    int modulus(int arrayOfIntElements[]) {
        if (arrayOfIntElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfIntElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int modulusFirstAndLastElementInArray;
        int index = arrayOfIntElements.length - 1;
        if (arrayOfIntElements[index] == 0) {
            throw new IllegalArgumentException("Last element is 0. Cant take modulus");
        } else {
            modulusFirstAndLastElementInArray = arrayOfIntElements[0] % arrayOfIntElements[index];
        }
        return modulusFirstAndLastElementInArray;
    }

    double modulus(double arrayOfDoubleElements[]) {
        if (arrayOfDoubleElements == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (arrayOfDoubleElements.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double modulusFirstAndLastElementInArray;
        int index = arrayOfDoubleElements.length - 1;
        if (arrayOfDoubleElements[index] == 0) {
            throw new IllegalArgumentException("Last element is 0. Cant take modulus");
        } else {
            modulusFirstAndLastElementInArray = arrayOfDoubleElements[0] % arrayOfDoubleElements[index];

        }
        return modulusFirstAndLastElementInArray;
    }
}