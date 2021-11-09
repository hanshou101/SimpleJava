import java.util.Scanner;

/**
 * 采用面向对象的方式 写一个登录系统
 * @author Administrator
 *
 */

//用户信息
class UserInfo{
    public static String[] user = new String[10];
    public static String[] passwd = new String[10];

    public UserInfo() {
        this.user[0] = "test";
        this.passwd[0] ="123456";

    }

}

//找回密码
class ZhaoHui extends UserInfo{
    public static void zhaohui() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要找回的用户名：");
        String zname = s.nextLine();
        for(int i=0;i<2;i++) {
            if(user[i].equals(zname)) {
                Scanner ss = new Scanner(System.in);
                System.out.println("恭喜你!成功找回密码，请输入："+"'为什么不ban猛犸'"+"  查看密码");
                String zgzs = ss.nextLine();

                if("张哥最帅".equals(zgzs)) {
                    System.out.println(passwd[i]);
                }else {
                    System.out.println("请输正确！");
                }
            }else if(user[i]!=zname){
                System.out.println("用户名不存在！");
                return;
            }
            break;
        }
    }
}
//修改密码
class XiuGai extends UserInfo{
    public static void xiugai() {

        Scanner s =new Scanner(System.in);
        System.out.println("请输入您要修改的密码：");
        String xpasswd = s.nextLine();
        for(int i=0;i<2;i++) {
            passwd[i] = xpasswd;
            if(xpasswd.equals(passwd[i])) {
                System.out.println("恭喜你，修改成功！");
                break;
            }else {
                System.out.println("修改密码失败");
                break;
            }
        }
    }
}

//查询用户
class ChaXun extends UserInfo{

    public static void select() {
        for(int i=0;i<2;i++) {
            System.out.println("当前用户："+user[i] +"\n"+ "当前密码："+passwd[i] );
            i++;
            break;
        }
    }
}
//注册
class ZhuCe extends UserInfo{

    public static void regist() {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String suser = ss.nextLine();
        System.out.println("请输入密码：");
        String spasswd = ss.nextLine();

        for(int i=0;i<user.length;i++) {

            user[i] = suser;
            passwd[i] = spasswd;
            System.out.println("注册成功!");
            break;

        }
    }
}

//登录
class Loginc extends UserInfo{

    public static void login() {
        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String users = scanner.nextLine();
        System.out.println("请输入密码：");
        String passwds = scanner.nextLine();

        for(int i=0;i<UserInfo.user.length;i++) {
            if(user[i].equals(users) && passwd[i].equals(passwds)) {
                System.out.println("登陆成功！");
                break;
            }
            System.out.println("登陆失败！");
            break;
        }

    }
}


//主界面
class ZhuJieMian{
    public static void Start() {
        Loginc Loginc = new Loginc();
        ZhuCe ZhuCe = new ZhuCe();
        ChaXun ChaXun = new ChaXun();
        XiuGai XiuGai = new XiuGai();
        ZhaoHui ZhaoHui = new ZhaoHui();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("|"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+"\t"+"|");
            System.out.println("|"+"\t" + "测试用户名:test 测试密码:123456" + "\t"+ "\t"+ "\t"+ "\t"+"|");
            System.out.println("|" + "\t"+ "请输入[1-5]进行操作 1.登录|2.注册|3.查询当前用户|4.修改密码|5.找回密码 " + "\t"+"|");
            System.out.print("请输入:");
            int temp = s.nextInt();

            switch(temp) {
                case 1:Loginc.login();
                    break;
                case 2:ZhuCe.regist();;
                    break;
                case 3:ChaXun.select();;
                    break;
                case 4:XiuGai.xiugai();;
                    break;
                case 5:ZhaoHui.zhaohui();;
                    break;
                default:
                    System.out.println("错误！请重写输入正确的数字进行操作！");

            }
        }
    }

}

class LoginTest {
    public static void main(String[] args) {
        ZhuJieMian zjm = new ZhuJieMian();
        zjm.Start();


    }

}