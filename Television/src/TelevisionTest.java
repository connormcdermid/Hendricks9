import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    @org.junit.jupiter.api.Test
    void getBrand() {
        Television sammy = new Television("Samsung", 50);
        assertEquals(sammy.getBrand(), "Samsung");
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        Television sammy = new Television("Samsung", 50);
        assertEquals(sammy.getSize(), 50);
    }

    @org.junit.jupiter.api.Test
    void getChannel() {
        Television sammy = new Television("Samsung", 50);
        try {
            sammy.setChannel(10);
        } catch (Television.ChannelOutOfBoundsException e) {
            e.printStackTrace();
        }
        assertEquals(sammy.getChannel(),10);
    }

    @org.junit.jupiter.api.Test
    void getPower() {
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
    }

    @org.junit.jupiter.api.Test
    void setChannel() {
    }

    @org.junit.jupiter.api.Test
    void setPower() {
    }
}