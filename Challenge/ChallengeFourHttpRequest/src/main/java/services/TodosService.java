package services;

import models.Todos.Todos;
import models.Todos.TodosDetail;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodosService {
    @GET("todos")
    Call<Todos> getAllTodos();

    @GET("todos/{id}")
    Call<TodosDetail> getTodosbyid(@Path("id") int id);
}
