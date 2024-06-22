package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Zrank command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ZrankCommand implements Command {
    @Override
    public String name() {
        return "ZRANK";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String val = getVal(args);
        return Reply.integer(cache.zrank(key, val));
    }
}
