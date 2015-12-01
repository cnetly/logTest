package aoptest.invohandler;

import aoptest.invohandler.test.WorkService;
import aoptest.invohandler.test.WorkServiceImpl;

public class Test {
    public static void main(String[] args) {
        WorkService ws = LogInvoHandler.getProxyInstance(WorkServiceImpl.class);
        ws.work();
        ws.sleep();
    }
}
