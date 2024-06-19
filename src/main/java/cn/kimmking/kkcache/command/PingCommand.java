package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Ping command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class PingCommand implements Command {
    @Override
    public String name() {
        return "PING";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        String ret = "PONG";
        if(args.length >= 5) {
            ret = args[4];
        }
        return Reply.string(ret);
    }
}
