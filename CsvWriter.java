package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class CsvWriter {
    private CsvFile csvFile = new CsvFile();

    void writeToCsv() {
        try {
            FileOutputStream fOS = new FileOutputStream(new File(".csv"));
            PrintStream pS = new PrintStream(fOS);

            for(MovieInfo mI : csvFile.readCsv()) {
                pS.print(mI.getDirector_name());
                pS.print(",");
                pS.print(mI.getMovie_title());
                pS.print(",");
                pS.print(mI.getActor_1_name());
                pS.print(",");
                pS.print(mI.getTitle_year());
                pS.print(",");
                pS.print("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}