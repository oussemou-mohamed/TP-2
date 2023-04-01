package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
//pojo :un simpel classe
//pour sa soi un web servise on doi utiliser la notation xml
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compt getCompte(@WebParam(name = "code")int code){
         return  new Compt(code,Math.random()*9888,new Date());
    }
    @WebMethod
    public List<Compt> listComptes(){
        return List.of(
                new Compt(1,Math.random()*9888,new Date()),
                new Compt(2,Math.random()*9888,new Date()),
                new Compt(3,Math.random()*9888,new Date())
        );
    }
}
