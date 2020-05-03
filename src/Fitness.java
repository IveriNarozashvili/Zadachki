public class Fitness {
    public static int calc(int ivan, int nick) {
        int month = 0;
        while (ivan < nick) {
            ivan *= 3;
            nick *= 2;
            month++;
            if (ivan > nick)
                break;
        }
        return month;
    }

    public static void main(String[] args) {
        int ivan = 90 ;
        int nick = 100;
        System.out.println(calc(ivan,nick));
    }
}