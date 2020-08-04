package Models.Users;

import com.google.gson.annotations.SerializedName;

public class UserModel{

	@SerializedName("ad")
	private Ad ad;

	@SerializedName("data")
	private Data data;

	@Override
 	public String toString(){
		return 
			"UserModel{" + 
			"ad = '" + ad + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}