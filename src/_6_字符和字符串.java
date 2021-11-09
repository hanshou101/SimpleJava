/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_16 {
    public static void main(String[] args) {
        // 字符
        char c1 = 'A';
        char c2 = '中';

        /*
         * 一种特殊情况：
         *      一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。
         */
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013

        /*
         * 另一种特殊情况：
         *      直接用转义字符\ u + Unicode编码来表示一个字符：
         */
        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013

        // 字符串
        String s = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格

        // 转义的情况
        String eS1 = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z
        String eS2 = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
    }
}

class Hello_17 {
    public static void main(String[] args) {
        /*
         * 普通拼接。
         *      1. 在超大并发时，会造成一定的性能问题。（不在此深入）
         */
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s);

        //
        int age = 25;
        String str = "age is " + age;
        System.out.println(str);
    }
}

class Hello_18 {
    public static void main(String[] args) {
        // 引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。例
        // 区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null。
        String s1 = null; // s1是null
        String s2; // 没有赋初值值，s2也是null
        String s3 = s1; // s3也是null
        String s4 = ""; // s4指向空字符串，不是null

    }
}

class Hello_19 {
    public static void main(String[] args) {
        // 请将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        String s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);
    }
}