/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello3 {
    public static void main(String[] args) {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
    }
}

class Hello4 {
    public static void main(String[] args) {
        // 整数类型
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L

        // 浮点型
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

        // 布尔类型
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false

        // 字符类型
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

        /*
         * 除了以上【基本类型】，全都是【引用类型】
         *      1. 类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置。
         */
        String s = "hello";

    }
}

class Hello5 {
    public static void main(String[] args) {
        // 常量
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        // PI = 300; // 编译错误 ！
    }
}

class Hello6 {
    public static void main(String[] args) {
        // var关键字 （Java 10 版本特性）
        StringBuilder sb1 = new StringBuilder();

        var sb2 = new StringBuilder();


        // 变量范围
        /**
         * 定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域
         * 并且，不要重复使用变量名。
         */
        if (true) {
            int i = 0; // 变量i从这里开始定义
            if (true) {
                int x = 1; // 变量x从这里开始定义
                if (true) {
                    String s = "hello"; // 变量s从这里开始定义
                } // 变量s作用域到此结束
                // 注意，这是一个新的变量s，它和上面的变量同名，
                // 但是因为作用域不同，它们是两个不同的变量:
                String s = "hi";
            } // 变量x和s作用域到此结束
        } // 变量i作用域到此结束
    }
}