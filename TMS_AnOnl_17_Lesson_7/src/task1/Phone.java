package task1;
import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private int weight;
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this (number, model, 0);
    }
    public Phone() {
        this(0, "unknow");
    }
    public String toString() {
        return "Phone{" + "number = " + ", model = '" + model + '\'' + ", weight = " + weight + '}';
    }
    public void receiveCall(String name) {
        System.out.printf("Вызывает %S\n, name");
    }
    public void receiveCall(String name, int number) {
        System.out.printf("Вызывает %S\nНомер абонента: %S\n, name, number");
    }
    public void getNumber() {
        System.out.printf("Номер абонента: %S\n", this.number);
    }
    public void sendMassage(int... numbers) {
        System.out.println("Сообщение отправлено на номер: ");
        System.out.println(Arrays.toString(numbers));
    }
}
