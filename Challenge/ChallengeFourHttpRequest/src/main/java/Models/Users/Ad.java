package Models.Users;

import com.google.gson.annotations.SerializedName;

public class Ad{

	@SerializedName("company")
	private String company;

	@SerializedName("text")
	private String text;

	@SerializedName("url")
	private String url;

	@Override
 	public String toString(){
		return 
			"{" +
			" \"company\" = '\"" + company + '\"' +
			", \"text\" = '\"" + text + '\"' +
			", \"url\" = '\"" + url + '\"' +
			"}";
		}
}