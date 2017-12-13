public class Music {
    private String name;
    private String genre;
    private String format;
    private int year;
    private String artise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAartise() {
        return artise;
    }

    public void setartise(String artise) {
        this.artise = artise;
    }

    public Music(String name, String genre, String format, int year, String artise) {
        this.name = name;
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.artise = artise;
    }
}
