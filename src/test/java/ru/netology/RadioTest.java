package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio rdo2 = new Radio(20);
    Radio rdo = new Radio();

    @Test
    public void shouldSetCurrentStation() {

        rdo2.setCurrentStation(15);
        int expected = 15;
        int actual = rdo2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBoundaryValues() {

        rdo.setCurrentStation(-1);
        int expected = 0;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationBoundary() {
        rdo.setCurrentStation(9);
        rdo.setToNextStation();
        int expected = 0;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {

        rdo.setCurrentStation(8);
        rdo.setToNextStation();
        int expected = 9;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationBoundary() {

        rdo.setCurrentStation(0);
        rdo.setToPrevStation();
        int expected = 9;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {

        rdo.setCurrentStation(7);
        rdo.setToPrevStation();
        int expected = 6;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {

        rdo.setCurrentVolume(15);
        int expected = 15;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        rdo.setCurrentVolume(2);
        rdo.increaseVolume();
        int expected = 3;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBoundary() {

        rdo.setCurrentVolume(100);
        rdo.increaseVolume();
        int expected = 100;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {

        rdo.setCurrentVolume(110);
        rdo.setMaxVolume();
        int expected = 100;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolume() {

        rdo.setCurrentVolume(2);
        rdo.turnDownTheVolume();
        int expected = 1;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolumeBoundary() {

        rdo.setCurrentVolume(0);
        rdo.turnDownTheVolume();
        int expected = 0;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVMinVolume() {

        rdo.setCurrentVolume(-1);
        rdo.setMinVolume();
        int expected = 0;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

}