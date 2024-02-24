abstract class SmallArm {
    public abstract String getDescription();
    private String name;
    public SmallArm(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

}
class Pistol extends SmallArm {
    private String Action;
    public Pistol(String n, String a){
        super(n);
        Action = a;
    }
    @Override
    public String getDescription() {
        return ", a pistol with action type of " + Action;
    }
}

class Rifle extends SmallArm {
    private String length;
    public Rifle(String n, String l){
        super(n);
        length = l;
    }
    public String getDescription() {
        return ", a " + length + " long rifle";
    }
}

class Shotgun extends SmallArm{
    private String barrel;
    public Shotgun(String n, String b){
        super(n);
        barrel = b;
    }
    @Override
    public String getDescription() {
        return ", a " + barrel + " shotgun";
    }
}


public class GeneralizationSpecialization {
    public static void main(String[] args) {
        SmallArm[] gun = new SmallArm[3];
        gun[0] = new Pistol("Desert Eagle","semi-automatic");
        gun[1] = new Rifle("AK-47","880 mm");
        gun[2] = new Shotgun("Winchester Model 1897","single barreled");
        for (SmallArm g : gun)
            System.out.println(g.getName() + g.getDescription());
    }
}