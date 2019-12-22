package com.example.Restapispring.services.FooService.impl;
import com.example.Restapispring.repositories.FooRepository.Foo;
import com.example.Restapispring.repositories.FooRepository.IFooDao;
import com.example.Restapispring.services.FooService.common.AbstractService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import java.util.List;
import com.example.Restapispring.services.FooService.IFooService;
@Service
@Transactional
public class FooService extends AbstractService<Foo> implements IFooService {

    @Autowired
    private IFooDao dao;

    public FooService() {
        super();
    }

    // API

    @Override
    protected PagingAndSortingRepository<Foo, Long> getDao() {
        return dao;
    }

    // custom methods

    @Override
    public Page<Foo> findPaginated(Pageable pageable) {
        return dao.findAll(pageable);
    }

    // overridden to be secured

    @Override
    @Transactional(readOnly = true)
    public List<Foo> findAll() {
        return Lists.newArrayList(getDao().findAll());
    }

}