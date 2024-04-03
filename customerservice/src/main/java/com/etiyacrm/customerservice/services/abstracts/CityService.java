package com.etiyacrm.customerservice.services.abstracts;

import com.etiyacrm.customerservice.core.business.paging.PageInfo;
import com.etiyacrm.customerservice.services.dtos.requests.cityRequests.CreateCityRequest;
import com.etiyacrm.customerservice.services.dtos.responses.cityresponses.CreatedCityResponse;
import com.etiyacrm.customerservice.services.dtos.responses.cityresponses.GetAllCityResponse;

import java.util.List;

public interface CityService {
    List<GetAllCityResponse> getAll(PageInfo pageInfo);

    CreatedCityResponse add(CreateCityRequest createCityRequest);
}