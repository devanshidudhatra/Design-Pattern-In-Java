class IPhoneBuilder implements PhoneBuilder {
    private String os;
    private int ram;
    private int battery;

    @Override
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    @Override
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    @Override
    public Phone getPhone() {
        return new Phone(os, ram, battery);
    }
}
