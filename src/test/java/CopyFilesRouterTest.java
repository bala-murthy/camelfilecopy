import com.learncamel.files.CopyFilesRouter;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

public class CopyFilesRouterTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new CopyFilesRouter();
    }


    @Test
    public void checkIfFileExistsInOPDir() throws InterruptedException{

        Thread.sleep(5000);
        File file = new File("F:/ApacheCamel/Output");
        assertTrue(file.isDirectory());
        assertEquals(2,file.listFiles().length);

    }
}
