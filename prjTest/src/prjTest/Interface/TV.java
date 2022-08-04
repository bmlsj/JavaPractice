package prjTest.Interface;

public interface TV {

    public int MAX_VOLUME = 100;
    // 컴파일시 public static final int MAX_VOLUME 로 변환
    public int MIN_VOLUME = 0;
    // 컴파일시, public static final int MIN_VOLUME로 변환

    public void turnOn();
    // 컴파일 시, public abstract void on();로 변환
    public void turnOff();
    // 컴파일 시, public abstract void turnOff();로 변환
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
