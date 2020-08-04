package Clients;

import Services.UserService;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserClient {
    public static UserService userService(){
        var retrofit = new Retrofit.Builder()
                .baseUrl(" https://reqres.in/api/")
                .addConverterFactory(
                        GsonConverterFactory.create(
                                new GsonBuilder().setLenient().create()
                        )
                )
                .build();

        return retrofit.create(UserService.class);
    }
}
