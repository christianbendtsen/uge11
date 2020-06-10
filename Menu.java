package com.company;

import java.util.*;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private CsvFile csvFile = new CsvFile();
    private CsvWriter csvWriter = new CsvWriter();


    public void displayMenu() {
        do {
            System.out.printf("Vælg Følgende: \n" +
                    "1. Udskriv 4 kolonner: \n" +
                    "2. Print 4 kolonner til csv fil");


            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    csvFile.readCsv();


                    break;
                case "2":
                    csvWriter.writeToCsv();

                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (true);
    }

}

