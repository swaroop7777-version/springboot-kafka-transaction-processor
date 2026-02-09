package com.jpmc.midascore.entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.Instant;

@Entity
public class TransactionRecord {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(optional = false)
    private UserRecord sender;

    @ManyToOne(optional = false)
    private UserRecord recipient;

    @Column(nullable = false)
    private float amount;

    protected TransactionRecord() {}

    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount, float incentiveAmount) {
    }

    public long getId() { return id; }
    public UserRecord getSender() { return sender; }
    public UserRecord getRecipient() { return recipient; }
    public float getAmount() { return amount; }
}
