package com.dessignpatterns.com;

import com.dessignpatterns.com.interfaces.Observer;
import com.dessignpatterns.com.model.EmailTopic;
import com.dessignpatterns.com.model.EmailTopicSubscriber;

public class Main {

  public static void main(String[] args) {
    EmailTopic topic = new EmailTopic();

    // create observers
    Observer firstObserver = new EmailTopicSubscriber("First observer");
    Observer secondObserver = new EmailTopicSubscriber("Second observer");
    Observer thirdObserver = new EmailTopicSubscriber("Third observer");

    // Register them...
    topic.register(firstObserver);
    topic.register(secondObserver);
    topic.register(thirdObserver);

    // Attaching observer to subject
    firstObserver.setSubject(topic);
    secondObserver.setSubject(topic);
    thirdObserver.setSubject(topic);

    // Check for updates
    firstObserver.udpate();

    // Provider/Subject (broadcaster)
    topic.postMessage("Hello Subscribers");

    topic.unregister(firstObserver);

    topic.postMessage("Hello subscribers");
  }
}