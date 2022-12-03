package kg.megacom.productservice.mappers.impl;

import kg.megacom.productservice.mappers.PcMapper;
import kg.megacom.productservice.models.dto.PcEx1Dto;
import kg.megacom.productservice.models.entity.Pc;

import java.util.ArrayList;
import java.util.List;

public class PcMapperImpl implements PcMapper {
    @Override
    public List<PcEx1Dto> pcListToPcEx1DtoList(List<Pc> pcList) {

        List<PcEx1Dto> pcEx1DtoList = new ArrayList<>();

        pcList.stream().forEach(pc->{
            PcEx1Dto pcEx1Dto = new PcEx1Dto();
            pcEx1Dto.setModel((pc.getProduct().getModel()));
            pcEx1Dto.setHd(pc.getHd());
            pcEx1Dto.setSpeed(pc.getSpeed());
            pcEx1DtoList.add(pcEx1Dto);
        });
        return pcEx1DtoList;
    }
}
