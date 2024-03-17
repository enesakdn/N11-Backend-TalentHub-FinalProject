package com.enesakdn.n11finaluserService.general;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@Getter
@Setter
@ResponseStatus
public class ApplicationBusinessException extends RuntimeException {
private  final BaseErrorMessage baseErrorMessage;
}
