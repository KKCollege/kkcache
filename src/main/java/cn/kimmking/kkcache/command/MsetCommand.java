package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * MSet command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class MsetCommand implements Command {
    @Override
    public String name() {
        return "MSET";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String[] keys = getKeys(args);
        String[] vals = getVals(args);
        cache.mset(keys, vals);
        return Reply.string(OK);
    }

}
