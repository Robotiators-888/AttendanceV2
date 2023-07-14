package attendancev2.util;

public class ResponceBuilder {
    public static DataInput buildDataInput(boolean isLogin, String name){
        return new DataInput(isLogin, name);
    }

    public static class DataInput{
        boolean isLogin;
        String time;
        String name;

        DataInput(boolean isLogin, String name){
            this.isLogin = isLogin;
            this.time = String.valueOf(System.currentTimeMillis());
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public String getName() {
            return name;
        }

        public boolean isLogin() {
            return isLogin;
        }

        @Override
        public String toString(){
            String type = (isLogin)? "LOGIN" : "LOGOUT";
            return type + ":" + time + ":"+name;
        }
    } 
}


