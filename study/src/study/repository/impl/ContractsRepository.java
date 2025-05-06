package study.repository.impl;

import study.common.ReadAndWriteDaTa;
import study.enity.Booking;
import study.enity.Contracts;
import study.repository.IBookingRepository;
import study.repository.IContractsRepository;

import java.util.*;

public class ContractsRepository implements IContractsRepository {
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final String CONTRACTS_FILE = "src/study/data/contracts.csv";
    private static final boolean NOT_APPEND = false;

    private static List<String> convertToListString(Queue<Contracts> contracts) {
        List<String> stringList = new ArrayList<>();
        for (Contracts contracts1 : contracts) {
            String line = contracts1.convertToString();
            stringList.add(line);
        }
        return stringList;
    }

    private static Queue<Contracts> convertToQueueContract(List<String> stringList) {
        Queue<Contracts> contractsQueue = new ArrayDeque<>();
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 4) {
                String contractId = line[0];
                String bookingCode = line[1];
                int deposit = Integer.parseInt(line[2]);
                int totalPayment = Integer.parseInt(line[3]);
                contractsQueue.offer(new Contracts(contractId, bookingCode, deposit, totalPayment));
            }
        }
        return contractsQueue;
    }

    @Override
    public Queue<Booking> convertBookingFromSetToQueue(Set<Booking> bookingSet) {
        Queue<Booking> contractsQueue = new ArrayDeque<>();
        for (Booking booking : bookingSet) {
            contractsQueue.offer(booking);
        }
        return contractsQueue;
    }

    @Override
    public Queue<Contracts> findAll() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(CONTRACTS_FILE);
        return convertToQueueContract(stringList);
    }

    @Override
    public void edit(Contracts contracts) {
        Queue<Contracts> contractsQueue = findAll();
        for (Contracts contract : contractsQueue) {
            if (contract.getContractId().equals(contracts.getContractId())) {
                contract.setContractId(contracts.getContractId());
                contract.setDeposit(contracts.getDeposit());
                contract.setTotalPayment(contracts.getTotalPayment());
                break;
            }
        }
        List<String> stringList = convertToListString(contractsQueue);
        ReadAndWriteDaTa.writeFileCSV(CONTRACTS_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void add(Contracts contracts) {
        Queue<Contracts> contractsQueue = findAll();
        contractsQueue.offer(contracts);
        List<String> stringList = convertToListString(contractsQueue);
        ReadAndWriteDaTa.writeFileCSV(CONTRACTS_FILE, stringList, NOT_APPEND);
    }
}
