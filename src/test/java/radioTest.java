import org.junit.jupiter.api.Assertions;

public class radioTest {

    public class radioTest {
        @org.testng.annotations.Test
        public void mustSwitchToEnd() {
            Radio info = new Radio();
            info.setCurrentNumberRadioStationDown(-1);
            int expected = 9;
            int actual = info.getCurrentNumberRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void mustSwitchToBeginning() {
            Radio info = new Radio();
            info.setCurrentNumberRadioStationUp(10);
            int expected = 0;
            int actual = info.getCurrentNumberRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void prevStation() {
            Radio info = new Radio();
            info.setCurrentNumberRadioStationDown(6);
            int expected = 5;
            int actual = info.getCurrentNumberRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void nextStation() {
            Radio info = new Radio();
            info.setCurrentNumberRadioStationUp(5);
            int expected = 6;
            int actual = info.getCurrentNumberRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void shouldTurnUpVolume() {
            Radio info = new Radio();
            info.setCurrentVolumeUp(0);
            int expected = 1;
            int actual = info.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void notHigherThanMax() {
            Radio info = new Radio();
            info.setCurrentVolumeUp(100);
            int expected = 100;
            int actual = info.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void shouldTurnDownVolume() {
            Radio info = new Radio();
            info.setCurrentVolumeDown(100);
            int expected = 99;
            int actual = info.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @org.testng.annotations.Test
        public void notLowerThanMin() {
            Radio info = new Radio();
            info.setCurrentVolumeDown(0);
            int expected = 0;
            int actual = info.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

}

