package com.twhydqa.automationdemo.spreedemo.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

import java.util.Objects;

public class BrowserScope extends SimpleThreadScope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object threadScopedDriver = super.get(name, objectFactory);

        SessionId sessionId = ((RemoteWebDriver) threadScopedDriver).getSessionId();

        if (Objects.isNull(sessionId)) {
            super.remove(name);
            threadScopedDriver =super.get(name, objectFactory);
        }

        return threadScopedDriver;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
//        super.registerDestructionCallback(name, callback);
    }
}
