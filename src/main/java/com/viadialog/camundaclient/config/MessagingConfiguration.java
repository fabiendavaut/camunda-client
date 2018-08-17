package com.viadialog.camundaclient.config;

import com.viadialog.camundaclient.messaging.ConsumerProducerChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Configures Spring Cloud Stream support.
 *
 * See http://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/
 * for more information.
 */
@EnableBinding(value = {ConsumerProducerChannel.class})
public class MessagingConfiguration {
}
