package pres;

import dao.DAOimpl;
import dao.DAOimpl2;
import metier.Imetier;
import metier.ImetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DAOimpl dao=new DAOimpl(); // instanciation statique
        ImetierImpl metier =new ImetierImpl(dao);//injection via constructeur
        //metier.setIdao(dao);//injection des dépendances
        System.out.println(metier.calcul());

    }
}
