package ru.netology;

import lombok.Data;

@Data
public class Radio {

    private int id;
    private String name = "Smart radio";
    private int numberOfRadioStations = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = setMaxVolume();
    private int minVolume = setMinVolume();
    private int currentVolume;

    public Radio() {

    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > numberOfRadioStations -1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToNextStation() {
        if (currentStation < numberOfRadioStations -1) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
    }


    public void setToPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberOfRadioStations -1;
        }

    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public int setMaxVolume() {

        currentVolume = 100;
        return currentVolume;
    }

    public void turnDownTheVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int setMinVolume() {

        currentVolume = 0;

        return currentVolume;
    }


}














