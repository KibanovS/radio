public class Radio {
    public int currentVolume;
    public int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void next(int newNext) {
        if (newNext < 9) {
            newNext = newNext + 1;
        } else {
            return;
        }
        currentNumberRadioStation = newNext;
    }

    public void prev(int newPrev) {
        if (newPrev < 0) {
            currentNumberRadioStation = 9;
        } else {
            newPrev = newPrev - 1;
            currentNumberRadioStation = newPrev;
            return;
        }
        newPrev = currentNumberRadioStation;
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
