public class PhoneBulider1 {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public void setOs(String os1){
        this.os = os1;
    }
    public void setRam(int ram1) {
        this.ram = ram1;
    }
    public void setProcessor(String processor1) {
        this.processor = processor1;
    }
    public void setScreensize(double screensize1){
        this.screensize = screensize1;
    }
    public void setBattery(int battery1){
        this.battery = battery1;
    }
    public Phone getPhone(){
        return new Phone(os, ram, processor, screensize, battery);
    }

}
