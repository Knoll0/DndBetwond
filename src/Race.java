import java.util.ArrayList;

public class Race {
    
    private int age;
    private String alignment;
    private ArrayList<String> languages;
    private ArrayList<String> resists;


    Race(int age, String alignment) {
        this.age = age;
        this.alignment = alignment;
        this.languages = new ArrayList<String>();
        this.languages.add("common");
        this.resists = new ArrayList<String>();
    }

    public void abilityScoreInc(){

    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }
    public void addLanguage(String lang){
        this.languages.add(lang);
    }
    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }


    public ArrayList<String> getResits() {
        return resists;
    }
    public void addResist(String resist){
        this.resists.add(resist);
    }
    public void setResists(ArrayList<String> resists) {
        this.resists = resists;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAlignment() {
        return alignment;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }


}
