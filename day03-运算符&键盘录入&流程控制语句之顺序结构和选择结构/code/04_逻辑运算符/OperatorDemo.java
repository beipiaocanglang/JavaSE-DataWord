/**
 * 逻辑运算符
 *      &、|、^、！、&&、||
 * 
 * 特点：
 *      逻辑运算符一般用于连接boolean型表达式或值，在Java中不可以写成3<x<6，应该写成x>3 & x<6
 * 
 * 结论：
 *      &逻辑与：有false则flase，左右两边都是true时才是true
 *      |逻辑或：有true则true，左右两边都是false时才是false
 *      ^逻辑异或：左右两边相同false，不同true(例如情侣，异性为情侣)
 *      !逻辑非：非true即false，非false即true(偶数个!不改变本身)
 *      &&逻辑双与：和逻辑与的效果相同，只是&&具有短路效果，左边false右边不执行，左边true时右边才参与运算
 *      ||逻辑双或：和逻辑或的效果相同，只是||具有短路效果，左边true右边不执行，因为只要有一个为true结果就为true
 * 开发中常用
 *      !、 &&、 ||
 */
public class OperatorDemo {
    public static void main(String[] args){   
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println("**************** & ****************");
        //逻辑与(&):有false则false，左右两边都是true时才是true
        System.out.println((a>b) & (a>c));//false & false = false
        System.out.println((a>b) & (a<c));//false & true = false
        System.out.println((a<b) & (a>c));//true & false = false
        System.out.println((a<b) & (a<c));//true & true = true

        System.out.println("**************** | ****************");
        //逻辑与或|):有true则true，左右两边都是false时才是false
        System.out.println((a>b) | (a>c));//false | false = false
        System.out.println((a>b) | (a<c));//false | true = true
        System.out.println((a<b) | (a>c));//true | false = true
        System.out.println((a<b) | (a<c));//true | true = true

        System.out.println("**************** ^ ****************");
        //逻辑异与(^):左右两边相同false，不同true(例如情侣，异性为情侣)
        System.out.println((a>b) ^ (a>c));//false ^ false = false
        System.out.println((a>b) ^ (a<c));//false ^ true = true
        System.out.println((a<b) ^ (a>c));//true ^ false = true
        System.out.println((a<b) ^ (a<c));//true ^ true = false

        System.out.println("**************** ! ****************");
        //逻辑非(!):非true即false，非false即true(偶数个!不改变本身)
        System.out.println(!(a>b));//!false = true
        System.out.println(!(a<b));//!true = false
        System.out.println(!!(a<b));//!(!true = false) = true
        System.out.println(!!!(a<b));//(!!(!true = false) = true) = false

        System.out.println("**************** && ****************");
        //逻辑双与(&&):和逻辑与的效果相同，只是&&具有短路效果，左边false右边不执行，左边true时右边才参与运算
        System.out.println((a>b) && (a>c));//false && false = false
        System.out.println((a>b) && (a<c));//false && true = false
        System.out.println((a<b) && (a>c));//true && false = false
        System.out.println((a<b) && (a<c));//true && true = true

        System.out.println("**************** || ****************");
        //逻辑或(||):和逻辑或的效果相同，只是||具有短路效果，左边true右边不执行，因为只要有一个weitrue结果就为true
        System.out.println((a>b) || (a>c));//false || false = false
        System.out.println((a>b) || (a<c));//false || true = true
        System.out.println((a<b) || (a>c));//true || false = true
        System.out.println((a<b) || (a<c));//true || true = true
    } 
}