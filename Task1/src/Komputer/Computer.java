package Komputer;

public class Computer {


    private HardDrive hardDrive;
    private Keyboard keyboard;
    private Monitor monitor;
    private Processor processor;
    private RAM ram;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, HardDrive hardDrive, Keyboard keyboard, Monitor monitor, RAM ram, String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(String vendor, String name, HardDrive hardDrive, Keyboard keyboard, Monitor monitor, Processor processor, RAM ram) {
        this.vendor = vendor;
        this.name = name;
        this.hardDrive = hardDrive;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.processor = processor;
        this.ram = ram;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public double calculateWeight() {
        return processor.getWeight() + ram.getWeight() + keyboard.getWeight() + monitor.getWeight() + hardDrive.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", hardDrive=" + hardDrive +
                ", keyboard=" + keyboard +
                ", monitor=" + monitor +
                ", processor=" + processor +
                ", ram=" + ram +
                '}';
    }
}
