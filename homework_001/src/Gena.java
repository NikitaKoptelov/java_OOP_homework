public class Gena extends Humon {
    private String familiuDevich;

    public Gena(String familiu, String familiuDevich, String imu_Otchestvo, String pol, double godRogd){
        super(familiu, imu_Otchestvo, pol, godRogd);
        this.familiuDevich = familiuDevich;
    }

    public String getfamiliuDevich(){
        return familiuDevich;
    }
    public void setfamiliuDevich(String familiuDevich){
        this.familiuDevich = familiuDevich;
    }
    
    @Override
    public String toString(){
        return super.toString()+", девичья фамилия - "+familiuDevich+"\n";
    }


}
