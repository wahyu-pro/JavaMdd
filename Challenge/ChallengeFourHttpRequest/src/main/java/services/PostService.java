package services;

import models.PostsAndUsers.Post;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PostService {
    @GET("posts")
    Call<List<Post>> getPosts();
}
