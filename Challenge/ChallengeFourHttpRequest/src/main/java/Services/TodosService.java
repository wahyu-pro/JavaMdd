package Services;

import Models.Todos.All;
import Models.Todos.Todos;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TodosService {
    @GET("todos")
    Call<All> getAllTodos();
}
