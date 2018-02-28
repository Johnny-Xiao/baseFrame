package spring.test.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.manager.util.RedisUtil;

/** 声明用的是Spring的测试类 **/
@RunWith(SpringJUnit4ClassRunner.class)
/** 声明spring主配置文件位置 **/
@ContextConfiguration(locations={"classpath:applicationContext*.xml"})
/** 事务自动回滚  **/
/*@Rollback*/
public class RedisTest {
	
	@Autowired
	private RedisUtil redisUtil;
	
	@Test
	public void test() {
		redisUtil.getCacheObject("test1");
		System.out.println("test");
	}
}
