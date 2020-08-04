package Answers;

import Clients.TodosClient;
import Models.Todos.All;
import Models.Todos.Todos;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NumberTwo {
    public static void main(String[] args) {
        TodosClient.todosService().getAllTodos().enqueue(new Callback<All>() {
            @Override
            public void onResponse(Call<All> call, Response<All> response) {
                if (response.code() >= 200 & response.code() <= 299) {
                    System.out.println(new Gson().toJson(response.body()));
                } else {
                    System.out.println("Maaf response gagal dengan kode " +
                            response.code());
                }
                System.exit(0);
            }

            @Override
            public void onFailure(Call<All> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
