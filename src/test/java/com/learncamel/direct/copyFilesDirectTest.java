package com.learncamel.direct;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

public class copyFilesDirectTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder(){
        return new copyFilesDirect();
    }

    @Test
    public void testDirectFileSource() throws InterruptedException{
        template.sendBody("direct:sampleDirectInput","123,Bala,Solution Architect");
        Thread.sleep(5000);

        File opDir = new File("sampleDirectOutput");

        // Check if Directory Exists
        assertTrue(opDir.isDirectory());

        // Check if File name received is Correct
        Exchange exchangeContent = consumer.receive("file:sampleDirectOutput");
        assertEquals("outpudsfdsfdsft.txt",exchangeContent.getIn().getHeader("CamelFileName"));

    }



}
