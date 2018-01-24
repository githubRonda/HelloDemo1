
import java.util.Arrays;

class Test{
	public static void man(String[] args){

        String str = "我要去北京啦啦啦!";
        if (str.contains("要去")){

            String[] splits = str.split("要去");

            System.out.println(Arrays.toString(splits));

            //Settings.System.putString(getContentResolver(), "inner_command", command + "_" + mRandom.nextInt(1000));//页面内部命令
        }
	}
}
