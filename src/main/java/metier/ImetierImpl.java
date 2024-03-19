package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ImetierImpl implements Imetier {
   // @Autowired
    //@Qualifier("v1")
    private IDAO idao; //couplage faible

    public ImetierImpl(@Qualifier("v1") IDAO idao) {
        this.idao = idao;
    }

    @Override
    public double calcul() {
       double res=idao.getData()*11.4;
        return res;
    }

    public void setIdao(IDAO idao) {
        this.idao = idao;
    }
}
