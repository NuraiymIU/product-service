package kg.megacom.productservice.mappers;

import kg.megacom.productservice.mappers.impl.PcMapperImpl;
import kg.megacom.productservice.models.dto.PcEx1Dto;
import kg.megacom.productservice.models.entity.Pc;

import java.util.List;

public interface PcMapper {

    PcMapper INSTANCE = new PcMapperImpl();

    List<PcEx1Dto> pcListToPcEx1DtoList(List<Pc> pcList);
}
