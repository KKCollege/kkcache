package cn.kimmking.kkcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * plugins entrypoint.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/12 下午8:14
 */

@Component
public class KKApplicationListener implements ApplicationListener<ApplicationEvent> {

    @Autowired
    List<KKPlugin> plugins;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ApplicationReadyEvent are) {
            for (KKPlugin plugin : plugins) {
                plugin.init();
                plugin.startup();
            }
        } else if (event instanceof ContextClosedEvent cce) {
            for (KKPlugin plugin : plugins) {
                plugin.shutdown();
            }
        }
    }
}
