package pjatk.jazs20495nbp.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<Object> handleHttpClientErrorException(HttpClientErrorException ex) {

        switch (ex.getStatusCode()) {
            case NOT_FOUND:
                return new ResponseEntity<>("Not Found: 404", NOT_FOUND);
            case BAD_REQUEST:
                return new ResponseEntity<>("Bad Request: 400", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    //todo
    //W przypadku zapytania obejmującego więcej niż trzy miesiące serwis zwraca komunikat 400 Bad Request
    // - Przekroczony limit 93 dni / Limit of 93 days has been exceeded
}
