package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Mget command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class MgetCommand implements Command {
    @Override
    public String name() {
        return "MGET";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String[] keys = getParams(args);
        return Reply.array(cache.mget(keys));
    }
    
}
