package com.learncamel.mock;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class copyFilesMockTest extends CamelTestSupport {

    @Override
    public RouteBuilder createRouteBuilder(){
        return new copyFilesMock();
    }

    @Test
    public void testMockFilesCopyRouter() throws InterruptedException{
        //Construct the mock output that is expected in the sink
        String input = "Sample Mock Input Text";
        //get the mock output endpoint
        MockEndpoint mockEndPoint = getMockEndpoint("mock:samplemockoutput");
        // get the received inout value and store it in mock output object
        mockEndPoint.expectedBodiesReceived(input);

        template.sendBody("direct:samplemockinput","Sample Mock Input Text");
        //now compare and assert the received mock input and the expected mock output
        assertMockEndpointsSatisfied();

    }
}

