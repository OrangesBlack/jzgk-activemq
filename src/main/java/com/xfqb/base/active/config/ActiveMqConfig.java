package com.xfqb.base.active.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

/**
 * 
 * @ClassName:  ActiveMqConfig   
 * @Description:ACTIVEMQ工厂配置类   
 * @author: LouYue 
 * @date:   2018年12月13日 下午3:27:18   
 *
 */
@Configuration
public class ActiveMqConfig {
	
	/**
	 * 点对点
	 * QUEUE模式的ListenerContainer
	 * @param activeMQConnectionFactory
	 * @return
	 */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }
    
    /**
     * 主题
     * TOPIC模式的ListenerContainer
     * @param activeMQConnectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }
}
