package Lesson8.ClassWork.Tanks;


public enum Direction {

    UP(0),DOWN(1),LEFT(2),RIGHT(3),NONE(4);

int id;

    private Direction(int id) {
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Direction getDirection(int id){

        Direction direction = Direction.NONE;

     switch(id) {

         case 0:{
             direction = Direction.NONE;
             break;
         }
         case 1:{
             direction = direction.UP;
             break;
         }
         case 2:{
             direction = Direction.DOWN;
             break;
         }
         case 3:{
             direction = Direction.LEFT;
             break;
         }
         case 4:{
             direction = Direction.RIGHT;
             break;
         }
        }
        return direction;
    }

}
