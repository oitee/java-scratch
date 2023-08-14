package Section8;

public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        type = type.toLowerCase();
        return switch (type) {
            case "adventure" -> new Adventure(title);
            case "comedy" -> new Comedy(title);
            case "romcom" -> new Romcom(title);
            default -> new Movie(title);
        };

    }
}

class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.println("Adventure Movie is playing....");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.println("Comedy Movie is playing....");
    }
}

class Romcom extends Movie{
    public Romcom(String title){
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.println("Romcom Movie is playing....");
    }
}

