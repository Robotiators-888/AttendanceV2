package attendancev2;

import attendancev2.util.ResponceBuilder;
import redis.clients.jedis.Jedis;


public class RedisHandler {
    Jedis jedis = new Jedis("localhost", 8888);
    // JedisPooled pooled = new JedisPooled("localhost", 8888);

    public RedisHandler(){
        
    }

    public boolean forcePut(int db, String id, String name){
        jedis.select(db);
        jedis.set(id, name);

        return true;
    }

    public boolean logInOut(String id, boolean isLogin){
        jedis.select(0);
        System.out.println(jedis.set(id.toString(), ResponceBuilder.buildDataInput(isLogin, getName(id)).toString()));
        jedis.save();
        
        return true;
    }

    public String getName(String id){
        int pastDB = jedis.getDB();
        jedis.select(1);
        String name = jedis.get(id);
        jedis.select(pastDB);
        return name;
    }
}
