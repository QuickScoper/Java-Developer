package Lesson4.HomeWork.Frame5;


public enum Genres {

    FANTASY(0),HORROR(1),DRAMMA(2),TRAGEDY(3),HISTORYCAL(4);

    private int id;

     Genres(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
