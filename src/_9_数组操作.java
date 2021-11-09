import java.util.Arrays;

/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_37 {
    public static void main(String[] args) {
        /*
         * 排序方法。省略
         *
         * 冒泡排序
         * 插入排序
         * 快速排序（快排。曾获奖）
         *
         */
    }
}

class Hello_38 {
    public static void main(String[] args) {
        // 排序
        // Java的标准库已经内置了排序功能。
        // 我们只需要调用JDK提供的Arrays.sort()就可以排序。
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};

        /*
         * 对数组排序实际上修改了数组本身。即 ns 数组自身，被改变了。
         *
         * 还有另一种思维模式：即【返回一个新的，经过排序的数组】；而不改变【原有数组】
         */
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}

class Hello_39 {
    public static void main(String[] args) {
        // Java程序的入口是main方法，而main方法可以接受一个命令行参数，它是一个String[]数组。
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
