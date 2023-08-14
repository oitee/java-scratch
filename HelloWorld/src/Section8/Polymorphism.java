package Section8;

public class Polymorphism {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Jurassic Park");
        myMovie.watchMovie();

        Adventure indianaJones = new Adventure("Indiana Jones");
        indianaJones.watchMovie();

        Comedy rushHour = new Comedy("Rush Hour");
        rushHour.watchMovie();

        Romcom harryMetSally = new Romcom("Harry Met Sally");
        harryMetSally.watchMovie();

        // This works as we are using base class:
        Movie missionImpossible = Movie.getMovie("Adventure", "Mission Impossible");

        // This won't work as, at compile time, it appears that the return type will only be `Movie`.
        // It is only clear at run time that this will always return `Adventure` type
        //Adventure missionImpossible2 = Movie.getMovie("Adventure", "Mission Impossible 2");

        // This will work as we are casting the `Adventure` type on the `Movie`
        Adventure missionImpossible2 = (Adventure) Movie.getMovie("Adventure", "Mission Impossible 2");
        missionImpossible2.watchMovie();

        // This will throw compile time error as the return value will not be `Adventure`:
        //Adventure rushHour2 = (Adventure) Movie.getMovie("Comedy", "Rush Hour 2");
    }
}
