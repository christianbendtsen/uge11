package com.company;

public class MovieInfo {

    String director_name;
    String movie_title;
    String actor_1_name;
    String title_year;


    public MovieInfo(String director_name, String movie_title, String actor_1_name, String title_year) {
        this.director_name = director_name;
        this.movie_title = movie_title;
        this.actor_1_name = actor_1_name;
        this.title_year = title_year;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getActor_1_name() {
        return actor_1_name;
    }

    public void setActor_1_name(String actor_1_name) {
        this.actor_1_name = actor_1_name;
    }

    public String getTitle_year() {
        return title_year;
    }

    public void setTitle_year(String title_year) {
        this.title_year = title_year;
    }

    @Override
    public String toString() {
        return "                                  " +"\n" +
                "Director = " + director_name +"\n" +
                "Movie title = " + movie_title + "\n" +
                "Actor name =  " + actor_1_name + "\n" +
                "Title year = " + title_year + "\n"  ;
    }
}
