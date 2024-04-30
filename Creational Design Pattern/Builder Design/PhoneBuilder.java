interface PhoneBuilder {
    PhoneBuilder setOs(String os);
    PhoneBuilder setRam(int ram);
    PhoneBuilder setBattery(int battery);
    Phone getPhone();
}