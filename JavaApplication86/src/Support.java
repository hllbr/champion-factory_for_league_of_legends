
public class Support extends Champions{//sup class
     private String champion_passive ;

    public Support(String name, String skill, int skillNumber, String speel,String champion_passive) {
        super(name, skill, skillNumber, speel);
    }

    @Override
    public void showdata() {
        super.showdata(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/");
        System.out.println("champion passive : " +champion_passive);
    }

    @Override
    public void use_ult() {
        super.use_ult(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getName()+" passive active "+champion_passive );
        System.out.println("Your support is tanking the damage for the shooter to survive");
    }

    @Override
    public void placeatotemonthebush() {
        super.placeatotemonthebush(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
