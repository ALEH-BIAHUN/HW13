package Komputer;

public class RAM {
    private TypeOfRam typeOfRam;
    private int volume;
    private int weight;

    public RAM() {
    }

    public RAM(TypeOfRam typeOfRam, int volume, int weight) {
        this.typeOfRam = typeOfRam;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeOfRam getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(TypeOfRam typeOfRam) {
        this.typeOfRam = typeOfRam;
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
        return "RAM{" +
                "typeOfRam=" + typeOfRam +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
