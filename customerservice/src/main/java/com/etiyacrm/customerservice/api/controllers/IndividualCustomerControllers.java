package com.etiyacrm.customerservice.api.controllers;

import com.etiyacrm.customerservice.business.abstracts.IndividualCustomerService;
import com.etiyacrm.customerservice.business.dtos.requests.IndividualCustomerRequests.CreateIndividualCustomerRequest;
import com.etiyacrm.customerservice.business.dtos.requests.IndividualCustomerRequests.UpdateIndividualCustomerRequest;
import com.etiyacrm.customerservice.business.dtos.responses.IndividualCustomerResponses.CreatedIndividualCustomerResponse;
import com.etiyacrm.customerservice.business.dtos.responses.IndividualCustomerResponses.UpdatedIndividualCustomerResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/individualcustomers")
public class IndividualCustomerControllers {
    private IndividualCustomerService individualCustomerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedIndividualCustomerResponse add(@Valid @RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest){
        return individualCustomerService.add(createIndividualCustomerRequest);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedIndividualCustomerResponse update(@Valid @RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest,
                                                    @PathVariable Long id){
        return individualCustomerService.update(updateIndividualCustomerRequest, id);
    }
}