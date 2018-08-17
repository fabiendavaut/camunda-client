package com.viadialog.camundaclient.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ConsumerProducerService {

    private final Logger log = LoggerFactory.getLogger(ConsumerProducerService.class);

    private ConsumerProducerChannel consumerProducerChannel;

    public ConsumerProducerService(ConsumerProducerChannel consumerProducerChannel) {
        this.consumerProducerChannel = consumerProducerChannel;
    }

    @StreamListener(ConsumerProducerChannel.COMMAND_CHANNEL)
    public synchronized void consumeCommand(MyCommandDTO myCommandDTO) {

        log.debug("Received message: {}.", myCommandDTO);

        MyReceiptDTO myReceiptDTO = new MyReceiptDTO().executionId(myCommandDTO.getExecutionId());

        this.consumerProducerChannel.sendReceipt().send(MessageBuilder.withPayload(myReceiptDTO).build());
    }


//    @StreamListener(ConsumerProducerChannel.COMMAND_CHANNEL)
//    public synchronized void consumeCommand(MyCommandDTO myCommandDTO) {
//
//        log.debug("Received message: {}.", myCommandDTO);
//
//        Integer i = Integer.valueOf(myCommandDTO.getExecutionId()) + 1;
//        MyReceiptDTO myReceiptDTO = new MyReceiptDTO().executionId(i.toString());
//
//        this.consumerProducerChannel.sendReceipt().send(MessageBuilder.withPayload(myReceiptDTO).build());
//    }

}
