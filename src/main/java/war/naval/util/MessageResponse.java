package war.naval.util;

public class MessageResponse {

	public String message;
	public Object result;

	public MessageResponse() {

	}

	public MessageResponse(String message, Object result) {
		this.message = message;
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
