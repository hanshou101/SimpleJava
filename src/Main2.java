/**
 * Created by ycw/yanch on 2021/11/1.
 */
public class Main2 {
    public static void main(String[] args) {
        // ���ǿ������ý��յ��������в��������ݲ�ͬ�Ĳ���ִ�в�ͬ�Ĵ��롣���磬ʵ��һ��-version��������ӡ����汾�ţ�
        // ���롾src��֮��
        // javac  -encoding UTF-8  Main.java
        // java   Main  -version

        //
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
