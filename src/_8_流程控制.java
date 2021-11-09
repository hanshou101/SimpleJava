import java.util.Scanner;

/**
 * Created by ycw/yanch on 2021/11/1.
 */
class Hello_23 {
    public static void main(String[] args) {
        // println是print line的缩写，表示输出并换行。
        // 因此，如果输出后不想换行，可以用print()：
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
    }
}

class Hello_24 {
    public static void main(String[] args) {
        // 读取一个字符串和一个整数的例子
        // import java.util.Scanner;    注意这里的导包
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}

class Hello_25 {
    public static void main(String[] args) {
        // 设计的一个练习
        var scanner = new Scanner(System.in);
        System.out.print("请输上次考试成绩：");
        float test1 = scanner.nextFloat();
        System.out.print("请输本次考试成绩：");
        float test2 = scanner.nextFloat();
        float m = (test2 - test1) / test1 * 100;
        // 百分比不保留小数
        System.out.printf("你的成绩提升百分比为：%.0f%%", m);
    }
}

class Hello_26 {
    public static void main(String[] args) {
        int n = 70;
        // 在串联使用多个if时，要特别注意判断顺序。（比如，把60放在90前面？）
        // 此外，还要注意【边界条件】，比如【n > 90】、【n >= 60】，就漏了一个 90
        if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
    }
}

class Hello_27 {
    public static void main(String[] args) {
        /*
         * Java之类语言的一个特点：String是引用类型。
         *
         * 判断值类型的变量是否相等，可以使用==运算符。
         * 但是，判断引用类型的变量是否相等，==表示“引用是否相等”。（即地址是否相等）
         */
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    }
}

class Hello_28 {
    public static void main(String[] args) {
        // 引用类型的变量内容是否相等，必须使用equals()方法
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }
}

class Hello_29 {
    public static void main(String[] args) {
        // 请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
        // BMI = 体重（kg）/ 身高（m）^ 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的体重（kg）：");
        float weight = scanner.nextFloat();
        System.out.println("请输入您的身高（m）：");
        float height = scanner.nextFloat();
        float BMI = (float) (weight / Math.pow(height, 2));
        System.out.printf("您的BMI值为：%.2f\n ", BMI);
        if (BMI < 18.5) {
            System.out.println("体重过轻");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("体重正常");
        } else if (BMI >= 25 && BMI < 28) {
            System.out.println("体重过重");
        } else if (BMI >= 28 && BMI < 32) {
            System.out.println("体重肥胖");
        } else {
            System.out.println("体重非常肥胖");
        }

    }
}

class Hello_30 {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
            case 3:
                System.out.println("Selected 2, 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}

class Hello_31 {
    public static void main(String[] args) {
        // 用while循环来累加1到100
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            System.out.println("当前次数" + n);
            sum = sum + n; // 把n累加到sum中
            n++; // n自身加1
            System.out.println("总和" + sum);
        }
        System.out.println(sum); // 5050
    }
}

class Hello_32 {
    public static void main(String[] args) {
        // 把对1到100的求和用do while循环改写一下
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n++;
        } while (n <= 100);
        System.out.println(sum);
    }
}

class Hello_33 {
    public static void main(String[] args) {
        // 把1到100求和用for循环改写一下
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

class Hello_34 {
    // Java还提供了另一种for each循环，它可以更简单地遍历数组：
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }
}

// Ctrl + Alt + L，格式化代码
class Hello_35 {
    public static void main(String[] args) {
        // 在循环过程中，可以使用break语句跳出当前循环。
        int sum = 0;
        for (int i = 1; ; i++) {             // 此处，并没有终止条件
            sum = sum + i;
            if (i == 100) {             // 手动判断，并终止
                break;
            }
        }
        System.out.println(sum);
    }
}

class Hello_36 {
    public static void main(String[] args) {
        // break会跳出当前循环，也就是整个循环都不会执行了。
        // 而continue则是提前结束本次循环，直接继续执行下次循环。
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue;           // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum); // 25
    }
}