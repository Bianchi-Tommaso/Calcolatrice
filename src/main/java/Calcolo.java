import java.util.Vector;

public class Calcolo 
{
    String operazione;

    public Calcolo(String operazione) 
    {
        this.operazione = operazione;
    } 
    
    public String operazione(String s)
    {
        int i = 0;
        int z = 0;
        int possegno = 0;
        int possegnosuccessivo = 0;
        String salva = "";
        String salva1 = "";
        String input = s;
        input = input.replace(" ","");
        String x = "";
        boolean stringfinita = false;
        int numero = 0;
        char g = 0;
        Vector<Integer> v = new Vector<Integer>();
        Vector<Character> segni = new Vector<Character>();

                    for(i = 0; i < input.length(); i++)
                    {    
                                g = s.charAt(i);
                                if(g != '/' && g != '*' && g != '+' && g != '-')
                                {
                                    salva += g;
                                    if(i == input.length() - 1)
                                        v.add(Integer.valueOf(salva));
                                }
                                else if(g == '/' || g == '*') 
                                {
                                    possegno = i;
                                    z = i + 1;
                                    g = s.charAt(z);
                                    
                                    while(g != '/' && g != '*' && g != '+' && g != '-')
                                    {
                                        salva1 += g;
                                        z++;
                                        if(z < input.length())
                                        {
                                          g = s.charAt(z);
                                        }
                                        else
                                        {
                                            g = '+';
                                            stringfinita = true;
                                        }
                                    }
                                    
                                    if('/' == input.charAt(possegno))
                                    {
                                        numero = Integer.parseInt(salva) / Integer.parseInt(salva1);
                                        v.add(numero);
                                        i = z;
                                        possegnosuccessivo = z;
                                        if(stringfinita != true)
                                        segni.add(input.charAt(possegnosuccessivo));
                                        salva = "";
                                        salva1 = "";
                                        z = 0;
                                    }
                                    else if('*' == input.charAt(possegno))
                                    {
                                        numero = Integer.parseInt(salva) * Integer.parseInt(salva1);
                                        v.add(numero);
                                        i = z;
                                        possegnosuccessivo = z;
                                        if(stringfinita != true)
                                        segni.add(input.charAt(possegnosuccessivo));
                                        salva = "";
                                        salva1 = "";
                                        z = 0;
                                    }
                                    else if('+' == input.charAt(possegno))
                                    {
                                        numero = Integer.parseInt(salva) + Integer.parseInt(salva1);
                                        v.add(numero);
                                        i = z;
                                        possegnosuccessivo = z;
                                        if(stringfinita != true)
                                        segni.add(input.charAt(possegnosuccessivo));
                                        salva = "";
                                        salva1 = "";
                                        z = 0;
                                    }
                                    else if('-' == input.charAt(possegno))
                                    {
                                        numero = Integer.parseInt(salva) - Integer.parseInt(salva1);
                                        v.add(numero);
                                        i = z;
                                        possegnosuccessivo = z;
                                        if(stringfinita != true)
                                        segni.add(input.charAt(possegnosuccessivo));
                                        salva = "";
                                        salva1 = "";
                                        z = 0;
                                    }
                                }
                                else
                                {
                                    v.add(Integer.valueOf(salva));
                                    segni.add(input.charAt(i));
                                    salva = "";
                                    salva1 = "";
                                    z = 0;
                                }
                    }
                        for(i = 0; i < v.size(); i++)
                        {
                            x += v.get(i);
                            if(segni.size() != i)
                            x += segni.get(i);
                            s = x;
                        }
                        salva = "";
                        salva1 = "";
                        z = 0;
                        v.clear();
                        segni.clear();
                        
                       return String.valueOf(x); 
                            }
    
    public String x(String s)
    {
        int i = 0;
        int conta = 0;
        Vector<Character> operatori = new Vector<Character>();
         
        for (i = 0; i < s.length(); i++)
        {
             if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' ) 
             {
                conta++;
             operatori.add(s.charAt(i));
         }
        }
     String[] retval = s.split("\\+|\\-|\\*|\\/", conta + 1);    

    int num1 = Integer.parseInt(retval[0]);
    int num2 = 0;
    int j = 0;
    
    for (i = 1; i < retval.length; i++) 
    {
        num2 = Integer.parseInt(retval[i]);
        char operatore = operatori.get(j);
        if (operatore == '+') 
        {
            num1 = num1 + num2;

        }
        else if(operatore == '-')
        {
            num1 = num1 - num2;
        }
        else if(operatore == '÷')
        {
            num1 = num1 / num2;
        }
        else
        {
            num1 = num1 * num2;
        }
        j++;            
    }
        
        return String.valueOf(num1);
    }                              
}
                        
                        
