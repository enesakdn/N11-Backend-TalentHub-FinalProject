package com.enesakdn.n11finaluserService.request;

import com.enesakdn.n11finaluserService.enums.EnumScore;

public record CommentUpdateRequest(long id,
                                   String topic,
                                   String text,
                                   EnumScore score) {

}
