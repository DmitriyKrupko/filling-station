public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоймости топлива");

        int fuelType = 95;
        int amount = 500;
        int maxAmount = 400;

        double fuel92Price = 2.00;
        double fuel95Price = 2.10;
        double fuel98price = 1.90;

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92Price;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95Price;
        }
        else if(fuelType == 98){
            fuelPrice = fuel98price;
        }
        else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount < 1) {
            System.out.println("Слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допускимое");
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоймость заправки: " + totalPrice + " руб.");
    }
}


