package com.example.netflix.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "subscribers")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "subscriber_id")
    private Long subscriberId;

    @NotNull
    @Column(name = "subscriber_name")
    private String subscriberName;

    public Subscriber(@NotNull String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberId=" + subscriberId +
                ", subscriberName='" + subscriberName + '\'' +
                '}';
    }
}
