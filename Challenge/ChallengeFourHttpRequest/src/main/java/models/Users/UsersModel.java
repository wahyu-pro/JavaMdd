package models.Users;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UsersModel {

	@SerializedName("per_page")
	private int perPage;

	@SerializedName("total")
	private int total;

//	@SerializedName("ad")
//	private Ad ad;

	@SerializedName("data")
	private List<Object> data;

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@Override
	public String toString() {
		return "{" +
				"\"page=\"" + page +
				", \"perPage=\"" + perPage +
				", \"total=\"" + total +
//				", \"ad=\"" + ad +
				", \"data=\"" + data +
				", \"totalPages=\"" + totalPages +
				'}';
	}
}