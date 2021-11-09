import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ycw/yanch on 2021/11/5.
 */


//序列化/反序列化
class _12_反序列化 {
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        //实例化一个可序列化对象
        Giao testClass = new Giao();
        testClass.name = "说唱带师";
        testClass.motto = "一给我哩 giao giao！";

        //序列化
        //将序列化后的对象写入到文件
        FileOutputStream fos = new FileOutputStream("test.ser");        // 看做【楼层水闸】
        ObjectOutputStream os = new ObjectOutputStream(fos);                    // 看做【水龙头】
        os.writeObject(testClass);                                              // 水龙头的【放水能力】
        os.close();                                                             // 关水龙头
        fos.close();                                                            // 关水闸



        //反序列化
        Giao obj = null;
        //从文件读取序列化的结果后进行反序列化
        FileInputStream fis = new FileInputStream("test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        obj = (Giao)ois.readObject();
        ois.close();
        fis.close();


        System.out.println(obj.name);
        System.out.println(obj.motto);
    }
}


// /定义一个可序列化的类，该类必须实现 java.io.Serializable 接口
class Giao implements java.io.Serializable
{
    public String name;
    public String motto;
    public void saygiao()
    {
        System.out.println(this.motto);
    }
    // 自定义 readObject 方法
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
        //执行默认的readObject()方法
        in.defaultReadObject();

        //执行命令
        Runtime.getRuntime().exec("calc.exe");
    }
}
