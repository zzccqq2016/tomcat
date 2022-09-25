package org.kira;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.RequestFilterValve;
import org.apache.juli.logging.Log;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/9/16 0:14
 */
public class TestValue extends RequestFilterValve {
    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        System.out.println("TestValue");
    }

    @Override
    protected Log getLog() {
        return null;
    }
}