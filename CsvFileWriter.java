/*
package com.company;

import java.io.*;

public class CsvFileWriter {
    private CsvFile csvFile = new CsvFile();

   public void writeCsvFile(){
       try {
       //PrintWriter printWriter = new PrintWriter(new File("test.csv"));
           FileWriter fileWriter = new FileWriter("test.csv");
           PrintStream printStream = new PrintStream(String.valueOf(fileWriter));

           printStream.println("Director, Movie title, Actor name, Titel year");
           for (MovieInfo movieInfo : csvFile.readCsv()){
               printStream.print(movieInfo.getDirector_name());
               printStream.print(",");
               printStream.print(movieInfo.getActor_1_name());
               printStream.print(",");
               printStream.print(movieInfo.getMovie_title());
               printStream.print(",");
               printStream.print(movieInfo.getTitle_year());
           }



       } catch (IOException e) {
           e.printStackTrace();
       }


   }
}
*/
