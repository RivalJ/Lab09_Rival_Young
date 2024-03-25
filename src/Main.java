import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 100;
        int[] dataPoints = new int[SIZE];
        Random rnd = new Random();

        int dataSum = 0;
        double dataAvg = 0;

        int userNum = 0;
        int numFinder = 0;

        int position = 0;

        int min = 0;
        int max = 0;

        for (int x = 0; x<dataPoints.length; x++){
            dataPoints[x] = rnd.nextInt(100)+1;

        }

        for (int x = 0; x<dataPoints.length; x++){
            System.out.print(dataPoints[x] + " | "); //       + " | ");

            /*
            if(dataPoints[x]<10)
                System.out.print(" ");
            System.out.print(" | ");



            if(x==49 || x==24 || x==74)
                System.out.println();
                 */ //this block allows me to arrange the data in 4 rows that fit on the screen
            //for it to work you have to remove a chunk of the print line
            // {    + " | ");   } this gets removed and placed at the end of the loop instead
        }

        System.out.println();
        /*
        for (int x = 0; x<dataPoints.length; x++){ //sum loop
            dataSum += dataPoints[x];
        }
        System.out.println("The sum of the data is: " + dataSum);

        dataAvg = (double)dataSum/dataPoints.length;
        System.out.println("The average of the data is: " + dataAvg);

        userNum = SafeInput.getRangedInt(in,"please pick a number ",100,1);

        for(int x = 0; x<dataPoints.length; x++){
            if(dataPoints[x] == userNum){
                numFinder += 1;

            }
        }
        System.out.println("your number was found " + numFinder + " times!");

        userNum = SafeInput.getRangedInt(in,"please pick a number ",100,1);

        for(int x = 0; x<dataPoints.length; x++){

            System.out.print(dataPoints[x] + " | "); //       + " | ");

            if(dataPoints[x] == userNum){
                position = x;
                x = dataPoints.length;

            }
        }
        System.out.println();
        System.out.println("your number was found at position " + position + " in the array.");


        for(int x = 0; x<dataPoints.length; x++){
            min = dataPoints[0];
            if(dataPoints[x]<min){
                min = dataPoints[x];
            }
        }

        min = dataPoints[0];
        max = dataPoints[0];
        for(int v : dataPoints){
            if(v < min){
                min = v;
            }

            if(v > max)
                max = v;
        }

        System.out.println("the minimum is: " + min);
        System.out.println("the maximum is: " + max);

         */

        dataAvg=getAverage(dataPoints);
        System.out.println("the method has found the average to be: " + dataAvg);
    }

    public static double getAverage(int values[] ){
        int valSum = 0;
        double avg = 0;
        for (int x = 0; x<values.length; x++){ //sum loop
            valSum += values[x];
        }

        avg = (double)valSum/values.length;

        return avg;
    }
}