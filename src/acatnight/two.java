package acatnight;

public class two {
    public static void main(String[] args) {
        int a = 1020;
        if(a>=0&&a<60) {
            System.out.println("D");
        } else if (a>=60&&a<80) {
            System.out.println("C");
        } else if (a>=80&&a<90) {
            System.out.println("B");
        } else if (a>=90&&a<=100) {
            System.out.println("A");
        }else {
            System.out.println("您录入的分数有问题");
        }
    }
}
