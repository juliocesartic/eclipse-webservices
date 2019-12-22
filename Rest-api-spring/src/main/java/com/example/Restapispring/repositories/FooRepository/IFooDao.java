package com.example.Restapispring.repositories.FooRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IFooDao extends JpaRepository<Foo, Long>  {
}
