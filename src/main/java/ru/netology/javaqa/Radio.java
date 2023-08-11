package ru.netology.javaqa;
public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == 9)
            currentStation = 0;
        else
            currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0)
            currentStation = 9;
        else
            currentStation--;
    }

    public void setCurrentStation (int newStation) {
        if ((newStation >= 0) && (newStation <= 9)) {
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

    void setCurrentVolume(int newVolume) {  //И так сойдёт
        currentVolume = newVolume;
    }
}