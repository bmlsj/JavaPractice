package prjTest.Interface;

public class LedTV implements TV{

    @Override
    public void turnOn() {
        System.out.println("on");
    }

    @Override
    public void turnOff() {
        System.out.println("off");
    }

    @Override
    public void changeVolume(int value) {
        System.out.println(value + " 로 볼륨조정하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(channel + " 로 채널조정하다");
    }
}
