package Lesson4.HomeWork.Frame5;


public class LauncherLib {

    public static void main(String[] args) {


        Library lib = new Library();
        lib.searchByGenre(Genres.HORROR);
        System.out.println();
        System.out.println();
        lib.searchByGenre(Genres.HORROR);
        System.out.println();
        System.out.println();
        System.out.println();
        lib.searchByGenre(Genres.HORROR);
        System.out.println();
        System.out.println();
        System.out.println();
        lib.searchByName("Dead World Resurrection");
        System.out.println();
        System.out.println();
        lib.searchByAuthorName("Keith Deininger");
    }
}
