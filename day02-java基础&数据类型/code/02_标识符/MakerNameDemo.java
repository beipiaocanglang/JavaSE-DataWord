import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 标识符概述：
 *      就是给类,接口,方法,变量等起名字时使用的字符序列
 *       
 * 要求规范组成规则(其他的也可以，只是不建议)：
 *      英文大小写字母
 *      数字字符
 *      $和_
 *       
 * 注意事项
 *      不能以数字开头
 *      不能是Java中的关键字
 *      区分大小写
 * 
 * 常见的命名规则：见名知意
 *      (1): 举例
 *           我要定义一个学生类
 *               class Student {}  可以
 *               class S{}         不可以   因不知  s  是什么
 *
 *      (2): 包：其实就是文件夹，用于把相同的类名进行区分，全部小写
 *           单级：liuyi
 *           多级：cn.itcast （.用于隔开文件夹）
 *               cn        （cn是文件夹）
 *               itcast    （cn下的又一个文件夹） 
 *
 *      (3): 类或者接口：
 *           一个单词：单词的首字母必须大写
 *              举例：Student,Dog
 * 
 *           多个单词：每个单词的首字母必须大写
 *              举例：HelloWorld,StudentName  
 *
 *      (4): 方法或者变量：
 *           一个单词：单词的首字母小写
 *              举例：main,age
 * 
 *           多个单词：从第二个单词开始，每个单词的首字母大写
 *              举例：studentAge,showAllNames()    
 *
 *      (5): 常量：
 *           一个单词：全部大写
 *               举例：PI
 * 
 *           多个单词：每个字母都大写(单词之间)用_隔开
 *              举例：STUDENT_MAX_AGE
 */
class MakerNameDemo {
    public static void main(String[] arges) {
        int y = 100;
        //int 1y = 100;
        //int class = 100;
        int Class = 100;

        System.out.println("正确的标识符："+y);
        //System.out.println("以数字开头的标识符："+1y);
        //System.out.println("关键字的标识符："+class);
        System.out.println("区分大小写的标识符："+Class);
    }
}