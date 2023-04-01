public class Dwarf extends Race{

    private int speed;
    private String size;
    private boolean darkvision;
    private int darkVRange;

    Dwarf(int age, String alignment) {
        super(age, alignment);
        this.speed = 30;
        this.size = "medium";
        this.darkvision = true;
        this.darkVRange = 60;
        super.addLanguage("dwarvish");
        super.addResist("poison");
    }





    // Getters and Setters
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public boolean isDarkvision() {
        return darkvision;
    }
    public void setDarkvision(boolean darkvision) {
        this.darkvision = darkvision;
    }

    public int getDarkVRange() {
        return darkVRange;
    }
    public void setDarkVRange(int darkVRange) {
        this.darkVRange = darkVRange;
    }

    
}
