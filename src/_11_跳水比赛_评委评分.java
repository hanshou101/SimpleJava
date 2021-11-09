import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ycw/yanch on 2021/11/3.
 */
class _11_跳水比赛_评委评分 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Judge judge = new Judge();
        //judge.getLastFen(); 不打印，怎么出结果哦
        System.out.println(judge.getLastFen());

    }
}


class Judge {
    // 定义一个可以存放8个小数
    float fens[] = null;
    // 在这里定义，方便以后改
    int size = 8;

    // 构造函数代码初始化专用，显得更加规范
    public Judge() {
        fens = new float[size];
        // 初始化
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // for(int i=0;i<fens.length;i++){
        // 不能写在这里：System.out.println("请输入第"+(i+1)+"裁判的分数");
        try {
            for (int i = 0; i < fens.length; i++) {
                System.out.println("请输入第" + (i + 1) + "裁判的分数");

                fens[i] = Float.parseFloat(br.readLine());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    // 得到运动员的最后得分
    public float getLastFen() {
        // 功能：
        // 找到最低、最高(没办法去掉，只能找到它的下标)以及去掉最低最高得出最后得分
        float allFen = 0;
        int minIndex = this.getLowFenIndex();
        int maxIndex = this.getHightFenIndex();
        for (int i = 0; i < fens.length; i++) {
            if (i != minIndex && i != maxIndex) {
                allFen += fens[i];
            }
        }

        return allFen / (fens.length - 2);

    }

    public int getLowFenIndex() {
        // 选择法：认为第一个是最低分
        float minFen = fens[0];
        int minIndex = 0;

        for (int i = 1; i < fens.length; i++) {
            // 修改最低分
            if (fens[i] < minFen) {         // FIXME 已修正。如果【新出现的分数】小于【之前最低的分数】，将【最低分】记录为新值。
                minFen = fens[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int getHightFenIndex() {
        // 选择法：认为第一个是最低分
        float maxFen = fens[0];
        int maxIndex = 0;
        for (int i = 1; i < fens.length; i++) {
            // 修改最低分
            if (fens[i] > maxFen) {         // FIXME 已修正。如果【新出现的分数】大于【之前最高的分数】，将【最高分】记录为新值。
                maxFen = fens[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
