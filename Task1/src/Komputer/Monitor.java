package Komputer;

public class Monitor {
    double diagonal;
    private TypeOfDiagonal typeOfDiagonal;
    int weight;

    public Monitor() {
    }

    public Monitor(double diagonal, TypeOfDiagonal typeOfDiagonal, int weight) {
        this.diagonal = diagonal;
        this.typeOfDiagonal = typeOfDiagonal;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public TypeOfDiagonal getTypeOfDiagonal() {
        return typeOfDiagonal;
    }

    public void setTypeOfDiagonal(TypeOfDiagonal typeOfDiagonal) {
        this.typeOfDiagonal = typeOfDiagonal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", typeOfDiagonal=" + typeOfDiagonal +
                ", weight=" + weight +
                '}';
    }
}
