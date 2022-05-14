package com.example.sberprojecttest.mappers;

import com.example.sberprojecttest.model.modelsForTestingMapper.SimpleDestination;
import com.example.sberprojecttest.model.modelsForTestingMapper.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
