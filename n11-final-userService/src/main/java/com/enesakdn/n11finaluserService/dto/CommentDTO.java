package com.enesakdn.n11finaluserService.dto;

import com.enesakdn.n11finaluserService.enums.EnumScore;

public record CommentDTO(long id,
                         long CustomerId,
                         long RestaurantId,
                         String topic,
                         String text,
                         EnumScore score) {
}
