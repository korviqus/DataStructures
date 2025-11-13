package LabWorks;

public class Recursive {
    public static int ArrEvenCount(int[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            if (array[index] % 2 == 0) {
                return 1 + ArrEvenCount(array, index + 1);
            } else {
                return ArrEvenCount(array, index + 1);
            }
        }
    }
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println(ArrEvenCount(myArray,0));
        }
    }
