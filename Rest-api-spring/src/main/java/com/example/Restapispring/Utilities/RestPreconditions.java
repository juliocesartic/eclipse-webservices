package com.example.Restapispring.Utilities;

import com.example.Restapispring.exceptions.MyResourceNotFoundException;
import com.example.Restapispring.exceptions.ResourceNotFoundException;

public class RestPreconditions {

    public static <T> T checkFound(T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }

}
