package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Del command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class DelCommand implements Command {
    @Override
    public String name() {
        return "DEL";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String[] key = getParams(args);
        return Reply.integer(cache.del(key));
    }
}
