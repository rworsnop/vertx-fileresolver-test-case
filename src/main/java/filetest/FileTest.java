package filetest;

import io.vertx.core.Vertx;
import io.vertx.core.impl.FileResolver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileTest {

    public static void main(String[] args) throws Exception {
        FileResolver resolver = new FileResolver(Vertx.vertx());
        // Succeeds because it's in this jar
        System.out.println(resolver.resolveFile("filetest/FileTest.class"));
        // Fails because it's in the vert.x core jar
        System.out.println(resolver.resolveFile("codegen.json"));
    }
}
