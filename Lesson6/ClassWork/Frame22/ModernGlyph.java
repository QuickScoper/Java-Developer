package Lesson6.ClassWork.Frame22;


public class ModernGlyph extends Glyph{

    private int number = 5;

    public ModernGlyph(int number){
        System.out.println("ModernGlyph");
        draw();
        this.number = number;
    }

    @Override
    public void draw() {
        System.out.println("ModernGlyphDraw()");
        System.out.println("ModernGlyph number [ " + number + " ].");
    }
}
