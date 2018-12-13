package com.xfqb.base.active.demo;

import java.util.List;

import javax.jms.ObjectMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName:  ATopicConsumer   
 * @Description:A主题类消息接受类   
 * @author: LouYue 
 * @date:   2018年12月13日 下午3:40:18   
 *
 */
@Component
public class ATopicConsumer {
	
	/**
	 * 接受字符串主题消息
	 * @param msg
	 */
	@JmsListener(destination = "stringTopic", containerFactory = "jmsListenerContainerTopic")
    public void receiveStringTopic(String msg) {
        System.out.println("ATopicConsumer接收到消息...." + msg);
    }
 
	/**
	 * 接受字符串集合主题消息
	 * @param list
	 */
    @JmsListener(destination = "stringListTopic", containerFactory = "jmsListenerContainerTopic")
    public void receiveStringListTopic(List<String> list) {
        System.out.println("ATopicConsumer接收到集合主题消息...." + list);
    }
 
    /**
     * 接受类主题消息
     * @param objectMessage
     * @throws Exception
     */
    @JmsListener(destination = "objTopic", containerFactory = "jmsListenerContainerTopic")
    public void receiveObjTopic(ObjectMessage objectMessage) throws Exception {
        System.out.println("ATopicConsumer接收到对象主题消息...." + objectMessage.getObject());
    }
 

    /**
     * 接受类集合主题消息
     * @param objectMessage
     * @throws Exception
     */
    @JmsListener(destination = "objListTopic", containerFactory = "jmsListenerContainerTopic")
    public void receiveObjListTopic(ObjectMessage objectMessage) throws Exception {
        System.out.println("ATopicConsumer接收到的对象集合主题消息..." + objectMessage.getObject());
    }
}
