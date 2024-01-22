public class Radio {
    private int currentVolume;
    private int maxStaion = 9;
    private int minStation = 0;
    private int currentNumberRadioStation = maxStaion;
    public Radio(int size){
        maxStaion = minStation + size;

    }
    public int getMaxRadioStation() {
        return maxStaion;
    }
    public int getMinRadioStation(){
        return minStation;
    }
    private int maxVolume = 100;
    private int minVolume = 0;

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
        if (target < maxVolume) {
            target = target + 1;
        } else {
            target = maxVolume;
        }
        currentVolume = target;
    }

    public void setCurrentVolumeDown() {
        int target = currentVolume;
        if (target > minVolume) {
            target = target - 1;
        } else {
            target = minVolume;
        }
        currentVolume = target;
    }
}
