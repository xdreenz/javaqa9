package ru.netology.javaqa;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int stationsAmount;

    public Radio() {
        stationsAmount = 10;
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == (stationsAmount - 1)) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationsAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int newStation) {
        if ((newStation >= 0) && (newStation <= (stationsAmount - 1))) {
            currentStation = newStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    void setCurrentVolume(int newVolume) {
        currentVolume = newVolume;
    }
}