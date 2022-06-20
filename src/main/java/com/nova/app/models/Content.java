package com.nova.app.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long contentId;
    private Long userId;
    private String contentText;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate contentTimeStamp;
    private Integer repostCount;
    private Integer likeCount;

    public Content() {

    }
}
