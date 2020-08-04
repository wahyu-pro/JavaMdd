package services;

import models.Users.PostUserModel;
import models.Users.UpdateUserModel;
import models.Users.UserModel;
import models.Users.UsersModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {
    // add query params
    @GET("users")
    Call<UsersModel> getUser(@Query("page") int page);

    @GET("users/{id}")
    Call<UserModel> getUserById(@Path("id") int id);

    @Headers({"Content-type: application/json"})
    @POST("users")
    Call<PostUserModel> postUser(@Body PostUserModel post);

    @PUT("users/{id}")
    Call<UpdateUserModel> putUser(@Path("id") int id, @Body UpdateUserModel update);

    @PATCH("users/{id}")
    Call<UpdateUserModel> patchUser(@Path("id") int id, @Body UpdateUserModel update);

    @DELETE("users/{id}")
    Call<ResponseBody> deleteUser(@Path("id") int id);

}
