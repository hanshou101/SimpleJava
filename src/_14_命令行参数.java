/**
 * Created by ycw/yanch on 2021/11/6.
 */
class _14_命令行参数 {
}


class Hello_40 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}


class Hello_41 {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}