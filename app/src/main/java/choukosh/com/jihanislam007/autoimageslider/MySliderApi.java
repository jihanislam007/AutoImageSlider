package choukosh.com.jihanislam007.autoimageslider;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
 
public interface MySliderApi {
 
 
    @GET("onbording.php")
    Call<List<MySliderList>> getonbordingdata();
}