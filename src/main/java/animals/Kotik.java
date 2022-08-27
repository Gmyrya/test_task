package main.java.animals;

public class Kotik {
    private String name;

    private String voice;

    private Integer satiety;

    private Integer weight;

    private static int count;

    private final int METHODS = 5;

    public Kotik(String name, String voice, Integer satiety, Integer weight) {
        this();
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Integer getSatiety() {
        return satiety;
    }

    public void setSatiety(Integer satiety) {
        this.satiety = satiety;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCount() {
        return count;
    }

    public boolean play() {
        if (this.satiety > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sleep() {
        if (this.satiety > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean wash() {
        if (this.satiety > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean walk() {
        if (this.satiety > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hunt() {
        if (this.satiety > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void eat(Integer satiety) {
        this.satiety = this.satiety + satiety;
    }

    public void eat(Integer satiety, String food) {
        this.satiety = this.satiety + satiety;
    }

    public void eat() {
        eat(1, "коричневые камушки");
    }

    public String[] liveAnotherDay() {
        String[] result = new String[24];
        for(int i = 0; i < 24; i++) {
            int method_number = (int) (Math.random() * METHODS);
            switch (method_number) {
                case  (0):
                    if(play()) {
                        result[i] = i + " - играл";
                        this.satiety = this.satiety - 1;
                    } else {
                        eat(1);
                        result[i] = i + " - ел";
                    }
                    break;
                case (1):
                    if(sleep()) {
                        result[i] = i + " - спал";
                        this.satiety = this.satiety - 1;
                    } else {
                        eat(1);
                        result[i] = i + " - ел";
                    }
                    break;
                case (2):
                    if(wash()) {
                        result[i] = i + " - мылся";
                        this.satiety = this.satiety - 1;
                    } else {
                        eat(1);
                        result[i] = i + " - ел";
                    }
                    break;
                case (3):
                    if(walk()) {
                        result[i] = i + " - гулял";
                        this.satiety = this.satiety - 1;
                    } else {
                        eat(1);
                        result[i] = i + " - ел";
                    }
                    break;
                case (4):
                    if(hunt()) {
                        result[i] = i + " - охотился";
                        this.satiety = this.satiety - 1;
                    } else {
                        eat(1);
                        result[i] = i + " - ел";
                    }
                    break;
            }
        }
        return result;
    }
}
