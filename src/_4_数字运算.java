/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_7 {
    public static void main(String[] args) {
        // 基本四则运算
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);

        // 整除（只取到，整数的部分）
        int x = 12345 / 67; // 184       // 184.2537313432836
        // 求余，运算
        int y = 12345 % 67; // 12345÷67的余数是17
    }
}


class Hello_8 {
    public static void main(String[] args) {
        // 溢出
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }
}

class Hello_9 {
    public static void main(String[] args) {
        int n = 3300;
        System.out.println(n);
        n++; // 3301, 相当于 n = n + 1;
        System.out.println(n);
        n--; // 3300, 相当于 n = n - 1;
        System.out.println(n);
        int y = 100 + (n);
        System.out.println(y);
    }
}

class Hello_10 {
    public static void main(String[] args) {
        // 移位运算（位运算的一种）
        // （算法用的较多；平时接触较少，有个认知即可）
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
    }

    // 另一个方法。返回值为void（无返回值）
    void test2() {
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n >> 1;  // 00000000 00000000 00000000 00000011 = 3
        int b = n >> 2;  // 00000000 00000000 00000000 00000001 = 1
        int c = n >> 3;  // 00000000 00000000 00000000 00000000 = 0
    }

    // 另一个方法。返回值为void（无返回值）
    void test3() {
        int n = -536870912;
        int a = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        int b = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        int c = n >> 28; // 11111111 11111111 11111111 11111110 = -2
        int d = n >> 29; // 11111111 11111111 11111111 11111111 = -1
    }

    // 另一个方法。返回值为void（无返回值）
    void test4() {
        int n = -536870912;
        int a = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
        int b = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
        int c = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
        int d = n >>> 31; // 00000000 00000000 00000000 00000001 = 1
    }

}

class Hello_11 {
    public static void main(String[] args) {
        // 位运算的另外一种
        // 按位与
        int n = 0;
        n = 0 & 0; // 0
        n = 0 & 1; // 0
        n = 1 & 0; // 0
        n = 1 & 1; // 1

        // 按位或
        n = 0 | 0; // 0
        n = 0 | 1; // 1
        n = 1 | 0; // 1
        n = 1 | 1; // 1

        // 按位非
        n = ~0; // 1
        n = ~1; // 0

        // 按位【异或】运算
        n = 0 ^ 0; // 0
        n = 0 ^ 1; // 1
        n = 1 ^ 0; // 1
        n = 1 ^ 1; // 0

    }
}

class Hello_12 {
    public static void main(String[] args) {
        // 运算优先级
        /* 从高到低
         ()
         ! ~ ++ --
         * / %
         + -
         << >> >>>
         &
         |
         += -= *= /=
         */
        // 记不住也没关系，只需要加括号就可以保证运算的优先级正确。（括号，是最高优先级）
    }
}

class Hello_13 {
    public static void main(String[] args) {
        // 小练习
        // 根据【高斯求和公式】，计算【前N个自然数】的和
        //      https://gitee.com/gelamogen/typora_images/raw/master/image-20211101222806714.png

        int N = 100;
        int sum = 0;            // sum要怎么计算？

        // ……………………………………………………

        System.out.println(sum);
        // System.out.println(sum == xxxx ? "测试通过" : "测试失败");
    }
}