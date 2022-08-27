import main.java.animals.Kotik;

import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Kotik kotik1 = new Kotik("Мультик", "мяу", 0, 4);

        Kotik kotik2 = new Kotik();
        kotik2.setName("Симба");
        kotik2.setVoice("мяв");
        kotik2.setSatiety(1);
        kotik2.setWeight(3);

        String[] kotik1Day = kotik1.liveAnotherDay();
        for (String day: kotik1Day) {
            System.out.println(day);
        }

        System.out.println("Второго котика зовут " + kotik2.getName());
        System.out.println("Второй котик весит " + kotik2.getWeight() + " кг");

        if(compareVoice(kotik1, kotik2)) {
            System.out.println("Котики разговаривают одинаково :)");
        } else {
            System.out.println("Котики разговаривают по-разному :(");
        }

        Field field = Kotik.class.getDeclaredField("count");
        field.setAccessible(true);
        System.out.println("Было создано котиков: " + field.get(null));
    }

    static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}
