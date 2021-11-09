/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_14 {
    public static void main(String[] args) {
        // 布尔运算

        /*
         比较运算符：>   >=    <    <=    ==    !=
         与运算 &&
         或运算 ||
         非运算 !
         */

        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age > 6 && age < 18; // true


        // 短路运算
        /*
         * 如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
         */

        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);  // 如果没短路，则会报错。
        System.out.println(result);


        // 三元运算符（三目运算符）
        /*
         * 很多时候，程序员，用来代替【if/else】语法结构。
         *      1. 算是偷懒吧。
         *      2. 不推荐嵌套使用。如 int nb = ( 1 > 0 ? true : false  ) ? 100 : -100
         */

        int n = -100;
        int x = n >= 0
                ? n
                : -n;
        System.out.println(x);
        int nb = (1 > 0 ? true : false) ? 100 : -100;       // 不推荐的用法

    }
}


class Hello_15 {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = (6 <= age) && (age <= 12);
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}