package aoptest.invohandler.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 吕勇
 * @date :2015年11月20日 下午4:02:48
 * @desc: 1.业务运转控制层Action<br />
 *        2.
 */
public class WorkServiceImpl implements WorkService{
    private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Override
    public String work() {
    	logger.info("work() is executing ...");
        return "work success";
    }

    @Override
    public String sleep() {
    	logger.info("sleep() is executing ...");
        return "sleep success";
    }
}