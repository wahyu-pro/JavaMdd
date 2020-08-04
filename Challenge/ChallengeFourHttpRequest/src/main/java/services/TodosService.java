package services;

import models.Todos.Todos;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TodosService {
    @GET("todos")
    Call<Todos> getAllTodos();
}
