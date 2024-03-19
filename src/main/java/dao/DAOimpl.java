package dao;

import dao.IDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("v1")
public class DAOimpl implements IDAO {
    @Override
    public double getData() {
        System.out.println("version base de données");
        double data=34;
        return data;

    }
}
