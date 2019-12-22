package com.example.Restapispring.services.FooService;

import com.example.Restapispring.Utilities.IOperations;
import com.example.Restapispring.repositories.FooRepository.Foo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFooService extends IOperations<Foo> {

    Page<Foo> findPaginated(Pageable pageable);
}
