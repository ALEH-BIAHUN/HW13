package Komputer;

public class HardDrive {
    private TypeOfHardDrive typeOfHardDrive;
    int volume;
    int weight;

    public HardDrive() {
    }

    public HardDrive(TypeOfHardDrive typeOfHardDrive, int volume, int weight) {
        this.typeOfHardDrive = typeOfHardDrive;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeOfHardDrive getTypeOfHardDrive() {
        return typeOfHardDrive;
    }

    public void setTypeOfHardDrive(TypeOfHardDrive typeOfHardDrive) {
        this.typeOfHardDrive = typeOfHardDrive;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "typeOfHardDrive=" + typeOfHardDrive +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
