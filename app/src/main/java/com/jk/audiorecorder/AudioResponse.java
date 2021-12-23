package com.jk.audiorecorder;

public class AudioResponse{
	private int resultStatus;
	private String input;
	private String say;
	private String broadcast_url;
	private String intent;

	public void setResultStatus(int resultStatus){
		this.resultStatus = resultStatus;
	}

	public int getResultStatus(){
		return resultStatus;
	}

	public void setInput(String input){
		this.input = input;
	}

	public String getInput(){
		return input;
	}

	public void setSay(String say){
		this.say = say;
	}

	public String getSay(){
		return say;
	}

	public void setBroadcast_url(String broadcast_url){
		this.broadcast_url = broadcast_url;
	}

	public String getBroadcast_url(){
		return broadcast_url;
	}

	public void setIntent(String intent){
		this.intent = intent;
	}

	public String getIntent(){
		return intent;
	}

	@Override
 	public String toString(){
		return 
			"AudioResponse{" + 
			"resultStatus = '" + resultStatus + '\'' + 
			",input = '" + input + '\'' + 
			",say = '" + say + '\'' + 
			",broadcast_url = '" + broadcast_url + '\'' +
			",intent = '" + intent + '\'' + 
			"}";
		}
}
