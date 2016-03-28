package Lesson8.ClassWork.Tanks.BattelField.Interfaces;


public interface Destroyable {

    public void destroy() throws InterruptedException, Exception;

    public boolean isDestroyed();
}
