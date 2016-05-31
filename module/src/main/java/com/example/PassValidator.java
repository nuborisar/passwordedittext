package com.example;

public class PassValidator implements Validator {


        private String textToValidate ;

        public PassValidator(String textToValidate) {
            this.textToValidate = textToValidate;
        }

        @Override public boolean validate() {
            if (isValid(textToValidate)){
                return true;
            }else{
                return true;
            }
        }

        private boolean isValid(String textToValidate) {
            String textWithOutSpaces = textToValidate.replace(" ", "");
            return textToValidate.equals(textWithOutSpaces);
        }
}
