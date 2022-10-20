package com.G13.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResopnseContent {
    String status;
    String content;

    Object object;
}
