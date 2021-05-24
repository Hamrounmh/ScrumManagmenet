import Models.Film;

public class Application {

        public static void main(String[] args) {
            Film film = new Film("Bambi");
            System.out.println(film.getName()); // Display the string.
        }

}
