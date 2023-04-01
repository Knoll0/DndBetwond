public class Dragonborn extends Race {

    private String size;
    private int speed;
    private String color;


    Dragonborn(int age, String alignment, String color) {
        super(age, alignment);
        this.color = color.toLowerCase();
        super.addLanguage("draconic");
        colorResist(this.color);
        
    }

    private void colorResist(String color){
        switch(color){
            case "black":
                super.addResist("acid");
                break;
            case "blue":
                super.addResist("lightning");
                break;
            case "brass":
                super.addResist("fire");
                break;
            case "bronze":
                super.addResist("lightning");
                break;
            case "copper":
                super.addResist("acid");
                break;
            case "gold":
                super.addResist("fire");
                break;
            case "green":
                super.addResist("poison");
                break;
            case "red":
                super.addResist("fire");
                break;
            case "silver":
                super.addResist("cold");
                break;
            case "white":
                super.addResist("cold");
                break;
        }
    }


    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
