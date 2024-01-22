public class Radio {
    private int maxStaion = 9;
    private final int minStation = 0;
    private int currentNumberRadioStation;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;

    public Radio(int size) {
        maxStaion = minStation + size - 1;
    }

    public Radio() {
        int size = 10;
        maxStaion = minStation + size - 1;
    }

    public int getMaxRadioStation() {
        return maxStaion;
    }

    public int getMinRadioStation() {
        return minStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation > maxStaion) {
            newCurrentNumberRadioStation = maxStaion;
        } else {
            currentNumberRadioStation = newCurrentNumberRadioStation;
        }
        if (newCurrentNumberRadioStation < minStation) {
            newCurrentNumberRadioStation = minStation;
        } else {
            currentNumberRadioStation = newCurrentNumberRadioStation;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void next() {
        int target = currentNumberRadioStation;
        if (target < maxStaion) {
            target = target + 1;
        } else {
            target = minStation;
        }
        currentNumberRadioStation = target;
    }

    public void prev() {
        int target = currentNumberRadioStation;
        if (target > minStation) {
            target = target - 1;
        } else {
            target = maxStaion;
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

