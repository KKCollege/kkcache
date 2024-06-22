package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * HDEL command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class HdelCommand implements Command {
    @Override
    public String name() {
        return this.getClass().getSimpleName()
                .replace("Command", "").toUpperCase();
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String[] hkeys = getParamsNoKey(args);
        return Reply.integer(cache.hdel(key, hkeys));
    }

}
