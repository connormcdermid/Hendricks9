/*
  author: Frank Gomes
  lab: Television lab
  date: 16-09-19
  extra: Stops user from going to non-existent channels with ChannelOutOfBoundsException
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    @Test
    void getBrand() {
        Television sammy = new Television("Samsung", 50);
        assertEquals(sammy.getBrand(), "Samsung");
    }

    @Test
    void getSize() {
        Television sammy = new Television("Samsung", 50);
        assertEquals(sammy.getSize(), 50);
    }

    @Test
    void getChannel() {
        Television sammy = new Television("Samsung", 50);
        try {
            sammy.setChannel(10);
        } catch (Television.ChannelOutOfBoundsException e) {
            e.printStackTrace();
        }
        assertEquals(sammy.getChannel(), 10);
    }

    @Test
    void getChannelException() {
        Television sammy = new Television("Samsung", 50);
        assertThrows(Television.ChannelOutOfBoundsException.class, () -> sammy.setChannel(10000));
    }

    @Test
    void getPower() {
        Television sammy = new Television("Samsung", 50);
        assertFalse(sammy.getPower());
        sammy.setPower(true);
        assertTrue(sammy.getPower());
    }

    @Test
    void getVolume() {
        Television sammy = new Television("Samsung", 50);
        assertEquals(sammy.getVolume(), 20);
        sammy.setVolume(78);
        assertEquals(sammy.getVolume(), 78);
    }
}