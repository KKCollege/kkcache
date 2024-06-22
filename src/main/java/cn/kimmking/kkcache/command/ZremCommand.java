package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

import java.util.Arrays;

/**
 * Zrem command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ZremCommand implements Command {
    @Override
    public String name() {
        return "ZREM";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String[] vals = getParamsNoKey(args);
        return Reply.integer(cache.zrem(key, vals));
    }

}
