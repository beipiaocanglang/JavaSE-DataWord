/**
 * 流程控制语句 -- 选择结构(switch语句)
 * 练习题1：看程序说出结果
 */
class SwitchTest {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        /**
         * 执行流程：
         *      x:默认是2
         *      程序执行时会用表达式2的值和case的值进行对比，
         *      没有相同的会执行dufault中的语句体y++
         *      程序遇到break句结束了
         *      所以结果是4
         */
        switch(x){
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y:" + y);
        System.out.println("________________________________");

        int a = 2;
        int b = 3;

        /**
         * 执行流程：
         *      a:默认是2
         *      程序执行时会用表达式2的值和case的值进行对比，
         *      没有相同的会执行dufault中的语句体b++
         *      但是程序没有遇到break并且没有执行完成，所以还是会向下执行做两次的b++
         *      所以结果是6
         */
        switch(a){
            default:
                b++;
            case 3:
                b++;
            case 4:
                b++;
        }
        System.out.println("b:" + b);
    }
}