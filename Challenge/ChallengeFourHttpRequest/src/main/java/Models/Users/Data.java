package Models.Users;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("id")
	private int id;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("email")
	private String email;

	@Override
 	public String toString(){
		return 
			"{" +
			" \"last_name\" = '\"" + lastName + '\"' +
			", \"id\" = '\"" + id + '\"' +
			", \"avatar\" = '\"" + avatar + '\"' +
			", \"first_name\" = '\"" + firstName + '\"' +
			", \"email\" = '\"" + email + '\"' +
			"}";
		}
}