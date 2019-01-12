package com.github.edagarli.eventbus.listener;

import com.github.edagarli.eventbus.Listener;
import com.github.edagarli.eventbus.bean.EventSource;
import com.github.edagarli.eventbus.event.ApplicationEventListener;
import org.springframework.stereotype.Component;

/**
 * @author : lurou
 * Email: lurou@2dfire.com
 * github: http://github.com/edagarli
 * Date: 2019/1/11
 * Time: 11:53
 * Desc:
 */
@Component
@Listener(priority = 1, tag = "123", enableAsync = false)
public class TestTwoListener implements ApplicationEventListener<EventSource> {

    @Override
    public void onApplicationEvent(EventSource event) {
        System.out.println("i am two====>>>" + event);
    }

}

