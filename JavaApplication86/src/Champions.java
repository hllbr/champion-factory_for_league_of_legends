
public class Champions {//sper class
    private String name ;
    private String skill ;
    private int skillNumber ;
    private String speel ;

    public Champions(String name, String skill, int skillNumber, String speel) {
        this.name = name;
        this.skill = skill;
        this.skillNumber = skillNumber;
        this.speel = speel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getSkillNumber() {
        return skillNumber;
    }

    public void setSkillNumber(int skillNumber) {
        this.skillNumber = skillNumber;
    }

    public String getSpeel() {
        return speel;
    }

    public void setSpeel(String speel) {
        this.speel = speel;
    }
    //common method
    public void placeatotemonthebush(){
        System.out.println(name +" totem threw the bush");
        
    }
    public void use_ult(){
        System.out.println("Ulti is in waiting time");
    }
    public void showdata(){
        System.out.println("selected champion : "+name);
        System.out.println("abilities the champion has "+skill);
        System.out.println("skill number : "+skillNumber);
        System.out.println("your spel : " +speel);
    }

    
}
