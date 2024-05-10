package com.etiyacrm.customerservice.services.rules;

import com.etiyacrm.customerservice.core.business.abstracts.MessageService;
import com.etiyacrm.customerservice.core.crossCusttingConcerns.exceptions.types.BusinessException;
import com.etiyacrm.customerservice.entities.ContactMedium;
import com.etiyacrm.customerservice.repositories.ContactMediumRepository;
import com.etiyacrm.customerservice.services.messages.Messages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ContactMediumBussinessRules {
    private ContactMediumRepository contactMediumRepository;
    private MessageService messageService;

    public void checkIfContactMedium(String id){
        Optional<ContactMedium> contactMedium = contactMediumRepository.findByCustomerId(id);
        if (contactMedium.isEmpty()) {
            throw new BusinessException(messageService.getMessage(Messages.BusinessErrors.ContactMediumIdNotExists));
        }
    }

    public void checkIfCustomerHasContactMedium(String customerId){
        Optional<ContactMedium> contactMedium = contactMediumRepository.findByCustomerId(customerId);
        if(contactMedium.isPresent()){
            throw new BusinessException(messageService.getMessage(Messages.BusinessErrors.CustomerHasContactMedium));
        }

    }
}
