package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.service.TransactionProcessor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private final TransactionProcessor transactionProcessor;

    public KafkaConsumer(TransactionProcessor transactionProcessor) {
        this.transactionProcessor = transactionProcessor;
    }

    @KafkaListener(
            topics = "${general.kafka-topic}",
            groupId = "midas-core"
    )
    public void listen(Transaction tx) {
        transactionProcessor.process(tx);
    }
}