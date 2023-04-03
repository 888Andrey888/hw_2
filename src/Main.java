import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //В методе main вызвать написанный метод 5 раз с различными входными данными
        //(аргументами) и распечатать результат в консоль.
        System.out.println(getString(46, 10));
        System.out.println(getString(25, -10));
        System.out.println(getString(15, 8));
        System.out.println(getString(30, 20));
        System.out.println(getString(18, 30));

        //ДЗ на сообразительность:
        System.out.println();
        System.out.println(getString(generateRandomAge(), 30));
    }

    //Создать возвращаемый метод который будет принимать 2 входящих параметра -
    //возраст человека и температуру на улице, и возвращать результат в виде строки.
    public static String getString(int age, int temp) {
        /*если возраст человека от 20 до 45 лет
        и температура на улице от -20 до 3 градусов, то возвращаемый результат - “Можно идти гулять”;*/
        if ((age >= 20 & age <= 45) & (temp >= -20 & temp <= 3)) {
            return "Можно идти гулять";
        }
        /*если же человеку меньше 20 лет и температура на улице в диапазоне от 0
        до 28 градусов, то результат снова - “Можно идти гулять”;*/
        else if (age < 20 & (temp >= 0 & temp <= 28)){
            return "Можно идти гулять";
        }
        /*а если человеку больше 45 лет, то результат “Можно идти гулять”
        формируется только тогда когда на улице температура в диапазоне от -10
        до 25 градусов;*/
        else if (age >45 & (temp >= -10 & temp <= 25)) {
            return "Можно идти гулять";
        }
        //В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
        else{
            return "Оставайтесь дома";
        }
    }

    //ДЗ на сообразительность:
    //Написать метод в котором генерируется случайный возраст
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(80) + 1;
    }
}