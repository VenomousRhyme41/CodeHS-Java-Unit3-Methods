public boolean passwordCheck(String password)
    {
        for( int i=0; i<password.length(); i++ )
        {
            char curChar = password.charAt(i);
           
            if( ! (Character.isDigit(curChar) || Character.isLetter(curChar) ) )
               return false;
        }
       
        return password.length() >= 8;
    }
