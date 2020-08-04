package Models.Todos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class All {
    @SerializedName("data")
    List<Todos> data;

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
}
