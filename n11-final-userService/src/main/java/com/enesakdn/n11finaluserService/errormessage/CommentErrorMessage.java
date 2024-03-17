package com.enesakdn.n11finaluserService.errormessage;

import com.enesakdn.n11finaluserService.general.BaseErrorMessage;

public enum CommentErrorMessage implements BaseErrorMessage {
    USER_NOT_FOUND("User is not exist!"),
    ;
    private final String message;

    CommentErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return null;
    }
    @Override
    public String toString() {
        return message;
    }
}
