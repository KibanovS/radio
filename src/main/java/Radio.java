public class Radio {
    public int currentVolume;
    public int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStationUp() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;

        }
    }

    public void setCurrentNumberRadioStationDown(int newSetCurrentNumberRadioStationDown) {
        if (newSetCurrentNumberRadioStationDown < 0) {
            currentNumberRadioStation = 9;
        } else {
            newSetCurrentNumberRadioStationDown = newSetCurrentNumberRadioStationDown - 1;
            currentNumberRadioStation = newSetCurrentNumberRadioStationDown;
            return;
        }
        newSetCurrentNumberRadioStationDown = currentNumberRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolumeUp(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentVolumeDown(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        }
        currentVolume = newCurrentVolume;
    }


}
