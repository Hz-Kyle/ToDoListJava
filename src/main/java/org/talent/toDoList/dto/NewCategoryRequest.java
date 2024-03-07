package org.talent.toDoList.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewCategoryRequest {

    private String name;
    private String imageUrl;
}
