package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

import java.util.Arrays;

/**
 * Zadd command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ZaddCommand implements Command {
    @Override
    public String name() {
        return "ZADD";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String[] scores = getHkeys(args);
        String[] vals = getHvals(args);
        return Reply.integer(cache.zadd(key, vals, toDouble(scores)));
    }

    double[] toDouble(String[] scores) {
        return Arrays.stream(scores).mapToDouble(Double::parseDouble).toArray();
    }
}
