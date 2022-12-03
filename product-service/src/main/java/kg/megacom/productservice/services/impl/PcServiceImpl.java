package kg.megacom.productservice.services.impl;

import kg.megacom.productservice.dao.PcRepository;
import kg.megacom.productservice.mappers.PcMapper;
import kg.megacom.productservice.models.dto.PcEx1Dto;
import kg.megacom.productservice.models.dto.Task1;
import kg.megacom.productservice.models.entity.Pc;
import kg.megacom.productservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    private PcRepository pcRepository;

    @Autowired
    public PcServiceImpl(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @Override
    public List<PcEx1Dto> getAllPcByPrice(double price) {
        List<Pc> pcList = pcRepository.findAllByPriceLessThan(price);
        return PcMapper.INSTANCE.pcListToPcEx1DtoList(pcList);
    }

    @Override
    public List<Task1> task1(double price) {
        return pcRepository.task1Query(price);
    }
}
