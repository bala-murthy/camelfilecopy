package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class copyFilesDirect extends RouteBuilder{


    public void configure() throws Exception {
        from("direct:sampleDirectInput").
                log("Received Messages is ${body} and Header is ${headers}").
                to("file:sampleDirectOutput?fileName=output.txt");

    }
}
