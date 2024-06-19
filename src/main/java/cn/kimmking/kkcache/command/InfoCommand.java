package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Info command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class InfoCommand implements Command {

    private static final String INFO = "KKCache Server[v1.0.1], created by kimmking." + CRLF
            + "Mock Redis Server, at 2024-06-19 in Beijing." + CRLF;


    @Override
    public String name() {
        return "INFO";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        return Reply.bulkString(INFO);
    }
}
