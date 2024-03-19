package pres;

import dao.IDAO;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        //DAOimpl dao=new DAOimpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoclass=scanner.nextLine();
        Class cDao=Class.forName(daoclass);//pour chargé la classe en mémoire
        IDAO idao =(IDAO)cDao.getConstructor().newInstance(); // new DAOimpl()
        System.out.println(idao.getData());


        //ImetierImpl metier =new ImetierImpl()
        String metierclass = scanner.nextLine();
        Class cmetier=Class.forName(metierclass);
        Imetier metier =(Imetier) cmetier.getConstructor(IDAO.class).newInstance(idao); //new ImetierImpl()
        //metier.setIdao(dao)
        Method setdao=cmetier.getDeclaredMethod("setIdao",IDAO.class);
        setdao.invoke(metier,idao);//injection de dependances
        metier.calcul();

    }
}
