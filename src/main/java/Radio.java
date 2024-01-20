public class Radio {
    public int currentVolume;
    private int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation > 9) {
            newCurrentNumberRadioStation = 0;
        } else {
            currentNumberRadioStation = newCurrentNumberRadioStation;
        }
        if (newCurrentNumberRadioStation < 0) {
            newCurrentNumberRadioStation = 9;
        } else {
            currentNumberRadioStation = newCurrentNumberRadioStation;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void next() {
        int target = currentNumberRadioStation;
        if (target < 9) {
            target = target + 1;
        } else {
            target = 0;
        }
        currentNumberRadioStation = target;

    }

    public void prev() {
        int target = currentNumberRadioStation;
        if (target > 0) {
            target = target - 1;
        } else {
            target = 9;
        }
        currentNumberRadioStation = target;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

    }

    public void setCurrentVolumeUp() {
        int target = currentVolume;
        if (target < 100) {
            target = target + 1;
        } else {
            target = 100;
        }
        currentVolume = target;
    }

    public void setCurrentVolumeDown() {
        int target = currentVolume;
        if (target > 0) {
            target = target - 1;
        } else {
            target = 0;
        }
        currentVolume = target;
    }


}
