package ca.sheridancollege.Game;

public class PasswordValidator extends Validator {
    
        @Override
	public boolean validate(String password) {
            return (this.checkLength(password) && this.checkSpecialCharacter(password) && this.checkUppercase(password)); 
	}
        
        
        public boolean checkLength(String password) {
            return password.length() > 5;
        }
        
        public boolean checkUppercase(String password) {
            return !password.toLowerCase().equals(password);
        }
        
        public boolean checkSpecialCharacter(String password) {
            for (char c : password.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    return true;
                    
                }
            }
            return false;
        }

}