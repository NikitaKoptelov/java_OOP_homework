public class Humon {
    private String familiu;
    private String imu_Otchestvo;
    private String pol;
    private double godRogd;

    public Humon(String familiu, String imu_Otchestvo, String pol, double godRogd){
        this.familiu = familiu;
        this.imu_Otchestvo = imu_Otchestvo;
        this.pol = pol;
        this.godRogd = godRogd;
    }

    public String getfamiliu(){
        return familiu;
    }
    public void setfamiliu(String familiu){
        this.familiu = familiu;
    }

    public String getimu_Otchestvo(){
        return imu_Otchestvo;
    }
    public void setimu_Otchestvo(String imu_Otchestvo){
        this.imu_Otchestvo = imu_Otchestvo;
    }

    public String getpol(){
        return pol;
    }
    public void setpol(String pol){
        this.pol = pol;
    }

    public double getgodRogd(){
        return godRogd;
    }
    public void setgodRogd(double godRogd){
        this.godRogd = godRogd;
    }

    @Override
    public String toString(){
        return "человек-{"+"фамилия-"+familiu+", имя отчество - "+imu_Otchestvo+", пол-"+pol+", год рождения-"+godRogd+"}\n";
    }

}