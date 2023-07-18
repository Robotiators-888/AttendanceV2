package attendancev2;

public class AttendAPI {
    private RedisHandler redis;
    private AttendAPI instance = null;

    public AttendAPI getIntance() {
       if(instance == null){
        synchronized(AttendAPI.class){
            if(instance == null){
                instance = new AttendAPI();
            }
        }
       }
       return instance;
    }

    private AttendAPI(){
        redis = new RedisHandler();
    }

    public String concatTime(String type, String dateTime){

        return type + ": " + dateTime;
    }

    public double calculateHours(){
       
       
       
        return 0.0;
    }

    public boolean writeToExcel(){
        return true;
    }

}
