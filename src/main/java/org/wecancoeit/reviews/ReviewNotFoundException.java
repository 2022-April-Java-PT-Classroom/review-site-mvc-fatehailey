package org.wecancoeit.reviews;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ReviewNotFoundException extends Exception {
    @ResponseStatus(code= HttpStatus.NOT_FOUND, reason="Bad Request, Course Not Found!")
    public class CourseNotFoundException extends Exception {
    }
}
