package acatnight;

public class five {
    public static void main(String[] args) {
        //使用 for 循环批量产生数据
        for(int i = 1;i <=100;i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        //2.定义1个变量 储存数组
        int sum = 0;
        //1.定义1个循环 先产生1-5 这五个数
        for(int i = 1;i <=5;i++) {
            sum = sum + i;
        }
        System.out.println("1~5数据的和"+sum);

        System.out.println("------------------------------");
        int sun = 0;
        for(int i = 1; i <100;i+=2){
            sun = sun + i;
        }
        System.out.println("1~100奇数的和"+sun);

        System.out.println("-------------------------------");
        int sum2 = 0;
        for(int i = 1;i<=100;i++){
            if(i%2==1){
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2);
    }
    }

