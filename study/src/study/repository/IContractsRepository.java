package study.repository;

import study.enity.Contracts;

public interface IContractsRepository extends IRepository<Contracts> {
    void edit(Contracts contracts);
}
