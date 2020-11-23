package com.musictrainer.api.users.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestDTO {

    private String idTest;
    private String testcol;
    private String testcol1;

}
