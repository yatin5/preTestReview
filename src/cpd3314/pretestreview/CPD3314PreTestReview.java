/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package cpd3314.pretestreview;

import java.util.Scanner;

/**
 * This file is an attempt to give solutions to most of the non-homework
 * problems at the back of Chapter 5 - Methods, in the course textbook.
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314PreTestReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: Add code to run the doExercise methods here.
    }

    /**
     * Accepts a string and a position, displays the character at the position.
     *
     * @param str - The string to search
     * @param pos - The position to display
     */
    public static void showChar(String str, int pos) {
        System.out.println(str.charAt(pos));
    }

    /**
     * Provides a working sample of Exercise #1 - showChar Method
     */
    public static void doExercise1() {
        String str = "New York";
        int pos = 2;
        System.out.printf("Outputting the character in position %d from string "
                + "'%s'\n", pos, str);
        showChar(str, pos);
    }

    // Global Constants for Calculating Paint Jobs
    final static double SQFT_PER_GALLON = 115.0;
    final static double HOURS_PER_SQFT = 8.0;
    final static double COST_PER_HOUR = 18.00;

    /**
     * Calculates the number of gallons required to paint an area of walls.
     *
     * @param sqft - The square footage of wall area to paint.
     * @return - The number of gallons required.
     */
    public static double numGallons(double sqft) {
        return sqft / SQFT_PER_GALLON;
    }

    /**
     * Calculates the number of hours required to paint an area of walls.
     *
     * @param sqft - The square footage of wall area to paint.
     * @return - The number of hours required.
     */
    public static double hoursLabour(double sqft) {
        return sqft * HOURS_PER_SQFT;
    }

    /**
     * Calculates the total cost of paint based on the price per gallon.
     *
     * @param gallons - The number of gallons required.
     * @param pricePerGallon - The price for each gallon.
     * @return - The total cost of paint.
     */
    public static double costPaint(double gallons, double pricePerGallon) {
        return gallons * pricePerGallon;
    }

    /**
     * Calculates the total labour charges for a paint job.
     *
     * @param hours - The number of hours required.
     * @return - The total labour charges.
     */
    public static double labourCharges(double hours) {
        return hours * COST_PER_HOUR;
    }

    /**
     * Calculates the total cost of a paint job, based on the area and price of
     * paint per gallon.
     *
     * @param sqft - The square footage of wall area to paint.
     * @param pricePerGallon - The price per gallon of paint.
     * @return - The total cost of the paint job.
     */
    public static double costOfPaintJob(double sqft, double pricePerGallon) {
        double gal = numGallons(sqft);
        double hours = hoursLabour(sqft);
        return costPaint(gal, pricePerGallon) + labourCharges(hours);
    }

    /**
     * Provides a working sample of Exercise #4 - Paint Job Estimator
     */
    public static void doExercise4() {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many rooms do you want to paint?");
        int rooms = kb.nextInt();
        System.out.println("What is the cost of paint per gallon?");
        double pricePerGallon = kb.nextDouble();
        double sqft = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.printf("What is the square footage of room %d?", i);
            sqft += kb.nextDouble();
        }
        double cost = costOfPaintJob(sqft, pricePerGallon);
        System.out.printf("The job will cost $%.2f\n", cost);
    }

    /**
     * Calculates the distance an object has fallen in a given time.
     *
     * @param t - The time falling, in seconds.
     * @return - The distance fallen, in metres.
     */
    public static double fallingDistance(double t) {
        final double g = 9.8;
        return g * t * t / 2;
    }

    /**
     * Provides a working sample of Exercise #5 - Falling Distance
     */
    public static void doExercise5() {
        System.out.println("Time\tDistance");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d sec\t%.2f m\n", i, fallingDistance(i));
        }
    }

    /**
     * Calculates the average of five grades.
     *
     * @param g1 - The first grade.
     * @param g2 - The second grade.
     * @param g3 - The third grade.
     * @param g4 - The fourth grade.
     * @param g5 - The fifth grade.
     * @return - The average grade.
     */
    public static double calcAverage(double g1, double g2, double g3, double g4,
            double g5) {
        return (g1 + g2 + g3 + g4 + g5) / 5.0;
    }

    /**
     * Determines the letter grade associated with a percentage grade.
     *
     * @param percent - The grade as a percentage.
     * @return - The letter grade.
     */
    public static char determineGrade(double percent) {
        char grade;
        if (percent >= 90) {
            grade = 'A';
        } else if (percent >= 80) {
            grade = 'B';
        } else if (percent >= 70) {
            grade = 'C';
        } else if (percent >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    /**
     * Provides a working sample of Exercise #7 - Test Average and Grade
     */
    public static void doExercise7() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first grade:");
        double g1 = kb.nextDouble();
        System.out.printf("Letter grade is %c.\n", determineGrade(g1));
        System.out.println("Enter the second grade:");
        double g2 = kb.nextDouble();
        System.out.printf("Letter grade is %c.\n", determineGrade(g2));
        System.out.println("Enter the third grade:");
        double g3 = kb.nextDouble();
        System.out.printf("Letter grade is %c.\n", determineGrade(g3));
        System.out.println("Enter the fourth grade:");
        double g4 = kb.nextDouble();
        System.out.printf("Letter grade is %c.\n", determineGrade(g4));
        System.out.println("Enter the fifth grade:");
        double g5 = kb.nextDouble();
        System.out.printf("Letter grade is %c.\n", determineGrade(g5));
        double avg = calcAverage(g1, g2, g3, g4, g5);
        System.out.printf("Average is %.1f, letter grade: %c.\n", avg,
                determineGrade(avg));
    }

    /**
     * Converts the distance to kilometers and outputs the value.
     *
     * @param m - The distance in meters.
     */
    public static void showKilometers(double m) {
        double km = m * 0.001;
        System.out.printf("%.1fm is %.1fkm\n", m, km);
    }

    /**
     * Converts the distance to inches and outputs the value.
     *
     * @param m - The distance in meters.
     */
    public static void showInches(double m) {
        double in = m * 39.37;
        System.out.printf("%.1fm is %.1fin\n", m, in);
    }

    /**
     * Converts the distance to feet and outputs the value.
     *
     * @param m - The distance in meters.
     */
    public static void showFeet(double m) {
        double ft = m * 3.281;
        System.out.printf("%.1fm is %.1fft\n", m, ft);
    }

    /**
     * Displays all possible menu options.
     */
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void doExercise8() {
        Scanner kb = new Scanner(System.in);

        // Retrieve a Positive Distance from the User
        double m;
        do {
            System.out.print("Enter a distance in meters: ");
            m = kb.nextDouble();
            if (m < 0) {
                System.out.println("Enter a positive distance.");
            }
        } while (m < 0);

        // Retrieve a Display Option from the User
        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    showKilometers(m);
                    break;
                case 2:
                    showInches(m);
                    break;
                case 3:
                    showFeet(m);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("That was an invalid option.");
                    break;
            }
        } while (choice != 4);
    }
}
