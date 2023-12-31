package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void nextStationTrivial() {
        Radio radio = new Radio();
        int expected = 3;

        radio.setCurrentStation(2);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationIfCurrentStationIs9() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationTrivial() {
        Radio radio = new Radio();
        int expected = 4;

        radio.setCurrentStation(5);
        radio.prevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationIfCurrentStationIs0() {
        Radio radio = new Radio();
        int expected = 9;

        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentStationIfBelow0() {
        Radio radio = new Radio();

        int expected = radio.getCurrentStation();   //Всегда будет 0, зато нагляднее
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentStationIfAbove9() {
        Radio radio = new Radio();

        int expected = radio.getCurrentStation();   //Всегда будет 0, зато нагляднее
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeTrivial() {
        Radio radio = new Radio();
        int expected = 21;

        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeIfCurrentIs100() {
        Radio radio = new Radio();
        int expected = 100;

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeTrivial() {
        Radio radio = new Radio();
        int expected = 20;

        radio.setCurrentVolume(21);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeIfCurrentIs0() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setCurrentVolume(0);  //currentVolume и так была 0, зато нагляднее
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}