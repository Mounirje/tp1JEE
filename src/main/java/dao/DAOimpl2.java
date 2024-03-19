package dao;

import dao.IDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("v2")
public class DAOimpl2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("version webservice");
        double data=23;
        return data;
    }
}
