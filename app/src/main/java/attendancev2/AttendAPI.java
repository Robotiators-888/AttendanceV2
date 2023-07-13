package attendancev2;

public class AttendAPI {
    
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

    }

    public String concatTime(String type, String dateTime){
        return type + ": " + dateTime;
    }

    public double calculateHours(){
       
       
       
        return 0.0;
    }



}
