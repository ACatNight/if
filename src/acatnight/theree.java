package acatnight;
//掌握switch的写法
//注意事项
//表达式只能是byte,short,int,char
//不支持double,folat,long
//case给出的值不允许重复,只能是字面量,不能变量
//正常使用Switch,不要忘记写break,否则会出现穿透现象;
public class theree {
    public static void main(String[] args) {
        String week = "周一";
        switch (week) {
            case "周一":
                System.out.println("摸鱼1");
                break;
            case "周二":
                System.out.println("摸鱼2");
                break;
            case "周三":
                System.out.println("摸鱼3");
                break;
            case "周四":
                System.out.println("摸鱼4");
                break;
            case "周五":
                System.out.println("摸鱼5");
                break;
            case "周六":
                System.out.println("摸鱼6");
                break;
            case "周日":
                System.out.println("摸鱼7");
                break;
            default:
                System.out.println("当前日期不存在");

        }
    }
}
