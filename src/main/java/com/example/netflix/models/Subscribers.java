package com.example.netflix.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "subscribers")
public class Subscribers {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
//    @Column(name = "subscriber_id")
    private Long subscriber_id;

//    @NotNull
//    @Column(name = "subscriber_name")
    private String subscriber_name;

    public Subscribers(@NotNull String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }

    public Long getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(Long subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public String getSubscriber_name() {
        return subscriber_name;
    }

    public void setSubscriber_name(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }

    @Override
    public String toString() {
        return "Subscribers{" +
                "subscriber_id=" + subscriber_id +
                ", subscriber_name='" + subscriber_name + '\'' +
                '}';
    }
}
