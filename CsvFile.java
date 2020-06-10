package com.company;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;


public class CsvFile {

    public List<MovieInfo> readCsv () {

        List<MovieInfo> movieInfos = readMoviesFromCSV("movie.metadata.500.1.csv");
        for (MovieInfo b : movieInfos) {
            System.out.print(String.valueOf(b));

        }
        return movieInfos;

    }


    private static List<MovieInfo> readMoviesFromCSV(String fileName){

        List<MovieInfo> movieInfos = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            String line = br.readLine();

            // loope igennem til alle linjer i filen er kørt igennem.
            while (line !=null){
                //brug string-split for at loade string array med values fra hver linje i filen, comma separeret
                String [] attributes = line.split(",");

                MovieInfo movieInfo = visMovie(attributes);

                movieInfos.add(movieInfo);

                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //List<MovieInfo> soegResultat = findMovieInfos("Gore Verbinski",movieInfos);
        //System.out.println("fandt: " + soegResultat.size());

        return movieInfos;

    }


    private static MovieInfo visMovie(String[] attributes) {
        String director_name = attributes[1];
        String movie_title = attributes[11];
        String actor_1_name = attributes [10];
        String title_year = attributes [23];

        return new MovieInfo(director_name,movie_title,actor_1_name,title_year);

    }

   /* static List<MovieInfo> findMovieInfos(String director_name, List<MovieInfo> list) {
        List<MovieInfo> resultat = new ArrayList<>();
        for (MovieInfo mInfo : list) {
            if (mInfo.getDirector_name().equalsIgnoreCase(director_name)) {
                resultat.add(mInfo);
            }
        }
        return resultat;
    }

    */


}

//https://www.java67.com/2015/08/how-to-load-data-from-csv-file-in-java.html
//https://www.baeldung.com/find-list-element-java
//https://codereview.stackexchange.com/questions/191783/searching-for-a-specific-object-in-an-arraylist
//http://myitlearnings.com/java-arraylist-adding-and-searching/
//https://www.baeldung.com/java-file-to-arraylist