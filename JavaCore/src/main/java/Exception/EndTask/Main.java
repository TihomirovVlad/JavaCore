package Exception.EndTask;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {
        Registration reg = new Registration();
        try{
            reg.validateRegistration("101010","tttt_","tttt_");
        } catch(EmptyLoginException e){
            e.printStackTrace();

        } catch(InvalidCharactersException e){
            e.printStackTrace();

        } catch(LengthException e){
            e.printStackTrace();

        } catch (PasswordConfirmException e ) {
            e.printStackTrace();
        }
    }
}
