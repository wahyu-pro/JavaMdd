package answers;

import clients.UserClient;
import models.Users.PostUserModel;
import models.Users.UpdateUserModel;
import models.Users.UserModel;
import models.Users.UsersModel;
import com.google.gson.Gson;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NumberOne {
    public static void main(String[] args) {

            // Get All User
            UserClient.userService().getUser(2).enqueue(new Callback<UsersModel>() {
                @Override
                public void onResponse(Call<UsersModel> call, Response<UsersModel> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println(new Gson().toJson(response.body()));
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                    System.exit(0);
                }

                @Override
                public void onFailure(Call<UsersModel> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });

            System.out.println("\n --- \n");

            // Get user by id
            UserClient.userService().getUserById(2).enqueue(new Callback<UserModel>() {
                @Override
                public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println(new Gson().toJson(response.body()));
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                    System.exit(0);
                }

                @Override
                public void onFailure(Call<UserModel> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });

            // Post user
            PostUserModel post = new PostUserModel();
            post.setName("wahyu");
            post.setJob("Engineer");
            Call<PostUserModel> call = UserClient.userService().postUser(post);
            call.enqueue(new Callback<PostUserModel>() {
                @Override
                public void onResponse(Call<PostUserModel> call, Response<PostUserModel> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println(new Gson().toJson(response.body()));
                        System.exit(0);
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                }

                @Override
                public void onFailure(Call<PostUserModel> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });

            // Update User with put
            UpdateUserModel put = new UpdateUserModel();
            put.setName("wahyu");
            put.setJob("Programmer");
            Call<UpdateUserModel> callup = UserClient.userService().putUser(2, put);
            callup.enqueue(new Callback<UpdateUserModel>() {
                @Override
                public void onResponse(Call<UpdateUserModel> call, Response<UpdateUserModel> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println(new Gson().toJson(response.body()));
                        System.exit(0);
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                }

                @Override
                public void onFailure(Call<UpdateUserModel> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });

            // update user with patch
            UpdateUserModel patch = new UpdateUserModel();
            patch.setName("wahyu");
            patch.setJob("Programmer");
            Call<UpdateUserModel> callpatch = UserClient.userService().patchUser(2, patch);
            callpatch.enqueue(new Callback<UpdateUserModel>() {
                @Override
                public void onResponse(Call<UpdateUserModel> call, Response<UpdateUserModel> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println(new Gson().toJson(response.body()));
                        System.exit(0);
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                }

                @Override
                public void onFailure(Call<UpdateUserModel> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });

            // Delete User
            Call<ResponseBody> calldel = UserClient.userService().deleteUser(2);
            calldel.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if (response.code() >= 200 & response.code() <= 299) {
                        System.out.println("User dengan id " + 2 + " berhasil dihapus");
                    } else {
                        System.out.println("Maaf response gagal dengan kode " +
                                response.code());
                    }
                    System.exit(0);
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    System.out.println(t.getMessage());
                }
            });


    }

}
