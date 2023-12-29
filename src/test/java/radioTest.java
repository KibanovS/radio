import org.junit.jupiter.api.Assertions;

public class radioTest {

    @org.testng.annotations.Test
    public void mustSwitchToEnd() {
        radio info = new radio();
        info.setCurrentNumberRadioStationDown(-1);
        int expected = 9;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void mustSwitchToBeginning() {
        radio info = new radio();
        info.setCurrentNumberRadioStationUp(10);
        int expected = 0;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void prevStation() {
        radio info = new radio();
        info.setCurrentNumberRadioStationDown(6);
        int expected = 5;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void nextStation() {
        radio info = new radio();
        info.setCurrentNumberRadioStationUp(5);
        int expected = 6;
        int actual = info.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shouldTurnUpVolume() {
        radio info = new radio();
        info.setCurrentVolumeUp(0);
        int expected = 1;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void notHigherThanMax() {
        radio info = new radio();
        info.setCurrentVolumeUp(100);
        int expected = 100;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shouldTurnDownVolume() {
        radio info = new radio();
        info.setCurrentVolumeDown(100);
        int expected = 99;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void notLowerThanMin() {
        radio info = new radio();
        info.setCurrentVolumeDown(0);
        int expected = 0;
        int actual = info.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

