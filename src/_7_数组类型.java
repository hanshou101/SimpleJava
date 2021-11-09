import java.util.Arrays;

/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_20 {
    public static void main(String[] args) {
        // 5位同学的成绩:
        int n1 = 68;
        int n2 = 79;
        int n3 = 91;
        int n4 = 85;
        int n5 = 62;

        // 其实没有必要定义5个int变量。可以使用数组来表示“一组”int类型
        // 5位同学的成绩:
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;

        System.out.println(ns.length); // 5
        System.out.println(Arrays.toString(ns)); //
    }
}

class Hello_21 {
    public static void main(String[] args) {
        // 5位同学的成绩:
        int[] ns = new int[]{68, 79, 91, 85, 62};
        System.out.println(Arrays.toString(ns)); // 编译器自动推算数组大小为5
    }
}

class Hello_22 {
    public static void main(String[] args) {
        // 对“指向”有了更深入的理解。
        // 只是简单理解一下。
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }
}