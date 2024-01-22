import org.junit.jupiter.api.Assertions;

public class radioTest {


    @org.testng.annotations.Test
    public void nextStation() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(5);
        info.next();
        int expected = 6;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void prevStation() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(5);
        info.prev();
        int expected = 4;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void mustSwitchToEnd() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(0);
        info.prev();
        int expected = 9;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void mustSwitchToBeginning() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(9);
        info.next();
        int expected = 0;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void correctDirectIndicationOfStation() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(5);
        int expected = 5;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void directIndicationOfTheStationBelow() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(-2);
        int expected = 0;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void directIndicationOfTheStationAbove() {
        Radio info = new Radio();
        info.setCurrentNumberRadioStation(11);
        int expected = 9;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void shouldTurnUpVolume() {
        Radio info = new Radio();
        info.setCurrentVolume(0);
        info.setCurrentVolumeUp();
        int expected = 1;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void shouldTurnDownVolume() {
        Radio info = new Radio();
        info.setCurrentVolume(100);
        info.setCurrentVolumeDown();
        int expected = 99;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void notHigherThanMax() {
        Radio info = new Radio();
        info.setCurrentVolume(100);
        info.setCurrentVolumeUp();
        int expected = 100;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void notLowerThanMin() {
        Radio info = new Radio();
        info.setCurrentVolume(0);
        info.setCurrentVolumeDown();
        int expected = 0;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void test() {
        Radio info = new Radio(10);
        Assertions.assertEquals(0, info.getMinRadioStation());
        Assertions.assertEquals(10, info.getMaxRadioStation());
        Assertions.assertEquals(10, info.getCurrentNumberRadioStation());

    }
}