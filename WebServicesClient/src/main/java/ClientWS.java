import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compt;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversion(7600));
        Compt cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
