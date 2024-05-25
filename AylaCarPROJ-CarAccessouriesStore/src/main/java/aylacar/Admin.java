package aylacar;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin {

    private String username;
    private String password;
    Logger logger = Logger.getLogger(Admin.class.getName());

    protected List<Product> findByNameProduct = new ArrayList<>();
    protected List<Customer> findByNameCustomer = new ArrayList<>();
    protected List<Installer> findByNameInstaller = new ArrayList<>();

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

  public   Admin(){ }


    public boolean addProduct(Product newProduct) {
        for (Product oldproduct : findByNameProduct) {
            if (oldproduct.getProductId() == (newProduct.getProductId())) {
                logger.log(Level.INFO, "product is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "PRODUCT will added to list");
        findByNameProduct.add(newProduct);
        return false;


    }

    public boolean deleteProduct(int id){
        for(Product existProduct : findByNameProduct){
            if(existProduct.getProductId()== (id)){
                logger.log(Level.INFO,"Exist");
                findByNameProduct.removeIf(n -> (n.getProductId() == (id)));
                return true;
            }}
        logger.log(Level.INFO,"Not Exist");
        return false;
    }
    public boolean searchProduct(int id){
        for(Product existProduct : findByNameProduct){
            if(existProduct.getProductId() == (id)){
                logger.log(Level.INFO,"Exist");
                return true;
            }
        }
        logger.log(Level.INFO,"Not Exist");
        return false;
    }





    public boolean updateProduct(Product toUpdate,int id){
        int neededIndex = 0;
        for(Product product : findByNameProduct) {
            boolean temp = searchProduct(id);
            if(temp){
                return  true;
            }

        }
        findByNameProduct.set(neededIndex-1,toUpdate);
        return false;
    }


    public boolean searchCustomerByEmail(String email){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean addCustomer(Customer newCustomer) {
        for (Customer cus : findByNameCustomer) {
            if (Integer.parseInt(cus.getCustomerId()) == Integer.parseInt((newCustomer.getCustomerId()))) {
                logger.log(Level.INFO, "custOmEr is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "CUSTOMER will added to list");
        findByNameCustomer.add(newCustomer);
        return false;


    }
    public boolean addinstaller(Installer newInstaller) {
        for (Installer oldInstaller : findByNameInstaller) {
            if (oldInstaller.getInstallerId() == (newInstaller.getInstallerId())) {
                logger.log(Level.INFO, "installer is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "installer will added to list");
        findByNameInstaller.add(newInstaller);
        return false;
    }



    }
