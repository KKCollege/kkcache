package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Lrange command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class LrangeCommand implements Command {
    @Override
    public String name() {
        return "LRANGE";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String[] params = getParamsNoKey(args);
        int start = Integer.parseInt(params[0]);
        int end = Integer.parseInt(params[1]);
        return Reply.array(cache.lrange(key, start, end));
    }
}
