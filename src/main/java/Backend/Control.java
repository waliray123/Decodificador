/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author user-ubunto
 */
public class Control {
    private String sequence1;
    private String sequence2;
    
    /**
     * This is the constructor of the class Control
     * @param sequence1
     * @param sequence2
    */
    public Control(String sequence1, String sequence2) {
        this.sequence1 = sequence1.toUpperCase();
        this.sequence2 = sequence2.toUpperCase();
    }
        
    /**
     * This method is used to compare between the 2 sequences 
     * which is the largest part that is repeated
    */
    public String CompareSequences(){
        String result = "";
        String [] results = new String[0];        
        for (int i = 0; i < this.sequence1.length(); i++) {
            for (int j = 0; j < this.sequence2.length(); j++) {
                String resultPiv = "";
                char char1 = this.sequence1.charAt(i);
                char char2 = this.sequence2.charAt(j);
                if (char1 == char2) {                    
                    int cont1 = i;
                    int cont2 = j;
                    while(char1 == char2){     
                        resultPiv += char1;
                        cont1 +=1;
                        cont2 +=1;
                        if (cont1 < this.sequence1.length() && cont2 < this.sequence2.length()) {                              
                            char1 = this.sequence1.charAt(cont1);
                            char2 = this.sequence2.charAt(cont2);                            
                        }else{
                            break;
                        }                         
                    }                    
                    results = this.redimResults(results, resultPiv);
                }
            }            
        }
        
        result =  searchHigherResult(result,results);
        
        return result;
    }    
    
    /**
     * This method is used to compare between the 
     * whole vector, which contains all the repeated 
     * parts between the 2 sequences, which is the largest
     * @param result
     * @param results
    */
    private String searchHigherResult(String result, String [] results){
        for (int i = 0; i < results.length; i++) {
            if (results[i].length() > result.length()) {
                result = results[i];
            }            
        }        
        return result;
    }
    
    /**
     * This method is used to resize the container 
     * vector of the repeated parts between the 2 sequences
     * @param results
     * @param newResult
    */
    private String[] redimResults(String results[], String newResult){
        String [] results2 = results;        
        results = new String[results2.length+1];
        
        for (int i = 0; i < results2.length; i++) {
            results[i] = results2[i];            
        }
        results[results2.length] = newResult; 
        
        return results;
    }
    
    
}
