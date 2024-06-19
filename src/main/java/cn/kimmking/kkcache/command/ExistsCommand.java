package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Exists command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ExistsCommand implements Command {
    @Override
    public String name() {
        return "EXISTS";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String[] key = getParams(args);
        return Reply.integer(cache.exists(key));
    }
}
