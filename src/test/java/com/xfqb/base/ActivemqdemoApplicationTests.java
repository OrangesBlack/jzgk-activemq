package com.xfqb.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xfqb.base.active.inter.SendJmsProducer;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ActivemqdemoApplicationTests extends TestCase {
	
	@Autowired
    private SendJmsProducer sendJmsProducer;
	
    @Test
    public void testStringListTopic() {
        System.out.println("正在发送集合主题消息ing......");
        sendJmsProducer.sendStringQueue("stringQueue", "消费");
    }
}
