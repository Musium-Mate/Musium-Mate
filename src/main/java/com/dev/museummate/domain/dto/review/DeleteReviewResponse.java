package com.dev.museummate.domain.dto.review;

import com.dev.museummate.controller.ReviewController;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteReviewResponse {

    private String message;
    private Long reviewId;

    @Builder
    public DeleteReviewResponse(String message, Long reviewId) {
        this.message = message;
        this.reviewId = reviewId;
    }

    public static DeleteReviewResponse toResponse(ReviewDto deletedReviewDto) {
        return DeleteReviewResponse.builder()
            .message("리뷰 삭제 완료")
            .reviewId(deletedReviewDto.getId())
            .build();
    }

}
