day01
    什么是跨平台性：
        跨平台就是跨操作系统
        Java语言是跨平台的，而JVM不是跨平台的。
        Java语言是通过JVM跨平台的
        JVM相当于翻译，想要和其他国家进行交流则需要翻译人员会对应国家的语言，针对不同的系统会有不同的JVM

    JRE与JDK区别
        JRE(Java Runtime Environment：Java运行环境)
            包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。

        JDK(Java Development Kit：Java开发工具包)
            JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE。所以安装了JDK，就不用在单独安装JRE了。
            其中包含的开发工具：编译工具(javac.exe)  打包工具(jar.exe)等
        
        *简单而言：
            使用JDK开发完成的java程序，交给JRE去运行，由JVM保证跨平台

    Java语言特点特点：
        简单性		
        面向对象		
        分布式处理	
        健壮性		
        结构中立		
        *开源(开放源代码)
        *跨平台(跨操作系统)
        *多线程
        解释性
        高性能
        动态
        安全性

    path和classpath的区别
        path环境变量里面记录的是可执行性文件，如.exe文件，对可执行文件先在当前路径去找，如果没找到就去path环境变量中配置的路径去找
        
        classpath环境变量里记录的是java类的运行文件( .class)所在的目录



day02
    1、关键字统计：(记住这些关键字就行  其他的自己拼写)
        见图1
        * 用于定义数据类型的关键字
            class、interface、byte、short
            int、long、float、double
            char、boolean、void

        * 用于定义数据类型值的关键字
            true、false、null

        * 用于定义流程控制的关键字
            if、else、switch、case
            default、while、do
            for、break、continue、return

        * 用于定义访问权限修饰符的关键字
            private、protected、public
            
        * 用于定义类，函数，变量修饰符的关键字
            abstract、final、static、synchronized
            
        * 用于定义类与类之间关系的关键字
            extends、implements
            
        * 用于定义建立实例及引用实例，判断实例的关键字
            new、this、super、instanceof
            
        * 用于异常处理的关键字
            try、catch、finally、throw、throws
            
        * 用于包的关键字
            package/import

        * 其他修饰符关键字
            native、strictfp、transient、volatile、assert

    2、数据类型分类 
        2.1、基本数据类型
            数值型：
                整数类型：默认int
                    byte：占用存储空间：1字节、表数范围：-128 ~~ 127
                    short：占用存储空间：2字节、表数范围：-2^15 ~~ 2^15-1
                    int：占用存储空间：4字节、表数范围：-2^31 ~~ 2^31-1
                    long：占用存储空间：8字节、表数范围：-2^63 ~~ 2^63-1
                    备注：
                        声明long型常量必须在值后加 ‘l’ 或 ‘L’，否则会报错
                        long j = 1000000000000;//虽然定义的是long类型，但是整数型默认是int类型 所以还是会自动转换成int类型 但是int类型已经表示不了这个数值了，所以会报错
                        long j = 1000000000000L;//定义了long类型，加上了L  标识这是long类型，所以不会报错
                                    
                浮点类型：默认double
                    float：占用存储空间：4字节、表数范围：-3.403E38 ~~ 3.403E38
                    double：占用存储空间：8字节、表数范围：-1.798E308 ~~ 1.798E308
                    备注：
                        声明float型常量必须在值后加 ‘f’ 或 ‘F’，否则会报错
                        float f = 12.345;//默认会转成double类型(占用8个字节)，float占用4个字节，已经不能表示了  所以会损失精度
                        float f = 12.345F;//加上了F就标识了这是一个float类型
                        double f = 12.345;//正常不会报错

            字符型：
                char：占用存储空间：2字节
                备注：
                    char 型数据用来表示通常意义上的“字符”，字符常量为用单引号括起来的单个字符(不是字符串)
                    Java 字符采用 Unicode 编码，每个字符占两个字节，因而可用十六进制编码形式表示。注：Unicode是全球语言统一编码

            布尔型：
                boolean：占用存储空间：1字节、表数范围：true、false
                备注：
                    类型适于逻辑运算，一般用于程序流程控制。
                    boolean 类型数据只允许取值 true 或 false ，不可以 0 或非 0 的整数替代 true 和 false ，这点和C语言不同。

            注意：
                (0): Java基本数据类型有固定的表数范围和字段长度，其不受具体操作系统的影响，以保证Java程序的可移植性。

                (1): 整数默认是int类型
                
                (2): 浮点数默认是double类型。                        
                
                (3): 长整型后缀用L或者l标记。建议使用L。
                
                (4): 单精度浮点数用F或者f标记。建议使用F。                
                
                (5): boolean类型不能转换为其他的数据类型

                (6): 作用域	
                        变量定义在哪一级大括号中，哪个大括号的范围就是这个变量的作用域。相同的作用域中不能定义两个同名变量。

                (7): 初始化值
                    没有初始化值的变量不能直接使用
                    
                    在一行上建议只定义一个变量
                    
                    可以定义多个，但是不建议

        2.2、引用数据类型
            类：class

            接口：interface

            数组：[]
    3、面试题
        /**
        * 面试&思考
        *      1、请问下面这两个有没有问题
        *          double d = 12.345;
        *          float f = d;
        *      2、请问下面的两个有问题吗？如果让你选择 你会选择使用哪一个
        *          float f1 = (float)12.345;
        *          float f2 = 12.345F;
        *      3、面试题1
        *           byte b1=3,b2=4,b;
        *           b=b1+b2;
        *           b=3+4;
        *           哪句是编译失败的呢？为什么呢？
        *      4、面试题2
        *          byte b = 130;有没有问题?如果我想让赋值正确，可以怎么做?结果是多少呢?
        *          
        *  
        */
    class DataTypeDemo3 {
        public static void main(String[] args) {

            /**
                * 请问下面这两个有没有问题
                * 有问题：
                *      浮点数默认是double类型，double类型大于float类型，编译时会出现损失精度的问题
                *      如果想要可以需要加强制转换
                */
            double d = 12.345;
            //float f = d;
            float f = (float)d;

            System.out.println(f);

            /**
                * 请问下面的两个有问题吗？如果让你选择 你会选择使用哪一个
                * 没有问题；结果都一样，
                *      第一种是double类型(浮点数默认double类型)使用了强制转换，可能会损失精度
                *      第二种直接定义了float类型不会损失精度
                * 如果要使用会选择第二种
                */
            float f1 = (float)12.345;
            float f2 = 12.345F;
            System.out.println(f1);
            System.out.println(f2);

            /**
                * 面试题1
                *      定义了三个变量byte b1=3; byte b2=4; byte b;   
                */
            byte b1 = 3, b2 = 4, b;

            //b1 是byte类型，b2是byte类型，b是byte类型，两个byte类型相加 首先会转成int类型 将int类型赋值给byte类型  会损失精度
            //b = b1 + b2;
            
            //3和4是常量，常量的计算是先把结果计算出来  看结果是否在byte类型的范围内  在就不报错
            b = 3 + 4;
            System.out.println(b);

            /**
                * 面试题2
                *  byte c = 130;有没有问题?如果我想让赋值正确，可以怎么做?结果是多少呢?
                */
            //有问题，byte的取值范围-128~127，130超出了取值范围 会损失精度
            //byte c = 130;
            
            /**
                * 可以解决，需要加强转  结果是-126
                * 分析过程：
                *   我们要想知道结果是什么，就应该知道是如何进行计算的。
                *   而我们又知道计算机中数据的运算都是补码进行的。
                *   而要得到补码，首先要计算出数据的二进制。
                *   
                *   A:获取130这个数据的二进制。
                *       00000000 00000000 00000000 10000010
                *       这是130的原码，也是反码，还是补码。
                *   B:做截取操作，截成byte类型的了。
                *       10000010 
                *       这个结果是补码。
                *   C:已知补码求原码。
                *               符号位		数值位
                *       补码：	1			0000010
                *       
                *       反码：	1			0000001
                *       
                *       原码：	1			1111110
                *      
                */
            byte e = (byte)130;
            System.out.println(e);

            byte b1 = 127;
            byte b2 = (byte)128; //-128
            byte b3 = (byte)129; //-127
            byte b4 = (byte)130; //-126
        }
    }
    4、强制转换 
        (1): 默认装换是从小的数据类型到到的数据类型(byte,short,char 相互之间不转换，他们参与运算首先转换为int类型)

        (2): 强制转换是从大的数据类型到小的数据类型。                    
        
        (3): 格式：目标数据类型 变量 = (目标数据类型) (被转换的数据);                
        
        (4): 注意：不要随意的去使用强制转换，因为它隐含了精度损失问题。

    5、Java语言中的字符char可以存储一个中文汉字吗?为什么呢?
        可以。因为java语言中的字符占用两个字节。
        
        Java语言采用的是Unicode编码。
day03
    /**
     * 面试题
     *      short s=1; s = s+1; 
     *      short s=1; s+=1;
     *      上面两个代码有没有问题，如果有，那里有问题
     *      
     *  第一个有问题：
     *      会出现损失精度的问题
     * 
     *  第二个没有问题：
     *      扩展赋值运算符其实隐含了类型的强制转换
     *      s += 1;
     *      不等于s = s + 1;
     *      而是等价于s = (s的数据类型)(s + 1)
     *      
     */
    public class OperatorDemo1{
        public static void main(String[] args){
            /**
             * 有问题：
             *      s是short类型，在做运算时会自动转成int类型，而s+1是int类型之间的运算，
             *      将int类型的运算结果int类型赋值给short类型，会损失精度
             */
            short s = 1; 
            s = s + 1;
            System.out.println(s);
            
            /**
             * 没有问题，结果是2
             *      扩展赋值运算符隐含着强制转换
             *      s += 1 不等于 s = s + 1
             */
            short d = 1; 
            d += 1;
            System.out.println(d);
        }
    }

    &和&&的区别？ |和||的区别？
        &逻辑与：有false则flase，左右两边都是true时才是true
        |逻辑或：有true则true，左右两边都是false时才是false
        &&逻辑双与：和逻辑与的效果相同，只是&&具有短路效果，左边false右边不执行，左边true时右边才参与运算
        ||逻辑双或：和逻辑或的效果相同，只是||具有短路效果，左边true右边不执行，因为只要有一个为true结果就为true


    /**
     * 面试题
     *      1、请自己实现两个整数变量的交换
     *      2、请用最有效率的方式写出计算2乘以8的结果
     */
    public class OperatorDemo1 {
        public static void main(String[] args){   
            int a = 10;
            int b = 20;

            /**
             * 1、请自己实现两个整数变量的交换
             */
            //方式1：使用第三方变量交换(开发中用的)
            /*int c = a;

            a = b;

            b = c;

            System.out.println("a:"+a+"b:"+b);*/

            //方式2：使用位异或(面试)
            //左边：a、b、a
            //右边：a^b

        /* a = a ^ b;
            b = a ^ b;//a^b^b=a=b b已变成了a
            a = a ^ b;//a^b^a=b=a

            System.out.println("a:"+a+"b:"+b);*/

            //方式3：变量相加
            /*a = a + b;//30
            b = a - b;//30-20=10
            a = a - b;//30-10
            System.out.println("a:"+a+"b:"+b);*/

            //方式4：一句话搞定
            b = (a+b) - (a=b);//先算小括号a+b=30、再算a=b 这是a=20 所以b=10
            System.out.println("a:"+a+"b:"+b);
            /**
             * 2、请用最有效率的方式写出计算2乘以8的结果
             */
            System.out.println(2 << 3);//2 * 2^3 = 2 * 8 = 16
        }   
    }
         
    
day04
    switch表达式的取值：byte,short,int,char类型
    JDK5以后可以是枚举
    JDK7以后可以是String

    注意：
       \X:x为未知字符，标识转移字符
       '\n'    换行
       ‘\t’    tab键的位置
       ‘\r’    回车


    (1):三种循环的区别以及使用顺序
       /**
        * 流程控制语句--循环区别
        *      do...while循环至少执行一次循环体
        *      for和while循环必须先判断条件是否成立，才能决定是否执行循环体
        * for while循环的区别
        *      A:for循环语句和while循环语句可以等价转换，但还是有些小区别的
        *      B:区别
        *          使用区别：
        *              控制条件语句所控制的那个变量，
        *              在for循环结束后，就不能再被访问到了，
        *              而while循环结束还可以继续使用，
        *              如果你想继续使用，就用while，否则推荐使用for。
        *              原因是for循环结束，该变量就从内存中消失，能够提高内存的使用效率。
        *
        *          场景区别：
        *              for循环适合针对一个范围判断进行操作
        *              while循环适合判断次数不明确操作
        * 三种循环语句的使用顺序：
        *      for > while > do...while
        *
        */
       class XunHuanDiffDemo {
           public static void main(String[] arge){
               //do...while循环,至少执行一次循环体
               int x = 3;
               do{
                   System.out.println("我爱java--do...while循环");
                   x++;
               } while (x<3);

               System.out.println("*************************");

               //while循环，条件成立才能执行循环体
               int y = 4;
               while(y < 4){
                   System.out.println("我爱java--while循环");
                   y++;
               }
               
           }
       }   



    /**
     * 流程控制语句 -- 选择结构(switch语句)
     * 
     * 格式：
     *      switch(表达式) {
     *          case 值1：
     *			    语句体1;
     *			    break;
     *		    case 值2：
     *			    语句体2;
     *			    break;
     *		   ......
     *		    default：	
     *			    语句体n+1;
     *			    break;
     *      }
     * 
     * 格式解释：
     *       switch：表示这是switch语句
     *          表达式的取值：byte,short,int,char
     *          JDK5以后可以是枚举
     *          JDK7以后可以是String
     * 
     *       case：case后面跟的是要和表达式进行比较的值
     *       语句体：可以是一条或多条语句
     *       break：表示中断，结束的意思，可以结束switch语句 
     *       default：语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
     * 
     * 执行流程：
     *       首先计算出表达式的值
     *       其次，和case依次比较，一旦有对应的值，就会执行相应的语句体，在执行的过程中，遇到break就会结束。
     *       最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉
     * 
     * 注意事项
     *       A:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
     *       B:default可以省略吗?
     *          可以省略。一般不建议。它的作用是对其他不正确的q情况给出提示
     *          特殊情况：
     *              除非判断的值是固定的。(比如单选题(只有ABCD不可能出现别的))
     *       C:break可以省略吗?
     *          最后一个可以省略
     *          其他也可以省略，但是一般不建议。否则结果可能不是你想要的(会出现case穿透)，
     *          例如：
     *              将下面案例中case为5的break注释，当键盘输入4时会输出两条结果
     *       D:default的位置一定要在最后吗?
     *          可以出现在switch语句任意位置。相当于if语句中的else
     *       E:switch语句的结束条件
     *          遇到break
     *          执行到程序的末尾
     *
     * 案例：
     *      根据键盘录入的数字判断并且输出对应的星期
     *      需求：
     *          键盘录入1，输出对应的星期一，
     *          键盘录入2，输出对应的星期二，
     *          。。。。。。
     *          键盘录入7，输出对应的星期日，
     */
    import java.util.Scanner;
    class SwitchDemo {
        public static void main(String[] args) {
            //创建Scanner对象
            Scanner sc = new Scanner(System.in);
            //提示语
            System.out.println("请输入一个数字(1~7)。");
            int inputNum = sc.nextInt();

            //定义一个变量, 错误: 需要常量表达式
            int num = 3;

            switch(inputNum){
                case 1:
                    System.out.println("您输入的数字对应的是星期一");
                    break;
                case 2:
                    System.out.println("您输入的数字对应的是星期二");
                    break;
                case 3:
                    System.out.println("您输入的数字对应的是星期三");
                    break;
                /*
                case后面的值不能重复，错误: case 标签重复
                case 3:
                    System.out.println("您输入的数字对应的是星期三");
                    break;
                */
                /*
                case后面的值不能是变量，错误: 需要常量表达式
                case num:
                    System.out.println("您输入的数字对应的是星期三");
                    break;
                */
                case 4:
                    System.out.println("您输入的数字对应的是星期四");
                    break;
                case 5:
                    System.out.println("您输入的数字对应的是星期五");
                    //如果将这里的break注释掉，结果可能不是想要的(case穿透)
                    break;
                case 6:
                    System.out.println("您输入的数字对应的是星期六");
                    break;
                case 7:
                    System.out.println("您输入的数字对应的是星期日");
                    break;
                default:
                    System.out.println("您输入的数字有误请重新输入。。。。");
                    break;
            }
        }
    }


java中参数传递的问题
    基本类型：形式参数的改变对实际参数没有影响(传递的是数值)
    引用类型：形式蚕食的改变直接影响实际参数(传递的是地址值)







