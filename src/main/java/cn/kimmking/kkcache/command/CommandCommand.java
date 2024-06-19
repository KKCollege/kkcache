package cn.kimmking.kkcache.command;

import cn.kimmking.kkcache.core.Command;
import cn.kimmking.kkcache.core.Commands;
import cn.kimmking.kkcache.core.KKCache;
import cn.kimmking.kkcache.core.Reply;

/**
 * Command command.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:15
 */
public class CommandCommand implements Command {

    @Override
    public String name() {
        return "COMMAND";
    }

    @Override
    public Reply<?> exec(KKCache cache, String[] args) {
        return Reply.array(Commands.getCommandNames());
    }
}
