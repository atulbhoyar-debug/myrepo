package com.spotify.oAuth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
	  @JsonProperty("error")
	  private Error error;
	  private InnerError innererror;
	  
	  
	  
	  public InnerError getInnererror() {
		return innererror;
	}
	public void setInnererror(InnerError innererror) {
		this.innererror = innererror;
	}
	@JsonProperty("error")
	public Error getError() {
		return error;
	}
	  @JsonProperty("error")
	public void setError(Error error) {
		this.error = error;
	}
	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
