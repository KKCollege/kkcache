package cn.kimmking.kkcache.core;

import cn.kimmking.kkcache.command.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * register commands.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/19 下午8:16
 */
public class Commands {

    private static Map<String, Command> ALL = new LinkedHashMap<>();

    static {
        initCommands();
    }

    private static void initCommands() {
        // common commands
        register(new PingCommand());
        register(new InfoCommand());
        register(new CommandCommand());

        // string
        register(new SetCommand());
        register(new GetCommand());
        register(new StrlenCommand());
        register(new DelCommand());
        register(new ExistsCommand());
        register(new IncrCommand());
        register(new DecrCommand());
        register(new MsetCommand());
        register(new MgetCommand());

        // list
        // Lpush, Rpush, Lpop, Rpop, Llen, Lindex, Lrange
        register(new LpushCommand());
        register(new LpopCommand());
        register(new RpopCommand());
        register(new RpushCommand());
        register(new LlenCommand());
        register(new LindexCommand());
        register(new LrangeCommand());

    }

    public static void register(Command command) {
        ALL.put(command.name(), command);
    }
    public static Command get(String name) {
        return ALL.get(name);
    }

    public static String[] getCommandNames() {
        return ALL.keySet().toArray(new String[0]);
    }

}
