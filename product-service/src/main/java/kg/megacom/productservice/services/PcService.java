package kg.megacom.productservice.services;

import kg.megacom.productservice.models.dto.PcEx1Dto;
import kg.megacom.productservice.models.dto.Task1;

import java.util.List;

public interface PcService {

    List<PcEx1Dto> getAllPcByPrice(double price);

    List<Task1> task1(double price);
}
