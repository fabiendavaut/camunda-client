package com.viadialog.camundaclient.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerProducerChannel {

    String COMMAND_CHANNEL = "command";

    String RECEIPT_CHANNEL = "receipt";

    @Input(COMMAND_CHANNEL)
    SubscribableChannel receiveCommand();

    @Output(RECEIPT_CHANNEL)
    MessageChannel sendReceipt();

}
