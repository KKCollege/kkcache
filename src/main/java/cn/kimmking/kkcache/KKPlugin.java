package cn.kimmking.kkcache;

/**
 * kk cache plugin.
 *
 * @Author : kimmking(kimmking@apache.org)
 * @create 2024/6/12 下午8:12
 */
public interface KKPlugin {

    void init();
    void startup();
    void shutdown();

}
