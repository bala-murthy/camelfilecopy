package com.learncamel.files;

import org.apache.camel.builder.RouteBuilder;

public class CopyFilesRouter extends RouteBuilder {
    public void configure() throws Exception {
        from("file://F:/ApacheCamel/Input?noop=true")
                .to("log:level=INFO&showAll=true")
                .to("file://F:/ApacheCamel/Output");
    }
}
