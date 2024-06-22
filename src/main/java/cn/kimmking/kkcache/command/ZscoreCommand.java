package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Zscore command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class ZscoreCommand implements Command {
    @Override
    public String name() {
        return "ZSCORE";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String key = getKey(args);
        String val = getVal(args);
        Double zscore = cache.zscore(key, val);
        return Reply.string(zscore == null ? null : zscore.toString());
    }
}
