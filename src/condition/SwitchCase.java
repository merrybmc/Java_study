package condition;

public class SwitchCase {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";

//        switch
        switch (month){
//            case 연산
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "6월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "11월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "unknown";
                break;
        }
        System.out.println(monthString);
    }
}