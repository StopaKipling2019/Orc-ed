import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //choose intelligence, keep base damage the same
        int intelligence = 21;
        Random rand = new Random();
        int baseDmg = 5;
        double damageInt = intelligence*baseDmg;

            //test 10 times and add up total damage

        double dmgMod1 = rand.nextDouble() + 0.5;
        double damage1 = damageInt * dmgMod1;

        double dmgMod2 = rand.nextDouble() + 0.5;
        double damage2 = damageInt * dmgMod2;

        double dmgMod3 = rand.nextDouble() + 0.5;
        double damage3 = damageInt * dmgMod3;

        double dmgMod4 = rand.nextDouble() + 0.5;
        double damage4 = damageInt * dmgMod4;

        double dmgMod5 = rand.nextDouble() + 0.5;
        double damage5 = damageInt * dmgMod5;

        double dmgMod6 = rand.nextDouble() + 0.5;
        double damage6 = damageInt * dmgMod6;

        double dmgMod7 = rand.nextDouble() + 0.5;
        double damage7 = damageInt * dmgMod7;

        double dmgMod8 = rand.nextDouble() + 0.5;
        double damage8 = damageInt * dmgMod8;

        double dmgMod9 = rand.nextDouble() + 0.5;
        double damage9 = damageInt * dmgMod9;

        double dmgMod10 = rand.nextDouble() + 0.5;
        double damage10 = damageInt * dmgMod10;

        double damageTot = damage1 + damage2 + damage3 + damage4 + damage5 + damage6 + damage7 + damage8 + damage9 +damage10;
        System.out.println(damageTot);

        //20 was 50 too 60 percent of time 21 was 60 to 70 percent of time

        System.out.println(intelligence)
        
        
        
        
        
        //!!used 2 separate Idea Projects to complete this so variables could be easily streamlined, second project starts here!!
        
        
        
        
        
        //choose base damage, keep intelligence the same
        int intelligence = 10;
        Random rand = new Random();
        int baseDmg = 11;
        double damageInt = intelligence*baseDmg;

        //test 10 times and add up total damage

        double dmgMod1 = rand.nextDouble() + 0.5;
        double damage1 = damageInt * dmgMod1;

        double dmgMod2 = rand.nextDouble() + 0.5;
        double damage2 = damageInt * dmgMod2;

        double dmgMod3 = rand.nextDouble() + 0.5;
        double damage3 = damageInt * dmgMod3;

        double dmgMod4 = rand.nextDouble() + 0.5;
        double damage4 = damageInt * dmgMod4;

        double dmgMod5 = rand.nextDouble() + 0.5;
        double damage5 = damageInt * dmgMod5;

        double dmgMod6 = rand.nextDouble() + 0.5;
        double damage6 = damageInt * dmgMod6;

        double dmgMod7 = rand.nextDouble() + 0.5;
        double damage7 = damageInt * dmgMod7;

        double dmgMod8 = rand.nextDouble() + 0.5;
        double damage8 = damageInt * dmgMod8;

        double dmgMod9 = rand.nextDouble() + 0.5;
        double damage9 = damageInt * dmgMod9;

        double dmgMod10 = rand.nextDouble() + 0.5;
        double damage10 = damageInt * dmgMod10;

        double damageTot = damage1 + damage2 + damage3 + damage4 + damage5 + damage6 + damage7 + damage8 + damage9 +damage10;
        System.out.println(damageTot);

        //10 50-60 percent 11 was 60-70 percent

        System.out.println(baseDmg);
    }
}
