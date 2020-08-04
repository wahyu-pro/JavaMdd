package answers;

import clients.ApiClient;
import models.PostsAndUsers.Post;
import models.PostsAndUsers.Users;
import services.PostService;
import services.UsersService;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class NumberThree {

    public static void main(String[] args) {
        // Get All Posts
        ApiClient.client(PostService.class)
                .getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    System.out.println(new Gson().toJson(response.body()));
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
                System.exit(0);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        // Get All Users
        ApiClient.client(UsersService.class).getUsers().enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    System.out.println(new Gson().toJson(response.body()));
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
                System.exit(0);
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        // Get of posts and users
        ApiClient.client(PostService.class)
                .getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    System.out.println(response.body());
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
                System.exit(0);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
