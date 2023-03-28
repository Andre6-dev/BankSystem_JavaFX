package com.devspace.javafxproject.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Transaction {

    private final StringProperty sender;
    private final StringProperty receiver;
    private final StringProperty amount;
    private final ObjectProperty<LocalDate> date;
    private final StringProperty message;

    public Transaction(StringProperty sender, StringProperty receiver, StringProperty amount, ObjectProperty<LocalDate> date, StringProperty message) {
        this.sender = new SimpleStringProperty(this, "Sender", sender.get());
        this.receiver = new SimpleStringProperty(this, "Receiver", receiver.get());
        this.amount = new SimpleStringProperty(this, "Amount", amount.get());
        this.date = new SimpleObjectProperty<>(this, "Date", date.get());
        this.message = new SimpleStringProperty(this, "Message", message.get());
    }

    public StringProperty senderProperty() {
        return sender;
    }

    public StringProperty receiverProperty() {
        return receiver;
    }

    public StringProperty amountProperty() {
        return amount;
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public StringProperty messageProperty() {
        return message;
    }
}
