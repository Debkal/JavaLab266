public class AverageInt {
    /*Filip Ciesinski 02/05/2024 Program 2.6.6 - Short Program #45*/

    public static void main(String[] args) {
        int[] array ={1,7,9,34};  //declare set of numbers as array
        System.out.println("The average of the set of numbers is : " + equation(array));
    }
    public static float equation(int[] numbers){
        float sum=0; //sum needs to be float or will return average as a whole number rounded down
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i]; //iterate through length of array adding each number to the sum
        }
        float average = sum/numbers.length; //perform the equation and divide by array length
        return average; //return average when method is called in main
    }

}