package services;

import models.Todos.PostTodosModel;
import models.Todos.Todos;
import models.Todos.TodosDetail;
import models.Users.PostUserModel;
import retrofit2.Call;
import retrofit2.http.*;

public interface TodosService {
    @GET("todos")
    Call<Todos> getAllTodos();

    @GET("todos/{id}")
    Call<TodosDetail> getTodosbyid(@Path("id") int id);

    @Headers({"Content-type: application/json"})
    @POST("todos")
    Call<PostTodosModel> postTodos(@Body PostTodosModel postTodos);
}
