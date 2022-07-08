package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void testMeaningMinusOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void testMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        int actual = rad.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        int actual = rad.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void testMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMeaningTen() {

        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testNextStationMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }


    @Test
    void testNextStationMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    void testNextStationMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testNextStationMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void testPrevStationMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningTen() {

        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testPrevStationNegativeMeaning() {

        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeMinusOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeZero() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeTen() {

        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void testVolumeEleven() {

        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolume0() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolume10() {

        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolumeMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolumeMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningTen() {

        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningEleven() {

        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningNegativeMeaning() {

        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
