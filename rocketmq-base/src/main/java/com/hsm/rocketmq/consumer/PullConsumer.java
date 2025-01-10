package com.hsm.rocketmq.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPullConsumer;
import org.apache.rocketmq.client.consumer.PullResult;
import org.apache.rocketmq.client.consumer.PullStatus;
import org.apache.rocketmq.common.message.MessageQueue;

public class PullConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("please_rename_unique_group_name_5");
        consumer.setNamesrvAddr("127.0.0.1:9876");
        consumer.start();
        try {
            MessageQueue mq = new MessageQueue();
            mq.setQueueId(0);
            mq.setTopic("TopicTest");
            mq.setBrokerName("steven");
            long offset = 26;
            PullResult pullResult = consumer.pull(mq, "*", offset, 32);
            if (pullResult.getPullStatus().equals(PullStatus.FOUND)) {
                System.out.printf("%s%n", pullResult.getMsgFoundList());
                consumer.updateConsumeOffset(mq, pullResult.getNextBeginOffset());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        consumer.shutdown();
    }
}
