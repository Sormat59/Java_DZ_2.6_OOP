package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {

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
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
    }


    public void setToPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }

        else {
            currentStation = 9;
        }

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
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setMaxVolume() {

        currentVolume = 10;
    }

    public void turnDownTheVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setMinVolume() {

        currentVolume = 0;

    }


}










