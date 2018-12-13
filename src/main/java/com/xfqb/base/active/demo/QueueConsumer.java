package com.xfqb.base.active.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: QueueConsumer
 * @Description:队列消费类
 * @author: LouYue
 * @date: 2018年12月13日 下午3:36:32
 *
 */
@Component
public class QueueConsumer {

	/**
	 * 接受字符串消息
	 * @param msg
	 */
	@JmsListener(destination = "stringQueue", containerFactory = "jmsListenerContainerQueue")
	public void receiveStringQueue(String msg) {
		System.out.println("接收到消息...." + msg);
	}
}
