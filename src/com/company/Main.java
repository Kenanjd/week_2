package com.company;

public class Main {

    public static void main(String[] args) {
        int[] temperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int count;


        for (count = 0; count < temperatures.length; count++)
        {
            if (temperatures[count] <= 32 && precipitation[count] > 50)
                System.out.println(days[count] + " it will snow");
        }
    }
}


