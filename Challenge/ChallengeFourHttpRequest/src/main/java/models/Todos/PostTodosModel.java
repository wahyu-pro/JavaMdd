package models.Todos;

import com.google.gson.annotations.SerializedName;

public class PostTodosModel{

	@SerializedName("data")
	private Data data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"{" +
			" \"data\" = '\"" + data + '\"' +
			", \"message\" = '\"" + message + '\"' +
			",\"status\" = '\"" + status + '\"' +
			"}";
		}
}