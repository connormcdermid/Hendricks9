/*
  author: Frank Gomes
  lab: Television lab
  date: 16-09-19
  extra: Stops user from going to non-existent channels with ChannelOutOfBoundsException
 */

class Television {
    // TV specs
    private final String brand; // Manufacturer name
    private final float size; // TV's screen size

    // TV status
    private int channel = 2; // Current channel the TV is on, default 1
    private boolean power = false; // Power state of the TV
    private int volume = 20; // Volume of the TV, default 50

    // Getters
    public String getBrand() {
        return brand;
    }

    public float getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean getPower() {
        return power;
    }

    public int getVolume() {
        return volume;
    }

    // Setters
    public void setChannel(int channel) throws ChannelOutOfBoundsException {
        if (channel < 1 || channel > 999)
            throw new ChannelOutOfBoundsException(channel);
        this.channel = channel;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Object constructor
    public Television(String manufacturer, float screenSize) {
        brand = manufacturer;
        size = screenSize;
    }

    // ChannelOutOfBoundsException, thrown when user sets channel to a value too low or too high
    class ChannelOutOfBoundsException extends Exception {
        // Constructor
        ChannelOutOfBoundsException(int channel) {}

        // Returns usable message
        @Override
        public String getMessage() {
            return String.format("String %d is not a valid channel.", channel);
        }
    }
}