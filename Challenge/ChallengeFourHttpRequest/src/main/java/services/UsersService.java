package services;

import models.PostsAndUsers.Users;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface UsersService {
    @GET("users")
    Call<List<Users>> getUsers();
}
