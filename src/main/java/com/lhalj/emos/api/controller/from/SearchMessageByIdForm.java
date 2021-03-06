package com.lhalj.emos.api.controller.from;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel
@Data
public class SearchMessageByIdForm {

    @NotBlank
    private String id;
}
