import Komputer.*;

public class Main {
    public static void main(String[] args) {
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(3,5);
    arithmeticCalculator.calculate(Operation.ADD);
    arithmeticCalculator.calculate(Operation.MULTIPLY);
    arithmeticCalculator.calculate(Operation.SUBTRACT);

        Processor processor = new Processor(Frequency.FOUR_THOUSAND_SIX_HUNDRED, CoreCounnt.THREE, Manufacturer.INTEL, 450);
        HardDrive hardDrive = new HardDrive(TypeOfHardDrive.SSD, 3000, 650);
        Keyboard keyboard = new Keyboard(TypeOfKeyboard.WIRELESS, LightingKeyboard.YES, 130);
        Monitor monitor = new Monitor(35.5, TypeOfDiagonal.IPS, 2500);
        RAM ram = new RAM(TypeOfRam.DDR3_SDRAM, 3600, 25);

        Computer computer = new Computer(processor, hardDrive, keyboard, monitor, ram, "INTEL", "DELL");
        System.out.println(computer.calculateWeight());
    }
}