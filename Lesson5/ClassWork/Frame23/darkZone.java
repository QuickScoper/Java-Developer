package Lesson5.ClassWork.Frame23;

public class darkZone {

    public static void main(String[] args) {

        System.out.println(darkZone(100, (0.12), 1000000));
    }

    public static int darkZone(int mounthlyPaiment, double percent, int dreamSum) {
        double currentSum = 0;
        double curPersent = percent/12;
        double Proceed = 0;
        int i = 0;
        for (; currentSum <= dreamSum; ) {
          currentSum += mounthlyPaiment;
            Proceed = currentSum*curPersent;
            currentSum += Proceed;
            i += 1;
        }
        return i / 12;
    }
}
