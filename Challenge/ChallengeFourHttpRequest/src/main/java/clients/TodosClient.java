package clients;

import services.TodosService;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TodosClient {
    public static TodosService todosService(){
        var retrofit = new Retrofit.Builder()
                .baseUrl("https://online-course-todo.herokuapp.com/api/v1/")
                .addConverterFactory(
                        GsonConverterFactory.create(
                                new GsonBuilder().setLenient().create()
                        )
                )
                .build();

        return retrofit.create(TodosService.class);
    }
}
