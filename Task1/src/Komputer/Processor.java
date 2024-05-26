package Komputer;

public class Processor {
    private Frequency frequency;
    private CoreCounnt coreCounnt;
    private Manufacturer manufacturer;
    private double weight;

    public Processor() {
    }

    public Processor(Frequency frequency, CoreCounnt coreCounnt, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.coreCounnt = coreCounnt;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCounnt getCoreCounnt() {
        return coreCounnt;
    }

    public void setCoreCounnt(CoreCounnt coreCounnt) {
        this.coreCounnt = coreCounnt;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCounnt=" + coreCounnt +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
