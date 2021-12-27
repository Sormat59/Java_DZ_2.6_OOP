package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        if (currentStation >= 10) {
            currentStation = 0;
        } else if (currentStation < 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
       return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToNextStation() {
        this.currentStation = currentStation + 1;
    }


    public void setToPrevStation() {
        this.currentStation = currentStation - 1;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume + 1;
    }

    public void setMaxVolume() {

        currentVolume = 10;

    }

    public void turnDownTheVolume() {
        currentVolume = currentVolume - 1;
    }

    public void setMinVolume() {

        currentVolume = 0;

    }


}










