package acatnight;

public class six {
    public static void main(String[] args) {
        int number = 0;
        for(int i = 1;i<=9;i++){
            if(i % 2 == 1){
                number = number + i;
            }

        }
        System.out.println(number);
        if(number % 2 ==0){
            System.out.println("是偶数");
        } else {
            System.out.println("奇数");
        }

    }

}
