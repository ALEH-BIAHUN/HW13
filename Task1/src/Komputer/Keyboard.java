package Komputer;

public class Keyboard {
    private TypeOfKeyboard typeOfKeyboard;
    private LightingKeyboard lightingKeyboard;
    private int weight;

    public Keyboard() {
    }

    public Keyboard(TypeOfKeyboard typeOfKeyboard, LightingKeyboard lightingKeyboard, int weight) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.lightingKeyboard = lightingKeyboard;
        this.weight = weight;
    }

    public TypeOfKeyboard getTypeOfKeyboard() {
        return typeOfKeyboard;
    }

    public void setTypeOfKeyboard(TypeOfKeyboard typeOfKeyboard) {
        this.typeOfKeyboard = typeOfKeyboard;
    }

    public LightingKeyboard getLightingKeyboard() {
        return lightingKeyboard;
    }

    public void setLightingKeyboard(LightingKeyboard lightingKeyboard) {
        this.lightingKeyboard = lightingKeyboard;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "typeOfKeyboard=" + typeOfKeyboard +
                ", lightingKeyboard=" + lightingKeyboard +
                ", weight=" + weight +
                '}';
    }
}