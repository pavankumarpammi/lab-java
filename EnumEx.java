enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class EnumEx {
    public static void main(String[] args) {
        Week w=Week.MON;
        System.out.println(w);
        Week wr[]=Week.values();
        for(Week k:wr)
        {
            System.out.println(k+" : "+k.ordinal());
        }
    }
}
