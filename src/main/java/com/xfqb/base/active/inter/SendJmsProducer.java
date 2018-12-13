package com.xfqb.base.active.inter;


import java.io.Serializable;
import java.util.List;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * 
 * @ClassName:  MqProducer   
 * @Description:消费生产类   
 * @author: LouYue 
 * @date:   2018年12月13日 下午3:35:11   
 *
 */
@Service
public class SendJmsProducer{
	
	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
	
	
	
	/*------------------------------------------------------ 消息队列 ------------------------------------------------------ */
	/**
	 * 发送字符串消息队列
	 * @param queueName 队列名称
	 * @param message 字符串
	 */
    public void sendStringQueue(String queueName, String message) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQQueue(queueName), message);
    }
    
	/**
	 * 发送字符串集合消息队列
	 * @param queueName 队列名称
	 * @param list 字符串集合
	 */
    public void sendStringListQueue(String queueName, List<String> list) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQQueue(queueName), list);
    }
 
	/**
	 * 发送对象消息队列
	 * @param queueName 队列名称
	 * @param obj 对象
	 */
    public void sendObjQueue(String queueName, Serializable obj) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQQueue(queueName), obj);
    }
 
	/**
	 * 发送对象集合消息队列
	 * @param queueName 队列名称
	 * @param objList 对象集合
	 */
    public void sendObjListQueue(String queueName, List<Serializable> objList) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQQueue(queueName), objList);
    }
 
    
 
	
	/*------------------------------------------------------ 主题队列 ------------------------------------------------------ */
	/**
	 * 发送字符串消息主题
	 * @param topicName 主题名称
	 * @param message 字符串
	 */
    public void sendStringTopic(String topicName, String message) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQTopic(topicName), message);
    }
 
	/**
	 * 发送字符串消息集合主题
	 * @param topicName 主题名称
	 * @param list 字符串集合
	 */
    public void sendStringListTopic(String topicName, List<String> list) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQTopic(topicName), list);
    }
 
	/**
	 * 发送对象消息主题
	 * @param topicName 主题名称
	 * @param obj 对象
	 */
    public void sendObjTopic(String topicName, Serializable obj) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQTopic(topicName), obj);
    }
 
	/**
	 * 发送对象集合消息主题
	 * @param topicName 主题名称
	 * @param objList 对象集合
	 */
    public void sendObjListTopic(String topicName, List<Serializable> objList) {
        this.jmsMessagingTemplate.convertAndSend(new ActiveMQTopic(topicName), objList);
    }
}
