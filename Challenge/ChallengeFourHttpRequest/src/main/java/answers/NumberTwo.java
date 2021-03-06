package answers;

import clients.TodosClient;
import models.Todos.Data;
import models.Todos.PostTodosModel;
import models.Todos.Todos;
import com.google.gson.Gson;
import models.Todos.TodosDetail;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.FileOutputStream;


public class NumberTwo {
    public static void main(String[] args) {
        // Get data todos
        TodosClient.todosService().getAllTodos().enqueue(new Callback<Todos>() {
            @Override
            public void onResponse(Call<Todos> call, Response<Todos> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    try {
//                        var list = Arrays.asList(response.body());
//                        list.stream().map(s -> s.getData().get(0).setTask("aku")).forEach(System.out::println);
                        var json = new Gson().toJson(response.body());
                        var file = new FileOutputStream("src/file.json");
                        file.write(json.getBytes());
                        file.flush();
                        file.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
//                System.exit(0);
            }

            @Override
            public void onFailure(Call<Todos> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        // Get data todos by id
        TodosClient.todosService().getTodosbyid(38).enqueue(new Callback<TodosDetail>() {
            @Override
            public void onResponse(Call<TodosDetail> call, Response<TodosDetail> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    System.out.println(new Gson().toJson(response.body()));
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
//                    System.exit(0);
            }

            @Override
            public void onFailure(Call<TodosDetail> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        // Post todos
//        PostTodosModel post = new PostTodosModel();
//        Data data = new Data();
//        data.setTask("Eksplor Node js");
//        data.setStatus(true);
//        post.setData(data);
//        Call<PostTodosModel> callPostTodos = TodosClient.todosService().postTodos(post);
//        callPostTodos.enqueue(new Callback<PostTodosModel>() {
//            @Override
//            public void onResponse(Call<PostTodosModel> call, Response<PostTodosModel> response) {
//                if (response.code() >= 200 & response.code() <= 299) {
//                    System.out.println(new Gson().toJson(response.body()));
//                        System.exit(0);
//                } else {
//                    System.out.println("Maaf response gagal dengan kode " +
//                            response.code());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<PostTodosModel> call, Throwable t) {
//                System.out.println(t.getMessage());
//            }
//        });
    }
}
