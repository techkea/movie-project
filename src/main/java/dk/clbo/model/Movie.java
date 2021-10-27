package dk.clbo.model;

public class Movie {

    private String year;
    private String Length;
    private String title;
    private String titlexxxxx;
    private String subject;
    private String popularity;
    private String awards;

    public Movie() {
    }

    public Movie(String year, String length, String title, String subject, String popularity, String awards) {
        this.year = year;
        Length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public String getTitlexxxxx() {
        return titlexxxxx;
    }

    public void setTitlexxxxx(String titlexxxxx) {
        this.titlexxxxx = titlexxxxx;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year='" + year + '\'' +
                ", Length='" + Length + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity='" + popularity + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }
}
