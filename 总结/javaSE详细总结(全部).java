
****************01-java环境配置***************

一、Java语言发展史(了解)
    詹姆斯·高斯林（James Gosling），被称之为JAVA之父。

    1983年获得了美国卡内基梅隆大学计算机科学博士学位，毕业后到IBM工作，设计IBM(服务器)第一代工作站NeWS系统，但不受重视。后来转至Sun公司，

    1990年，与Patrick，Naughton和Mike Sheridan等人合作“绿色计划”，后来发展一套语言叫做“Oak”，后改名为Java。

    JDK全称：Java Development Kit
    1.0.2
    1.1.1  1.1.6 > 1.1.7 > 1.1.8
    1.2.1

    Java 2 SDK
    1.2.2
    1.3.0  1.3.1
    1.4.0  1.4.1 > 1.4.2 > 1.5.0(5.0) > 1.6.0(6.0) 1.7.0(7.0)

    jdk8

    最长用的版本5、6、7

二、Java语言平台版本(了解)
    J2SE(Java 2 Platform Standard Edition)标准版(界面)
        是为开发普通桌面和商务应用程序提供的解决方案

        该技术体系是其他两者的基础，可以完成一些桌面应用程序的开发

    J2ME(Java 2 Platform Micro Edition)小型版(安卓，通过手机访问的)
        是为开发电子消费产品和嵌入式设备提供的解决方案

    J2EE(Java 2 Platform Enterprise Edition)企业版(网站，通过浏览器访问的)
        是为开发企业环境下的应用程序提供的一套解决方案
        该技术体系中包含的技术如 Servlet、Jsp等，主要针对于Web应用程序开发

    注意：
        SE是ME/EE的基础，想要学后两种必须先回第一种

        Java5.0版本前，叫 J2EE  J2SE  J2ME
        Java5.0版本后，更名为 JAVAEE  JAVASE  JAVAME

三、Java语言特点(熟知)
    1、特点：
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

    2、跨平台性：
        2.1、什么是跨平台性？
            通过Java语言编写的应用程序在不同的系统平台上都可以运行。

        2.2、原理是什么？
            只要在需要运行java应用程序的操作系统上，
            先安装一个Java虚拟机(JVM Java Virtual Machine)即可。
            由JVM来负责Java程序在该系统中的运行。

        2.3、图解跨平台性
            见图1

            注意：
                Java语言是跨平台的，而JVM不是跨平台的。
                Java语言是通过JVM跨平台的
                JVM相当于翻译，想要和其他国家进行交流则需要翻译人员会对应国家的语言，针对不同的系统会有不同的JVM

四、JRE与JDK(掌握)
    1、JRE与JDK区别
        JRE(Java Runtime Environment：Java运行环境)
            包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。

        JDK(Java Development Kit：Java开发工具包)
            JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE。所以安装了JDK，就不用在单独安装JRE了。
            其中包含的开发工具：编译工具(javac.exe)  打包工具(jar.exe)等

        为什么JDK中包含一个JRE呢？
            其一，开发完的程序，总需要运行一下看看效果。
            其二，也是最重要的，JDK中的开发工具其实都是java语言编写的应用程序，为了方便使用才打包成exe文件，
            如果没有JRE，那么这些工具是运行不了的。

        (1)作用
            JVM：保证Java语言跨平台
            JRE：Java程序的运行环境
            JDK：Java程序的开发环境

        (2)关系
            JDK：JRE+JAVA的开发工具
            JRE：JVM+类库

        *简单而言：
            使用JDK开发完成的java程序，交给JRE去运行，由JVM保证跨平台

    2、JDK的下载&&安装
        2.1、下载
            通过官方网站获取JDK：http://www.oracle.com

            注意：
                针对不同操作系统，下载不同的JDK版本

            下载步骤：
                见图2

        2.2、安装
            傻瓜式安装，下一步即可。

            建议：
                安装路径不要有中文或者特殊符号如空格等。最好目录统一。
                当提示安装JRE时，可以选择不安装(JDK包含JRE)。

五、入门案例
    1、开发工具介绍    
        notepad(微软操作系统自带)
        Notepad++
        Eclipse
        MyEclipse
        IntelliJ IDEA

    2、HelloWorld案例
        2.1、步骤：
            首先定义一个类(java程序是由最基本的单位类组成)：class 类名

            在类定义后加上一对大括号：{}
            
            在大括号中间添加一个主(main)方法/函数：public static void main(String [] args){ }

            在主方法的大括号中间添加一行输出语句：System.out.println(“hello world”);

        2.2、例如：
            class HelloWorld {
                public static void main(String [] args) {
                    System.out.println(“Hello World”);
                }
            }
            
    3、程序解析
        首先编写java源代码程序，扩展名.java
            
        在命令行模式中，输入javac命令对源代码进行编译，生成字节码文件：javac 源文件名.java

        编译完成后，如果没有报错信息，输入java命令对class字节码文件进行解释运行,执行时不需要添加.class扩展名：java HelloWorld

    4、运行与工作原理
        见图3

    5、常见错误
        (1)扩展名被隐藏
            如何找到：工具--文件夹选项--查看--去除隐藏扩展名的那个勾勾

        (2)我要求文件名称和类名一致。
            实际上不这样做也是可以的。
            但是，注意：
                javac后面跟的是文件名+扩展名
                java后面跟的类名不带扩展名

        (3)Java语言严格区分大小写，请注意。
            还有就是单词不要写错了。

        (4)见到非法字符: \65307肯定是中文问题。
            我们写程序要求标点符号必须全部是英文状态。

        (5)括号的配对问题。
            一般来说，括号都是成对出现的。

        (6)遇到
            在类 HelloWorld 中找不到主方法, 请将主方法定义为
            肯定是主方法的格式问题。

六、环境变量配置
    1、path环境变量配置的作用
        程序的执行需要使用外部指令javac，但是javac指令仅仅能在JDK安装目录下的bin目录下时候，因此程序只能写入bin目录

        实际程序开发过程中，不能将源代码写入JDK的安装目录，因此需要将源程序保存到任意位置的指定目录(英文目录)，所以需要使javac指令在任意目录下可以运行

        简单记：
            保证javac命令可以在任意目录下运行。

    2、path环境变量配置方式
        通过配置path环境变量，将javac指令所在目录也就是JDK安装目录下的bin目录配置到path变量下，即可使javac指令在任意目录下运行

        方式一：(删除和修改时不方便)
            win7,win8系统：
                右键点击桌面计算机→选择属性→选择高级系统设置→选择高级选项卡→点击环境变量→下方系统变量中查找path→双击path
            
            XP系统：
                右键点击桌面计算机→选择属性→选择高级选项卡→点击环境变量→下方系统变量中查找path→双击path
            
            将jdk安装目录下的bin目录添加到最左边并添加分号

        方式二：
            找到环境变量的位置，在系统变量里面
            新建：
                变量名：JAVA_HOME
                变量值：D:\develop\Java\jdk1.7.0_60
            修改：
                变量名：Path
                变量值：%JAVA_HOME%\bin;
            注意：
                path环境变量具有先后顺序

    3、classpath环境变量配置方式(了解 现在开发中不需要配置)
        创建新的变量名称：classpath

        值设定为指定的还有class文件的目录，多个目录间使用分号(;)分割(自定义用于存放编译后的class文件)

        作用：
            使classpath目录中的.class文件可以在任意目录运行

        技巧：
            通常将配置的目录最前面添加 . 配置，即便当前目录，使.class 文件搜索时首先搜索当前目录，
            
            然后根据目录配置的顺序依次查找，找到后即运行，因此classpath目录中的配置存在先后顺序

    4、path和classpath的区别
        (1)classpath环境变量的作用
            保证class文件可以在任意目录下运行

        (2)classpath环境变量的配置
            找到环境变量的位置，在系统变量里面
            新建：
                变量名：classpath
                变量值：E:\JavaSE\day01\code\HelloWorld案例


****************02-java基础***************
一、关键字
    关键字概述：被Java语言赋予特定含义的单词

    关键字特点：组成关键字的字母全部小写

    关键字注意事项：
        goto和const作为保留字存在,目前并不使用，在JDK的新版本中可能提升为关键字

        类似Notepad++这样的高级记事本,针对关键字有特殊的颜色标记，非常直观

    关键字统计：(记住这些关键字就行  其他的自己拼写)
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

二、标识符
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

三、注释
    定义：
        用于解释说明程序的文字

    注释的作用 
        A:解释说明程序，提高程序的阅读性
        B:可以帮助我们调试程序

    注释分类 
        单行注释：//
        多行注释：/*  */
        文档注释：/** 被javadoc工具解析生成一个说明书 */
        
    注意：
        多行注释和文档注释不可以嵌套使用，而单行是可以的

四、常量、变量、进制
    1、常量
        /**
        *  常量概述
        *      在程序执行的过程中其值不可以发生改变
        *
        *  Java中常量分类
        *      字面值常量
        *      自定义常量
        *
        *  字面值常量
        *      (1): 字符串常量    用双引号括起来的内容(可以直接被输出的)
        *          举例："hello","world","HelloWorld"  
        *      
        *      (2): 整数常量      所有的整数(不用加双引号或单引号)
        *          举例：100,200
        *      
        *      (3): 小数常量      所有的小数(不用加双引号或单引号)
        *          举例：10.23,110.11
        *      
        *      (4): 字符常量      用单引号括起来的内容
        *          举例：'a','A','0'   （0 不是数字零、是字符零）
        *          错误的：'ab'
        *      
        *      (5): 布尔常量      比较特殊
        *          举例：true,false（真  假  ）
        *      
        *      (6): 空常量      
        *          举例：null
        */
        class ConstantDemo {
            public static void main(String[] args) {
                //字符串常量
                System.out.println("HelloWorld");
                
                //整数常量
                System.out.println(100);

                //小数常量
                System.out.println(10.11);

                //字符常量
                System.out.println("j");

                //布尔常量
                System.out.println(true);
                System.out.println(false);

                //空常量
                //System.out.println(null);
            }
        }
            
    2、进制
        Java针对整数常量提供了4种表现形式
            二进制(jdk7以后才出现的二进制)
            八进制
            十进制
            十六进制

        进制概述：
            就是进位制，是人们规定的一种进位方法。 
            对于任何一种进制--X进制，就表示某一位置上的数运算时是逢X进一位。
            二进制就是逢二进一，
            八进制是逢八进一，
            十进制是逢十进一，
            十六进制是逢十六进一。

        进制的由来：
            见图

        进制的组成以及表现形式
            /**
             * 进制的组成以及表现形式
             * 进制组成：
             *       二进制：由0，1组成。以0b开头。
             *       
             *       八进制：由0,1,...7组成。以0开头。
             *       
             *       十进制：由0,1,...9组成。默认整数是十进制。
             *       
             *       十六进制：由0,1,...9,a,b,c,d,e,f(大小写均可)组成。以0x开头。
             *
             * 进制表现形式
             *       见代码
             */
            class JinZhiDemo1 {
                public static void main(String[] args) {
                    System.out.println(0b100);//二进制、结果：4
                    System.out.println(0100);//八进制、结果：64
                    System.out.println(100);//十进制、结果：100
                    System.out.println(0x100);//十六进制、结果：256
                }
            }

        进制之间的相互转换
            


        
    3、变量
        3.1、定义
            在程序执行的过程中，在某个范围内 其值可以发生改变的量
            理解：如同数学中的未知数

        3.2、作用域 
            变量定义在哪个大括号内，它就在这个大括号内有效。并且，在同一个大括号内不能同时定义同名的变量。

        3.3、初始化值 
            没有初始化值的变量不能直接使用,你只要在使用前给值就行,不一定非要在定义的时候立即给值。推荐在定义的时候给值

        3.4、格式 
            格式1
                数据类型 变量名 = 初始化值;
            格式2
                数据类型 变量名;//定义变量
                变量名 = 初始化值;//使用前给变量赋值

        3.5、注意 
            在一行上建议只定义一个变量；
            可以定义多个，但是不建议

****************03-java数据类型***************
一、定义 
    Java语言是强类型语言，对于每一种数据都定义了明确的具体数据类型，在内存总分配了不同大小的内存空间    

    注意：
        boolean类型不参与转换

二、数据类型分类 
    1、基本数据类型
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

    2、引用数据类型
        类：class

        接口：interface

        数组：[]

三、类型默认转换
    /**
     * 类型转换
     *      一般我们在做比较的或运算的时候要求参与运算的数据类型必须一致，才有可操作性
     * 
     *      默认转换(从小到大的转换) 
     *          (1): byte,short,char ———> int ———> long ———> float ———> double
     *          (2): byte,short,char 相互之间不转换，他们参与运算首先转换为int类型
     *          注意：
     *              如果在运算中有byte,short,char类型的和int类型相运算则byte,short,char类型必然会先转成int类型然后再与int类型相运算(同理long—float—double)
     *              
     *              有long类型，其他的会先转成long再参与运算
     * 
     *              有float类型，其他的会先转成float再参与运算
     * 
     *              有double类型，其他的会先转成double再参与运算
     * 
     *              小的数据类型会先转成大的数据类型再与大的数据类型相加减
     * 见图4 类型转换
     */
    class DataTypeDemo1 {
        public static void main(String[] args) {
            /**
             * int类型做加法运算 
             *  3是整数类型
             *  4是整数类型
             * 整数类型做加法运算会直接相加
             * 可以写成：
             *      int a = 3;
             *      int b = 4;
             *      int c = a + b;//c=4
             */ 
            System.out.println(3 + 4);//结果：7

            //定义一个byte类型，定义一个int类型  相加
            byte a = 5;
            int b = 6;

            //直接输出不会报错
            System.out.println(a + b);

            //大类型和小类型相加  转成小类型会报错 损失精度
            //byte c = a + b;
            //System.out.println(c);//错误: 不兼容的类型: 从int转换到byte可能会有损失

            //大类型和小类型相加  转成小类型会报错  正常相加
            int d = a+ b;
            System.out.println(d);//默认转换  小的会自动转换成大的数据类型
        }
    }

四、类型强制转换 
    /**
     * 类型强制转换
     *      强制转换是从大的数据类型到小的数据类型。                    
     *      
     *      格式：
     *          目标数据类型 变量 = (目标数据类型) (被转换的数据);                
     *       
     *      注意：
     *          不要随意的去使用强制转换，因为它隐含了精度损失问题。   
     */
    class DataTypeDemo2 {
        public static void main(String[] args) {

            //定义一个byte类型，定义一个int类型  相加
            byte a = 5;
            int b = 6;

            //直接输出不会报错
            System.out.println("正常相加，默认转换：" + (a + b));

            //大类型和小类型相加  转成小类型会报错 损失精度 可以使用类型强制转换
            byte c = (byte)(a + b);
            System.out.println("正常相加，强制转换：" + c);//错误: 不兼容的类型: 从int转换到byte可能会有损失
        }
    }

五、面试题
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

六、byte值的问题
    byte b1 = 127;
    byte b2 = (byte)128; //-128
    byte b3 = (byte)129; //-127
    byte b4 = (byte)130; //-126

    byte的范围：-128 ~ 127

    128：10000000
    -128：10000000 (这里的1即是符号位，也是数值位)
    
七、数据类型转换之默认转换
    byte,short,char -- int -- long -- float -- double

    long: 8个字节
    float：4个字节

    A:它们底层的存储结构不同。
    B:float表示的数据范围比long的范围要大
        long：2^63-1
        float：3.4*10^38 > 2*10^38 > 2*8^38 = 2*2^3^38 = 2*2^114 > 2^63-1


****************04-运算符***************
一、简介
    1：运算
        对常量和变量进行操作的过程称为运算。
    
    2：运算符
        对常量和变量进行操作的符号称为运算符

    3：操作数
        参与运算的数据称为操作数
    
    4：表达式
        用运算符把常量或者变量连接起来符号java语法的式子就可以称为表达式。不同运算符连接的式子体现的是不同类型的表达式。

    5、举例：
        int a = 3 + 4;

        这是做了一个加法运算
        +就是运算符，是算术运算符，我们还有其他很多的运算符
        3，4就是参与运算的操作数据
        3 + 4整体其实就是一个算数表达式

二、分类
    1、算术运算符
        常见算数运算符
        见图2

        /**
         * 运算符之算术运算符：
         *    +、-、*、/、%、++、--
         * ++、——的操作
         *    作用：
         *        就是对变量自增1或者自减1操作
         *    使用：
         *        单独使用：
         *            放操作数的前面和放后面的结果是一样，这种操作是嘴常见的
         *        参与运算使用(面试常见)
         *            放在操作数前面，先自增或者自减，再参与运算
         *            放在操作数后面，先参与运算，再自增或者自减
         * 注意事项：
         *    A:整数相除只能得到整数，想要得到小数必须将其中一个参数或者多个参数转换成浮点数
         *    B:/获取的是除法操作的商，%获取的是除法操作的余数
         */
        public class OperatorDemo1{
            public static void main(String[] args){

                //定义变量
                int x = 3;//准确的读法：把3赋值给int类型的变量x
                int y = 4;

                //+、-、*、/、%的演示
                System.out.println(x + y);//加、7
                System.out.println(x - y);//减、-1
                System.out.println(x * y);//乘、12
                System.out.println(x / y);//除、0（整数相除只能得到整数）

                //就是想要得到一个正常的小数怎么办？只需要将其中一个数据变成浮点数即可
                System.out.println(x * 1.0 / y);//小数、0.75

                System.out.println(x % y);//3


                //++ 、 ——的演示

                /**
                 * 单独使用:放操作数的前面和放后面的结果是一样，这种操作是嘴常见的
                 */
                //x++;
                //y--;
                ++x;
                --y;
                System.out.println("x:"+x);
                System.out.println("y:"+y);

                System.out.println("************************************");

                /**
                 * ++、--参与运算时使用
                 *      放在操作数前面，先自增或者自减，再参与运算
                 *      放在操作数后面，先参与运算，再自增或者自减
                 */
                int a = 3;
                int b = 4;

                //int c = a++;
                //int d = b--;

                int c = ++a;
                int d = --b;

                System.out.println("a:"+a);//4、4
                System.out.println("b:"+b);//3、3
                System.out.println("c:"+c);//3、4
                System.out.println("d:"+d);//4、3
            }
        }

    2、赋值运算符
        /**
         * 运算符之赋值运算符
         *      基本赋值运算符：=
         *          把等号(=)右边的数据赋值给左边的变量
         *      扩展赋值运算符：+=、-=、*=、/=、%=
         *          把左边的数据和右边的数据做加、减、乘、除运算后再赋值给左边
         */
        public class OperatorDemo1{
            public static void main(String[] args){

                /**
                 * 基本赋值运算符
                 *      把有变动数据赋值给左边
                 */
                //定义变量
                int x = 10;//准确的读法：把3赋值给int类型的变量x

                int a,b;
                a = b = 10;
                System.out.println("a:"+a);
                System.out.println("b:"+b);

                /**
                 * 扩展赋值运算符
                 *      左右两边做运算再赋值给左边
                 */
                x += 20;
                System.out.println("x:"+x);
                
            }
        }

        面试题
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

    3、比较(关系)运算符
        常见的比较(关系)运算符
        见图3

        /**
         * 比较运算符
         *      == 、 !=、> 、 >= 、 < 、<= 
         * 特点：  
         *      无论你操作的数据运算时简单还是复杂，结果都是boolean类型，其结果只有true和false
         * 注意：
         *      比较运算符"=="不能误写成”=“
         */
        public class OperatorDemo1{
            public static void main(String[] args){
                int a = 3;
                int b = 4;
                int c = 3;

                System.out.println(a == b);//false
                System.out.println(a == c);//true
                System.out.println((a+b) == (b+c));//true

                System.out.println("==============================");

                System.out.println(a != b);//true
                System.out.println(a > b);//false
                System.out.println(a >= b);//false
                System.out.println(a < b);//true
                System.out.println(a <= b);//true
                System.out.println("hello" instanceof String);//true

                System.out.println("==============================");
                System.out.println(a = b);//不能误写成 ”=“ 否者就会变成赋值
            }
        }

    4、逻辑运算符
        常见的逻辑运算符
        见图4

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
         * 
         * 开发中常用
         *      !、 &&、 ||
         * 
         * 注意：
         *      &、|、^
         *      当左右两边是boolean类型的数据时  她们是逻辑运算符
         *      当左右两边是常量时他们执行的是位运算
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

    5、位运算符(了解)
        常见的位运算符
        见图5
        
        /**
         * 位运算
         *      &、|、^、~
         *      << 、 >> 、>>>
         *      
         *      & 或位运算 补码操作 有0 则 0
         *      | 与位运算 补码操作 有1 则 1
         *      ^ 位异或运算：相同则0，不同则1
         *          特点：某一个数被同一个数位异或两次 该数的值不变
         *      ~ 按位取反运算：1变0，0变1
         *      << 左移：左边最高位丢弃，右边补齐0
         *      >> 右移：最高位是0，左边补齐0；最高位1，左边补齐1
         *      >>> 无符号右移：无论最高位是0还是1，左边补齐0
         * 注意：
         *      要做位运算首先要讲数据转换成二进制
         *      &、|、^
         *      当左右两边是boolean类型的数据时  她们是逻辑运算符
         *      当左右两边是常量时他们执行的是位运算
         */
        public class OperatorDemo {
            public static void main(String[] args){   
                int a = 3;
                int b = 4;

                System.out.println(a & b);//7
                System.out.println(a | b);//7
                System.out.println(a ^ b);//0
                System.out.println(~3);//-4

                //^位异或特点：某一个数被同一个数位异或两次 该数的值不变
                System.out.println(a ^ b ^ b);//3
                System.out.println(a ^ b ^ a);//4


                //<< 把<<左边的数据乘以2的移动次幂
                System.out.println(3 << 2); //3 * 2^2 = 3*4 = 12;
                
                //>> 把>>左边的数据除以2的移动次幂
                System.out.println(24 >> 2); //24 / 2^2 = 24 / 4 = 6
                System.out.println(24 >>> 2);

                System.out.println(-24 >> 2); //-6
                System.out.println(-24 >>> 2);
            } 
        }
        /**
         * 推算：  
         *       因为要做位运算，所以需要将数据转换成二进制数据
         * 
         * 3的二进制数:11    
         *      00000000 00000000 00000000 00000011
         * 4的二进制数:100
         *      00000000 00000000 00000000 00000100
         * 
         * &位与运算：有0则0
         *      00000000 00000000 00000000 00000011
         *      &
         *      00000000 00000000 00000000 00000100
         *      ———————————————————————————————————
         *      00000000 00000000 00000000 00000000
         *      
         *      结果是：0
         * 
         * |位或运算：有1则1
         *      00000000 00000000 00000000 00000011
         *      |
         *      00000000 00000000 00000000 00000100
         *      ———————————————————————————————————
         *      00000000 00000000 00000000 00000111
         *      
         *      结果是：7
         * 
         * ^位异或运算：相同则0，不同则1
         *      00000000 00000000 00000000 00000011
         *      ^
         *      00000000 00000000 00000000 00000100
         *      ———————————————————————————————————
         *      00000000 00000000 00000000 00000111
         *      
         *      结果是：7
         * 
         * ~按位取反运算：1变0，0变1
         *      3的按位取反结果：
         *          00000000 00000000 00000000 00000011(3是整数，整数的原码、反码、补码都相同，应该以补码进行运算)
         *          ~
         *          11111111 11111111 11111111 11111100(按位取反后的补码)
         *          
         *          补码：11111111 11111111 11111111 11111100(减1得反码)
         *          反码：11111111 11111111 11111111 11111011(反码转原码：符号位不变，其他位是1变0，0变1)
         *          原码：10000000 00000000 00000000 00000100(符号位：1：负号、0：正号)
         *          
         *          结果是：-4
         * 
         *      4的按位取反结果：
         *          00000000 00000000 00000000 00000100
         *          ~
         *          11111111 11111111 11111111 11111011
         *          
         *          补码：11111111 11111111 11111111 11111011
         *          反码：11111111 11111111 11111111 11111010
         *          原码：10000000 00000000 00000000 00000101
         *      
         *          结果：-5 
         * 
         * << 左移
         *      计算出3的二进制：11
         * 		    00000000 00000000 00000000 00000011
         *	    (00)000000 00000000 00000000 0000001100(右移两位，最高位舍弃，最右边补齐0)
         *		
         * >> 右移：	
         *	    计算出-24的二进制：11000
         *		    原码：10000000 00000000 00000000 00011000(负数最高位变1)
         *		    反码：11111111 11111111 11111111 11100111(加1得补码)
         *		    补码：11111111 11111111 11111111 11101000
         *		
         *		    11111111 11111111 11111111 11101000
         *		    1111111111 11111111 11111111 111010(00) 补码
         *		
         *		    补码：1111111111 11111111 11111111 111010（减1得反码）
         *		    反码：1111111111 11111111 11111111 111001(0变1，1遍0 得到原码)
         *		    原码：1000000000 00000000 00000000 000110
         *		
         *		    结果：-6
         *		
         * >>> 无符号右移：
         *		计算出24的二进制：11000
         *		    原码：10000000 00000000 00000000 00011000
         *		    反码：11111111 11111111 11111111 11100111
         *		    补码：11111111 11111111 11111111 11101000
         *		
         *		    11111111 11111111 11111111 11101000
         *		    0011111111 11111111 11111111 111010(00)(补码 最高位是0 就是整数  原、反、补一样，结果是：1073741818)
         *		
         *		结果：1073741818
         */
    6、三目运算符
        /**
         * 单目运算：~3
         * 双目运算：3 + 4
         * 三目运算：
         *      格式：比较表达式?表达式1 : 表达式2;
         *          比较表达式返回的是一个boolean类型的true或false
         *      执行流程：
         *          根据比较表达式的计算结果返回一个true或false
         *          如果是true，表达式1作为结果
         *          如果false，表达式2作为结果
         */
        public class OperatorDemo {
            public static void main(String[] args){   
                int a = 3;
                int b = 4;

                int c = (a > b)? a : b;
                System.out.println(c);
            } 
        }
        /**
         * 三目运算练习题
         *      1、获取两个整数中的最大值
         *      2、获取三个整数中的最大值
         *      3、比较两个整数是否相同
         */
        public class OperatorTest {
            public static void main(String[] args){   
                //1、获取两个整数中的最大值
                int a = 100;
                int b = 200;
                int c = (a>b)?a:b;
                System.out.println(c);

                //2、获取三个整数中的最大值
                int d = 100;
                int e = 200;
                int f = 300;
                //方式1
                int g = (((d>e)?d:e)>f)?((d>e)?d:e):f;
                System.out.println(g);
                //方式2
                int max = (d > e)?((d > f)?d : f):((e > f)?e : f);
                System.out.println("max:"+max);
                //方式3
                int temp = (d > e)?d:e;
                int max1 = (temp > f )?temp:f;
                System.out.println("max1:"+max1);

                //3、比较两个整数是否相同
                int h = 200;
                int j = 400;
                boolean k = h == j;
                System.out.println(k);
            } 
        }
    
****************05-键盘录入***************   
一、使用及步骤
    /**
     * 键盘录入
     *      为了使程序更接近实际开发 我们加入了键盘录入
     * 使用步骤：
     *      1、导包
     *          格式：import java.util.Scanner;
     *          位置：在class上面
     *      2、创建键盘录入对象
     *          Scanner sc = new Scanner();
     *      3、调用方法
     *          
     */
    import java.util.Scanner;
    public class ScannerDemo {
        public static void main(String[] args){   
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);

            //提示语
            System.out.println("请您输入一个数字：");
            //调用键盘录入方法
            int x = sc.nextInt();

            System.out.println("您输入的内容是："+x);
        } 
    }
二、练习
    /**
     * 键盘录入联系
     *      1、键盘录入两个数据，并对这两个数据求和，输出其结果
     *      2、键盘录入两个数据，获取这两个数据中的最大值
     *      3、键盘录入三个数据，获取这三个数据中的最大值
     *      4、键盘录入两个数据，比较这两个数据是否相等
     */
    import java.util.Scanner;
    public class ScannerTest {
        
        /**
         * 1、键盘录入两个数据，并对这两个数据求和，输出其结果
         */
        /*public static void main(String[] args){   
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入第一个数字：");
            int x = sc.nextInt();
            System.out.println("请您输入第二个数字：");
            int y = sc.nextInt();
            System.out.println("您输入的两个数字的和为：" + (x + y));
        }*/ 

        /**
         * 2、键盘录入两个数据，获取这两个数据中的最大值
         */
        /*public static void main(String[] args){   
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入第一个数字：");
            int x = sc.nextInt();
            System.out.println("请您输入第二个数字：");
            int y = sc.nextInt();
            System.out.println("您输入的两个数的最大值为：" + ((x > y)?x:y));
        }*/ 

        /**
         * 3、键盘录入三个数据，获取这三个数据中的最大值
         */
        public static void main(String[] args){   
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入第一个数字：");
            int x = sc.nextInt();
            System.out.println("请您输入第二个数字：");
            int y = sc.nextInt();
            System.out.println("请您输入第三个数字：");
            int z = sc.nextInt();

            int temp = (x>y)?x:y;
            int max = temp>z?temp:z;

            System.out.println("您输入的三个数的最大值为：" + max);
        } 
    }

****************06-流程控制语句***************   
一、简介
    1、描述
        在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的。
        也就是说程序的流程对运行结果有直接的影响。所以，我们必须清楚每条语句的执行流程。
        而且，很多时候我们要通过控制语句的执行顺序来实现我们要完成的功能。
    2、分类
        顺序结构
        选择结构
        循环结构
    3、作用
        可以控制程序的执行流程

二、流程控制语句--顺序结构
    1、简介
        是程序中最简单最基本的流程控制，没有特定的语法结构，按照代码的先后顺序，依次执行，程序中大多数的代码都是这样执行的。
    2、测试代码
    /**
     * 流程控制语句：
     *      作用：
     *          可以控制程程序的执行顺序
     *      分类：
     *          顺序结构
     *          选择结构
     *          循环结构
     * 
     * 流程控制语句 -- 顺序结构
     *     执行顺序：从上到下依次执行
     */
    public class ShunXuJieGuoDemo {
        public static void main(String[] args){   

            System.out.println("程序开始了！！！！！！");

            System.out.println("程序进行中！！！！！！");

            System.out.println("程序结束了！！！！！！");
        } 
    }

三、流程控制语句--选择结构
    1、简介
        选择结构也被称为分支结构。
        选择结构有特定的语法规则，代码要执行具体的逻辑运算进行判断，逻辑运算的结果有两个，所以产生选择，按照不同的选择执行不同的代码。
    
    2、分类
        if语句
        switch语句

    3、选择语句 -- if
        3.1、格式一
            /**
             * 流程控制语句 -- 选择结构 -- 格式1
             *      if(关系表达式) {
             *          语句体
             *      }
             * 执行流程
             *      首先判断关系表达式看其结果是true还是false
             *      如果是true就执行语句体
             *      如果是false就不执行语句体
             * If选择结构的注意事项：
             *      A:关系表达式无论简单还是复杂，结果必须是boolean类型
             *      B:if语句控制的语句体如果是一条语句，大括号可以省略；如果是多条语句，就不能省略。建议永远不要省略。
             *      C:一般来说：有左大括号就没有分号，有分号就没有左大括号
             */
            public class IfDemo {
                public static void main(String[] args){   

                    int a = 10;

                    if(a == 10){//条件成立，执行语句体
                        System.out.println("a==10");
                    }

                    if(a == 20){//条件不成立不执行语句体
                        System.out.println("a==20");
                    }
                    
                    //条件成立执行语句体,控制一条语句体时，大括号可以省略不写(只能控制一条语句体)
                    if(a != 20)
                    System.out.println("a==20");
                    

                    //条件不成立不执行语句体,但是因为有分号的原因程序会以为当前语句已经结束
                    if(a == 20);//实际是有语句体的，只不过语句体时空的而已

                    //下面的代码相当于代码块，正确的代码块是可以正常的执行的
                    {
                        System.out.println("a==20");
                        System.out.println("程序结束！！！！！");
                    }
                    
                    //属于顺序执行语句
                    System.out.println("程序结束！！！！！");
                } 
            }

        3.2、格式二
            /**
             * 流程控制语句 -- 选择结构 -- 格式2
             *      if(关系表达式) {
             *		     语句体1;
             *	    } else {
             *		     语句体2;
             *	    }
             *
             * 执行流程
             *      首先判断关系表达式看其结果是true还是false
             *      如果是true就执行语句体1 
             *      如果是false就执行语句体2
             *
             * If选择结构的注意事项：
             *      格式二的else后面是没有比较表达式的，只有if后面有
             */
            public class IfDemo1 {
                public static void main(String[] args){   

                    int a = 10;
                    int b = 20;

                    if (a == b) {
                        System.out.println("a等于b");
                    } else {
                        System.out.println("a不等于b");
                    }
                } 
            }

        3.3、格式三
            /**
             * 流程控制语句 -- 选择结构 -- 格式3
             *      if(关系表达式1) {
             *          语句体1;
             *      }else if(关系表达式2) {
             *          语句体2;
             *      }
             *         。。。。。。
             *       else {
             *          语句体n+1;
             *      }
             *
             * 执行流程
             *      首先判断关系表达式1看其结果是true还是false
             *       如果是true就执行语句体1
             *       如果是false就继续判断关系表达式2看其结果是true还是false
             *       如果是true就执行语句体2
             *       如果是false就继续判断关系表达式…看其结果是true还是false
             *       …
             *       如果没有任何关系表达式为true，就执行语句体n+1。
             *
             *
             * If选择结构的注意事项：
             *      如果在执行的过程中执行了其中的任意一条表达式成立  则其他的就都不执行
             */
            import java.util.Scanner;
            public class IfDemo2 {
                public static void main(String[] args){   
                    /**
                     * 需求：根据键盘录入一个成绩，判断成绩的等级
                     * 90~100 优秀
                     * 80~90 好
                     * 70~80 良
                     * 60~70 及格
                     * 0~60 不及格
                     */
                    Scanner sc = new Scanner(System.in);

                    System.out.println("请输入你要查询的成绩");

                    int score = sc.nextInt();

                    if (score >= 90 && score <= 100) {
                        System.out.println("你当前成绩在优秀阶段");
                    } else if (score >= 80 && score < 90) {
                        System.out.println("你当前成绩在好阶段");
                    } else if (score >= 70 && score < 80) {
                        System.out.println("你当前成绩在良阶段");
                    } else if (score >= 60 && score < 70) {
                        System.out.println("你当前成绩在及格阶段");
                    } else if (score >= 0 && score < 60) {
                        System.out.println("你当前成绩不及格，再接再厉");
                    } else {
                        System.out.println("你输入的成绩有误，请重新输入");
                    }
                } 
            }
    4、选择语句 -- switch
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

    5、if和switch的区别？应用场景？
        应用场景：
            if 语句：
                针对结果是boolean类型的判断
                针对一个范围的判断
                针对几个常量值的判断

            switch 语句
                针对几个常量值的判断

        区别：
            A: if代码比较简洁
            B: if实用性更强
            C: switch效率更高

    6、三元与if语句的区别
        三元运算符实现的，都可以采用if语句实现。反之不成立。
        什么时候if语句实现不能用三元改进呢?
            当if语句控制的操作是一个输出语句的时候就不能。
            因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出

四、流程控制语句--循环结构
    1、简介
        循环语句可以在满足循环条件的情况下，反复执行某一段代码，这段被重复执行的代码被称为循环体语句。
        当反复执行这个循环体时，需要在合适的时候把循环判断条件修改为false，从而结束循环，否则循环将一直执行下去，形成死循环。
    2、循环语句的组成
        初始化语句：
            一条或者多条语句，这些语句完成一些初始化操作。

        判断条件语句：
            这是一个boolean 表达式，这个表达式能决定是否执行循环体。

        循环体语句：
            这个部分是循环体语句，也就是我们要多次做的事情。

        控制条件语句：
            这个部分在一次循环体结束后，下一次循环判断条件执行前执行。通过用于控制循环条件中的变量，使得循环在合适的时候结束。

    3、分类
        (1):for循环

        (2):while循环

        (3):do...while循环

    4、注意事项   
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
        (2):死循环的三种格式
            /**
             * 死循环
             *      1、一定要注意控制条件语句控制的那个变量，一旦丢失，就会出现死循环
             *      2、两种最简单是死循环格式
             *          A:while(true){...}
             *          B:for(;;){...}
             */
            class DieXunHuanDemo {
                public static void main(String[] arge){
                    //丢失变量
                    int x=1;
                    while(x<10){
                        System.out.println("死循环的第一种形似：" + x);
                        x++;//此处x++不能丢失。
                    }
                    System.out.println("******************************");

                    //死循环的第二种形式
                    /*while(true){
                        System.out.println("死循环的第二种形似");
                    }*/

                    System.out.println("******************************");

                    //死循环的第三种形式
                    for(;;){
                        System.out.println("死循环的第三种形似");
                    }
                }
            }
                           
    4、for循环
        /**
         * 流程控制语句 -- 循环结构(for循环)
         * 分类：
         *      for循环、while循环、do...while循环
         * 
         * 格式：
         *      for(初始化语句;判断条件语句;控制条件语句) {
         *          循环体语句;
         *      }
         * 
         * 执行流程：初始化语句-->判断条件语句-->循环体语句-->控制条件语句
         *        A:执行初始化语句
         *        B:执行判断条件语句,看其返回值是true还是false
         *            如果是true，就继续执行
         *            如果是false，就结束循环
         *        C:执行循环体语句;
         *        D:执行控制条件语句
         *        E:回到B继续。
         *
         * 注意事项：
         *        A:判断条件语句无论简单还是复杂结果是boolean类型。
         *        B:循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略。
         *            建议永远不要省略。
         *        C:一般来说：有左大括号就没有分号，有分号就没有左大括号
         *
         * for循环嵌套遇到的问题
         *        A：根据规律推导循环和内循环的规律表达式
         *        B：print----不换行
         *        C：println--换行
         * 案例：  
         *      在控制台完成十次Helloword的输出
         */
        class ForDemo {
            public static void main(String[] args) {

                for (int x=1; x<=10; x++) {
                    System.out.println("Helloword!");
                }
            }
        }

        /**
         * 流程控制语句 -- 循环结构(for循环)
         * 练习：
         *      1、请在控制台输出数据1-10
         *      2、请在控制台输出数据10-1
         *      3、求出1-10之间数据之和
         *      4、求出1-100之间偶数和
         *      5、求出1-100之间奇数和
         *      6、求5的阶乘
         *          n != n*(n-1)
         *          n != n*(n-1)*n*(n-2)......3*2*1
         *      7、在控制台输出所有的”水仙花数”
         *          所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
         *          举例：153就是一个水仙花数。
         *          153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 127 = 153
         *           分析：
         *               A:三位数其实高数了我们范围
         *               B:通过for循环可以获取到每一个三位数
         *               C:如何获取ge、shi、bai位数呢
         *                   假设数据是：153
         *                       ge:153%10=3
         *                       shi:153/10%10=5
         *                       bai:153/10/10%10=1
         *                       qian:X/10/10/10%10
         *                       ......
         *
         *      8、统计”水仙花数”共有多少个*
         *      9、请在控制台输出满足如下条件的五位数
         *           个位等于万位
         *           十位等于千位
         *           个位+十位+千位+万位=百位
         *          分析：
         *              A:五位数告诉了我们范围
         *              B:分解每一个五位数的个、十、百、千、万上的数
         *              C:根据条件判断即可
         * 
         *      10、请统计1-1000之间同时满足如下条件的数据有多少个：
         *          对3整除余2
         *          对5整除余3
         *          对7整除余2
         *          分析：
         *              A:0~1000告诉了我们范围
         *              
         */
        class ForTest {
            public static void main(String[] args) {
                System.out.println("******在控制台输出1-10******");
                inputData1_10();
                System.out.println("******在控制台输出10-1******");
                inputData10_1();
                System.out.println("******在控制台输出1-10之和******");
                input1_10Sum();
                System.out.println("******在控制台输出1-100偶数和******");
                input1_100OuShuSum();
                System.out.println("******在控制台输出1-100奇数和******");
                input1_100JiShuSum();
                System.out.println("******在控制台输出5的阶乘******");
                inputNum5JieCheng();
                System.out.println("******在控制台输出水鲜花数******");
                inputShuiXianHua();
                System.out.println("******在控制台输出满足条件的五位数******");
                manZuTiaoJianWuWeiShu();
                System.out.println("******在控制台输出1000以内满足条件的五位数******");
                input1_1000ManZuTiaoJianWuWeiShu();
            }

            /**
             * 1、请在控制台输出数据1-10
             */
            public static void inputData1_10(){
                for (int x=1; x<=10; x++) {
                    System.out.println(x);
                }
            }

            /**
             * 2、请在控制台输出数据10-1
             */
            public static void inputData10_1(){
                for (int x=10; x>=1; x--) {
                    System.out.println(x);
                }
            }

            /**
             * 3、求出1-10之间数据之和
             */
            public static void input1_10Sum(){
                int totalNum = 0;
                for (int x=1; x<=10; x++) {
                    totalNum += x;
                }
                System.out.println("totalNum:"+totalNum);
            }
        
            /**
             * 4、求出1-100之间偶数和
             */
            public static void input1_100OuShuSum(){
                int totalNum = 0;
                //方式一：
                for (int x=1; x<=100; x++) {
                    //0~100之间的偶数和
                    if(x % 2 == 0){
                        totalNum += x;
                    }
                }
                System.out.println("0~100的偶数和:"+totalNum);

                //方式二：
                //0~100之间的偶数和
                int totalNum1 = 0;
                for (int x=0; x<=100; x+=2) {
                    totalNum1 += x;
                }
                //0~100之间的奇数和
                System.out.println("0~100的偶数和:"+totalNum1);
            }

            /**
             * 5、求出1-100之间奇数和
             */
            public static void input1_100JiShuSum(){
                int totalNum = 0;
                //方式一：
                for (int x=1; x<=100; x++) {
                    //0~100之间的奇数和
                    if(x % 2 != 0){
                        totalNum += x;
                    }
                }
                System.out.println("0~100的奇数和:"+totalNum);

                //方式二：
                //0~100之间的偶数和
                int totalNum1 = 0;
                for (int x=1; x<=100; x+=2) {
                    totalNum1 += x;
                }
                //0~100之间的奇数和
                System.out.println("0~100的奇数和:"+totalNum1);
            }

            /**
             * 6、求5的阶乘
             */
            public static void inputNum5JieCheng(){
                int jc = 1;
                //原始从1开始
                //for(int x=1;x<=5;x++){
                //改进后从2开始
                for(int x=1;x<=5;x++){
                    jc *= x;
                }
                System.out.println("0~5的阶乘:"+jc);
            }
            
            /**
             * 7、在控制台输出所有的”水仙花数”
             * 8、统计水仙花个数
             */
            public static void inputShuiXianHua(){
                //定义统计水仙花个数的变量
                int num = 0; 
                //三位数是告诉了我们范围
                for(int x=100;x<1000;x++){
                    int ge = x%10;
                    int shi = x/10%10;
                    int bai = x/10/10%10;

                    if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                        num += 1;
                        System.out.println(x);
                    }
                }
                //8、统计水仙花个数
                System.out.println("水仙花个数：" + num + "（个）");
            }

            /**
             * 9、请在控制台输出满足如下条件的五位数
             *      个位等于万位
             *      十位等于千位
             *      个位+十位+千位+万位=百位
             */
            public static void manZuTiaoJianWuWeiShu(){
                //定义一个变量统计总共有多少个
                int num = 0;
                //五位数告诉了我们范围
                for(int x=10000;x<100000;x++){
                    int ge = x%10;
                    int shi = x/10%10;
                    int bai = x/100%10;
                    int qian = x/1000%10;
                    int wan = x/10000%10;

                    if((ge == wan) && (shi == qian) && (ge+shi+qian+wan) == bai){
                        num += 1;
                        System.out.println(x);
                    }
                }
                System.out.println("满足条件的五位数有：" + num + "(个)");   
            }

            /**
             * 10、请统计1-1000之间同时满足如下条件的数据有多少个
             *      对3整除余2
             *      对5整除余3
             *      对7整除余2
             */
            public static void input1_1000ManZuTiaoJianWuWeiShu(){
                int num = 0;
                for(int x=1;x<=1000;x++){
                    if((x%3 == 2) && (x%5 == 3) && (x%7 == 2)){
                        num += 1;
                        System.out.println(x);
                    }
                }
                System.out.println("满足条件的有："+num);   
            }
        }

    5、while循环
        import java.util.LinkedHashMap;
        import java.util.Map;

        /**
         * 流程控制语句--循环语句(while循环)
         * 基本格式：
         *     while(判断条件语句) {
         *          循环体语句;
         *     }
         * 扩展格式：
         *      初始化语句;
         *      while(判断条件语句) {
         *          循环体语句;
         *          控制条件语句;
         *      }
         * 由此格式可见while循环和for循环是一样的，两者之间可以等价交换
         *
         */
        class WhileDemo {
            public static void main(String[] arge){
                //测试
                //需求：输出10次HelloWorld
                //for循环版
                for(int x=0;x<10;x++){
                    System.out.println("HelloWorld");
                }
                System.out.println("*****************************");

                //while循环版
                int x=0;
                while(x<10){
                    System.out.println("HelloWorld");
                    x++;
                }

                System.out.println("************以下是while的练习*************");
                Map<String, Object> describe = whileTest();
                System.out.println("sum:"+describe.get("sum"));
                System.out.println("count:"+describe.get("count"));

                System.out.println("************以下是统计珠穆拉玛峰的高度*************");
                Integer count = countSum();
                //F:输出统计变量
                System.out.println("需要折叠的次数："+ count);

            }

            /**
             * 练习：
             *      使用while循环统计1-100的和
             *      使用while循环统计水仙花个数
             */
            public static Map<String, Object> whileTest(){
                Map<String, Object> map = new LinkedHashMap<String, Object>();

                //1-100之间的和
                int sum = 0;
                int x = 1;
                while(x<=100){
                    sum+=x;
                    x++;
                }
                
                //统计水仙花数
                int count = 0;
                int y = 100;
                while(y<1000){
                    int ge = y%10;
                    int shi = y/10%10;
                    int bai = y/100%10;
                    if(ge*ge*ge+shi*shi*shi+bai*bai*bai == y){
                        count++;
                        System.out.println("每一个水仙花:"+y);
                    }
                    y++;
                }

                map.put("sum",sum);
                map.put("count",count);

                return map;
            }

            /**
             * 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
             * 实则为了练习for和while的区别
             * 分析：
             *      A:定义统计变量，默认0
             *      B:8848m是最终的厚度
             *      C:0.01m是初始厚度
             *      D:折叠多少次不低于珠穆拉玛峰的高度，折叠一次的厚度是原来的2倍
             *      E:只要折叠的厚度没有超过珠穆拉玛峰的高度就继续折叠，统计变量++
             *      F:输出统计变量
             */
            public static Integer countSum(){
                //A:定义统计变量，默认0
                int count = 0;
                //B:8848m是最终的厚度,为了简单884800m
                int end = 884800;
                //C:0.01m是初始厚度，为了简单1m
                int start = 1;

                while(start<end){
                    //D:折叠多少次不低于珠穆拉玛峰的高度，折叠一次的厚度是原来的2倍
                    start *= 2;
                    //E:只要折叠的厚度没有超过珠穆拉玛峰的高度就继续折叠，统计变量++
                    count++;
                }
                

                return count;
            }
        }
    
    6、do...while循环
        /**
         * 流程控制语句--循环语句(do...while循环)
         *   基本格式
         *      do {
         *           循环体语句;
         *      }while((判断条件语句);
         * 
         *   扩展格式
         *      初始化语句;
         *      do {
         *           循环体语句;
         *           控制条件语句;
         *       } while((判断条件语句);
         */
        class DoWhileDemo {
            public static void main(String[] arge){
                //输出5此Helloworld
                int x=0;
                do{
                    System.out.println("Helloworld");
                    x++;
                } while (x<10);

                System.out.println("*************************");

                //求和
                int sum = 0;
                int y = 1;
                do{
                    sum += y;
                    y++;
                } while(y<=100);
                System.out.println(sum);
            }
        }
        
    7、循环test
        /**
         * 循环练习
         *      练习1：请输出一个4行5列的星星(*)图案
         *          *****
         *          *****
         *          *****
         *          *****
         *      
         *      练习2：请输出如下图形
         *           *
         *           **
         *           ***
         *           ****
         *           *****
         *      练习3：在控制台输出九九乘法表。
         *          1*1=1
         *          1*2=2    2*2=4
         *          1*3=3    2*3=6   3*3=9
         *          1*4=4    2*4=8   3*4=12  4*4=16
         *          ...
         *          1*9=9    2*9=18  3*9=27  4*9=36  ... 9*9=81
         */
        class XunHuanTest {
            public static void main(String[] arge){
                System.out.println("**************练习1：请输出一个4行5列的星星(*)图案**************");
                xingXing();

                System.out.println("**************练习2：请输出如下图形**************");
                sanJiaoXing();

                System.out.println("**************练习3：在控制台输出九九乘法表。**************");
                jiuJiuChengFaBiao();
            }

            /**
             * 练习1：请输出一个4行5列的星星(*)图案。
             *      *****
             *      *****
             *      *****
             *      *****
             * 通过结果我们得出：
             *      外循环控制行数
             *      内循环控制列数
             */
            public static void xingXing(){
                for(int y=0; y<4; y++){
                    for (int x=0; x<5; x++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            /**
             * 练习2：请输出如下图形
             *     *
             *     **
             *     ***
             *     ****
             *     *****
             */
            public static void sanJiaoXing(){
                //先输出一个5行5列的图形
                for(int y=0; y<5; y++){
                    for (int x=0; x<5; x++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                /**
                 * 改进版
                 * 列数是变化的：
                 *      第一行：1列 y=0 y<=0 y++
                 *      第二行：2列 y=0 y<=1 y++
                 *      第三行：3列 y=0 y<=2 y++
                 *      第四行：4列 y=0 y<=3 y++
                 *      第五行：5列 y=0 y<=4 y++
                 */
                for(int y=0; y<5; y++){
                    for (int x=0; x<=y; x++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            /**
             * 练习3：在控制台输出九九乘法表。
             * 先列出九九乘法表
             * 1*1=1
             * 1*2=2    2*2=4
             * 1*3=3    2*3=6   3*3=9
             * 1*4=4    2*4=8   3*4=12  4*4=16
             * ...
             * 1*9=9    2*9=18  3*9=27  4*9=36  ... 9*9=81
             * 
             * 注意：
             *      \X:x为未知字符，标识转移字符
             *      '\n'    换行
             *      ‘\t’    tab键的位置
             *      ‘\r’    回车
             */
            public static void jiuJiuChengFaBiao(){
                for (int x=1; x<=9; x++) {
                    for(int y=1; y<=x; y++){
                        System.out.print(y + "*" + x + "=" + y * x + '\t');
                    }
                    System.out.println();
                }
            }
        }

五、流程控制语句--跳转语句
    1、简介
        前面我们已经说过了，Java中的goto是保留字，目前不能使用。
        虽然没有goto语句可以增强程序的安全性，但是也带来很多不便，
        比如说，我想在某个循环知道到某一步的时候就结束，现在就做不了这件事情。
        为了弥补这个缺陷，Java就提供了break，continue和return来实现控制语句的跳转和中断。

    2、分类
        break 中断(跳出循环，不再执行下次循环)
        continue 继续(跳出本次循环继续下次循环)
        return 返回(结束一个方法)
    
    3、break 
        /**
         * 跳转语句 -- break
         * break的使用场景：
         *     在选择结构switch语句中
         *     在循环语句中
         *         一般情况下在循环语句中加入了if语句
         *     注意：
         *         离开使用场景的存在是没有意义的
         * break的作用：
         * 跳出当前循环,不再执行后面的循环，但是循环外的代码还会继续往下执行(单独使用智能跳出单层循环)
         *     跳出单层循环
         *     跳出多层循环
         *         带标签的跳出
         *         格式：
         *              标签名(自定义): 循环语句
         *              注意：
         *                  标签名要符合Java的命名规则
         * 
         *      
         */
        class BreakDemo {
            public static void main(String[] args){  
                //输出10次HelloWorld,输出三次后就跳出循环
                //跳出单层循环
                for (int x=0; x<10; x++) {
                    if (x==3) {
                        break;
                    }
                    System.out.println("HelloWorld");
                } 

                System.out.println("------------------------------------——————");

                //跳出多层循环
                wc:for(int a=0; a<4; a++){
                    nc:for(int b=0; b<5; b++){
                        if(b == 3){
                            break wc;
                        }

                        System.out.print("*");
                    }
                    System.out.println();
                }
            } 
        }
        
    4、continue 
        /**
         * 跳转语句 -- continue
         * continue的使用场景：
         *     在循环语句中
         *     注意：
         *          离开使用场景的存在是没有意义的
         * continue的作用：
         *     单层循环对比break，然后总结两个的区别
         *         break  退出当前循环
         *         continue  退出本次循环，继续下次循环
         *     也可以带标签的使用(不演示了)
         */
        class ContinueDemo {
            public static void main(String[] args){  
                //对比continue和break的区别
                //跳出单层循环
                for (int x=0; x<5; x++) {
                    if (x==3) {
                        //break;//0、1、2
                        continue;//0、1、2、4、5
                    }
                    System.out.println(x);
                } 

                System.out.println("-——————————————");
                //跳出多层循环
                wc:for (int a=0; a<3; a++) {
                    for (int y=0; y<5; y++) {
                        if (y==3) {
                            //break;//0、1、2
                            continue wc;//0、1、2、4、5
                        }
                        System.out.print(y);
                    }
                    System.out.println();
                }
            } 
        }

    5、return  
        /**
         * 跳转语句 -- return
         *  return关键字不是为了跳转出循环体，更常用的功能是结束一个方法，也就是退出一个方法。
         *  跳转到上层调用的方法。
         */
        class ReturnDemo {
            public static void main(String[] args){  
                for(int x=0; x<6; x++){
                    if(x == 2){
                        System.out.print("退出");
                        //break;//01退出over
                        //continue;//01退出345over
                        return;//01退出
                    }
                    System.out.print(x);
                }
                System.out.println("over");
                System.out.println("---------------------");
            } 
        }
    
    6、案例
        /**
         * 需求：
         *      小芳的妈妈每天给她2.5元钱，她都会存起来，
         *      但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
         *      请问，经过多少天，小芳才可以存到100元钱。
         * 分析：
         *      A:小芳的妈妈每天给她2.5元钱
         *          double dayMoney = 2.5;
         *      B:她都会存起来
         *          double daySum = 0.0;
         *      C:从第一天开始存
         *          int dayCount = 1;
         *      D:经过多少天，小芳才可以存到100元钱
         *          double result = 100;
         *      E:每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
         *          说明要判断dayCount的值对5整除daySum减6元
         *          daySum -= 6;
         *          间接的说明 反之要daySum累加dayMoney
         *          daySum += dayMoney
         *      F:因为不知道需要存多少天，所以用死循环，一旦超过100 就退出
         */
        class XiaoFangCunQianTest {
            public static void main(String[] args){  
                //每天要存的钱
                double dayMoney = 2.5;

                //累计存钱的初始化值
                double daySum = 0.0;

                //从第一天开始存
                int dayCount = 1;

                //最终存的钱大于等于100就可以
                double result = 100;

                //因为不知道需要存多少天，所以用死循环，一旦超过100 就退出
                while(true){
                    //钱累加
                    daySum += dayMoney;

                    //判断是否超过100
                    if(daySum >= result){
                        System.out.println("一共花了"+dayCount+"天存储了"+daySum+"元");
                        break;
                    }

                    //没有存够100，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
                    if(dayCount%5 == 0 || daySum%5 == 0){
                        System.out.println("第"+dayCount+"天花了6元");
                        //花去6元
                        daySum -= 6;
                    }
                    dayCount++;
                }
            } 
        }

****************07-方法(函数)***************
1、方法概述
    假设有一个游戏程序，程序在运行过程中，要不断地发射炮弹(植物大战僵尸)。
    发射炮弹的动作需要编写100行的代码，在每次实现发射炮弹的地方都需要重复地编写这100行代码，这样程序会变得很臃肿，可读性也非常差。
    为了解决代码重复编写的问题，可以将发射炮弹的代码提取出来放在一个{}中，并为这段代码起个名字，这样在每次发射炮弹的地方通过这个名字来调用发射炮弹的代码就可以了。
    上述过程中，所提取出来的代码可以被看作是程序中定义的一个方法，程序在需要发射炮弹时调用该方法即可。

2、简单的说
    方法就是完成特定功能的代码块
    在很多语言里面都有函数的定义
    函数在Java中被称为方法

3、格式
    修饰符 返回值类型 方法名(参数数据类型 参数名1，参数数据类型 参数名2…) {
        方法体语句;
        return 返回值;
    }
    
4、方法格式解释
    修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符

    返回值类型：就是功能结果的数据类型。

    方法名：符合命名规则即可。方便我们的调用。

    参数：
        实际参数：就是实际参与运算的。
        形式参数；就是方法定义上的，用于接收实际参数的。

    参数类型：就是参数的数据类型

    参数名：就是变量名

    方法体语句：就是完成功能的代码。

    return：结束方法的。

    返回值：就是功能的结果，由return带给调用者。
    
5、案例
    方法的执行流程
    见图1

    /**
     *  要想写好一个方法，就必须明确两个东西：
     *      A:返回值类型
     *          结果的数据类型
     *      B:参数列表
     *          你要传递几个参数，以及每个参数的数据类型
     *    
     * 方法的调用特点
     *      方法不调用不执行
     *      方法不调用不执行
     *      方法与方法是平级关系，不能嵌套定义
     *      方法定义的时候参数之间用逗号隔开
     *      方法调用的时候不用在传递数据类型
     *      如果方法有明确的返回值，一定要有return带回一个值
     *      其实就是void类型方法的调用,只能单独调用
     *
     * 需求：
     *      求两个数之和
     */
    class FunctionDemo {
        public static void main(String[] args){  
            int x = 5;
            int y = 6;
            //方式一：单独调用，没意义
            sum(x,y);

            //方式二：输出调用，可以但是不推荐，调用成功后不一定就要输出
            System.out.println(sum(x,y));

            //方式三：赋值调用，推荐使用
            int result = sum(x,y);
            //在这里可以对调用后返回的 值做其他处理
            System.out.println(result);
        } 

        public static int sum(int a, int b){
            int c = a + b;
            return c;
        }
    }

6、练习
    import java.util.Scanner;

    /**
     * 练习一：键盘录入两个数，输出最大值
     * 练习二：键盘录入两个数，判断是否相等
     * 练习三：键盘录入三个数，输出最大值
     * 练习四：根据需求在控制台输出对应的矩形
     * 练习五：在控制台输出nn乘法表
     */
    class FunctionTest {
        public static void main(String[] args){  
            //练习一：键盘录入两个数，输出最大值
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数据：");
            int a = sc.nextInt();
            //System.out.println("请输入第二个数据：");
            //int b = sc.nextInt();
            //System.out.println("请输入第三个数据：");
            //int c = sc.nextInt();

            //int result = getMax(a,b);
            //System.out.println("最大数是：" + result);

            //Boolean result = isEquals(a,b);
            //System.out.println("是否相等：" + result);

            //int result = getMaxNum(a,b,c);
            //System.out.println("最大数是：" + result);

            //inputJuXing(a, b);

            inputChengFaBiao(a);
        } 

        //练习一：键盘录入两个数，输出最大值
        public static int getMax(int a, int b){
            int c = ((a>b)?a:b);
            return c;
        }
        //练习二：键盘录入两个数，判断是否相等
        public static Boolean isEquals(int a, int b){
            if(a == b){
                return true;
            }
            return false;
        }
        //练习三：键盘录入三个数，输出最大值
        public static int getMaxNum(int a, int b, int c){
            /*if(a>b){
                if(a>c){
                    return a;
                }else{
                    return c;
                }
            }else{
                if(b>c){
                    return b;
                }else{
                    return c;
                }
            }*/

            //三元改进
            int result = ((a>b)?((a>c)?a:c):((b>c)?b:c));

            return result;
        }
        //练习四：根据需求在控制台输出对应的矩形
        public static void inputJuXing(int a, int b){
            for(int x=0; x<a; x++){
                for(int y=0; y<b; y++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        //练习五：在控制台输出nn乘法表
        public static void inputChengFaBiao(int a){
            for(int x=1; x<=a; x++){
                for(int y=1; y<=x; y++){
                    System.out.print(y+"*"+x+"="+y*x+"\t");
                }
                System.out.println();
            }
        }
    }

7、方法重载
    /**
     * 方法重载
     *      在同一个类中，方法名相同，参数列表不同，与返回值无关的方法教方法重载
     *      参数列表不同：
     *          A:参数列表不同
     *          B:参数类型不同
     */
    class FunctonOverloadTest {
        public static void main(String[] args){  
            System.out.println(sum(10,20));
            System.out.println(sum(10,20,30));
            System.out.println(sum(10,20,30,40));
        } 

        public static int sum(int a, int b){
            return a + b;
        }
        public static int sum(int a, int b, int c){
            return a + b + c;
        }
        public static int sum(int a, int b, int c, int d){
            return a + b + c + d;
        }
    }

****************08-数组***************
一、一维数组
    1、数组概述&格式&初始化
        /**
         * 数组：
         *      定义：存储同一个数据类型的多个元素(变量)的集合(容器),叫做数组
         * 定义格式：
         *      格式一:数据类型[] 数组名;
         *      格式二:数据类型 数组名[];
         * 举例：
         *      int[] a;//定义了一个int类型的数组a变量
         *      int a[];//定义了一个int类型的a数组变量
         * 注意：
         *      效果一样，都是定义了一个int类型的数组，只是在读法上有点小区别，现有的int a[]后有的int[] a，推荐使用格式一
         * 
         * 如何给初始化的数组赋值呢(如何初始化数组)？
         * 
         * 初始化概述：
         *      Java中的数组必须先初始化,然后才能使用。
         *      所谓初始化：就是为数组中的数组元素分配内存空间，并为每个数组元素赋值。
         * 初始化方式
         *      动态初始化：指定数组长度，由系统为数组分配初始值。
         *      静态初始化：指定每个数组元素的初始值，由系统决定数组长度。
         *      注意：
         *          各有用处，常用静态初始化，因为数组的值应该由自己定，由系统算长度
         *      动态初始化：
         *          格式：
         *              数据类型[] 数组名 = new 数据类型[数组长度];
         *              注：数组长度其实就是数组中元素的个数。
         *          举例：
         *              int[] arr = new int[3];
         *              解释：
         *                  定义了一个int类型的数组，这个数组中可以存放3个int类型的值。
         *                  左边：
         *                      int:说明数组中的元素的数据类型是int类型
         *                      []:说明是一个数组
         *                      arr:数组名称
         *                  右边：
         *                      new:为数组分配内存空间
         *                      int:说明数组中的元素的数据类型是int类型
         *                      []:说明是一个数组
         *                      3:数组长度，其实就是数组中存储的元素数量
         *          获取元素格式：
         *              数组名[索引]
         *              注意：索引其实就是没有个元素的编号，取值0 ~ 长度-1
         * 
         *          图解：
         *              详见附件：见图7、java在堆栈中存储
         * 
         *          Java中的内存分配
         *              Java 程序在运行时，需要在内存中的分配空间。
         *              为了提高运算效率，就对空间进行了不同区域的划分，
         *              因为每一片区域都有特定的处理数据方式和内存管理方式。
         *                  栈：存储局部变量(局部变量：方法声明中或方法声明上的变量)
         *                  堆：存储new出来的东西
         *                  方法区：(面向对象部分讲)
         *                  本地方法区：(和系统相关)
         *                  寄存器：(给CPU使用)
         * 
         *              两个栈内存中的引用执行堆内存中的同一个空间，无论这两个谁的操作都在操作同一个空间  
         *      数组的静态初始化
         *          格式：
         *              数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
         *              举例：
         *                  int[] arr = new int[]{1,2,3};
         *          简化格式
         *              数据类型[] 数组名 = {元素1,元素2,…};
         *              举例：
         *                  int[] arr = {1,2,3}};
         *          解释：
         *              定义了一个int类型的数组，这个数组中可以存放3个int类型的值，并且值分别是1,2,3。
         * 注意：
         *      以后初始化时两种方式任选一种即可
         *      不能两种方法同时进行
         *      错误格式：
         *          int[] arr = new int[3]{1,2,3};//系统默认给了长度  你有指定了长度
         * 
         * 两种常见错误
         *      数组索引越界
         *          ArrayIndexOutOfBoundsException
         *          访问到了数组中的不存在的索引时发生。
         *      空指针异常
         *          NullPointerException
         *          数组引用没有指向实体(堆内存)，但是却在操作实体中的元素。
         */
        class ArrayDemo{
            public static void main(String[] args){
                //int[] a;
                //System.out.println(a);//错误: 可能尚未初始化变量a

                /**
                 * 动态初始化
                 */
                int[] arr = new int[3];
                System.out.println(arr);//[I@677327b6：地址值
                /**
                 * 其实数组中的没有个元素都是有编号的，0 ~ 长度-1
                 * 用数组名称和编号的配合就可以获取到指定编号的元素，编号的专业术语叫索引
                 * 通过数组名访问数组中元素的格式：数组名[索引]
                 */
                System.out.println(arr[0]);//指定数组长度，系统给的初始化值：0
                System.out.println(arr[1]);//指定数组长度，系统给的初始化值：0
                System.out.println(arr[2]);//指定数组长度，系统给的初始化值：0

                System.out.println("***********动态初始化数组并赋值练习***********");

                //动态初始化数组并赋值练习
                activeInitArray();

                System.out.println("***********静态初始化数组直接赋值练习***********");
                /**
                 * 静态初始化数组
                 */
                int[] arr1 = new int[]{1,2,3};
                System.out.println(arr1);//[I@7f31245a
                System.out.println(arr1[0]);//1
                System.out.println(arr1[1]);//2
                System.out.println(arr1[2]);//3

                //简化格式
                int[] arr2 = {1,2,3};
                System.out.println(arr2);//[I@6d6f6e28
                System.out.println(arr2[0]);//1
                System.out.println(arr2[1]);//2
                System.out.println(arr2[2]);//3

                /**
                 * 两种常见问题演示
                 */
                int[] arr3 = {1,2,3};
                //System.out.println(arr3[3]);//ArrayIndexOutOfBoundsException:访问了不存在的索引
                arr3 = null;
                System.out.println(arr3[0]);//NullPointerException：：数组引用已经不再指向堆内存了
            }

            /**
             * 动态初始化数组案例
             * 定义一个数组，初始化 输出
             * 赋值后再次输出
             */
            public static void activeInitArray(){
                //初始化数组，输出
                int[] arr = new int[3];

                System.out.println(arr);//[I@677327b6
                System.out.println(arr[0]);//0
                System.out.println(arr[1]);//0
                System.out.println(arr[2]);//0

                System.out.println("-----------------"); 
                
                arr[0] = 100;
                arr[2] = 500;

                System.out.println(arr);//[I@677327b6
                System.out.println(arr[0]);//0
                System.out.println(arr[1]);//0
                System.out.println(arr[2]);//0

            }
        }
    2、数组练习
        import java.util.Scanner;
        /**
         * 练习一：数组遍历(依次输出数组中的每一个元素)
         * 练习二：数组获取最值(获取数组中的最大值最小值)
         * 练习三：数组元素逆序 (就是把元素对调)
         * 练习四：数组查表法(根据键盘录入索引,查找对应星期)
         * 练习五：数组元素查找(查找指定元素第一次在数组中出现的索引)
         * 练习六：数组排序和二分查找(后面在数组高级部分讲解)
         */
        class ArrayTest {
            public static void main(String[] args) {
                System.out.println("******依次输出数组中的每一个元素******");
                bianLiArray();
                System.out.println("******获取数组中的最大值最小值******");
                findZuiZhi();
                System.out.println("******数组逆序******");
                niXuArray();
                System.out.println("******数组查表法******");
                //arrayChaBiao();
                System.out.println("******查找制定元素第一次在数组中出现的索引******");
                fistIndex();
            }

            /**
             * 练习五：数组元素查找(查找指定元素第一次在数组中出现的索引)
             * 
             */
            public static void fistIndex() {
                //定义一个数组5
                int[] arr = {212,2323,433,555,66,77,88,99,00};  

                int index = -1;
                int data = 433;
                for (int x=0; x<arr.length; x++) {
                    if (arr[x] == data) {
                        index = x;
                        break;
                    }
                }
                System.out.println("第一次出现的索引：" + index);
            }

            /**
             * 练习四：数组查表法(根据键盘录入索引,查找对应星期)
             * 意思:
             *      根据键盘录入的索引查找对应的星期几
             *       String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};  
             */
            public static void arrayChaBiao() {
                //定义一个数组
                String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};  

                //创建键盘录入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个数据(1-7)");
                int data = sc.nextInt();
                System.out.println("您要查找的数据是：" + arr[data-1]);
            }

            /**
             * 练习三：数组元素逆序 (就是把元素对调)
             * 思路:
             *      length/2(不管奇数还是偶数都可以)
             */
            public static void niXuArray() {
                //定义一个数组
                int[] arr = { 1, 2, 3, 4, 5, 6 };

                
                //循环遍历，小于数组的长度
                for (int x = 0; x < arr.length/2; x++) {
                    int temp = arr[x];
                    arr[x] = arr[arr.length-1-x];
                    arr[arr.length-1-x] = temp;
                }

                System.out.print("【");
                for (int x = 0; x < arr.length; x++) {
                    if(x == arr.length -1){
                        System.out.println(arr[x] + "】");
                    }else{
                        System.out.print(arr[x] + "、");
                    }
                }
            }

            /**
             * 练习二：数组获取最值(获取数组中的最大值最小值)
             * 
             */
            public static void findZuiZhi() {
                //定义一个数组
                int[] arr = { 1, 2, 3, 4, 5, 6, 88, -1 };
                //定义一个变量存储最大值
                int max = arr[0];
                //定义一个变量存储最小值
                int min = arr[0];
                //循环遍历，小于数组的长度
                for (int x = 0; x < arr.length; x++) {
                    //输出数组中的每一个元素
                    int element = arr[x];

                    if (element > max) {
                        max = element;
                    }
                    if (element < min) {
                        min = element;
                    }
                }

                System.out.println(max);
                System.out.println(min);
            }

            /**
             * 练习一：数组遍历(依次输出数组中的每一个元素)
             * 获取数组的长度：数组名.length
             */
            public static void bianLiArray() {
                //定义一个数组
                int[] arr = { 1, 2, 3, 4, 5, 6 };
                //循环遍历，小于数组的长度
                for (int x = 0; x < arr.length; x++) {
                    //输出数组中的每一个元素
                    System.out.println(arr[x]);
                }
            }
        }

二、二维数组
    1、解析&格式讲解
        /**
         * 二维数组
         * 定义：
         *     元素是一维数组的数组
         * 格式：
         *     格式一：动态初始化
         *         格式1(推荐)：
         *             数据类型[][] 数组名 = new 数据类型[m][n];
         *             解释：
         *                 m：表示这个二维数组有多少个一维数组
         *                 n：表示每一个一维数组的元素个数
         *         格式2：
         *             数据类型 数组名[][] = new 数据类型[m][n];
         *         格式3：
         *             数据类型[] 数组名[] = new 数据类型[m][n];
         *         面试小陷阱：
         *             int x,y;//定义了两个int类型的变量x和y
         *             int[] x,y[];//定义了一个一维数组x和一个二维数组y，而不是定义了两个二维数组x和y
         * 
         *         图解：
         *             详见附件：见图8、二维数组格式一在堆栈中的存储
         * 
         *     格式二：动态初始化
         *          数据类型[][] 变量名 = new 数据类型[m][];
         *          m：表示这个二维数组中有几个一维数组，没有具体的给出每一个一维数组中有多少个元素，可以动态赋值
         *          举例：
         *              int[][] arr = new int[3][];
         * 
         *          图解：
         *              详见附件：见图9、二维数组格式二在堆栈中的存储
         * 
         *     格式三：静态初始化
         *          数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}};
         *          简化版：
         *              数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};
         *          举例：
         *              int[][] arr = {{1,2,3},{1,3},{2}};
         *      图解： 
         *          详见附件：见图10、二维数组格式三在堆栈中的存储
         */
        class Array2Demo {
            public static void main(String[] args) {
                System.out.println("******格式一******");
                geShiEr_active1();
                System.out.println("******格式二******");
                geShiEr_active2();
                System.out.println("******格式三******");
                geShiEr_static();
            }

            /**
             * 格式三:静态初始化
             */
            public static void geShiEr_static(){
                int[][] arr = {{1,2,3},{4,5},{6}};

                System.out.println(arr);
                System.out.println(arr[0]);//[I@6bc7c054
                System.out.println(arr[1]);//[I@232204a1
                System.out.println(arr[2]);//[I@4aa298b7

                System.out.println(arr[0][0]);//1
                System.out.println(arr[1][0]);//4
                System.out.println(arr[2][0]);//6
            }

            /**
             * 格式二:动态初始化
             */
            public static void geShiEr_active2(){
                /**
                 * 定义一个二维数组arr
                 * 这个二维数组有三个一维数组元素
                 * 但是每一个一维数组中没有给出具体的元素个数，需要手动给出
                 */
                int[][] arr = new int[3][];
                
                //输出二维数组名称
                System.out.println(arr);//[[I@7852e922  两个[代表二维数组
                //输出二维数组中的一维数组名称
                System.out.println(arr[0]);//null 因为只开辟的内存空间 而没有赋值 一维数组是引用类型 引用类型的默认值是null
                System.out.println(arr[1]);//null
                System.out.println(arr[2]);//null
                //给一维数组赋值
                arr[0] = new int[2];
                arr[1] = new int[3];
                arr[2] = new int[1];
                //输出二维数组中的一维数组名称
                System.out.println(arr[0]);//[I@4e25154f 此时一维数组已经有值，所以输出的是地址值
                System.out.println(arr[1]);//[I@70dea4e
                System.out.println(arr[2]);//[I@5c647e05
                //输出每一个一维数组中的元素
                System.out.println(arr[0][0]);//0
                System.out.println(arr[0][1]);//0
            }
            /**
             * 格式一:动态初始化
             */
            public static void geShiEr_active1(){
                /**
                 * 定义一个二维数组arr
                 * 这个二维数组有三个一维数组元素
                 * 每一个一维数组元素中有两个元素
                 */
                int[][] arr = new int[3][2];
                
                //输出二维数组名称
                System.out.println(arr);//[[I@7852e922  两个[代表二维数组
                //输出二维数组中的一维数组名称
                System.out.println(arr[0]);//[I@4e25154f  一个[代表二维数组
                System.out.println(arr[1]);//[I@70dea4e
                System.out.println(arr[2]);//[I@5c647e05
                //输出每一个一维数组中的元素
                System.out.println(arr[0][0]);//0
                System.out.println(arr[0][1]);//0
            }
        }

    2、练习
        import java.util.Scanner;
        /**
         * 二维数组思考题1：
         *      看程序写结果，并总结基本类型和引用类型参数的传递问题
         * java中参数传递的问题
         *      基本类型：形式参数的改变对实际参数没有影响(传递的是数值)
         *      引用类型：形式蚕食的改变直接影响实际参数(传递的是地址值)
         */
        class SiKaoTiTest_1 {
            public static void main(String[] args) {
                int a = 10;
                int b = 20;
                System.out.println("a:"+a+",b:"+b);//a:10,b:20
                change(a,b);
                System.out.println("a:"+a+",b:"+b);//a:10,b:20
        
                int[] arr = {1,2,3,4,5};
                change(arr);
                System.out.println(arr[1]);//4
            }
        
            public static void change(int a,int b){//a:10,b:20
                System.out.println("a:"+a+",b:"+b);//a:10,b:20
                a = b;//a:20
                b = a + b;//b:40
                System.out.println("a:"+a+",b:"+b);//a:20,b:40
            }
        
            public static void change(int[] arr){//{1,2,3,4,5};
                for(int x=0; x<arr.length; x++){
                    if(arr[x]%2==0){
                        arr[x]*=2;
                    }
                }
                //arr = {1,4,3,8,5};
            }
        }

        import java.util.Scanner;
        /**
         * 二维数组思考题2：
         * 数据加密问题
         *      某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
         *	    在传递过程中需要加密，加密规则如下：
         *          首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
         *          最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
         *          然后，把加密后的结果在控制台打印出来。 
         * 分析：
         *      A:数据是小于8位的整数
         *          小于8位数，int类型就可以搞定，定义一个int类型的变量随便给一个数
         *          int number = 123456;
         *      B:加密规则
         *          a:首先将数据倒序
         *              结果：654321
         *          b:然后将每位数字都加上5，再除以10的余数代替该数字
         *              结果：109876
         *          c:最后将第一位和最后一位数字交换
         *              结果：609871
         *      C:输出到控制台
         * 
         * 通过分析我们得知 只要有办法讲数据转换成数组就比较好做了
         * 不能直接将数据写成数组int[] arr = {1,2,3,4,5,6};
         * 
         * 如何将数据转换成数组呢
         *      A:初始化一个数据
         *          int num = 123456;
         *      B:定义一个数组，数组的长度是多少？
         *          int[] arr = new int[8];//最大8
         *          在赋值的时候用一个变量记录索引的变化
         *          定义一个索引变量，int index = 0;
         *      C:获取数据中的每一个数
         *          a:获取值
         *              int ge = num%10;
         *              int shi = num/10%10;
         *              int bai num/100%10;
         *              ......
         *          b:赋值
         *              arr[index] = ge;
         *              index++;
         *              arr[index] = shi;
         *              index++;
         *              ......
         */
        class SiKaoTiTest_2 {
            public static void main(String[] args) {
                //创建键盘录入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个要加密的数据(1-8)");
                int number = sc.nextInt();
        
                if(number > 8){
                    System.out.println("你输入的数据超过8位，请重新输入");
                    return;
                }
        
                String result = jiaMi(number);
                System.out.println("加密后的数据是:" + result);
            }
        
            /**
             * 加密方法
             */
            public static String jiaMi(int number){
                //定义一个数组,初始长度8，最大不能超过8
                int[] arr = new int[8];
        
                //定义一个索引变量记录索引的变化
                int index = 0;
        
                /**
                 * 组成数组 + 倒序
                 * 因为不知道是几位数，也就是说不知道要循环几遍，所以使用while循环,此while循环完成后数据正好逆序
                 */
                while(number > 0){
                    
                    arr[index] = number%10;
                    //索引记录变化
                    index++;
                    //每一次做完number%10这一步  原来的number都会比原来少一10倍
                    number /= 10;
                }
        
                //每位数字都加上5，再除以10的余数代替该数字
                for(int x=0; x<index; x++){
                    arr[x] += 5;//每一个数加5
                    arr[x] %= 10;//每一个数对10取余
                }
                
                //最后将第一位和最后一位数字交换
                int temp = arr[0];
                arr[0] = arr[index - 1];
                arr[index - 1] = temp;
        
                String s = "";
        
                //遍历数组
                for(int x=0; x<index; x++){
                    s += arr[x];
                }
        
                return s;
            }
        }

****************09-面向对象***************
一、概述
	万事万物皆对象
	面向对象是基于面向过程的编程思想，面向过程是面向对象的基础

	1、面向过程
		强调的是每一个功能的步骤

		之前完成一个需求的步骤：
			首先是搞清楚我们要做什么，然后在分析怎么做，最后我们再代码体现。
			一步一步去实现，而具体的每一步都需要我们去实现和操作。
			这些步骤相互调用和协作，完成我们的需求。
			在上这些步骤中我们都是参与者，并且需要面对具体的每一个步骤和过程，
			这就是面向过程最直接的体现。

		面向过程开发，
			其实就是面向着具体的每一个步骤和过程，把每一个步骤和过程完成，然后由这些功能方法相互调用，完成需求。

		面向过程的代表语言：C语言

	2、面向对象
		
		强调的是对象，然后又对象去调用功能

		面向对象思想的编程方式
			当有多个数组都需要遍历时，我们可以将遍历的代码封装到方法中，需要遍历时，就调用相应的方法即可，提高代码的复用性。
			在对数组遍历的基础上继续增加需求，比如获取最值，数值逆序等，同样需要将这些功能封装到相应的方法中。
			这样继续封装会发现方法越来越多，于是就想能不能将这些方法继续进行封装呢？
			通过前面的讲解我们知道类是可以存放方法的，
			所以，我们就考虑使用类封装来这多个方法，将来再做数组的操作时，不用去找具体的方法，先找到这个类，然后使用这个类中的方法。
			这就是面向对象思想的编程方式。

		面向对象思想
			需求单一，或者简单时，我们使用面向过程去操作，并且效率也挺高。
			当需求增多，功能增加时面向过程就不能满足我们的开发了
			这时我们就要利用面向对象的思想来发，就是把面向过程的这些步骤和功能根据不同的功能进行封装功能类似的封装在一起。
			这样结构就清晰了很多。用的时候，找到对应的类就可以了。这就是面向对象的思想

	3、面向对象思想特点
		是一种更符合我们思想习惯的思想
		可以将复杂的事情简单化
		将我们从执行者变成了指挥者(角色发生了转换)

		举例：
			买电脑：
				面向过程：我的了解电脑--了解我自己的需求--找对应的参数信息--去中关村买电脑--讨价还价--买回电脑
				面向对象：我知道我要买电脑 -- 班长去给我买 -- 班长就买回来了
			洗衣服：
				面向过程：把衣服脱下--找一个盆--放点洗衣粉--加点水--把衣服扔进去--搓一搓--清洗衣服--拧干--晾起来
				面向对象：把衣服脱下--打开全自动洗衣机--扔进去--一键即可--晾起来
			吃饭：
				面向过程：去超市买菜--摘菜--洗菜--切菜--炒菜--盛起来--吃
				面向对象：上饭店吃饭，你--服务员(点菜)--厨师(做菜)--服务员(端菜)--吃
				
				家常事物，买洗衣机和去饭店太不划算了，所以，找个对象。
				但是，你不跟我好好学习，你将来4000，你对象8000。
	4、把大象装进冰箱
		4.1、面向过程：
			动作有哪些呢?
				A:打开冰箱门
				B:装进大象
				C:关闭冰箱门
				
			代码体现；
				class Demo {
					public static void main(String[] args) {
						/*
						System.out.println("打开冰箱门");
						//打开冰箱门的东西，我现在仅仅是为了演示，就写了一个输出语句
						//其实，它可能需要做很多操作。
						//这个时候代码就比较多一些了
						//假设我要多次打开冰箱门，
						//代码一多，每次都写一遍，麻烦不
						//我们就应该用方法改进
						
						System.out.println("装进大象");
						System.out.println("关闭冰箱门");
						*/
						
						//写了方法以后，调用就改变了
						open();
						in();
						close();
					}
					
					public static void open() {
						System.out.println("打开冰箱门");
					}
					
					public static void in() {
						System.out.println("装进大象");
					}
					
					public static void close() {
						System.out.println("关闭冰箱门");
					}
				}
		
		4.2、面向对象：
			我们怎么才能更符合面向对象思想呢?
				A:有哪些类呢?
				B:每个类有哪些东西呢?
				C:类与类直接的关系是什么呢?
				
			把大象装进冰箱的分析? (如何分析有哪些类呢?UML。名词提取法。)
				A:有哪些类呢?
					大象
					冰箱
					Demo
				B:每个类有哪些东西呢?
					大象：
						进去
					冰箱：
						开门
						关门
					Demo:
						main方法
				C:类与类直接的关系是什么呢?
					Demo中使用大象和冰箱类的功能。
					
			代码体现：
				class 大象 {
					public static void in() {
						System.out.println("装进大象");
					}
				}
				
				class 冰箱 {
					public static void open() {
						System.out.println("打开冰箱门");
					}
					
					public static void close() {
						System.out.println("关闭冰箱门");
					}
				}
				
				class Demo {
					public static void main(String[] args) {
						冰箱调用开门
						大象调用进去
						冰箱调用关门
					}
				}	

	5、面向对象开发,设计,特征
		面向对象开发
			就是不断的创建对象，使用对象，指挥对象做事情。
		面向对象设计
			其实就是在管理和维护对象之间的关系。
		面向对象特征
			抽象(abstract)
			封装(encapsulation)
			继承(inheritance)
			多态(polymorphism)

二、类与对象
	1、类的定义及使用
		类的定义：
			定义一个类其实就是定义该类的成员变量和成员方法

		成员变量：和以前的变量定义的格式一样，但是位置不同，在类中方法外
		成员方法：和以前的方法定义的格式一样，但是今天把static先去掉

		成员变量和局部变量的区别
			在类中的位置不同
				成员变量：类中方法外
				局部变量：方法内或者方法声明上
			在内存中的位置不同
				成员变量：堆内存
				局部变量：栈内存
			生命周期不同
				成员变量：随着对象的存在而存在，随着对象的消失而消失
				局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
			初始化值不同
				成员变量：有默认的初始化值(byte/short/int/long 默认值是0；float/double 默认值是0.0；char 默认值是'\u0000(就是空的意思)'；boolean 默认值fals；引用类型 默认值null)
				局部变量：没有默认的初始化值，必须先定义，赋值，才能使用。
		注意：
			成员变量和局部变量的名称可以一样，但是在使用的时候会以就近原则使用，就是先从小范围查找

		如何使用：
			创建对象使用
				格式：类名 对象名 = new 类名();
			使用成员变量：
				获取值：对象名.成员变量名
				赋值：对象名.成员变量 = 要赋的值(成员变量是什么数据类型的就需要赋值什么类型的)
			使用成员方法：
				对象名.方法名(参数1,参数2,...);

	2、类与对象的关系
		现实世界中是如何描述一个事物的呢?
			举例：学生
				姓名,年龄,性别...
				学习,吃饭,睡觉...
					
			属性：是对该事物的描述信息
			行为：是该事物能够做什么
			
		我们学习编程语言，是为了模拟现实世界的事物的。
		而我们学习的编程语言Java中最基本的单位是：类。
		所以，我们就应该把事物通过类来体现出来：
		由此，我们就得到了现实世界事物和类的对应关系：

		事物：						类：	
			属性						成员变量
			行为						成员方法
		类：
			是一组相关属性和行为的集合。是一个抽象的概念。
		对象：
			是该类事物的具体表现形式。具体存在的个体。

		举例：
			学生：类
			班长：对象

	3、案例
		/**
		 * 定义一个学生类
		 * 事物
		 * 		属性		事物的信息描述
		 * 		行为		事物的行为
		 * 类
		 * 		成员变量	事物的属性
		 * 		成员方法	事物的行为
		 * 
		 * 定义一个类其实就是定义该类的成员变量和成员方法
		 * 
		 * 定义一个学生类
		 * 		学生事物
		 * 			属性：姓名、年龄、地址...
		 * 			行为：吃饭、睡觉、学习...
		 * 把事物转换成对应的类
		 * 		成员变量：姓名、年龄、地址...
		 * 		成员方法：吃饭、睡觉、学习...
		 * 
		 * 成员变量：和以前的变量定义的格式一样，但是位置不同，在类中方法外
		 * 成员方法：和以前的方法定义的格式一样，但是今天把static先去掉
		 * 
		 * 如何使用队对象：
		 * 		创建对象使用
		 * 		格式：类名 对象名 = new 类名();
		 * 
		 * 如何使用成员变量：
		 * 		获取值：对象名.成员变量名
		 * 		赋值：对象名.成员变量 = 要赋的值(成员变量是什么数据类型的就需要赋值什么类型的)
		 * 如何使用成员方法：
		 * 		对象名.方法名(参数1,参数2,...);
		 * 
		 * 对象的内存图：
		 * 		详见附件：见图11、一个对象的内存图
		 * 		详见附件：见图11、二个对象的内存图
		 * 		详见附件：见图11、三个对象的内存图
		 */
		//定义了一个学生类
		class Student {
			//定义成员变量
			//姓名
			String name;
			//年龄
			int age;
			//地址
			String address;
			
			//定义方法
			//吃饭
			public void eat(){
				System.out.println("饿了要吃饭");
			}

			//睡觉
			public void sleep(){
				System.out.println("困了要睡觉");
			}

			//学习
			public void study(){
				System.out.println("缺乏知识要学习");
			}
		}

		//定义了一个学生类的测试类
		class StudentDemo {
			public static void main(String[] args) {
				//创建学生类对象
				Student student = new Student();

				//输出学生类对象中的属性
				System.out.println(student.name +"---"+student.age+"---"+student.address);//null---0---null

				//给学生类对象中的属性赋值
				student.name = "zhangsan";
				student.age = 26;
				student.address = "beijing";

				System.out.println(student.name +"---"+student.age+"---"+student.address);//zhangsan---26---beijing

				//调用成员方法
				student.study();
				student.eat();
				student.sleep();
			}
		}

三、形式参数的传递
	/**
	 * 形式参数传递的问题
	 * 		基本类型：形式参数的改变不影响实际参数
	 * 		引用类型：显示参数的改变直接影响实际参数
	 */
	//形式参数是基本类型
	class Demo{
		public int sum(int a, int b){
			return a+b;
		}
	}

	//形式参数是引用类型(引用类型包含类、接口、对象)
	class Student{
		public void show(){
			System.out.println("我爱java");
		}
	}
	class StudentDemo{
		//如果你看到一个方法的形式参数是一个类 类型(引用类型)，那么实际需要这个参数的对象
		public void mothed(Student s){//调用的时候把main方法中的对象地址传到这里相当于Student s = new Student();
			s.show();
		}
	}

	//测试类
	class ArgsTest{
		public static void main(String[] args) {
			//形式参数是基本类型
			Demo d = new Demo();
			int result = d.sum(10,20);
			System.out.println("result:"+result);

			//形式参数是引用类型
			Student s = new Student();
			StudentDemo sd = new StudentDemo();
			sd.mothed(s);
		}
	}
	
四、匿名内部类
	/**
	 * 匿名对象
	 * 		定义：没有名字的对象叫做匿名对象，是对象的一种简化表示形式
	 * 应用场景
	 * 		A:调用方法，仅仅只调用一次的时候
	 * 			好处：匿名对象调用完毕后就是垃圾，可以被垃圾回收器回收，因为栈中没有变量只想它
	 * 			注意：调用多次时不适合
	 * 		B:匿名对象可以作为实际参数传递
	 * 			
	 */
	class Student{
		public void show(){
			System.out.println("我爱学习");
		}
	}
	class StudentDemo{
		public void mothed(Student s){
			s.show();
		}
	}

	//测试类
	class NoNameDemo{
		public static void main(String[] args) {
			System.out.println("******匿名对象调用方法******");
			//带名字的对象调用
			Student s = new Student();
			s.show();

			//匿名对象调用
			new Student().show();;

			System.out.println("******匿名对象作为实际参数传递******");
			StudentDemo sd = new StudentDemo();
			sd.mothed(new Student());
			new StudentDemo().mothed(new Student());
		}
	}

五、面向对象特征 -- 封装
	1、封装的引出&概述&好处
		/**
		 * 定义一个学生类：
		 *		成员变量：name，age
		*		成员方法：show()方法
		* 	
		* 我们在使用这个案例的过程中，发现了一个问题：
		*		通过对象去给成员变量赋值，可以赋值一些非法的数据。
		*		这是不合理的。
		*		应该是这个样子的：在赋值之前，先对数据进行判断。
		*		判断到底在哪里做比较合适呢?
		*		StudentDemo类是一个测试类，测试类一般只创建对象，调用方法。	
		*		所以，这个判断应该定义在Student类中。
		*		而我们在成员变量的位置可不可以进行数据判断呢?
		*		是不可以的，因为做数据校验，必须要依靠一些逻辑语句。
		*		逻辑语句是应该定义在方法中的，所以，我们最终决定在Student类中提供一个方法
		*		来对数据进行校验。
		* 
		* 	按照我们前面的分析，我们给出了一个方法进行校验。
		* 	但是呢，它偏偏不调用方法来赋值，还是直接赋值了，
		* 	这样我们的方法就没有起到作用。
		* 	我就应该要求你必须使用我的方法，而不能直接调用成员变量赋值。
		* 	怎么去强制要求不能直接使用成员变量呢?
		* 		针对这种情况，Java就提供了一个关键字 private
		* 	
		* private:私有的
		* 		private是一个权限修饰符
		* 		可以修饰成员变量和成员方法。
		* 		被private修饰的成员只能在本类中访问。
		* 
		* 		private最常见的应用：
		*			把成员变量用private修饰
		*			提供对应的getXxx()/setXxx()方法
		*
		* 其实我讲到现在讲解的是一个封装的思想。
		* 封装：
		*  	封装概述
		*			是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
		*		好处：
		*			隐藏实现细节，提供公共的访问方式
		*			提高了代码的复用性
		*			提高安全性。
		*		封装原则：
		*			将不需要对外提供的内容都隐藏起来。
		*			把属性隐藏，提供公共方法对其访问。
		* /
		class Student {
			//姓名
			String name;
			//年龄
			private int age;
			
			//写一个方法对数据进行校验
			/*
				返回值类型：void
				参数列表：int a
			*/
			public void setAge(int a) {
				if(a < 0 || age > 120) {
					System.out.println("你给的年龄有问题");
				}else {
					age = a;
				}
			}
			
			
			//show()方法,显示所有成员变量值
			public void show() {
				System.out.println("姓名："+name);
				System.out.println("年龄："+age);
			}
		}

		//测试类
		class PrivateStudentDemo{
			public static void main(String[] args) {
				//创建学生对象
				Student s = new Student();
				s.show();
				System.out.println("--------------");
				
				//给成员变量赋值
				s.name = "林青霞";
				//s.age = 27;
				s.setAge(27);
				s.show();
				System.out.println("--------------");
				
				//给age赋值
				//s.age = -27; //这个数据是不合理的
				//通过方法给值
				s.setAge(-27);
				s.show();
				System.out.println("--------------");
			}
		}
	2、一个标准的private案例
		/**
		 * 这是一个标准的private修饰的案例
		 */
		class Student{
			private String name;
			private int age;
			
			public String getName(){
				return name;
			}
			public void setName(String n){
				name = n;
			}
			public int getAge(){
				return age;
			}
			public void setAge(int a){
				age = a;
			}
		}

		class privateStudentTest{
			public static void main(String[] args) {
				Student s = new Student();
				System.out.println(s.getName()+"---"+s.getAge());

				System.out.println("---------------");

				//赋值
				s.setName("zhangsan");
				s.setAge(27);
				//s.age = 27;//age可以在Student中访问private
				System.out.println(s.getName()+"---"+s.getAge());
			}
		}




****************day01-学习工具Eclipse的简介***************

****************day01-API讲解***************

****************day01-多线程***************

****************day01-设计模式***************

****************day01-GUI***************

****************day01-网络编程***************

****************day01-反射***************

****************day01-JDK5新特性***************














