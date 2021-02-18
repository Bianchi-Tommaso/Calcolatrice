public class Calcolo 
{
    String operazione;

    public Calcolo(String operazione) 
    {
        this.operazione = operazione;
    } 
    
    public String operazione(String s)
    {
        String salva = "";
        char g;
        int i = 0;
        int j = 0;
        int z = 0;
        int numero = 0;
        
        for(i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == '+')
            {
                for(i = 0; i <= s.length() - 1; i++)
                {
                    g = s.charAt(i);
                    
                    if(g == '+')
                    {
                        j = i;
                        for(z = 0; z < j; z++)
                        {
                            if(s.charAt(z) != '+')
                            {
                                 salva += s.charAt(z);
                            }
                        }
                        numero += Integer.parseInt(salva);
                        salva = "";
                    }
                    else if(i == s.length() - 1)
                    {
                        for(; i > 0; i--)
                        {
                            g = s.charAt(i);
                    
                            if(g == '+')
                            {
                                j = i;
                                 for(z = j; z < s.length(); z++)
                                 {
                                     if(s.charAt(z) != '+')
                                     {
                                        salva += s.charAt(z);
                                     }
                                 }
                                    numero += Integer.parseInt(salva);
                                    salva = "";
                                    i = s.length();
                                    break;
                            }
                        }
                    }
                }
            }
            else if(s.charAt(i) == '-')
            {
                for(i = 0; i <= s.length() - 1; i++)
                {
                    g = s.charAt(i);
                    
                    if(g == '-')
                    {
                        j = i;
                        for(z = 0; z < j; z++)
                        {
                            if(s.charAt(z) != '-')
                            {
                                 salva += s.charAt(z);
                            }
                        }
                        numero += Integer.parseInt(salva);
                        salva = "";
                    }
                    else if(i == s.length() - 1)
                    {
                        for(; i > 0; i--)
                        {
                            g = s.charAt(i);
                    
                            if(g == '-')
                            {
                                j = i;
                                 for(z = j; z < s.length(); z++)
                                 {
                                     if(s.charAt(z) != '-')
                                     {
                                        salva += s.charAt(z);
                                     }
                                 }
                                    numero = numero - Integer.parseInt(salva);
                                    salva = "";
                                    i = s.length();
                                    break;
                            }
                        }
                    }
                }
            }
            else if(s.charAt(i) == '*')
            {
                numero = 1;
                
                for(i = 0; i <= s.length() - 1; i++)
                {
                    g = s.charAt(i);
                    
                    if(g == '*')
                    {
                        j = i;
                        for(z = 0; z < j; z++)
                        {
                            if(s.charAt(z) != '*')
                            {
                                 salva += s.charAt(z);
                            }
                        }
                        numero *= Integer.parseInt(salva);
                        salva = "";
                    }
                    else if(i == s.length() - 1)
                    {
                        for(; i > 0; i--)
                        {
                            g = s.charAt(i);
                    
                            if(g == '*')
                            {
                                j = i;
                                 for(z = j; z < s.length(); z++)
                                 {
                                     if(s.charAt(z) != '*')
                                     {
                                        salva += s.charAt(z);
                                     }
                                 }
                                    numero = numero * Integer.parseInt(salva);
                                    salva = "";
                                    i = s.length();
                                    break;
                            }
                        }
                    }
                }
            }
        }
        
        return String.valueOf(numero);
    }
    
}
