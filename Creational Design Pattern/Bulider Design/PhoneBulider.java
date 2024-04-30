public class PhoneBulider {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBulider setOs(String os1){
        this.os = os1;
        return this;
    }
    public PhoneBulider setRam(int ram1) {
        this.ram = ram1;
        return this;
    }
    public PhoneBulider setProcessor(String processor1) {
        this.processor = processor1;
        return this;
    }
    public PhoneBulider setScreensize(double screensize1){
        this.screensize = screensize1;
        return this;
    }
    public PhoneBulider setBattery(int battery1){
        this.battery = battery1;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os, ram, processor, screensize, battery);
    }
}
