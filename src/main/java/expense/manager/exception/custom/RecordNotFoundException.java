package expense.manager.exception.custom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Record Not Found")
public class RecordNotFoundException extends CustomRuntimeException {

	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(String message) {
		super(message);
	}

}
