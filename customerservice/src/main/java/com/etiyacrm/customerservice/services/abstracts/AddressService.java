package com.etiyacrm.customerservice.services.abstracts;

import com.etiyacrm.customerservice.core.business.paging.PageInfo;
import com.etiyacrm.customerservice.services.dtos.requests.addressRequests.CreateAddressRequest;
import com.etiyacrm.customerservice.services.dtos.requests.addressRequests.UpdateAddressRequest;
import com.etiyacrm.customerservice.services.dtos.responses.addressResponses.*;

import java.util.List;

public interface AddressService {
    List<GetAllAddressResponse> getAll(PageInfo pageInfo);
    GetAddressResponse getById(long id);
    CreatedAddressResponse add(CreateAddressRequest createAddressRequest);
    UpdatedAddressResponse update(UpdateAddressRequest updateAddressRequest, long id);
    DeletedAddressResponse delete(long id);
}
