package condition;

public class If {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag){
            System.out.println("true");
        } else if(!flag) {
            System.out.println("false");
        } else {
            System.out.println("not a bool");
        }
    }
}
