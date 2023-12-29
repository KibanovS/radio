public class radio {
    public int currentVolume;
    private int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStationUp(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < 9) {
            currentNumberRadioStation = newCurrentNumberRadioStation + 1;

        } else {
        }
    }

    public void setCurrentNumberRadioStationDown(int newCurrentNumberRadioStation) {

        if (newCurrentNumberRadioStation < 0) {

            newCurrentNumberRadioStation = 9;
            currentNumberRadioStation = 9;
            return;
        } else {
            newCurrentNumberRadioStation = newCurrentNumberRadioStation - 1;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
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
