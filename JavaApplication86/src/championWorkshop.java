
public class championWorkshop {
    public Champions produceChampion(String Champion_type){
        if(Champion_type.equals("conspirator")){
            return new conspirator("katarina,zed,ekko,fizz,qiyana...","untargetable", 4,"ignite,flash", "assassinate");
        }else if(Champion_type.equals("tank")){
            return new tank("Sion,Maokai,Mordekaiser,poppy,ornn....", "damage reduction", 4, "Teleport,flash", "deceleration resistance");
        }else if(Champion_type.equals("Sniper")){
            return new Sniper("Caitlyn,Kaisa,Ezreal,Samira,Jhin", "critical hit", 4, "Heal,Flash", "deals high damage closely to the opponent");
        }else if(Champion_type.equals("Support")){
            return new Support("JANNA,NAMİ,PYKE,TAHM KENCH...,", "SLOW THE COMPETITOR 90%", 4, "exhaustion,flash", "giving money and life to your team");
            
        }else if(Champion_type.equals("Jung")){
            return new Jung("J4,AMUMU,RENGAR,KHAZİX....", "SHOW COMPETITOR CHAMPIONS", 4, "Cross,flash", "disable a champion from the opposing team");
        }else{
            return null;
        }
    }
    
}
