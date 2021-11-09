/**
 * Created by ycw/yanch on 2021/11/1.
 */
public class Main1 {
    public static void main(String[] args) {
        // 我们可以利用接收到的命令行参数，根据不同的参数执行不同的代码。例如，实现一个-version参数，打印程序版本号：
        // 进入【src】之内
        // javac  -encoding UTF-8  Main.java
        // java   Main  -version

        //
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
