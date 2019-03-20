package models;
public class Account {
    protected int money;
    String[] trasnfers= new String[100];
    int numberTransfers=0;
    CheckAccount checkAccount= new CheckAccount();
    public Account(){
        int password;
        int numCard;
        String user;
    }
    public boolean payments (int money, String type){
        if (money>0){//adding money
            this.money+=money;
            trasnfers[numberTransfers]=type+(char)money;
            ++numberTransfers;
            return true;
        }
        else{//paying stuff
            if (this.money-money>1){
                this.money-=money;
                trasnfers[numberTransfers]=type+(char)money;
                ++numberTransfers;
                return true;
            }
            else
                return false;
        }
    }
    public boolean activateCheckAccount(){
        if (money>=5000){
            checkAccount.active=true;
            return true;
        }
        else
            return false;
    }
}
