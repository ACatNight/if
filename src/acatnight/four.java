package acatnight;

public class four {
    public static void main(String[] args) {
        //目标 掌握for循环书写格式
        //需求打印多行Hello World
        /**
         * 流程
         *  首先初始化语句 int i = 0
         *    i = 0 ，判断0 < 3 返回 true 循环中执行第一行 Hello , 接着执行i++
         *    i = 3 结束语句
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello,world");
        }
    }
}