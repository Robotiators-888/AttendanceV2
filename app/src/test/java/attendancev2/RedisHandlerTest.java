package attendancev2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedisHandlerTest {
    RedisHandler redis = new RedisHandler();
    @Test
    public void handleTest(){
        redis.forcePut(1, "0106", "Spencer McGrath");
        redis.logInOut("0106", true);
        
    }

}
