package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Zcount command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ZcountCommand implements Command {
    @Override
    public String name() {
        return "ZCOUNT";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        double min = Double.parseDouble(getVal(args));
        double max = Double.parseDouble(args[8]);
        return Reply.integer(cache.zcount(key, min, max));
    }
}
