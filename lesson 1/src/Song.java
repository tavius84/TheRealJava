public class Song {
    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    public Song(){
        title = "";
        rating = 4;
        price = 0.0;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }
    public void addToFavorites(){
        favorite = true;
    }
    public Song(String title, double price) {
        title = title;
        price = price;
    }

}
