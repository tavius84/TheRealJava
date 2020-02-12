public class MediaLib {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        Books book1 = new Books();
        Movies movie1 = new Movies();
        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());
        System.out.println(book1);
        book1.setTitle("Children of the Corn");
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());
        System.out.println(movie1);
        movie1.setTitle("Battle LA");
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRating());




    }
}
