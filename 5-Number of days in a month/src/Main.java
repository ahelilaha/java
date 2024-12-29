public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(10, 2013));
        System.out.println(getDaysInMonth(2, 2024));
        System.out.println(getDaysInMonth(3, 1989));
        System.out.println(getDaysInMonth(12, 1989));
        System.out.println(getDaysInMonth(2, 1900));
        System.out.println(getDaysInMonth(2, 2000));
    }

    public static boolean isLeapYear(int year){

        if((year >= 1) && (year <= 9999)) {
            if(year%4 == 0) {
                if(year%100 == 0){
                    return (year%400 == 0);
                }else{
                    return true;
                }
            } else {
                return false;
            }
        } else {
            //Error Case
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        // Error Case
        if((month < 1) || (month > 12) || (year < 1) || (year > 9999)){
            return -1;
        }

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                boolean isLeapyear = Main.isLeapYear(year);
                return (isLeapyear ? 29 : 28);

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default: return -1;
        }
    }
}