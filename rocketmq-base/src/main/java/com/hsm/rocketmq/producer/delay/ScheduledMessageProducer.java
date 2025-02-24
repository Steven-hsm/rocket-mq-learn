package com.hsm.rocketmq.producer.delay;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;

public class ScheduledMessageProducer {
    public static void main(String[] args) throws Exception{
        // Instantiate a producer to send scheduled messages
        DefaultMQProducer producer = new DefaultMQProducer("delay-producer");
        // 设置NameServer地址
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        int totalMessagesToSend = 100;
        for (int i = 0; i < totalMessagesToSend; i++) {
            Message message = new Message("topic-delay", ("Hello scheduled message " + i).getBytes());
            // This message will be delivered to consumer 10 seconds later.
            message.setDelayTimeLevel(MqDelayLevelEnum.LEVEL_3.getLevel());
            // Send the message
            producer.send(message);
        }

        // Shutdown producer after use.
        producer.shutdown();
    }
}
