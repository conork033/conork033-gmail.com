package ie.gmit.single;
/*
Conor Kenny GroupA
G00352227@gmit.ie
25/3/20

 */

public class UserPersistenceService {
    private  Store store = new Store();

    public void saveUser(User user){

        store.store(user);
    }
}
