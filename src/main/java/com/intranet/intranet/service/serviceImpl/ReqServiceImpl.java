package com.intranet.intranet.service.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intranet.intranet.models.Req;
import com.intranet.intranet.repository.ReqRepository;
import com.intranet.intranet.service.IReqService;

@Service
public class ReqServiceImpl implements IReqService {

    @Autowired
    private ReqRepository reqRepository;

    @Override
    public List<Req> listarTodasLasReqs() {

        return reqRepository.findAll();
    }

    @Override
    public Req guardarReq(Req req) {

        return reqRepository.save(req);
    }

    @Override
    public Optional<Req> buscarReqPorId(Long id) {

        return reqRepository.findById(id);
    }

    @Override
    public void eliminarReqPorId(Long id) {

        reqRepository.findById(id);

    }

    @Override
    public List<Req> buscarTodasLasReqsPorQuery(int palabraClave) {

        return null;
    }

    @Override
    public void actualizarReq(Long id, Req req) {
        Req reqTemp = reqRepository.findById(id).get();
        reqTemp.setCodigo(req.getCodigo());
        reqTemp.setNombre(req.getCodigo());

    }

}
