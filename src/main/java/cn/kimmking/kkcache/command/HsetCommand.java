package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Hset command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class HsetCommand implements Command {
    @Override
    public String name() {
        return "HSET";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String[] hkeys = getHkeys(args);
        String[] hvals = getHvals(args);
        return Reply.integer(cache.hset(key, hkeys, hvals));
    }

}
