package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation () {
        Radio rdo = new Radio();
        rdo.setCurrentStation(15);
        int expected = 0;
        int actual = rdo.getCurrentStation();
        assertEquals (expected, actual);
    }


@Test
    public void shouldSetNextStation () {
    Radio rdo = new Radio();
    rdo.setCurrentStation(9);
    rdo.setToNextStation();
    int expected = 0;
    int actual = rdo.getCurrentStation();
    assertEquals (expected, actual);
}

    @Test
    public void shouldSetPrevStation () {
        Radio rdo = new Radio();
        rdo.setCurrentStation(-1);
        rdo.setToPrevStation();
        int expected = 9;
        int actual = rdo.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume () {
        Radio rdo = new Radio();
        rdo.setCurrentVolume(15);
        int expected = 10;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio rdo = new Radio();
        rdo.setCurrentVolume(9);
        rdo.increaseVolume();
        int expected = 10;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume () {
        Radio rdo = new Radio();
        rdo.setCurrentVolume(11);
        rdo.setMaxVolume();
        int expected = 10;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolume () {
        Radio rdo = new Radio();
        rdo.setCurrentVolume(0);
        rdo.turnDownTheVolume();
        int expected = 0;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVMinVolume () {
        Radio rdo = new Radio();
        rdo.setCurrentVolume(-1);
        rdo.setMinVolume();
        int expected = 0;
        int actual = rdo.getCurrentVolume();
        assertEquals(expected, actual);
    }

}