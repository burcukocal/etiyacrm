package com.etiya.searchservice.service.concretes;

import com.etiya.searchservice.entities.Customer;
import com.etiya.searchservice.repository.FilterRepository;
import com.etiya.searchservice.service.abstracts.FilterService;
import com.etiya.searchservice.service.dtos.requests.SearchRequest;
import com.etiya.searchservice.service.dtos.responses.SearchResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FilterServiceImpl implements FilterService {
    private FilterRepository filterRepository;

    @Override
    public void addCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        this.filterRepository.save(customer);
    }


}
