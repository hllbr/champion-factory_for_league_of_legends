
public class tank extends Champions{//sub class
     private String champion_passive ;

    public tank(String name, String skill, int skillNumber, String speel,String champion_passive) {
        super(name, skill, skillNumber, speel);
        this.champion_passive = champion_passive;
    }

    @Override
    public void showdata() {
        super.showdata(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("//////////////////////////////////////////////////");
          System.out.println("champion passive : " +champion_passive);
    }

    @Override
    public void use_ult() {
        super.use_ult(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getName()+" passive active : "+champion_passive );
        System.out.println("your champion is tanking for 30 seconds");
    }

    @Override
    public void placeatotemonthebush() {
        super.placeatotemonthebush(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
