package sim2604;

enum Season { SPRING, SUMMER, WINTER }
public class Weather {
    public int getAverageTemperate(Season s){
        switch (s){
            default:
            //case SUMMER | WINTER: return 30;
            //case SUMMER -> return 30;
            //case FALL: return 30;
            case WINTER: return 30;
            //case SUMMER | WINTER: return 30;
             //return 0;
        }
    }
}