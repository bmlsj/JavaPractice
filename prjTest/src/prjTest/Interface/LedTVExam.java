package prjTest.Interface;

public class LedTVExam {

    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeVolume(50);
        tv.changeVolume(6);
        tv.turnOff();
    }
}
