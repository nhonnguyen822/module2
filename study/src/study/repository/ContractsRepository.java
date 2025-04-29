package study.repository;

import study.enity.Contracts;

import java.util.List;

public class ContractsRepository implements IContractsRepository{
    @Override
    public List<Contracts> findAll() {
        return List.of();
    }

    @Override
    public void add(Contracts contracts) {

    }

    @Override
    public void edit(Contracts contracts) {

    }
}
