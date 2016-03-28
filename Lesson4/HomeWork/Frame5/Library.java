package Lesson4.HomeWork.Frame5;

public class Library {

    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    private Book[][] searchName;
    private Book[][] searchAuthorName;
    private Book[][] searchGenre;

    public Library() {
        searchName = new Book[26][];
        fillDictionary(searchName);

        searchAuthorName = new Book[26][];
        fillDictionary(searchAuthorName);

        searchGenre = new Book[26][];
        fillDictionary(searchGenre);
        createBooks();

    }

    int booksCount = 0;

    public Book[] searchByGenre(Genres genre) {
        int count = 0;
        String books = null;
//        for (int i = genre.getId(); i< searchGenre.length;i++) {
        for (int i = genre.getId(); booksCount < searchGenre[booksCount].length; booksCount++) {
            Book book = searchGenre[i][booksCount];
            if (book != null) {
                books = book.getName();
                if (count < 5) {
                    count++;
                    System.out.println("Book name : " + books + ", Book Author : " + book.getAuthor() + ".");
                    if (count == 5) {
                        booksCount += 1;
                        if (booksCount == 10) {
                            booksCount = 0;
                        }
                        break;
                    }
                }
            }
        }
//        }


        return null;
    }

    public Book[] searchByName(String name) {

        int pos = alphabet.indexOf(name.charAt(0));
        for (int j = 0; j < searchName[j].length; j++) {
            Book book = searchName[pos][j];
            if (book != null) {
                if (book.getName().equals(name)) {
                    System.out.println("Book name : " + book.getName() + ", Book Author : " + book.getAuthor() + ", Book Genre : " + book.getGenre() + ".");
                }
            }
        }

        return null;

    }

    public Book[] searchByAuthorName(String name) {
        int pos = alphabet.indexOf(name.charAt(0));
        for (int j = 0; j < searchAuthorName[j].length; j++) {
            Book book = searchAuthorName[pos][j];
            if (book != null) {
                if (book.getAuthor().equals(name)) {
                    System.out.println("Book name : " + book.getName() + ", Book Author : " + book.getAuthor() + ", Book Genre : " + book.getGenre() + ".");
                }
            }
        }

        return null;

    }

    private void fillDictionary(Book[][] dictionary) {
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = new Book[10];
        }

    }

    private void addToLibrary(Book book) {
        int position = alphabet.indexOf(book.getName().charAt(0));
        addToStorage(searchName[position], book);

        position = alphabet.indexOf(book.getAuthor().charAt(0));
        addToStorage(searchAuthorName[position], book);

        addToStorage(searchGenre[book.getGenre().getId()], book);
    }

    private void addToStorage(Book[] storage, Book book) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = book;
                return;
            }

        }
    }

    private void createBooks() {

        Book b = new Book();
        b.setAuthor("Joe McKinney");
        b.setGenre(Genres.HORROR);
        b.setName("Dead World Resurrection");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Joe McKinney");
        b.setGenre(Genres.HORROR);
        b.setName("Apocalypse of the Dead");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Chantal Noordeloos");
        b.setGenre(Genres.HORROR);
        b.setName("Angel Manor");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Keith Deininger");
        b.setGenre(Genres.HORROR);
        b.setName("Ghosts of Eden x");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Matt Manochio");
        b.setGenre(Genres.HORROR);
        b.setName("The Dark Servant");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Nick Mamatas");
        b.setGenre(Genres.HORROR);
        b.setName("The Nickronomicon");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Keith Deininger");
        b.setGenre(Genres.HORROR);
        b.setName("Ghosts of Eden");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Jeff VanderMeer");
        b.setGenre(Genres.HORROR);
        b.setName("Area X");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("JD Barker");
        b.setGenre(Genres.HORROR);
        b.setName("Forsaken: Book one of the Shadow Cove Saga");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Jonathan Maberry");
        b.setGenre(Genres.HORROR);
        b.setName("Out of Tune");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Robin LaFevers");
        b.setGenre(Genres.FANTASY);
        b.setName("Mortal Heart");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Carrie Ryan");
        b.setGenre(Genres.FANTASY);
        b.setName("The Map to Everywhere");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("GA Aiken");
        b.setGenre(Genres.FANTASY);
        b.setName("Light My Fire");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Claudia Gray");
        b.setGenre(Genres.FANTASY);
        b.setName("A Thousand Pieces of You");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Jennifer Lynn Barnes");
        b.setGenre(Genres.FANTASY);
        b.setName("Killer instinct");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Robin LaFevers");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("Mortal Heart");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Melanie Dickerson");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("The Princess Spy");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Stephanie Thornton");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("The Tiger Queens: The Women of Genghis Khan");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Ha Jim");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("Stephanie Thornton");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Kimberley Griffiths Little");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("Forbidden");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Lalita Tademy");
        b.setGenre(Genres.HISTORYCAL);
        b.setName("Citizens Creek");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Cassia Leo");
        b.setGenre(Genres.DRAMMA);
        b.setName("Hunting Luke");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Cassia Leo");
        b.setGenre(Genres.DRAMMA);
        b.setName("Black Box");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Hiroshi Sakurazaka");
        b.setGenre(Genres.DRAMMA);
        b.setName("All You Need is Kill");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Christoph Fischer");
        b.setGenre(Genres.DRAMMA);
        b.setName("Conditions");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Emma James");
        b.setGenre(Genres.DRAMMA);
        b.setName("A Little Faith");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Mimi Jean Pamfiloff");
        b.setGenre(Genres.TRAGEDY);
        b.setName("King of me");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Renée Carlino");
        b.setGenre(Genres.TRAGEDY);
        b.setName("After the Rain");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Belle Aurora");
        b.setGenre(Genres.TRAGEDY);
        b.setName("Raw");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Amy Harmon");
        b.setGenre(Genres.TRAGEDY);
        b.setName("Making Faces");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Amy Zhang");
        b.setGenre(Genres.TRAGEDY);
        b.setName("Falling into Places");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Robyn Schneider");
        b.setGenre(Genres.TRAGEDY);
        b.setName("The Beginning of Everything");
        addToLibrary(b);

        b = new Book();
        b.setAuthor("Keith Deininger");
        b.setGenre(Genres.TRAGEDY);
        b.setName("The fall of all Mankind");
        addToLibrary(b);
    }

}




