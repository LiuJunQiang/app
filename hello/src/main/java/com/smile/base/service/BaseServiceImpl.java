package com.smile.base.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    private JpaRepository<T, ID> JpaRepository;

    public abstract JpaRepository<T, ID> getJpaRepository();


    @Override
    public List<T> findAll() {
        return getJpaRepository().findAll();
    }

    @Override
    public List<T> findAll(Sort var1) {
        return getJpaRepository().findAll(var1);
    }

    @Override
    public List<T> findAllById(Iterable<ID> var1) {
        return getJpaRepository().findAllById(var1);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> var1) {
        return getJpaRepository().saveAll(var1);
    }

    @Override
    public void flush() {
        getJpaRepository().flush();
    }

    @Override
    public <S extends T> S saveAndFlush(S var1) {
        return getJpaRepository().saveAndFlush(var1);
    }

    @Override
    public void deleteInBatch(Iterable<T> var1) {
        getJpaRepository().deleteInBatch(var1);
    }

    @Override
    public void deleteAllInBatch() {
        getJpaRepository().deleteAllInBatch();
    }

    @Override
    public T getOne(ID var1) {
        return getJpaRepository().getOne(var1);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> var1) {
        return getJpaRepository().findAll(var1);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> var1, Sort var2) {
        return getJpaRepository().findAll(var1, var2);
    }

    @Override
    public <S extends T> S save(S var1) {
        return getJpaRepository().save(var1);
    }

    @Override
    public Optional<T> findById(ID var1) {
        return getJpaRepository().findById(var1);
    }

    @Override
    public boolean existsById(ID var1) {
        return getJpaRepository().existsById(var1);
    }

    @Override
    public long count() {
        return getJpaRepository().count();
    }

    @Override
    public void deleteById(ID var1) {
        getJpaRepository().deleteById(var1);
    }

    @Override
    public void delete(T var1) {
        getJpaRepository().delete(var1);
    }

    @Override
    public void deleteAll(Iterable<? extends T> var1) {
        getJpaRepository().deleteAll(var1);
    }

    @Override
    public void deleteAll() {
        getJpaRepository().deleteAll();
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> var1) {
        return getJpaRepository().findOne(var1);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> var1, Pageable var2) {
        return getJpaRepository().findAll(var1, var2);
    }

    @Override
    public <S extends T> long count(Example<S> var1) {
        return getJpaRepository().count(var1);
    }

    @Override
    public <S extends T> boolean exists(Example<S> var1) {
        return getJpaRepository().exists(var1);
    }
}
