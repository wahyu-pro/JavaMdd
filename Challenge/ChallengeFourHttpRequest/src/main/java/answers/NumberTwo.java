package answers;

import clients.TodosClient;
import models.Todos.Todos;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.stream.Collectors;


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

        // Get data
    }
}
